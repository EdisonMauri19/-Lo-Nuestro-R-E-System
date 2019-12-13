/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.view;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public FrmMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuTools = new javax.swing.JMenu();
        mnuItmAbout = new javax.swing.JMenuItem();
        mnuItmExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuItmSchedule = new javax.swing.JMenuItem();
        mnuItmNewEvent = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        mnuAccount = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setSize(new java.awt.Dimension(800, 600));

        mnuTools.setText("Lo Nuestro R&E");

        mnuItmAbout.setText("Acerca de..");
        mnuTools.add(mnuItmAbout);

        mnuItmExit.setText("Salir");
        mnuItmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmExitActionPerformed(evt);
            }
        });
        mnuTools.add(mnuItmExit);

        jMenuBar1.add(mnuTools);

        jMenu2.setText("Menu");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Eventos");

        mnuItmSchedule.setText("Agenda");
        mnuItmSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuItmScheduleMouseClicked(evt);
            }
        });
        mnuItmSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmScheduleActionPerformed(evt);
            }
        });
        jMenu3.add(mnuItmSchedule);

        mnuItmNewEvent.setText("Nuevo Evento");
        mnuItmNewEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuItmNewEventMouseClicked(evt);
            }
        });
        mnuItmNewEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmNewEventActionPerformed(evt);
            }
        });
        jMenu3.add(mnuItmNewEvent);

        jMenuBar1.add(jMenu3);

        mnuOrder.setText("Ordenes");
        mnuOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuOrderMouseClicked(evt);
            }
        });
        mnuOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOrderActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuOrder);

        jMenu5.setText("Gestión");

        jMenuItem8.setText("Menú");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem10.setText("Servicios para Eventos");
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Reportes");

        jMenuItem11.setText("Ordenes");
        jMenu6.add(jMenuItem11);

        jMenuItem12.setText("Eventos");
        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        mnuAccount.setText("Cuentas");
        mnuAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuAccountMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuAccount);

        jMenu8.setText("Ayuda");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuAccountMouseClicked
        // TODO add your handling code here:
        FrmNewAccount account = new FrmNewAccount();
        account.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuAccountMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        FrmMenuOption menuOp = new FrmMenuOption();
        menuOp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void mnuItmNewEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuItmNewEventMouseClicked
        // TODO add your handling code here:
        FrmEvent frmE = new FrmEvent();
        frmE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuItmNewEventMouseClicked

    private void mnuItmScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuItmScheduleMouseClicked
        // TODO add your handling code here:
        FrmScheduleEvent schedule = new FrmScheduleEvent();
        schedule.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuItmScheduleMouseClicked

    private void mnuOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuOrderMouseClicked
        // TODO add your handling code here:
       FrmOrder order= new FrmOrder();
        order.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuOrderMouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        FrmDish dish = new FrmDish();
        dish.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void mnuItmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmExitActionPerformed
        // TODO add your handling code here:
        int index = JOptionPane.showConfirmDialog(this, "Salir del Programa?");
        if (index == 0) {
            FrmLogin login = new FrmLogin();
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_mnuItmExitActionPerformed

    private void mnuItmScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmScheduleActionPerformed
        // TODO add your handling code here:
        FrmScheduleEvent schedule = new FrmScheduleEvent();
        schedule.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuItmScheduleActionPerformed

    private void mnuItmNewEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmNewEventActionPerformed
        // TODO add your handling code here:
        FrmEvent frmE = new FrmEvent();
        frmE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuItmNewEventActionPerformed

    private void mnuOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOrderActionPerformed
        // TODO add your handling code here:
        FrmOrder order= new FrmOrder();
        order.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuOrderActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenu mnuAccount;
    private javax.swing.JMenuItem mnuItmAbout;
    private javax.swing.JMenuItem mnuItmExit;
    private javax.swing.JMenuItem mnuItmNewEvent;
    private javax.swing.JMenuItem mnuItmSchedule;
    private javax.swing.JMenu mnuOrder;
    private javax.swing.JMenu mnuTools;
    // End of variables declaration//GEN-END:variables
}
