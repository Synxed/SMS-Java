/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Font;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Enumeration;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author Cerberus
 */
public class MainFrame extends javax.swing.JFrame {
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        CredentialPanel = new javax.swing.JPanel();
        UsernameTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        OperationsPanel = new javax.swing.JPanel();
        OperationsComboBox = new javax.swing.JComboBox<>();
        OpenButton = new javax.swing.JButton();
        StatusPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AboutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SMS - Login");
        setResizable(false);

        CredentialPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Admin Login"));

        UsernameTextField.setText("Admin");
        UsernameTextField.setToolTipText("Enter Username");

        PasswordField.setText("Password");
        PasswordField.setToolTipText("Enter Password");

        LoginButton.setText("Login");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CredentialPanelLayout = new javax.swing.GroupLayout(CredentialPanel);
        CredentialPanel.setLayout(CredentialPanelLayout);
        CredentialPanelLayout.setHorizontalGroup(
            CredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CredentialPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameTextField)
                    .addComponent(PasswordField)
                    .addGroup(CredentialPanelLayout.createSequentialGroup()
                        .addComponent(LoginButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CredentialPanelLayout.setVerticalGroup(
            CredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CredentialPanelLayout.createSequentialGroup()
                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginButton))
        );

        OperationsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Operations"));

        OperationsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee Registration", "Project Registration", "Project Allocation", "Training Assessment" }));
        OperationsComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OperationsComboBox.setEnabled(false);

        OpenButton.setText("Open");
        OpenButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OpenButton.setEnabled(false);
        OpenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout OperationsPanelLayout = new javax.swing.GroupLayout(OperationsPanel);
        OperationsPanel.setLayout(OperationsPanelLayout);
        OperationsPanelLayout.setHorizontalGroup(
            OperationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperationsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OperationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OperationsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(OperationsPanelLayout.createSequentialGroup()
                        .addComponent(OpenButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OperationsPanelLayout.setVerticalGroup(
            OperationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperationsPanelLayout.createSequentialGroup()
                .addComponent(OperationsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpenButton))
        );

        StatusPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("CSE - Java Micro Project (2014-18)");

        AboutLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AboutLabel.setForeground(new java.awt.Color(11, 0, 128));
        AboutLabel.setText("About");
        AboutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AboutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout StatusPanelLayout = new javax.swing.GroupLayout(StatusPanel);
        StatusPanel.setLayout(StatusPanelLayout);
        StatusPanelLayout.setHorizontalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(AboutLabel)
                .addContainerGap())
        );
        StatusPanelLayout.setVerticalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(AboutLabel))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CredentialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OperationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(StatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CredentialPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OperationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        if(UsernameTextField.getText().equals("Admin") && new String(PasswordField.getPassword()).equals("Password")){
            UsernameTextField.setEnabled(false);
            PasswordField.setEnabled(false);
            OperationsComboBox.setEnabled(true);
            OpenButton.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Username and Password combination is incorrect.", "Invalid Credential", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void AboutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutLabelMouseClicked
        new AboutFrame().setVisible(true);
    }//GEN-LAST:event_AboutLabelMouseClicked

    private void OpenButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenButtonMouseClicked
        URL iconURL = getClass().getResource("/Resources/icon.png");
        ImageIcon icon = new ImageIcon(iconURL);
        
        switch(OperationsComboBox.getSelectedIndex()){
            case 0:
                JFrame employeeRegistrationFrame = new EmployeeRegistrationFrame();
                employeeRegistrationFrame.setIconImage(icon.getImage());
                employeeRegistrationFrame.setVisible(true);
                break;
                
            case 1:
                JFrame projectRegistrationFrame = new ProjectRegistrationFrame();
                projectRegistrationFrame.setIconImage(icon.getImage());
                projectRegistrationFrame.setVisible(true);
                break;
                
            case 2:
                JFrame projectAllocationFrame = new ProjectAllocationFrame();
                projectAllocationFrame.setIconImage(icon.getImage());
                projectAllocationFrame.setVisible(true);
                break;
                
            case 3:
                JFrame trainingAssessmentFrame = new TrainingAssessmentFrame();
                trainingAssessmentFrame.setIconImage(icon.getImage());
                trainingAssessmentFrame.setVisible(true);
                break;               
        }
    }//GEN-LAST:event_OpenButtonMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame mainFrame = new MainFrame();
                URL iconURL = getClass().getResource("/Resources/icon.png");
                mainFrame.setIconImage(new ImageIcon(iconURL).getImage());
                mainFrame.setVisible(true);               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutLabel;
    private javax.swing.JPanel CredentialPanel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton OpenButton;
    private javax.swing.JComboBox<String> OperationsComboBox;
    private javax.swing.JPanel OperationsPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel StatusPanel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}