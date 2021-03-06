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
public class JFBebida extends javax.swing.JFrame {

    /**
     * Creates new form Bebida
     */
    public JFBebida() {
        initComponents();
        this.setLocationRelativeTo(null);
        ingrVisible(false);
    }

    public void ingrVisible(boolean visible) {
        this.LIngr1B.setVisible(visible);
        this.LIngr2.setVisible(visible);
        this.LIngr3.setVisible(visible);
        this.LIngr4.setVisible(visible);
        this.LIngr5.setVisible(visible);
        this.SPLIngrB.setVisible(visible);
        this.jBborrarIngr.setVisible(visible);
        this.jBanadirIngrB.setVisible(visible);
        this.jBcalcularPrecio.setVisible(visible);
        this.jTFNombreIngrB.setVisible(visible);
        this.jTFPrecioIngB.setVisible(visible);
        this.jTFcantidadIngrB.setVisible(visible);
        this.jLabel3.setVisible(visible);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jBborrarBebida = new javax.swing.JButton();
        jBFavbebida = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCBBebida = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTFPrecioBebida = new javax.swing.JTextField();
        jTFCantidadBebida = new javax.swing.JTextField();
        jTFNombreBebida = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jBanadirbebida = new javax.swing.JButton();
        jBanadirIngrB = new javax.swing.JButton();
        LIngr5 = new javax.swing.JLabel();
        SPLIngrB = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jBcalcularPrecio = new javax.swing.JButton();
        jBborrarIngr = new javax.swing.JButton();
        jBExitBebida = new javax.swing.JButton();
        jBVolverBebida = new javax.swing.JButton();
        LIngr4 = new javax.swing.JLabel();
        LIngr3 = new javax.swing.JLabel();
        LIngr2 = new javax.swing.JLabel();
        LIngr1B = new javax.swing.JLabel();
        jTFPrecioIngB = new javax.swing.JTextField();
        jTFNombreIngrB = new javax.swing.JTextField();
        jTFcantidadIngrB = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 55));
        jLabel3.setText("Bebida");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 120, 70));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 150));

        jBborrarBebida.setBackground(new java.awt.Color(255, 102, 102));
        jBborrarBebida.setForeground(new java.awt.Color(51, 51, 55));
        jBborrarBebida.setText("Borrar");
        getContentPane().add(jBborrarBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 80, -1));

        jBFavbebida.setBackground(new java.awt.Color(255, 153, 51));
        jBFavbebida.setForeground(new java.awt.Color(51, 51, 55));
        jBFavbebida.setText("Favoritos");
        getContentPane().add(jBFavbebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 55));
        jLabel11.setText("Cantidad :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 55));
        jLabel12.setText("Nombre :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, 30));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 55));
        jLabel6.setText("Precio : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jCBBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebida no alcoholica", "Bebida alcoholica" }));
        jCBBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBBebidaActionPerformed(evt);
            }
        });
        getContentPane().add(jCBBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 140, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 55));
        jLabel1.setText("Tipo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 50, 20));
        getContentPane().add(jTFPrecioBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 30, -1));
        getContentPane().add(jTFCantidadBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 30, -1));
        getContentPane().add(jTFNombreBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 140, 30));

        jLabel13.setForeground(new java.awt.Color(51, 51, 55));
        jLabel13.setText("€");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 10, 20));

        jBanadirbebida.setBackground(new java.awt.Color(255, 153, 153));
        jBanadirbebida.setForeground(new java.awt.Color(51, 51, 55));
        jBanadirbebida.setText("Añadir");
        getContentPane().add(jBanadirbebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 80, -1));

        jBanadirIngrB.setBackground(new java.awt.Color(255, 153, 153));
        jBanadirIngrB.setForeground(new java.awt.Color(51, 51, 55));
        jBanadirIngrB.setText("Añadir");
        getContentPane().add(jBanadirIngrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 80, -1));

        LIngr5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LIngr5.setForeground(new java.awt.Color(51, 51, 55));
        LIngr5.setText(" Ingredientes");
        getContentPane().add(LIngr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 110, 60));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        SPLIngrB.setViewportView(jList2);

        getContentPane().add(SPLIngrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 120, 90));

        jBcalcularPrecio.setBackground(new java.awt.Color(102, 204, 255));
        jBcalcularPrecio.setForeground(new java.awt.Color(51, 51, 55));
        jBcalcularPrecio.setText("Calcular Precio");
        getContentPane().add(jBcalcularPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 120, -1));

        jBborrarIngr.setBackground(new java.awt.Color(255, 102, 102));
        jBborrarIngr.setForeground(new java.awt.Color(51, 51, 55));
        jBborrarIngr.setText("Borrar");
        getContentPane().add(jBborrarIngr, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 80, -1));

        jBExitBebida.setBackground(new java.awt.Color(102, 153, 255));
        jBExitBebida.setForeground(new java.awt.Color(55, 55, 51));
        jBExitBebida.setText("Salir");
        jBExitBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitBebidaActionPerformed(evt);
            }
        });
        getContentPane().add(jBExitBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 80, -1));

        jBVolverBebida.setBackground(new java.awt.Color(102, 204, 255));
        jBVolverBebida.setForeground(new java.awt.Color(55, 55, 51));
        jBVolverBebida.setText("Volver");
        jBVolverBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverBebidaActionPerformed(evt);
            }
        });
        getContentPane().add(jBVolverBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, -1));

        LIngr4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        LIngr4.setForeground(new java.awt.Color(51, 51, 55));
        LIngr4.setText("Precio : ");
        getContentPane().add(LIngr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        LIngr3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        LIngr3.setForeground(new java.awt.Color(51, 51, 55));
        LIngr3.setText("Cantidad :");
        getContentPane().add(LIngr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, 20));

        LIngr2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        LIngr2.setForeground(new java.awt.Color(51, 51, 55));
        LIngr2.setText("Nombre :");
        getContentPane().add(LIngr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, 30));

        LIngr1B.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LIngr1B.setForeground(new java.awt.Color(51, 51, 55));
        LIngr1B.setText("Añadir Ingrediente");
        getContentPane().add(LIngr1B, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, 40));

        jTFPrecioIngB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPrecioIngBActionPerformed(evt);
            }
        });
        getContentPane().add(jTFPrecioIngB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 30, -1));
        getContentPane().add(jTFNombreIngrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 130, -1));
        getContentPane().add(jTFcantidadIngrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 30, -1));

        jLabel14.setForeground(new java.awt.Color(51, 51, 55));
        jLabel14.setText("€");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 10, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/Drink-PNG-Image.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 440, 230));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/fondo_blanco.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExitBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitBebidaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBExitBebidaActionPerformed

    private void jBVolverBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBVolverBebidaActionPerformed

    private void jTFPrecioIngBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPrecioIngBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPrecioIngBActionPerformed

    private void jCBBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBBebidaActionPerformed
      if(this.jCBBebida.getSelectedItem().toString().equals("Bebida alcoholica")){
           ingrVisible(true);
      }else{
           ingrVisible(false);
      }
    }//GEN-LAST:event_jCBBebidaActionPerformed

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
            java.util.logging.Logger.getLogger(JFBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFBebida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LIngr1B;
    private javax.swing.JLabel LIngr2;
    private javax.swing.JLabel LIngr3;
    private javax.swing.JLabel LIngr4;
    private javax.swing.JLabel LIngr5;
    private javax.swing.JScrollPane SPLIngrB;
    private javax.swing.JButton jBExitBebida;
    private javax.swing.JButton jBFavbebida;
    private javax.swing.JButton jBVolverBebida;
    private javax.swing.JButton jBanadirIngrB;
    private javax.swing.JButton jBanadirbebida;
    private javax.swing.JButton jBborrarBebida;
    private javax.swing.JButton jBborrarIngr;
    private javax.swing.JButton jBcalcularPrecio;
    private javax.swing.JComboBox<String> jCBBebida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCantidadBebida;
    private javax.swing.JTextField jTFNombreBebida;
    private javax.swing.JTextField jTFNombreIngrB;
    private javax.swing.JTextField jTFPrecioBebida;
    private javax.swing.JTextField jTFPrecioIngB;
    private javax.swing.JTextField jTFcantidadIngrB;
    // End of variables declaration//GEN-END:variables
}
