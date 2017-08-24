/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aztsoft.gym.view;

import com.aztsoft.gym.controller.CustomerController;
import com.aztsoft.gym.controller.CustomerControllerImpl;

/**
 *
 * @author windows
 */
public class CustomerForm extends javax.swing.JFrame {
    
    /**
     * Creates new form ClientForm
     */
    public CustomerForm() {
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

        pnlDataClient = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurnames = new javax.swing.JTextField();
        lblSurnames = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblRegistrationDate = new javax.swing.JLabel();
        dpRegistrationDate = new org.jdesktop.swingx.JXDatePicker();
        pnlPhoto = new javax.swing.JPanel();
        lblPhoto = new javax.swing.JLabel();
        pnlAddress = new javax.swing.JPanel();
        lblAddress = new javax.swing.JLabel();
        srcAddress = new javax.swing.JScrollPane();
        txaAddress = new javax.swing.JTextArea();
        pnlContractDetail = new javax.swing.JPanel();
        lblTypeRenter = new javax.swing.JLabel();
        radVisit = new javax.swing.JRadioButton();
        radBiweekly = new javax.swing.JRadioButton();
        radWeekly = new javax.swing.JRadioButton();
        radMonthly = new javax.swing.JRadioButton();
        radAnnual = new javax.swing.JRadioButton();
        pnlCommand = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblname.setText("Nombre: ");

        txtName.setName(""); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtSurnames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSurnamesKeyTyped(evt);
            }
        });

        lblSurnames.setText("Apellidos:");

        lblAge.setText("Edad:");

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        lblRegistrationDate.setText("Fecha de registro:");

        javax.swing.GroupLayout pnlDataClientLayout = new javax.swing.GroupLayout(pnlDataClient);
        pnlDataClient.setLayout(pnlDataClientLayout);
        pnlDataClientLayout.setHorizontalGroup(
            pnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname)
                    .addComponent(lblSurnames)
                    .addComponent(lblAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDataClientLayout.createSequentialGroup()
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(lblRegistrationDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtName)
                    .addComponent(txtSurnames))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        pnlDataClientLayout.setVerticalGroup(
            pnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSurnames, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSurnames))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(lblRegistrationDate)
                    .addComponent(dpRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userIcon.png"))); // NOI18N

        javax.swing.GroupLayout pnlPhotoLayout = new javax.swing.GroupLayout(pnlPhoto);
        pnlPhoto.setLayout(pnlPhotoLayout);
        pnlPhotoLayout.setHorizontalGroup(
            pnlPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPhoto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPhotoLayout.setVerticalGroup(
            pnlPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPhoto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAddress.setText("Dirección:");

        txaAddress.setColumns(20);
        txaAddress.setRows(5);
        srcAddress.setViewportView(txaAddress);

        javax.swing.GroupLayout pnlAddressLayout = new javax.swing.GroupLayout(pnlAddress);
        pnlAddress.setLayout(pnlAddressLayout);
        pnlAddressLayout.setHorizontalGroup(
            pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(srcAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(369, 369, 369))
        );
        pnlAddressLayout.setVerticalGroup(
            pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srcAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTypeRenter.setText("Tipo de renta:");

        radVisit.setText("visita");

        radBiweekly.setText("Quincenal");

        radWeekly.setText("Semanal");

        radMonthly.setText("Mensual");

        radAnnual.setText("Anual");

        javax.swing.GroupLayout pnlContractDetailLayout = new javax.swing.GroupLayout(pnlContractDetail);
        pnlContractDetail.setLayout(pnlContractDetailLayout);
        pnlContractDetailLayout.setHorizontalGroup(
            pnlContractDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContractDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContractDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radVisit)
                    .addComponent(lblTypeRenter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlContractDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContractDetailLayout.createSequentialGroup()
                        .addComponent(radWeekly)
                        .addGap(18, 18, 18)
                        .addComponent(radBiweekly))
                    .addGroup(pnlContractDetailLayout.createSequentialGroup()
                        .addComponent(radMonthly)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radAnnual)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContractDetailLayout.setVerticalGroup(
            pnlContractDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContractDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTypeRenter)
                .addGap(21, 21, 21)
                .addGroup(pnlContractDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radVisit)
                    .addComponent(radWeekly)
                    .addComponent(radBiweekly))
                .addGap(18, 18, 18)
                .addGroup(pnlContractDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radMonthly)
                    .addComponent(radAnnual))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCommandLayout = new javax.swing.GroupLayout(pnlCommand);
        pnlCommand.setLayout(pnlCommandLayout);
        pnlCommandLayout.setHorizontalGroup(
            pnlCommandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCommandLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCommandLayout.setVerticalGroup(
            pnlCommandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCommandLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCommand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlDataClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlContractDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDataClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContractDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnlCommand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CustomerImpl customer = new CustomerImpl(this);
        customer.postClient();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        char alphabeticTyped = evt.getKeyChar();
        if(Character.isAlphabetic(alphabeticTyped)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char digitTyped = evt.getKeyChar();
        if(Character.isDigit(digitTyped)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtSurnamesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnamesKeyTyped
        char alphabeticType = evt.getKeyChar();
        if(Character.isDigit(alphabeticType)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSurnamesKeyTyped

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
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker dpRegistrationDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblRegistrationDate;
    private javax.swing.JLabel lblSurnames;
    private javax.swing.JLabel lblTypeRenter;
    private javax.swing.JLabel lblname;
    private javax.swing.JPanel pnlAddress;
    private javax.swing.JPanel pnlCommand;
    private javax.swing.JPanel pnlContractDetail;
    private javax.swing.JPanel pnlDataClient;
    private javax.swing.JPanel pnlPhoto;
    public javax.swing.JRadioButton radAnnual;
    public javax.swing.JRadioButton radBiweekly;
    public javax.swing.JRadioButton radMonthly;
    public javax.swing.JRadioButton radVisit;
    public javax.swing.JRadioButton radWeekly;
    private javax.swing.JScrollPane srcAddress;
    public javax.swing.JTextArea txaAddress;
    public javax.swing.JTextField txtAge;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtSurnames;
    // End of variables declaration//GEN-END:variables

    class CustomerImpl implements CustomerView {

        private CustomerForm customerView;
        
        public CustomerImpl(CustomerForm customerView) {
            this.customerView = customerView;
        }
        
        @Override
        public void postClient() {
            CustomerController customerController = new CustomerControllerImpl(customerView);
            customerController.postClient();
        }
        
    }
    
}