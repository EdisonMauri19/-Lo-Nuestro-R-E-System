/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.view;

import ec.edu.espe.restaurantSystem.model.Dish;

/**
 *
 * @author camyt
 */
public class FrmOrderReport extends javax.swing.JFrame {

    /**
     * Creates new form FrmOrderReport
     */
    public FrmOrderReport() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenuInformation = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbtFirstDish = new javax.swing.JRadioButton();
        rbtMainCourse = new javax.swing.JRadioButton();
        rbtDessert = new javax.swing.JRadioButton();
        rbtDrink = new javax.swing.JRadioButton();
        rbtExtra = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Reporte de Ordenes");

        jLabel2.setText("Total:");

        tblMenuInformation.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tblMenuInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N", "Nombre", "Precio"
            }
        ));
        tblMenuInformation.setToolTipText("Tabla de menu");
        jScrollPane1.setViewportView(tblMenuInformation);

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        rbtFirstDish.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtFirstDish.setText("Entradas");
        rbtFirstDish.setToolTipText("Platos de ntrada");
        rbtFirstDish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtFirstDishMouseClicked(evt);
            }
        });
        rbtFirstDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFirstDishActionPerformed(evt);
            }
        });

        rbtMainCourse.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtMainCourse.setText("Platos Fuerte");
        rbtMainCourse.setToolTipText("Platos fuerte");
        rbtMainCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMainCourseActionPerformed(evt);
            }
        });

        rbtDessert.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtDessert.setText("Postres");
        rbtDessert.setToolTipText("Plato de postres");
        rbtDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDessertActionPerformed(evt);
            }
        });

        rbtDrink.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtDrink.setText("Bebidas");
        rbtDrink.setToolTipText("Bebida");
        rbtDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDrinkActionPerformed(evt);
            }
        });

        rbtExtra.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtExtra.setText("Extras");
        rbtExtra.setToolTipText("Platos extras");
        rbtExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(rbtFirstDish)
                    .addGap(18, 18, 18)
                    .addComponent(rbtMainCourse)
                    .addGap(18, 18, 18)
                    .addComponent(rbtDessert)
                    .addGap(29, 29, 29)
                    .addComponent(rbtDrink)
                    .addGap(18, 18, 18)
                    .addComponent(rbtExtra)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtFirstDish)
                        .addComponent(rbtMainCourse)
                        .addComponent(rbtDrink)
                        .addComponent(rbtExtra)
                        .addComponent(rbtDessert))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtFirstDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFirstDishActionPerformed
        // TODO add your handling code here:
        Dish dish = new Dish();
        dish.showProducts(tblMenuInformation, "Entrada");

    }//GEN-LAST:event_rbtFirstDishActionPerformed

    private void rbtMainCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMainCourseActionPerformed
        // TODO add your handling code here:
        Dish dish = new Dish();
        dish.showProducts(tblMenuInformation, "Plato Fuerte");
    }//GEN-LAST:event_rbtMainCourseActionPerformed

    private void rbtDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDessertActionPerformed
        // TODO add your handling code here:
        Dish dish = new Dish();
        dish.showProducts(tblMenuInformation, "Postre");
    }//GEN-LAST:event_rbtDessertActionPerformed

    private void rbtDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDrinkActionPerformed
        // TODO add your handling code here:
        Dish dish = new Dish();
        dish.showProducts(tblMenuInformation, "");
    }//GEN-LAST:event_rbtDrinkActionPerformed

    private void rbtExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtExtraActionPerformed
        // TODO add your handling code here:
        Dish dish = new Dish();
        dish.showProducts(tblMenuInformation, "Extra");
    }//GEN-LAST:event_rbtExtraActionPerformed

    private void rbtFirstDishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtFirstDishMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtFirstDishMouseClicked

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
   
       
        
    }//GEN-LAST:event_txtTotalActionPerformed

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
            java.util.logging.Logger.getLogger(FrmOrderReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOrderReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOrderReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOrderReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOrderReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtDessert;
    private javax.swing.JRadioButton rbtDrink;
    private javax.swing.JRadioButton rbtExtra;
    private javax.swing.JRadioButton rbtFirstDish;
    private javax.swing.JRadioButton rbtMainCourse;
    private javax.swing.JTable tblMenuInformation;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
