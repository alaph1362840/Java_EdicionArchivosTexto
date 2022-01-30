/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edicionarchivostexto;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Brayan
 */
public class VentanaEdicionArchivo extends javax.swing.JFrame {
    
    public VentanaEdicionArchivo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtArchivoOrigen = new javax.swing.JTextField();
        btnArchivoOrigen = new javax.swing.JButton();
        btnCorregirPuntos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtAlarma = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtArchivoReemplazar = new javax.swing.JTextField();
        btnArchivoReemplazo = new javax.swing.JButton();
        btnReemplazar = new javax.swing.JButton();
        txtAlarma1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSeparador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtIngles = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Edicion de Archivos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Directorio del Archivo a Editar");

        txtArchivoOrigen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtArchivoOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArchivoOrigenActionPerformed(evt);
            }
        });

        btnArchivoOrigen.setBackground(new java.awt.Color(210, 241, 218));
        btnArchivoOrigen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnArchivoOrigen.setText("...");
        btnArchivoOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoOrigenActionPerformed(evt);
            }
        });

        btnCorregirPuntos.setBackground(new java.awt.Color(97, 182, 217));
        btnCorregirPuntos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCorregirPuntos.setForeground(new java.awt.Color(255, 255, 255));
        btnCorregirPuntos.setText("CORREGIR");
        btnCorregirPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorregirPuntosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Corregir Puntos Pegados:");

        txtAlarma.setText("....");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ejemplo: Cambia \"La marea.el mar\" por \"La marea. el mar\"");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Remplazar lista de palabras:");

        txtArchivoReemplazar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtArchivoReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArchivoReemplazarActionPerformed(evt);
            }
        });

        btnArchivoReemplazo.setBackground(new java.awt.Color(195, 246, 242));
        btnArchivoReemplazo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnArchivoReemplazo.setText("...");
        btnArchivoReemplazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoReemplazoActionPerformed(evt);
            }
        });

        btnReemplazar.setBackground(new java.awt.Color(97, 182, 217));
        btnReemplazar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReemplazar.setForeground(new java.awt.Color(255, 255, 255));
        btnReemplazar.setText("Reemplazar");
        btnReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReemplazarActionPerformed(evt);
            }
        });

        txtAlarma1.setText("....");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Directorio del Archivo de Palabras a Reemplazar");

        txtSeparador.setBackground(new java.awt.Color(204, 204, 255));
        txtSeparador.setText("--");
        txtSeparador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeparadorActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Ingresa el saparador usado el archivo:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Pueden ser guiones, comas, etc.");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Buscar texto en Ingles:");

        btnBuscar.setBackground(new java.awt.Color(97, 182, 217));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtIngles.setEditable(false);
        txtIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInglesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(txtIngles))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtArchivoReemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(btnArchivoReemplazo))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtArchivoOrigen)
                                .addGap(18, 18, 18)
                                .addComponent(btnArchivoOrigen))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReemplazar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAlarma1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCorregirPuntos, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAlarma, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArchivoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArchivoOrigen))
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btnCorregirPuntos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlarma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArchivoReemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArchivoReemplazo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(2, 2, 2)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReemplazar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlarma1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIngles)
                        .addGap(1, 1, 1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtArchivoOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArchivoOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArchivoOrigenActionPerformed

    private void btnArchivoOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoOrigenActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        //Indicamos lo que podemos seleccionar
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
        int seleccion=fc.showOpenDialog(this);
        //Si el usuario, pincha en aceptar
        if(seleccion==JFileChooser.APPROVE_OPTION){
            //Seleccionamos el fichero
            File fichero=fc.getSelectedFile();
            //Ecribe la ruta del fichero seleccionado en el campo de texto
            this.txtArchivoOrigen.setText(fichero.getAbsolutePath());
        }
    }//GEN-LAST:event_btnArchivoOrigenActionPerformed

    private void btnCorregirPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorregirPuntosActionPerformed
        // TODO add your handling code here:
        String d_archivo = this.txtArchivoOrigen.getText();
        if (!d_archivo.equals("")) {
            File archivo01 = new File (d_archivo);
            if (archivo01.exists() && archivo01.isFile()) {
                ArchivoTexto h = new ArchivoTexto(d_archivo);
                h.corregirPuntosPegados();
                this.txtAlarma.setText("Proceso Realizado");
                this.txtAlarma.setForeground(Color.green);
            }else{
                this.txtAlarma.setText("La direccion del archivo ingresado no existe o es no es valido :(");
                this.txtAlarma.setForeground(Color.red);
            }
        }else{
            this.txtAlarma.setText("Debe Escribir la direccion de un archivo para Continuar");
            this.txtAlarma.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnCorregirPuntosActionPerformed

    private void txtArchivoReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArchivoReemplazarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArchivoReemplazarActionPerformed

    private void btnArchivoReemplazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoReemplazoActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        //Indicamos lo que podemos seleccionar
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
        int seleccion=fc.showOpenDialog(this);
        //Si el usuario, pincha en aceptar
        if(seleccion==JFileChooser.APPROVE_OPTION){
            //Seleccionamos el fichero
            File fichero=fc.getSelectedFile();
            //Ecribe la ruta del fichero seleccionado en el campo de texto
            this.txtArchivoReemplazar.setText(fichero.getAbsolutePath());
        }
    }//GEN-LAST:event_btnArchivoReemplazoActionPerformed

    private void btnReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReemplazarActionPerformed
        // TODO add your handling code here:
        String d_archivo = this.txtArchivoOrigen.getText();
        String d_reemplazo= this.txtArchivoReemplazar.getText();
        if (!d_archivo.equals("")&&!d_reemplazo.equals("")) {
            File archivo01 = new File (d_archivo);
            File archivo02 = new File (d_reemplazo);
            if (archivo01.exists() && archivo01.isFile() && archivo02.exists() && archivo02.isFile()) {                
                String separador = this.txtSeparador.getText();
                if (separador!="") {
                    ArchivoTexto tr=new ArchivoTexto(d_archivo);
                    tr.reemplazarLista(d_reemplazo, separador);
                    this.txtAlarma1.setText("Proceso Realizado");
                    this.txtAlarma1.setForeground(Color.green);
                }else{
                    this.txtAlarma1.setText("Debe introducir el separador que usara en el archivo.");
                    this.txtAlarma1.setForeground(Color.red);
                }                
            }else{
                this.txtAlarma1.setText("La direccion del archivo ingresado no existe o es no es valido :(");
                this.txtAlarma1.setForeground(Color.red);
            }
        }else{
            this.txtAlarma1.setText("Debe Escribir la direccion de un archivo para Continuar");
            this.txtAlarma1.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnReemplazarActionPerformed

    private void txtSeparadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeparadorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSeparadorActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String d_archivo = this.txtArchivoOrigen.getText();
        if (!d_archivo.equals("")) {
            File archivo01 = new File (d_archivo);
            if (archivo01.exists() && archivo01.isFile()) {
                ArchivoTexto h = new ArchivoTexto(d_archivo);
                String x = h.buscarIngles();
                if (x!="") {
                    this.txtIngles.setText(x);
                }else{
                    this.txtIngles.setText("No hay ingles");
                }                
                this.txtAlarma.setText("Proceso Realizado");
                this.txtAlarma.setForeground(Color.green);
            }else{
                this.txtAlarma.setText("La direccion del archivo ingresado no existe o es no es valido :(");
                this.txtAlarma.setForeground(Color.red);
            }
        }else{
            this.txtAlarma.setText("Debe Escribir la direccion de un archivo para Continuar");
            this.txtAlarma.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInglesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInglesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEdicionArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivoOrigen;
    private javax.swing.JButton btnArchivoReemplazo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCorregirPuntos;
    private javax.swing.JButton btnReemplazar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel txtAlarma;
    private javax.swing.JLabel txtAlarma1;
    private javax.swing.JTextField txtArchivoOrigen;
    private javax.swing.JTextField txtArchivoReemplazar;
    private javax.swing.JTextField txtIngles;
    private javax.swing.JTextField txtSeparador;
    // End of variables declaration//GEN-END:variables
}
