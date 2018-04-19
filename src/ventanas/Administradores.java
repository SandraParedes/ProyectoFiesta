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
public class Administradores extends javax.swing.JFrame {

    /**
     * Creates new form Administradores
     */
    public Administradores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jBVolverInvitados = new javax.swing.JButton();
        jBExitInvitados = new javax.swing.JButton();
        jCBinvitados = new javax.swing.JComboBox<>();
        jBAnadirAsistente = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBFav = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 55));
        jLabel2.setText("Administradores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 160, 60));

        jBVolverInvitados.setBackground(new java.awt.Color(102, 204, 255));
        jBVolverInvitados.setForeground(new java.awt.Color(51, 51, 55));
        jBVolverInvitados.setText("Volver");
        getContentPane().add(jBVolverInvitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, -1));

        jBExitInvitados.setBackground(new java.awt.Color(102, 153, 255));
        jBExitInvitados.setForeground(new java.awt.Color(51, 51, 55));
        jBExitInvitados.setText("Salir");
        jBExitInvitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitInvitadosActionPerformed(evt);
            }
        });
        getContentPane().add(jBExitInvitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 70, -1));

        jCBinvitados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jCBinvitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, -1));

        jBAnadirAsistente.setBackground(new java.awt.Color(153, 153, 255));
        jBAnadirAsistente.setForeground(new java.awt.Color(51, 51, 55));
        jBAnadirAsistente.setText("Añadir");
        getContentPane().add(jBAnadirAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 80, -1));

        jBBorrar.setBackground(new java.awt.Color(204, 153, 255));
        jBBorrar.setForeground(new java.awt.Color(51, 51, 55));
        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, -1));

        jBFav.setBackground(new java.awt.Color(255, 153, 51));
        jBFav.setForeground(new java.awt.Color(51, 51, 55));
        jBFav.setText("Favoritos");
        getContentPane().add(jBFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/imagenes/admin_v01D_support.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 230, 230));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/imagenes/fondo_blanco.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExitInvitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitInvitadosActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBExitInvitadosActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Administradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jBAnadirAsistente;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBExitInvitados;
    private javax.swing.JButton jBFav;
    private javax.swing.JButton jBVolverInvitados;
    private javax.swing.JComboBox<String> jCBinvitados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
