package main.java.com.csbl.sms.ui.user;

import javax.swing.JOptionPane;
import main.java.com.csbl.sms.bean.UserBean;
import main.java.com.csbl.sms.util.PropertiesFile;


public class ChangePasswordForm extends javax.swing.JDialog {

    public ChangePasswordForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();   
        setSize(470, 300);        
        setLocationRelativeTo(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOldPassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtRetypePassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password Form");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(240, 253, 249));

        jPanel1.setBackground(new java.awt.Color(240, 253, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel1.setText("Change Password ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(102, 10, 233, 41);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(2, 55, 430, 10);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Old Password :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 70, 120, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("New Password :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 110, 120, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Retype Password :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 150, 140, 22);

        txtOldPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtOldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtOldPassword);
        txtOldPassword.setBounds(160, 70, 250, 23);

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(120, 190, 100, 30);

        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset);
        btnReset.setBounds(240, 190, 90, 30);

        txtRetypePassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRetypePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetypePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtRetypePassword);
        txtRetypePassword.setBounds(160, 150, 250, 23);

        txtNewPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtNewPassword);
        txtNewPassword.setBounds(160, 110, 250, 23);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        if(checkForm() == false)
        {
            return;
        }
        int response = JOptionPane.showConfirmDialog(null, "Do you sure to Change Password?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response != JOptionPane.YES_OPTION) {
            return;
        }
        
        UserBean userBean = PropertiesFile.getUserManager().getLoginUser();
        if(!userBean.getPassword().equals(txtOldPassword.getText().trim()))
        {
            txtOldPassword.setText("");
            JOptionPane.showMessageDialog(null, "Old Password is not Correct", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        userBean.setPassword(txtNewPassword.getText().trim());
        String msgUpdateUser = PropertiesFile.getUserManager().changePassword(userBean);
        if(!msgUpdateUser.equalsIgnoreCase("Success"))
        {
            JOptionPane.showMessageDialog(null,"Unable to change password" , "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Successfully changed password" , "Info", JOptionPane.INFORMATION_MESSAGE);
        setVisible(false);
        
}//GEN-LAST:event_btnSaveActionPerformed

private void clearForm()
{
    txtOldPassword.setText("");
    txtNewPassword.setText("");
    txtRetypePassword.setText("");
}

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
}//GEN-LAST:event_formWindowOpened

private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    clearForm();
}//GEN-LAST:event_btnResetActionPerformed

    private void txtOldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldPasswordActionPerformed
        txtNewPassword.requestFocusInWindow();
    }//GEN-LAST:event_txtOldPasswordActionPerformed

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        txtRetypePassword.requestFocusInWindow();
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void txtRetypePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetypePasswordActionPerformed
        btnSaveActionPerformed(evt);
    }//GEN-LAST:event_txtRetypePasswordActionPerformed

private boolean checkForm()
{
    if(txtOldPassword.getText() == null || txtOldPassword.getText().trim().isEmpty())
    {
        txtOldPassword.setText("");
        JOptionPane.showMessageDialog(null, "Please Enter Old Password", "Alert", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    if(txtNewPassword.getText() == null || txtNewPassword.getText().trim().isEmpty())
    {
        txtNewPassword.setText("");
        JOptionPane.showMessageDialog(null, "Please Enter New Password", "Alert", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    if(txtRetypePassword.getText() == null || txtRetypePassword.getText().trim().isEmpty())
    {
        txtRetypePassword.setText("");
        JOptionPane.showMessageDialog(null, "Please Retype Password", "Alert", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if(!txtNewPassword.getText().trim().equals(txtRetypePassword.getText().trim()))
    {
        txtRetypePassword.setText("");
        JOptionPane.showMessageDialog(null, "Password does not match", "Alert", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    return true;
}


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JPasswordField txtRetypePassword;
    // End of variables declaration//GEN-END:variables
}
