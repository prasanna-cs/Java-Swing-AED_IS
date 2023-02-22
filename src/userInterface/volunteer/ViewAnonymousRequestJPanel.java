/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.volunteer;

import business.organizations.OrganizationDirectory;
import business.organizations.VolunteerOrganization;
import business.userAccount.UserAccount;
import business.workQueue.NeedServiceRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class ViewAnonymousRequestJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private VolunteerOrganization volunteerOrganization;
    private OrganizationDirectory directory;
    
    /**
     * Creates new form ViewAnonymousRequestJPanel
     */
    public ViewAnonymousRequestJPanel(JPanel userProcessContainer, UserAccount account, VolunteerOrganization organization, OrganizationDirectory directory) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
       this.volunteerOrganization = organization;
        this.directory = directory;
        
        populateAnonymousHelpRequestTable();
    }
    
    
     public void populateAnonymousHelpRequestTable(){
         
        DefaultTableModel model = (DefaultTableModel)anonymousHelpReqTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request : volunteerOrganization.getWorkQueue().getWorkRequestList()){
         if(request.getMessage().equalsIgnoreCase("Need Help"))//request.getMessage().equalsIgnoreCase("Need Service")
         {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getPerson().getFullName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getFullName();
            row[3] = request.getStatus();
            
            model.addRow(row);
         }
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

        manageEnt1 = new javax.swing.JLabel();
        manageEnt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        anonymousHelpReqTable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        viewHelpSeekerBtn = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        processHelpRquestJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(21, 25, 28));
        setForeground(new java.awt.Color(255, 255, 255));

        manageEnt1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        manageEnt1.setForeground(new java.awt.Color(169, 224, 49));
        manageEnt1.setText("Senior Safe");

        manageEnt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        manageEnt.setForeground(new java.awt.Color(169, 224, 49));
        manageEnt.setText("Service Requests");

        anonymousHelpReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Needed", "Service Seeker Name", "Reciever", "Request Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(anonymousHelpReqTable);

        jButton7.setBackground(new java.awt.Color(152, 201, 45));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(21, 25, 28));
        jButton7.setText("Refresh");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        viewHelpSeekerBtn.setBackground(new java.awt.Color(152, 201, 45));
        viewHelpSeekerBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        viewHelpSeekerBtn.setForeground(new java.awt.Color(21, 25, 28));
        viewHelpSeekerBtn.setText("Check Profile");
        viewHelpSeekerBtn.setBorder(null);
        viewHelpSeekerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewHelpSeekerBtn.setFocusPainted(false);
        viewHelpSeekerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHelpSeekerBtnActionPerformed(evt);
            }
        });

        assignJButton.setBackground(new java.awt.Color(152, 201, 45));
        assignJButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(21, 25, 28));
        assignJButton.setText("Assign");
        assignJButton.setBorder(null);
        assignJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assignJButton.setFocusPainted(false);
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(152, 201, 45));
        backJButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(21, 25, 28));
        backJButton.setText("<<Back");
        backJButton.setBorder(null);
        backJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton.setFocusPainted(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        processHelpRquestJButton1.setBackground(new java.awt.Color(152, 201, 45));
        processHelpRquestJButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        processHelpRquestJButton1.setForeground(new java.awt.Color(21, 25, 28));
        processHelpRquestJButton1.setText("Complete");
        processHelpRquestJButton1.setBorder(null);
        processHelpRquestJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        processHelpRquestJButton1.setFocusPainted(false);
        processHelpRquestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processHelpRquestJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewHelpSeekerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(backJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(processHelpRquestJButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(manageEnt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageEnt)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(viewHelpSeekerBtn)
                    .addComponent(processHelpRquestJButton1))
                .addGap(120, 120, 120)
                .addComponent(backJButton)
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
               populateAnonymousHelpRequestTable();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void viewHelpSeekerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHelpSeekerBtnActionPerformed
        int selectedRow = anonymousHelpReqTable.getSelectedRow();

        if (selectedRow < 0){
           JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
           return;
        }

        WorkRequest request = (WorkRequest)anonymousHelpReqTable.getValueAt(selectedRow, 0);
        UserAccount ua = request.getSender();
       
         ViewVolunteerProfile viewVolunteerProfile = new ViewVolunteerProfile(userProcessContainer, ua);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewHelpSeekerBtnActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
int selectedRow = anonymousHelpReqTable.getSelectedRow();

        if (selectedRow < 0){
        JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
      
        WorkRequest request = (WorkRequest)anonymousHelpReqTable.getValueAt(selectedRow, 0);
        if(request.getReceiver()!=null)
        {
         JOptionPane.showMessageDialog(null, "Request has been processed by Other Volunteers!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
        }
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateAnonymousHelpRequestTable();        populateAnonymousHelpRequestTable();    }//GEN-LAST:event_assignJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);  
    }//GEN-LAST:event_backJButtonActionPerformed

    private void processHelpRquestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processHelpRquestJButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = anonymousHelpReqTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        NeedServiceRequest request = (NeedServiceRequest)anonymousHelpReqTable.getValueAt(selectedRow, 0);
        
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

        ProcessAnonymousHelpReqPanel processAnonymousHelpReqPanel = new ProcessAnonymousHelpReqPanel(userProcessContainer, request, userAccount, directory);
        userProcessContainer.add("ProcessAnonymousHelpReqPanel", processAnonymousHelpReqPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processHelpRquestJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable anonymousHelpReqTable;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JButton processHelpRquestJButton1;
    private javax.swing.JButton viewHelpSeekerBtn;
    // End of variables declaration//GEN-END:variables
}