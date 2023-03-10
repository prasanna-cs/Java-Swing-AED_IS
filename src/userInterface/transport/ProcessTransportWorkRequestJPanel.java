/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.transport;

import business.userAccount.UserAccount;
import business.workQueue.TransportRequest;
import business.workQueue.SupervisorWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author daniel
 */
public class ProcessTransportWorkRequestJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private TransportRequest request;
    private UserAccount userAccount;
    /**
     * Creates new form ProcessTransportWorkRequestJPanel
     */
    public ProcessTransportWorkRequestJPanel(JPanel userProcessContainer, TransportRequest request, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        
        populateResultComboBox();
    }
    
    public void populateResultComboBox()
    {
        resultComboBox.removeAllItems();
        resultComboBox.addItem(SupervisorWorkRequest.REQUEST_ACCEPT);
        resultComboBox.addItem(SupervisorWorkRequest.REQUEST_REJECT);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resultComboBox = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(32, 36, 42));

        jLabel1.setBackground(new java.awt.Color(32, 36, 42));
        jLabel1.setForeground(new java.awt.Color(152, 201, 45));
        jLabel1.setText("Request Result");

        jLabel7.setBackground(new java.awt.Color(32, 36, 42));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(152, 201, 45));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Process Work Request:");

        resultComboBox.setBackground(new java.awt.Color(32, 36, 42));
        resultComboBox.setForeground(new java.awt.Color(152, 201, 45));
        resultComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBack.setBackground(new java.awt.Color(152, 201, 45));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(21, 25, 28));
        btnBack.setText("back");
        btnBack.setBorder(null);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(152, 201, 45));
        btnSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(21, 25, 28));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(null);
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.setFocusPainted(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(111, 111, 111)
                        .addComponent(resultComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resultComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
                userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DriverWorkAreaJPanel driverWorkAreaPanel = (DriverWorkAreaJPanel) component;
        driverWorkAreaPanel.populatetransportRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
         if(resultComboBox.getSelectedIndex()<0 )
        {
         JOptionPane.showMessageDialog(null, "Please enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
         return;
        }
        request.setReqResult((String)resultComboBox.getSelectedItem());
        request.setStatus(SupervisorWorkRequest.REQUEST_COMPLETED);
        request.setResolveDate(new Date());
        JOptionPane.showMessageDialog(null, "Request has been processed successfully", "success", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox resultComboBox;
    // End of variables declaration//GEN-END:variables
}
