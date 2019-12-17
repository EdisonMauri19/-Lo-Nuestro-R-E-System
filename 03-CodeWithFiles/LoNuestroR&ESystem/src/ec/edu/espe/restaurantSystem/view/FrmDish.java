/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.view;

import ec.edu.espe.restaurantSystem.controller.DishManager;
import ec.edu.espe.restaurantSystem.controller.DrinkManager;
import ec.edu.espe.restaurantSystem.model.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class FrmDish extends javax.swing.JFrame {
    private Account user;
    /**
     * Creates new form frmDish
     */
    public FrmDish() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cmbQuantity.setVisible(false);
        this.lblQuantity.setVisible(false);
        this.setTitle("\tLo Nuestro Restaurant  | Gestión de Platos");
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

        gbtType = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        spiPrice = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        rbtMainCourse = new javax.swing.JRadioButton();
        rbtDessert = new javax.swing.JRadioButton();
        rbtDrink = new javax.swing.JRadioButton();
        rbtExtra = new javax.swing.JRadioButton();
        btnAddDish = new javax.swing.JButton();
        rbtFirstDish = new javax.swing.JRadioButton();
        lblQuantity = new javax.swing.JLabel();
        cmbQuantity = new javax.swing.JComboBox<>();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setText("Ingreso de Nuevo Plato");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Precio:");

        txtName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtName.setToolTipText("Ingrese nombre del plato");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        spiPrice.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        spiPrice.setModel(new javax.swing.SpinnerNumberModel(1.0f, null, null, 0.05f));
        spiPrice.setToolTipText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Tipo:");

        gbtType.add(rbtMainCourse);
        rbtMainCourse.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rbtMainCourse.setText("Plato Fuerte");
        rbtMainCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMainCourseActionPerformed(evt);
            }
        });

        gbtType.add(rbtDessert);
        rbtDessert.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rbtDessert.setText("Postre");
        rbtDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDessertActionPerformed(evt);
            }
        });

        gbtType.add(rbtDrink);
        rbtDrink.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rbtDrink.setText("Bebida");
        rbtDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDrinkActionPerformed(evt);
            }
        });

        gbtType.add(rbtExtra);
        rbtExtra.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rbtExtra.setText("Extra");
        rbtExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtExtraActionPerformed(evt);
            }
        });

        btnAddDish.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnAddDish.setText("Añadir");
        btnAddDish.setToolTipText("Añadir plato");
        btnAddDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDishActionPerformed(evt);
            }
        });

        gbtType.add(rbtFirstDish);
        rbtFirstDish.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rbtFirstDish.setText("Entrada");
        rbtFirstDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFirstDishActionPerformed(evt);
            }
        });

        lblQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblQuantity.setText("Cantidad:");

        cmbQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cmbQuantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "350 ml", "500 ml", "750 ml", "1 L", "1.5 L", "2 L", "3 L" }));
        cmbQuantity.setToolTipText("Cantidad de bebida");

        btnExit.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnExit.setText("Regresar");
        btnExit.setToolTipText("Regresar a menu");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblQuantity)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddDish)
                                .addGap(166, 166, 166)
                                .addComponent(btnExit))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtDessert)
                            .addComponent(rbtExtra)
                            .addComponent(rbtFirstDish)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spiPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbtMainCourse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbQuantity, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtDrink, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spiPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtFirstDish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtMainCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtDessert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtDrink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtExtra)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(cmbQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDish, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDrinkActionPerformed
        // TODO add your handling code here:
        this.cmbQuantity.setVisible(true);
        this.lblQuantity.setVisible(true);
    }//GEN-LAST:event_rbtDrinkActionPerformed

    private void rbtFirstDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFirstDishActionPerformed
        // TODO add your handling code here:
        this.cmbQuantity.setVisible(false);
        this.lblQuantity.setVisible(false);
    }//GEN-LAST:event_rbtFirstDishActionPerformed

    private void rbtMainCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMainCourseActionPerformed
        // TODO add your handling code here:
        this.cmbQuantity.setVisible(false);
        this.lblQuantity.setVisible(false);
    }//GEN-LAST:event_rbtMainCourseActionPerformed

    private void rbtDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDessertActionPerformed
        // TODO add your handling code here:
        this.cmbQuantity.setVisible(false);
        this.lblQuantity.setVisible(false);
    }//GEN-LAST:event_rbtDessertActionPerformed

    private void rbtExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtExtraActionPerformed
        // TODO add your handling code here:
        this.cmbQuantity.setVisible(false);
        this.lblQuantity.setVisible(false);
    }//GEN-LAST:event_rbtExtraActionPerformed

    private void btnAddDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDishActionPerformed
        // TODO add your handling code here:
        String type;
        String name = this.txtName.getText();
        float price = Float.parseFloat(this.spiPrice.getValue().toString());
        if(rbtDrink.isSelected())
        {
            Drink product = new Drink();
            int id = product.assingId();
            product.setId(id);
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(getQuantity());
            DrinkManager.addDrink(product);
            JOptionPane.showMessageDialog(this,"Registro de plato exitoso" );
            backToMenu();
            
        }else if(rbtDessert.isSelected()||rbtExtra.isSelected()||rbtFirstDish.isSelected()||rbtMainCourse.isSelected()){
            Dish dish = new Dish();
            int id = dish.assingId();
            dish.setId(id);
            dish.setName(name);
            dish.setPrice(price);
            dish.setType(getTypeDish());
            DishManager.addDish(dish);
            JOptionPane.showMessageDialog(this,"Registro de plato exitoso" );
            backToMenu();
        }
    }//GEN-LAST:event_btnAddDishActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "Cancelar Registro?");
            if(i == 0)
            {
                backToMenu();
            }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed
    public void  backToMenu(){
        if(this.user.getUserType().equals("Administrador")){
           FrmMenuManager menu1 = new FrmMenuManager(this.user);
           menu1.setVisible(true);
           this.setVisible(false); 
        }else{
           FrmMenuEmployee menu2 = new FrmMenuEmployee(this.user);
           menu2.setVisible(true);
           this.setVisible(false); 
        }
    }
    public int getQuantity()
    {
        int index = this.cmbQuantity.getSelectedIndex();
        switch (index) {
            case 0:
                return 350;
            case 1:
                return 500;
            case 2:
                return 750;
            case 3:
                return 1000;
            case 4:
                return 1500;
            case 5:
                return 2000;
            default:
                return 3000;
        }
        
    }
    public String getTypeDish(){
        if(rbtDessert.isSelected()){
            return "Postre";
        }else if(rbtExtra.isSelected()){
            return "Extra";
        }
        else if(rbtFirstDish.isSelected()){
            return "Entrada";
        }else return "Plato Fuerte";
    }
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
            java.util.logging.Logger.getLogger(FrmDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDish().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDish;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cmbQuantity;
    private javax.swing.ButtonGroup gbtType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JRadioButton rbtDessert;
    private javax.swing.JRadioButton rbtDrink;
    private javax.swing.JRadioButton rbtExtra;
    private javax.swing.JRadioButton rbtFirstDish;
    private javax.swing.JRadioButton rbtMainCourse;
    private javax.swing.JSpinner spiPrice;
    private javax.swing.JTextField txtName;
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
