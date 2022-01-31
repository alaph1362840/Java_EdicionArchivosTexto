package edicionarchivostexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArchivoTexto {
    //Propiedades:    
    List<String> lineas = new ArrayList<String>();
    ArrayList<Palabra> list_palabras = new ArrayList<Palabra>();
    String ruta ="";
    String [] listArticulos = {"the", "The", "at", "in", "some"};
    
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
        this.escribirArchivo();
    }
        
    public void reemplazarLista(String directorioRemplazo, String separador){
        List<String> list_lineas_reemplazo = new ArrayList<String>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        // ----- LECTURA DE FICHERO ----
        try {
            archivo = new File (directorioRemplazo);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);            
            String linea;
            while((linea=br.readLine())!=null)
                list_lineas_reemplazo.add(linea);  
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
        }
        //------ CREADOR DE PALABRAS REEMPLAZO -----
        String[] lista;
        
        for(String x:list_lineas_reemplazo){
            Palabra y;
            lista=x.split(separador);
            System.out.println("Elementos a reemplazar.");            
            if (lista.length==1) {
                y= new Palabra(lista[0],"");
                this.list_palabras.add(y);
            } 
            if (lista.length==2) {
                y= new Palabra(lista[0],lista[1]);
                this.list_palabras.add(y);
            }
            
        }
        //------- REMPLAZAR PALABRAS ---
        int i = 0;
        for(String x: this.lineas){            
            for(Palabra y: this.list_palabras){
                if (x.contains(y.txtArchivo)) {
                    x = x.replace(y.txtArchivo, y.txtRemplazo);
                }                
            }
            this.lineas.set(i, x);
            i++;
        }
        this.escribirArchivo();
    }
    
    public String buscarIngles(){
        List<String> lista;
        String result = "";
        int i = 0;
        for(String x: this.lineas){
             lista=Arrays.asList(x.split(" ")); 
             for(String y: this.listArticulos){
                 if(lista.contains(y)) {
                     result = "Se econtro articulo "+y+" en la linea "+i;
                 }
             }
             i++;
        }
        return result;
    }
}
