package edicionarchivostexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ArchivoTexto {
    //Propiedades:    
    List<String> lineas = new ArrayList<String>();
    String ruta ="";
    public ArchivoTexto(String rutaArchivo){
        this.ruta=rutaArchivo;
        // **** LECTURA DE ARCHIVO****
        //INICIO
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;        
        try {
            //Lo unico que varia en este codigo es el directorioRemplazo :) 
            //la info la guardamos en un arraylist con todoas las lineas
            archivo = new File (rutaArchivo);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null){
                lineas.add(linea); 
            }
        }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }        
        //FIN
        //*******************
    }
    
    //Esta funcion corregira esto "la marea.estaba alta" por esto "la marea. estaba alta" o sea que se agregara espacio despues de un punto.
    public void corregirPuntosPegados(){
        char cb = '_';//caranter anterior before
        char c = '_';// caracter actual
        char ca = '_';//caracter posterior after        
        int i = 0;
        String centi = "";
        for(String x: this.lineas){
            centi = "";
            for(int n = 0; n < x.length(); n ++) {
                cb = '_';
                c = '_';
                ca = '_';
                if (n>0) {
                    cb = x.charAt(n-1);
                }
                c = x.charAt(n);
                if (n < (x.length()-1)) {
                    ca = x.charAt(n+1);
                }
                centi+= c;
                if (c == '.' && Character.isLetter(cb) && Character.isLetter(ca)) {
                    centi+= ' ';
                }
            }
            this.lineas.set(i, centi);
            i++;
        }
    }
    
    public void escribirArchivo(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(this.ruta);            
            pw = new PrintWriter(fichero);
            for(String x: this.lineas){
                pw.println(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
    
}
