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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(236, 236, 236))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(btnCorregirPuntos)
                            .addComponent(txtAlarma))
                        .addGap(0, 152, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtArchivoOrigen)
                                .addGap(18, 18, 18)
                                .addComponent(btnArchivoOrigen)))
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
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
                .addContainerGap(137, Short.MAX_VALUE))
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
                h.escribirArchivo();
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
    private javax.swing.JButton btnCorregirPuntos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel txtAlarma;
    private javax.swing.JTextField txtArchivoOrigen;
    // End of variables declaration//GEN-END:variables
}
