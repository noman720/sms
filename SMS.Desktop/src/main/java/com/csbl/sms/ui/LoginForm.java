package main.java.com.csbl.sms.ui;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import main.java.com.csbl.sms.util.PropertiesFile;


public class LoginForm extends javax.swing.JFrame {

    public LoginForm(java.awt.Frame parent, boolean modal) {
        super("Login Form");
        initComponents();
        setResizable (false);
        pack();
        setSize(460, 290);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        txtUserId.setText("Admin");
        txtPassword.setText("104269");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnForgotPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
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
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Software Login");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 10, 340, 41);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(2, 63, 675, 2);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("User Name :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(18, 80, 100, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Password :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 120, 90, 22);

        txtUserId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserId);
        txtUserId.setBounds(140, 80, 250, 23);

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword);
        txtPassword.setBounds(140, 120, 250, 23);

        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(270, 180, 120, 30);

        btnForgotPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnForgotPassword.setText("Forgot Password?");
        btnForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(btnForgotPassword);
        btnForgotPassword.setBounds(40, 180, 170, 30);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
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

private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    if(checkForm() == false)
    {
        return;
    }
    String message = PropertiesFile.getUserManager().getUserByUserIdAndPassword(txtUserId.getText().trim(), txtPassword.getText().trim());
    if(!message.equalsIgnoreCase("Success"))
    {
        JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
        txtUserId.setText("");
        txtPassword.setText("");
        return;
    }
    
    new MainFrame().setVisible(true);
    this.setVisible(false);
    
}//GEN-LAST:event_btnLoginActionPerformed



private boolean checkForm()
{
    if(txtUserId.getText() == null || txtUserId.getText().trim().isEmpty())
    {
        txtUserId.setText("");
        JOptionPane.showMessageDialog(rootPane, "Please Enter User ID", "Alert", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if(txtPassword.getText() == null || txtPassword.getText().trim().isEmpty())
    {
        txtPassword.setText("");
        JOptionPane.showMessageDialog(rootPane, "Please Enter Password", "Alert", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    return true;
}


private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
}//GEN-LAST:event_formWindowOpened

private void btnForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPasswordActionPerformed
    
}//GEN-LAST:event_btnForgotPasswordActionPerformed

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        txtPassword.requestFocusInWindow();
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnLoginActionPerformed(evt);
    }//GEN-LAST:event_txtPasswordActionPerformed


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
