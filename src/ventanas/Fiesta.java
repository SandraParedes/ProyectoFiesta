/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Usuario
 */
public class Fiesta extends javax.swing.JFrame {

    /**
     * Creates new form Fiesta
     */
    public Fiesta() {
        initComponents();
         this.setLocationRelativeTo(null);
          this.jBBebida.setVisible(false);
        this.jBComida.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBComida = new javax.swing.JButton();
        jBBebida = new javax.swing.JButton();
        jTFnombreFiesta = new javax.swing.JTextArea();
        jBMusica = new javax.swing.JButton();
        jBAsistentes = new javax.swing.JButton();
        jBAlimentos = new javax.swing.JButton();
        jBFecha = new javax.swing.JButton();
        jBExitFiesta = new javax.swing.JButton();
        jBEnviarFiesta = new javax.swing.JButton();
        jBVolverFiesta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBComida.setBackground(new java.awt.Color(204, 255, 102));
        jBComida.setForeground(new java.awt.Color(51, 51, 55));
        jBComida.setText("Comida");
        getContentPane().add(jBComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jBBebida.setBackground(new java.awt.Color(204, 255, 102));
        jBBebida.setForeground(new java.awt.Color(51, 51, 55));
        jBBebida.setText("Bebida");
        getContentPane().add(jBBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 70, -1));

        jTFnombreFiesta.setBackground(new java.awt.Color(56, 63, 75));
        jTFnombreFiesta.setColumns(20);
        jTFnombreFiesta.setRows(5);
        jTFnombreFiesta.setText("\n");
        getContentPane().add(jTFnombreFiesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 270, 30));

        jBMusica.setBackground(new java.awt.Color(153, 204, 0));
        jBMusica.setForeground(new java.awt.Color(51, 51, 55));
        jBMusica.setText("Música");
        jBMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMusicaActionPerformed(evt);
            }
        });
        getContentPane().add(jBMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 100, 30));

        jBAsistentes.setBackground(new java.awt.Color(153, 255, 153));
        jBAsistentes.setForeground(new java.awt.Color(51, 51, 55));
        jBAsistentes.setText("Asistentes");
        jBAsistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAsistentesActionPerformed(evt);
            }
        });
        getContentPane().add(jBAsistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 100, 30));

        jBAlimentos.setBackground(new java.awt.Color(204, 255, 102));
        jBAlimentos.setForeground(new java.awt.Color(51, 51, 55));
        jBAlimentos.setText("Alimentos");
        jBAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlimentosActionPerformed(evt);
            }
        });
        getContentPane().add(jBAlimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 100, 30));

        jBFecha.setBackground(new java.awt.Color(0, 204, 102));
        jBFecha.setForeground(new java.awt.Color(51, 51, 55));
        jBFecha.setText("Fechas");
        jBFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFechaActionPerformed(evt);
            }
        });
        getContentPane().add(jBFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 100, 30));

        jBExitFiesta.setBackground(new java.awt.Color(102, 153, 255));
        jBExitFiesta.setForeground(new java.awt.Color(55, 55, 51));
        jBExitFiesta.setText("Salir");
        jBExitFiesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitFiestaActionPerformed(evt);
            }
        });
        getContentPane().add(jBExitFiesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 70, -1));

        jBEnviarFiesta.setBackground(new java.awt.Color(102, 204, 255));
        jBEnviarFiesta.setForeground(new java.awt.Color(55, 55, 51));
        jBEnviarFiesta.setText("Enviar");
        jBEnviarFiesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarFiestaActionPerformed(evt);
            }
        });
        getContentPane().add(jBEnviarFiesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 70, -1));

        jBVolverFiesta.setBackground(new java.awt.Color(102, 204, 255));
        jBVolverFiesta.setForeground(new java.awt.Color(55, 55, 51));
        jBVolverFiesta.setText("Volver");
        jBVolverFiesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverFiestaActionPerformed(evt);
            }
        });
        getContentPane().add(jBVolverFiesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setForeground(new java.awt.Color(51, 51, 55));
        jButton2.setText("Historial de fiestas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 160, 30));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/imagenes/PARTY TIME.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 380));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/imagenes/globosverdes.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 180, 340));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Crear Fiesta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 240, 70));

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setForeground(new java.awt.Color(51, 51, 55));
        jButton1.setText("Añadir administrador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 160, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/imagenes/fondo_blanco.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExitFiestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitFiestaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBExitFiestaActionPerformed

    private void jBEnviarFiestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarFiestaActionPerformed

    }//GEN-LAST:event_jBEnviarFiestaActionPerformed

    private void jBVolverFiestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverFiestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBVolverFiestaActionPerformed

    private void jBAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlimentosActionPerformed
        // TODO add your handling code here:
        this.jBBebida.setVisible(true);
        this.jBComida.setVisible(true);
    }//GEN-LAST:event_jBAlimentosActionPerformed

    private void jBMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMusicaActionPerformed
        this.jBBebida.setVisible(false);
        this.jBComida.setVisible(false);
    }//GEN-LAST:event_jBMusicaActionPerformed

    private void jBAsistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsistentesActionPerformed
        this.jBBebida.setVisible(false);
        this.jBComida.setVisible(false);
    }//GEN-LAST:event_jBAsistentesActionPerformed

    private void jBFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFechaActionPerformed
       this.jBBebida.setVisible(false);
       this.jBComida.setVisible(false);
    }//GEN-LAST:event_jBFechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jBBebida.setVisible(false);
        this.jBComida.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Fiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fiesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jBAlimentos;
    private javax.swing.JButton jBAsistentes;
    private javax.swing.JButton jBBebida;
    private javax.swing.JButton jBComida;
    private javax.swing.JButton jBEnviarFiesta;
    private javax.swing.JButton jBExitFiesta;
    private javax.swing.JButton jBFecha;
    private javax.swing.JButton jBMusica;
    private javax.swing.JButton jBVolverFiesta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextArea jTFnombreFiesta;
    // End of variables declaration//GEN-END:variables
}
