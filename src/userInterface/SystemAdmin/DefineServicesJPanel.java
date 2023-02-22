/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;

import business.EcoSystem;
import business.common.NeedService;
import business.common.InputValidation;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author riaka
 */
public class DefineServicesJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private EcoSystem system;


    /**
     * Creates new form CreateHelpJPanel
     */
    public DefineServicesJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        

        addInputVerifiers();
        populateComboBxHelpType();
    }
    

    
    public void populateComboBxHelpType()
    {
      helpTypeComboBx.removeAllItems();
      helpTypeComboBx.addItem("Immediate");
      helpTypeComboBx.addItem("Need in a day");
      helpTypeComboBx.addItem("Not Immediate service");
      helpTypeComboBx.addItem("In a Week");
    }
    
     private void addInputVerifiers() {
        InputVerifier stringValidation = new InputValidation();
        helpnameJTxtField.setInputVerifier(stringValidation);
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnt2 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        helpnameJTxtField = new javax.swing.JTextField();
        helpName = new javax.swing.JLabel();
        createHelpJButton = new javax.swing.JButton();
        helpType = new javax.swing.JLabel();
        manageEnt1 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        helpTypeComboBx = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(21, 25, 28));

        manageEnt2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        manageEnt2.setForeground(new java.awt.Color(169, 224, 49));
        manageEnt2.setText("Senior Safe");

        jLayeredPane1.setBackground(new java.awt.Color(21, 25, 28));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));

        helpnameJTxtField.setBackground(new java.awt.Color(21, 25, 28));
        helpnameJTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        helpnameJTxtField.setForeground(new java.awt.Color(255, 255, 255));
        helpnameJTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));

        helpName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        helpName.setForeground(new java.awt.Color(169, 224, 49));
        helpName.setText("Services Offered");

        createHelpJButton.setBackground(new java.awt.Color(152, 201, 45));
        createHelpJButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        createHelpJButton.setForeground(new java.awt.Color(152, 201, 45));
        createHelpJButton.setText("Create Service");
        createHelpJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        createHelpJButton.setContentAreaFilled(false);
        createHelpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHelpJButtonActionPerformed(evt);
            }
        });

        helpType.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        helpType.setForeground(new java.awt.Color(169, 224, 49));
        helpType.setText("ServiceType");

        manageEnt1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        manageEnt1.setForeground(new java.awt.Color(169, 224, 49));
        manageEnt1.setText("Create Services Offered");

        cancelBtn.setBackground(new java.awt.Color(152, 201, 45));
        cancelBtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(152, 201, 45));
        cancelBtn.setText("Cancel");
        cancelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        cancelBtn.setContentAreaFilled(false);
        cancelBtn.setPreferredSize(new java.awt.Dimension(88, 19));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        helpTypeComboBx.setBackground(new java.awt.Color(152, 201, 45));
        helpTypeComboBx.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        helpTypeComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        helpTypeComboBx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));

        jLayeredPane1.setLayer(helpnameJTxtField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(helpName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(createHelpJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(helpType, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(manageEnt1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cancelBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(helpTypeComboBx, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addGap(0, 282, Short.MAX_VALUE)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(helpName)
                            .addComponent(helpType))
                        .addGap(29, 29, 29)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(helpTypeComboBx, 0, 215, Short.MAX_VALUE)
                            .addComponent(helpnameJTxtField)
                            .addComponent(createHelpJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(manageEnt1)
                .addGap(38, 38, 38)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helpName)
                    .addComponent(helpnameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpType)
                    .addComponent(helpTypeComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createHelpJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        backJButton.setBackground(new java.awt.Color(152, 201, 45));
        backJButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(152, 201, 45));
        backJButton.setText("Back");
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(manageEnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(392, 392, 392))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageEnt2)
                .addGap(64, 64, 64)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createHelpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHelpJButtonActionPerformed
       
        if(helpnameJTxtField.getText().trim().isEmpty() || helpTypeComboBx.getSelectedIndex()<0)
       {
            JOptionPane.showMessageDialog(this, "Please enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
            return;   
       }
        NeedService needService = system.addNeedService();
        needService.setService(helpnameJTxtField.getText());
        needService.setServiceDesc((String)helpTypeComboBx.getSelectedItem());
     
        JOptionPane.showMessageDialog(this, "Help has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
           
        resetFields();
        
    }//GEN-LAST:event_createHelpJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
      resetFields();
    }//GEN-LAST:event_cancelBtnActionPerformed

    public void resetFields()
    {
        helpnameJTxtField.setText("");
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton createHelpJButton;
    private javax.swing.JLabel helpName;
    private javax.swing.JLabel helpType;
    private javax.swing.JComboBox helpTypeComboBx;
    private javax.swing.JTextField helpnameJTxtField;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel manageEnt2;
    // End of variables declaration//GEN-END:variables
}