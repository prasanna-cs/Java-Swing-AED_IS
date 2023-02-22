/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.donorpkg;

import business.EcoSystem;
import business.organizations.DonorOrganization;
import business.organizations.Organization;
import business.userAccount.UserAccount;
import business.workQueue.NeedVitalSignDeviceRq;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.serviceSeeker.ViewServiceSeekerProfile;

/**
 *
 * @author riaka
 */
public class ViewDonationRequestJPanel extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    private DonorOrganization donorOrganization;
    /**
     * Creates new form ViewDonationRequestJPanel
     */
    public ViewDonationRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, EcoSystem ecoSystem) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.donorOrganization = (DonorOrganization)organization;
        
        populateDonationWorkRequestTable();
        
         setBackground(new Color(182,201,233));
    }

    
      public void populateDonationWorkRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request : donorOrganization.getWorkQueue().getWorkRequestList())
        {
         
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getPerson().getFullName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getFullName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        donationREq = new javax.swing.JLabel();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        viewAndUpdateProfileBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(169, 224, 49));

        donationREq.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        donationREq.setForeground(new java.awt.Color(169, 224, 49));
        donationREq.setText("Process Donation Requests");

        assignJButton.setBackground(new java.awt.Color(169, 224, 49));
        assignJButton.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.setBorder(null);
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(169, 224, 49));
        processJButton.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        processJButton.setText("Submit");
        processJButton.setBorder(null);
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(169, 224, 49));
        refreshJButton.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(null);
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        workRequestJTable.setBackground(new java.awt.Color(0, 0, 0));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        viewAndUpdateProfileBtn.setBackground(new java.awt.Color(169, 224, 49));
        viewAndUpdateProfileBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        viewAndUpdateProfileBtn.setText("View Support Seeker Profile");
        viewAndUpdateProfileBtn.setBorder(null);
        viewAndUpdateProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAndUpdateProfileBtnActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(169, 224, 49));
        backJButton.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.setBorder(null);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(771, 771, 771)
                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(donationREq, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewAndUpdateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(donationREq)
                .addGap(11, 11, 11)
                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAndUpdateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
           JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
          return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getReceiver()!=null)
        {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
        }
        
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateDonationWorkRequestTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        NeedVitalSignDeviceRq request = (NeedVitalSignDeviceRq)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getReceiver() == null)
        {
            JOptionPane.showMessageDialog(null, "Please assign the request first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(request.getStatus().equalsIgnoreCase("Completed"))
        {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
        }
        if(request.getStatus().equalsIgnoreCase("Processing") ||  request.getStatus().equalsIgnoreCase("Pending"))
        {
         if(request.getReceiver()!=userAccount)
         {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
         }
        }
        request.setStatus("Processing");

        DonationProcessRequestAreaJPanel dprajp = new DonationProcessRequestAreaJPanel(userProcessContainer, request, userAccount);
        userProcessContainer.add("DonationProcessRequestAreaJPanel", dprajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateDonationWorkRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void viewAndUpdateProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAndUpdateProfileBtnActionPerformed
       int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        NeedVitalSignDeviceRq request = (NeedVitalSignDeviceRq)workRequestJTable.getValueAt(selectedRow, 0);
        UserAccount ua = (UserAccount)request.getSender();
        ViewServiceSeekerProfile viewHelpSeekerProfile = new ViewServiceSeekerProfile(userProcessContainer, ua);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewHelpSeekerProfile", viewHelpSeekerProfile);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAndUpdateProfileBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel donationREq;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton viewAndUpdateProfileBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
