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
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        ocultarBotonesVerFiestas();
        visiblesBotonesFav(false);
    }

    public void ocultarBotonesVerFiestas() {
        this.jBAceptadasPrincipal.setVisible(false);
        this.jBMisFiestasPrincipal.setVisible(false);
        this.jBRechazadasPrincipal.setVisible(false);
        this.jBMisFiestasPrincipal.setVisible(false);
        this.jBInvitacionesPrincipal1.setVisible(false);
        this.jBEditar.setVisible(false);
        this.jList.setVisible(false);
        this.jBSug1.setVisible(false);
        this.jBAceptar.setVisible(false);
        this.jBRechazar.setVisible(false);
    }

    public void visiblesBotonesFav(boolean visible) {
        this.jBFavC.setVisible(visible);
        this.jBFavM.setVisible(visible);
        this.jBFavU.setVisible(visible);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBRechazadasPrincipal = new javax.swing.JButton();
        jBAceptadasPrincipal = new javax.swing.JButton();
        jBMisFiestasPrincipal = new javax.swing.JButton();
        jBVerFiestasPrincipal = new javax.swing.JButton();
        jBCrearFiestaPrincipal = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBAceptar = new javax.swing.JButton();
        jBRechazar = new javax.swing.JButton();
        jList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jBSug1 = new javax.swing.JButton();
        jBFavC = new javax.swing.JButton();
        jBFavM = new javax.swing.JButton();
        jBFavU = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jBExitPrincipal = new javax.swing.JButton();
        jBVolverPrincipal = new javax.swing.JButton();
        jBInvitacionesPrincipal1 = new javax.swing.JButton();
        jBFavIni = new javax.swing.JButton();
        jBAlerPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBRechazadasPrincipal.setBackground(new java.awt.Color(0, 102, 153));
        jBRechazadasPrincipal.setText("Rechazadas");
        jBRechazadasPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRechazadasPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jBRechazadasPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 100, -1));

        jBAceptadasPrincipal.setBackground(new java.awt.Color(0, 102, 153));
        jBAceptadasPrincipal.setText("Aceptadas");
        jBAceptadasPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptadasPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jBAceptadasPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 100, -1));

        jBMisFiestasPrincipal.setBackground(new java.awt.Color(0, 102, 153));
        jBMisFiestasPrincipal.setText("Mis Fiestas");
        jBMisFiestasPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMisFiestasPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jBMisFiestasPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 100, -1));

        jBVerFiestasPrincipal.setBackground(new java.awt.Color(0, 51, 102));
        jBVerFiestasPrincipal.setText("Ver Fiestas");
        jBVerFiestasPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerFiestasPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jBVerFiestasPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 150, 40));

        jBCrearFiestaPrincipal.setBackground(new java.awt.Color(0, 51, 102));
        jBCrearFiestaPrincipal.setText("Crear Fiesta");
        jBCrearFiestaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearFiestaPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jBCrearFiestaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, 40));

        jBEditar.setBackground(new java.awt.Color(0, 51, 102));
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 100, -1));

        jBAceptar.setBackground(new java.awt.Color(0, 51, 102));
        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 100, -1));

        jBRechazar.setBackground(new java.awt.Color(0, 51, 102));
        jBRechazar.setText("Rechazar");
        jBRechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRechazarActionPerformed(evt);
            }
        });
        getContentPane().add(jBRechazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 100, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList.setViewportView(jList1);

        getContentPane().add(jList, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 150, 150));

        jBSug1.setBackground(new java.awt.Color(0, 51, 102));
        jBSug1.setText("Sugerencias");
        jBSug1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSug1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBSug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 100, -1));

        jBFavC.setBackground(new java.awt.Color(255, 102, 51));
        jBFavC.setText("Comida");
        getContentPane().add(jBFavC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, -1));

        jBFavM.setBackground(new java.awt.Color(255, 102, 51));
        jBFavM.setText("Musica");
        getContentPane().add(jBFavM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, -1));

        jBFavU.setBackground(new java.awt.Color(255, 102, 51));
        jBFavU.setText("Usuarios");
        getContentPane().add(jBFavU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/imagenes/Party-PNG-HD.png"))); // NOI18N
        Fondo.setText("Rechazadas");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 200, 760, 210));

        jBExitPrincipal.setBackground(new java.awt.Color(102, 153, 255));
        jBExitPrincipal.setForeground(new java.awt.Color(55, 55, 51));
        jBExitPrincipal.setText("Salir");
        jBExitPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jBExitPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 80, -1));

        jBVolverPrincipal.setBackground(new java.awt.Color(102, 204, 255));
        jBVolverPrincipal.setForeground(new java.awt.Color(55, 55, 51));
        jBVolverPrincipal.setText("LogOut");
        jBVolverPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jBVolverPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, -1));

        jBInvitacionesPrincipal1.setBackground(new java.awt.Color(0, 102, 153));
        jBInvitacionesPrincipal1.setText("Invitaciones");
        jBInvitacionesPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInvitacionesPrincipal1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBInvitacionesPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 100, -1));

        jBFavIni.setBackground(new java.awt.Color(255, 153, 51));
        jBFavIni.setText("Favoritos");
        jBFavIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFavIniActionPerformed(evt);
            }
        });
        getContentPane().add(jBFavIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, -1));

        jBAlerPrincipal.setBackground(new java.awt.Color(0, 51, 255));
        jBAlerPrincipal.setText("Alergenos");
        getContentPane().add(jBAlerPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExitPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitPrincipalActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jBExitPrincipalActionPerformed

    private void jBCrearFiestaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearFiestaPrincipalActionPerformed
        
    }//GEN-LAST:event_jBCrearFiestaPrincipalActionPerformed

    private void jBVolverPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverPrincipalActionPerformed

    }//GEN-LAST:event_jBVolverPrincipalActionPerformed

    private void jBVerFiestasPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerFiestasPrincipalActionPerformed
        this.jBAceptadasPrincipal.setVisible(true);
        this.jBMisFiestasPrincipal.setVisible(true);
        this.jBRechazadasPrincipal.setVisible(true);
        this.jBMisFiestasPrincipal.setVisible(true);
        this.jBInvitacionesPrincipal1.setVisible(true);
        this.visiblesBotonesFav(false);
    }//GEN-LAST:event_jBVerFiestasPrincipalActionPerformed

    private void jBMisFiestasPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMisFiestasPrincipalActionPerformed
        // TODO add your handling code here:
        this.jList.setVisible(true);
        this.jBSug1.setVisible(true);
        this.jBEditar.setVisible(true);
         this.jBAceptar.setVisible(false);
        this.jBRechazar.setVisible(false);
    }//GEN-LAST:event_jBMisFiestasPrincipalActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBInvitacionesPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInvitacionesPrincipal1ActionPerformed
        // TODO add your handling code here:
        this.jList.setVisible(true);
         this.jBSug1.setVisible(false);
         this.jBEditar.setVisible(false);
          this.jBAceptar.setVisible(true);
        this.jBRechazar.setVisible(true);
    }//GEN-LAST:event_jBInvitacionesPrincipal1ActionPerformed

    private void jBAceptadasPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptadasPrincipalActionPerformed
        // TODO add your handling code here:
        this.jList.setVisible(true);
         this.jBSug1.setVisible(true);
         this.jBEditar.setVisible(false);
          this.jBAceptar.setVisible(false);
        this.jBRechazar.setVisible(true);
    }//GEN-LAST:event_jBAceptadasPrincipalActionPerformed

    private void jBRechazadasPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRechazadasPrincipalActionPerformed
        // TODO add your handling code here:
        this.jList.setVisible(true);
        this.jBSug1.setVisible(false);
        this.jBEditar.setVisible(false);
         this.jBAceptar.setVisible(true);
        this.jBRechazar.setVisible(false);
    }//GEN-LAST:event_jBRechazadasPrincipalActionPerformed

    private void jBSug1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSug1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSug1ActionPerformed

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jBRechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRechazarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBRechazarActionPerformed

    private void jBFavIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFavIniActionPerformed
        this.ocultarBotonesVerFiestas();
        this.visiblesBotonesFav(true);
    }//GEN-LAST:event_jBFavIniActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jBAceptadasPrincipal;
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBAlerPrincipal;
    private javax.swing.JButton jBCrearFiestaPrincipal;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExitPrincipal;
    private javax.swing.JButton jBFavC;
    private javax.swing.JButton jBFavIni;
    private javax.swing.JButton jBFavM;
    private javax.swing.JButton jBFavU;
    private javax.swing.JButton jBInvitacionesPrincipal1;
    private javax.swing.JButton jBMisFiestasPrincipal;
    private javax.swing.JButton jBRechazadasPrincipal;
    private javax.swing.JButton jBRechazar;
    private javax.swing.JButton jBSug1;
    private javax.swing.JButton jBVerFiestasPrincipal;
    private javax.swing.JButton jBVolverPrincipal;
    private javax.swing.JScrollPane jList;
    private javax.swing.JList<String> jList1;
    // End of variables declaration//GEN-END:variables
}
