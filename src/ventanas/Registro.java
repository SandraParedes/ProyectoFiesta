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
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBExitRegistro = new javax.swing.JButton();
        jBVolverRegistro = new javax.swing.JButton();
        jTAEmail = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTANombre = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jEnviar = new javax.swing.JButton();
        jPasswordRegistro = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBExitRegistro.setBackground(new java.awt.Color(102, 153, 255));
        jBExitRegistro.setForeground(new java.awt.Color(55, 55, 51));
        jBExitRegistro.setText("Salir");
        jBExitRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(jBExitRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jBVolverRegistro.setBackground(new java.awt.Color(102, 204, 255));
        jBVolverRegistro.setForeground(new java.awt.Color(55, 55, 51));
        jBVolverRegistro.setText("Volver");
        jBVolverRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(jBVolverRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jTAEmail.setColumns(20);
        jTAEmail.setRows(5);
        jPanel1.add(jTAEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, 26));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("   Nombre :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 100, 24));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Email :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 80, 41));

        jTANombre.setColumns(20);
        jTANombre.setRows(5);
        jPanel1.add(jTANombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 26));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 110, 41));

        jEnviar.setBackground(new java.awt.Color(102, 204, 255));
        jEnviar.setForeground(new java.awt.Color(55, 55, 51));
        jEnviar.setText("Enviar");
        jPanel1.add(jEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 70, 30));

        jPasswordRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/imagenes/globos-fondo-transp.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExitRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitRegistroActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBExitRegistroActionPerformed

    private void jBVolverRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverRegistroActionPerformed
        
    }//GEN-LAST:event_jBVolverRegistroActionPerformed

    private void jPasswordRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExitRegistro;
    private javax.swing.JButton jBVolverRegistro;
    private javax.swing.JButton jEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordRegistro;
    private javax.swing.JTextArea jTAEmail;
    private javax.swing.JTextArea jTANombre;
    // End of variables declaration//GEN-END:variables
}