
package main.java.com.csbl.sms.ui.mail;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import main.java.com.csbl.sms.util.PropertiesFile;
import main.java.com.csbl.sms.util.NumberConverterUtil;


public class SendMailForm extends javax.swing.JDialog {

    private List<String> mailIdList = new ArrayList<>();
    final static int interval = 1000;
    Timer timer;
    String msgComplete = "";

    public SendMailForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //setSize(680, 550);
        setLocationRelativeTo(null);
        //pb.setIndeterminate(true);
        
        
        //Create a timer.
        timer = new Timer(interval, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if(msgComplete.equalsIgnoreCase("successful"))
                {
                    //Toolkit.getDefaultToolkit().beep();
                    timer.stop();
                    pb.setIndeterminate(false);
                    String str = "<html>" + "<font color=\"#FF0000\">" + "<b>" + "Sending completed." + "</b>" + "</font>" + "</html>";
                    label.setText(str);
                }
                pb.setIndeterminate(true);
            }
        });
               
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
        cmbAcademicYear = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbClassId = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMsgSubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMsgDetails = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaEmailList = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pb = new javax.swing.JProgressBar();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Send Mail");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Send Mail");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Academic Year :");

        cmbAcademicYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbAcademicYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAcademicYearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Class Id :");

        cmbClassId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbClassId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Message Subject :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Message Details :");

        txtMsgSubject.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtAreaMsgDetails.setColumns(20);
        txtAreaMsgDetails.setRows(5);
        jScrollPane1.setViewportView(txtAreaMsgDetails);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Email List :");

        txtAreaEmailList.setEditable(false);
        txtAreaEmailList.setBackground(new java.awt.Color(204, 204, 204));
        txtAreaEmailList.setColumns(20);
        txtAreaEmailList.setRows(5);
        jScrollPane2.setViewportView(txtAreaEmailList);

        btnSend.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEntryLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEntryLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 3, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMsgSubject)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );
        panelEntryLayout.setVerticalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addComponent(lblHeader)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbClassId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cmbAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMsgSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgroundLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pb, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgroundLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void cmbAcademicYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAcademicYearActionPerformed
        mailIdList = PropertiesFile.getMailManager().getStudentEmailList(NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim()), cmbAcademicYear.getSelectedItem().toString().trim());
        if(mailIdList.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No Email Id Found !", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        txtAreaEmailList.setText(mailIdList.toString());
        //System.out.println(mailIdList.toString());
    }//GEN-LAST:event_cmbAcademicYearActionPerformed

    private void cmbClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassIdActionPerformed
        cmbAcademicYear.setModel(new javax.swing.DefaultComboBoxModel(getYearList().toArray()));    
        cmbAcademicYearActionPerformed(evt);
    }//GEN-LAST:event_cmbClassIdActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String message = isCompleteForm();
        if(!message.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(null, "Do you sure to Send E-mail?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response != JOptionPane.YES_OPTION) {
            return;
        }
        
        timer.start();
        pb.setIndeterminate(true);
        
        String subject = txtMsgSubject.getText().trim();
        String msg = txtAreaMsgDetails.getText().trim();
        
        String [] to = mailIdList.toArray(new String[mailIdList.size()]);
        
        String confirm = PropertiesFile.getMailManager().sendMail("noman.ict@gmail.com", to, subject, msg);
        msgComplete = confirm;
        if(!confirm.equalsIgnoreCase("successful"))
        {
            timer.stop();
            pb.setIndeterminate(false);
            String str = "<html>" + "<font color=\"#FF0000\">" + "<b>" + "Sending Faild !" + "</b>" + "</font>" + "</html>";
            label.setText(str);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,confirm, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(null,"Successfully Send Mail", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

       
    private String isCompleteForm()
    {
        try{
            cmbClassId.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Class Id";
        }
        
        try{
            cmbAcademicYear.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Exam Year";
        }            
        
        if(txtMsgSubject.getText().trim().isEmpty() || txtMsgSubject.getText().trim() == null)
        {
            return "Enter Message Subject";
        }
        
        if(txtAreaMsgDetails.getText().trim().isEmpty() || txtAreaMsgDetails.getText().trim() == null)
        {
            return "Enter Message Details";
        }
        
        if(mailIdList.isEmpty())
        {
            return "No Email Id Found !";
        }
        
        return "success";
    }
    
    private List<Integer> getYearList()
    {
        List<Integer> yearList = new ArrayList<>();
            Date d = new Date();
            int date = d.getYear()+1900;
            for(int i=date; i>=2000; i--)
            {
            yearList.add(i);
            }
        return yearList;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupMaritalStatus;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox cmbAcademicYear;
    private javax.swing.JComboBox cmbClassId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JProgressBar pb;
    private javax.swing.JTextArea txtAreaEmailList;
    private javax.swing.JTextArea txtAreaMsgDetails;
    private javax.swing.JTextField txtMsgSubject;
    // End of variables declaration//GEN-END:variables

}
