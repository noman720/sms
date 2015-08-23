
package main.java.com.csbl.sms.ui.reg.acc;

import java.util.List;
import javax.swing.JOptionPane;
import main.java.com.csbl.sms.bean.CommitResultBean;
import main.java.com.csbl.sms.util.PropertiesFile;
import main.java.com.csbl.sms.util.NumberConverterUtil;


public class CommitResultForm extends javax.swing.JDialog {

    

    public CommitResultForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //setSize(680, 550);
        setLocationRelativeTo(null);
               
    }

    
    
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        btnGroupMaritalStatus = new javax.swing.ButtonGroup();
        panelBackground = new javax.swing.JPanel();
        panelEntry = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmbExamYear = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbExamName = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbClassId = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Commit Result Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEntry.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Commit Result");
        panelEntry.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 2, 276, -1));
        panelEntry.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 45, 466, -1));
        panelEntry.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 150, 466, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Exam Year :");
        panelEntry.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 83, -1, -1));

        cmbExamYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbExamYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbExamYearActionPerformed(evt);
            }
        });
        panelEntry.add(cmbExamYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 84, 303, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Exam Name :");
        panelEntry.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 115, -1, -1));

        cmbExamName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbExamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbExamNameActionPerformed(evt);
            }
        });
        panelEntry.add(cmbExamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 116, 303, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Class Id :");
        panelEntry.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 53, -1, -1));

        cmbClassId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbClassId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassIdActionPerformed(evt);
            }
        });
        panelEntry.add(cmbClassId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 54, 303, -1));

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panelEntry.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 158, 89, -1));

        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        panelEntry.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 158, -1, -1));

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgroundLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBackground.getAccessibleContext().setAccessibleName("ProductEntryForm");

        pack();
    }// </editor-fold>//GEN-END:initComponents


private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    cmbClassId.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getClassManager().getClassName().toArray()));    
}//GEN-LAST:event_formWindowOpened

    private void cmbExamYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbExamYearActionPerformed
        List<String> examNameList = PropertiesFile.getMarkEntryManager().getExamName(NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim()), cmbExamYear.getSelectedItem().toString().trim());
        if(examNameList.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No Exam Name Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cmbExamName.setModel(new javax.swing.DefaultComboBoxModel(examNameList.toArray()));  
        
    }//GEN-LAST:event_cmbExamYearActionPerformed

    private void cmbExamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbExamNameActionPerformed
        
    }//GEN-LAST:event_cmbExamNameActionPerformed

    private void cmbClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassIdActionPerformed
        List<String> examYearList = PropertiesFile.getMarkEntryManager().getExamYear(NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim()));
        if(examYearList.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No Exam Year Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cmbExamYear.setModel(new javax.swing.DefaultComboBoxModel(examYearList.toArray()));
        cmbExamYearActionPerformed(evt);
    }//GEN-LAST:event_cmbClassIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String message = isCompleteForm();
        if(!message.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(null, "Do you sure to Commit Result?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response != JOptionPane.YES_OPTION) {
            return;
        }
        
        String classId = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
        String examYear = cmbExamYear.getSelectedItem().toString().trim();
        String examName = cmbExamName.getSelectedItem().toString().trim();
        
        CommitResultBean commitResultBean = new CommitResultBean(classId, examYear, examName);
        String confirm = PropertiesFile.getResultManager().setCommitResult(commitResultBean);
        
        if(!confirm.equalsIgnoreCase("successful"))
        {
            JOptionPane.showMessageDialog(null,confirm, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(null,"Successfully Commited Result", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

       
    private String isCompleteForm()
    {
        try{
            cmbClassId.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Class Id";
        }
        
        try{
            cmbExamYear.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Exam Year";
        }            
        
        try{
            cmbExamName.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Exam Name";
        }
        
        return "success";
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupMaritalStatus;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbClassId;
    private javax.swing.JComboBox cmbExamName;
    private javax.swing.JComboBox cmbExamYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    // End of variables declaration//GEN-END:variables

}
