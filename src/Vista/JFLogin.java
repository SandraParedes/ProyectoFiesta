/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Usuario
 */
public class JFLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public JFLogin() {
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

        jLMensajeLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTAUsuarioLogin = new javax.swing.JTextField();
        jPasswordLogin = new javax.swing.JPasswordField();
        jBEnviarLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBExitLogin = new javax.swing.JButton();
        jBVolverLogin = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLMensajeLogin.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLMensajeLogin.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jLMensajeLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 310, 30));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(178, 37, 37));
        jLabel1.setText("Contraseña :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(178, 37, 37));
        jLabel2.setText("Usuario :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        JTAUsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTAUsuarioLoginActionPerformed(evt);
            }
        });
        getContentPane().add(JTAUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 110, 30));

        jPasswordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 110, 30));

        jBEnviarLogin.setBackground(new java.awt.Color(102, 204, 255));
        jBEnviarLogin.setForeground(new java.awt.Color(51, 51, 55));
        jBEnviarLogin.setText("Enviar");
        jBEnviarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jBEnviarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/fondo_blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 265, 410, 170));

        jBExitLogin.setBackground(new java.awt.Color(102, 153, 255));
        jBExitLogin.setForeground(new java.awt.Color(51, 51, 55));
        jBExitLogin.setText("Salir");
        jBExitLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jBExitLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jBVolverLogin.setBackground(new java.awt.Color(102, 204, 255));
        jBVolverLogin.setForeground(new java.awt.Color(51, 51, 55));
        jBVolverLogin.setText("Volver");
        jBVolverLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jBVolverLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/image.png"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordLoginActionPerformed

    private void JTAUsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTAUsuarioLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTAUsuarioLoginActionPerformed

    private void jBExitLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitLoginActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBExitLoginActionPerformed

    private void jBEnviarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEnviarLoginActionPerformed

    private void jBVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBVolverLoginActionPerformed

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField JTAUsuarioLogin;
    public javax.swing.JButton jBEnviarLogin;
    private javax.swing.JButton jBExitLogin;
    public javax.swing.JButton jBVolverLogin;
    private javax.swing.JLabel jFondo;
    public javax.swing.JLabel jLMensajeLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPasswordField jPasswordLogin;
    // End of variables declaration//GEN-END:variables
}