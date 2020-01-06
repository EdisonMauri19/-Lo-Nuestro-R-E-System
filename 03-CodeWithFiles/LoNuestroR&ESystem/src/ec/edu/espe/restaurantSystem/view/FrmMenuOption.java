/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.view;

import ec.edu.espe.restaurantSystem.model.*;
import javax.swing.ImageIcon;

/**
 *
 * @author camyt
 */
public class FrmMenuOption extends javax.swing.JFrame {
    private Account user;
    /**
     * Creates new form frmMenuOption
     */
    public FrmMenuOption() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblExtra.setVisible(false);
        this.lblName.setVisible(false);
        this.lblPrice.setVisible(false);
        this.setTitle("\tLo Nuestro Restaurant  | Menú");
         setIconImage(new ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSystem/view/img/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtDishTipe = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtExtra = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenuInformation = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rbtFirstDish = new javax.swing.JRadioButton();
        rbtMainCourse = new javax.swing.JRadioButton();
        rbtDessert = new javax.swing.JRadioButton();
        rbtDrink = new javax.swing.JRadioButton();
        lblName = new javax.swing.JLabel();
        lblExtra = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        gbtDishTipe.add(rbtExtra);
        rbtExtra.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtExtra.setText("Extras");
        rbtExtra.setToolTipText("Platos extras");
        rbtExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtExtraActionPerformed(evt);
            }
        });

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

        btnBack.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnBack.setText("Regresar");
        btnBack.setToolTipText("Regresar a menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setText("MENU");

        gbtDishTipe.add(rbtFirstDish);
        rbtFirstDish.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtFirstDish.setText("Entradas");
        rbtFirstDish.setToolTipText("Platos de ntrada");
        rbtFirstDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFirstDishActionPerformed(evt);
            }
        });

        gbtDishTipe.add(rbtMainCourse);
        rbtMainCourse.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtMainCourse.setText("Platos Fuerte");
        rbtMainCourse.setToolTipText("Platos fuerte");
        rbtMainCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMainCourseActionPerformed(evt);
            }
        });

        gbtDishTipe.add(rbtDessert);
        rbtDessert.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtDessert.setText("Postres");
        rbtDessert.setToolTipText("Plato de postres");
        rbtDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDessertActionPerformed(evt);
            }
        });

        gbtDishTipe.add(rbtDrink);
        rbtDrink.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtDrink.setText("Bebidas");
        rbtDrink.setToolTipText("Bebida");
        rbtDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDrinkActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblName.setText("Nombre:");

        lblExtra.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblExtra.setText("Extra:");

        lblPrice.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblPrice.setText("Precio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtFirstDish)
                        .addGap(18, 18, 18)
                        .addComponent(rbtMainCourse)
                        .addGap(18, 18, 18)
                        .addComponent(rbtDessert)
                        .addGap(29, 29, 29)
                        .addComponent(rbtDrink)
                        .addGap(18, 18, 18)
                        .addComponent(rbtExtra))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExtra)
                            .addComponent(lblName)
                            .addComponent(lblPrice))
                        .addContainerGap(186, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtFirstDish)
                            .addComponent(rbtMainCourse)
                            .addComponent(rbtDrink)
                            .addComponent(rbtExtra)
                            .addComponent(rbtDessert))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(lblName)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrice)
                        .addGap(13, 13, 13)
                        .addComponent(lblExtra)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(this.user.getUserType().equals("Administrador")){
           FrmMenuManager menuAdmin = new FrmMenuManager(this.user);
           menuAdmin.setVisible(true);
           this.setVisible(false); 
        }else{
           FrmMenuEmployee menuEmployee = new FrmMenuEmployee(this.user);
           menuEmployee.setVisible(true);
           this.setVisible(false); 
        }
        
    }//GEN-LAST:event_btnBackActionPerformed

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

    private void rbtExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtExtraActionPerformed
        // TODO add your handling code here:
        Dish dish = new Dish();
        dish.showProducts(tblMenuInformation, "Extra");
    }//GEN-LAST:event_rbtExtraActionPerformed

    private void rbtDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDrinkActionPerformed
        // TODO add your handling code here:
        Dish dish = new Dish();
        dish.showProducts(tblMenuInformation, "");
    }//GEN-LAST:event_rbtDrinkActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            

            @Override
            public void run() {
new FrmMenuOption().setVisible(true);            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup gbtDishTipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExtra;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JRadioButton rbtDessert;
    private javax.swing.JRadioButton rbtDrink;
    private javax.swing.JRadioButton rbtExtra;
    private javax.swing.JRadioButton rbtFirstDish;
    private javax.swing.JRadioButton rbtMainCourse;
    private javax.swing.JTable tblMenuInformation;
    // End of variables declaration//GEN-END:variables
    /**
     * @return the user
     */
    public Account getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Account user) {
        this.user = user;
    }
}
