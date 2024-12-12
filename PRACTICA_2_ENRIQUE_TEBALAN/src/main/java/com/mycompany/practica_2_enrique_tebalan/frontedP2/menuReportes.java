/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practica_2_enrique_tebalan.frontedP2;
import com.mycompany.practica_2_enrique_tebalan.frontedP2.menuBienvenida;
import com.mycompany.practica_2_enrique_tebalan.gestorArchivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */



public class menuReportes extends javax.swing.JFrame {

    /**
     * Creates new form menuReportes
     */
    
    private static final String PATH_CARPETA = "com/mycompany/practica_2_enrique_tebalan";
    private static final String PATH_RELATIVO_ARCHIVO = "texto.txt";
    private static final String PATH_ABSOLUTO_ARCHIVO = "com/mycompany/practica_2_enrique_tebalan";
     private static final String PATH_ARCHIVO = PATH_RELATIVO_ARCHIVO;
     
    public menuReportes() {
        initComponents();
    }

    public String leerArchivoDeTextoCompleto() {
        StringBuilder contenido = new StringBuilder();
        File archivoTexto = new File(PATH_ARCHIVO);

        try (FileReader fileReader = new FileReader(archivoTexto);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String linea;
            while((linea = bufferedReader.readLine()) != null) {
                contenido.append(linea).append("\n");  // Agregar cada línea al contenido
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contenido.toString();
    }
    
    public void mostrarContenidoEnDialogo() {
        String contenidoArchivo = leerArchivoDeTextoCompleto();  // Obtener el contenido del archivo

        // Mostrar el contenido en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, contenidoArchivo, "Contenido del archivo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        historialJugadores = new javax.swing.JButton();
        mejorJugador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REPORTES - MEMORIA");

        regresar.setText("REGRESAR");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        historialJugadores.setText("HISTORIAL DE GANADORES");
        historialJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialJugadoresActionPerformed(evt);
            }
        });

        mejorJugador.setText("MEJOR JUGADOR");
        mejorJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mejorJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(regresar)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(mejorJugador))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(historialJugadores)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addComponent(historialJugadores)
                .addGap(36, 36, 36)
                .addComponent(mejorJugador)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historialJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialJugadoresActionPerformed
        leerArchivoDeTextoCompleto();
        mostrarContenidoEnDialogo();
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_historialJugadoresActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        menuBienvenida menu1= new menuBienvenida();
        menu1.setLocationRelativeTo(null);
        menu1.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void mejorJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mejorJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mejorJugadorActionPerformed

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
            java.util.logging.Logger.getLogger(menuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton historialJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mejorJugador;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
