
package main.java.com.csbl.sms.ui.payment;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import main.java.com.csbl.sms.bean.StudentTransactionBean;
import main.java.com.csbl.sms.util.DateUtil;
import main.java.com.csbl.sms.util.NumberUtil;
import main.java.com.csbl.sms.util.PropertiesFile;
import main.java.com.csbl.sms.util.NumberConverterUtil;

public class StudentTransactionForm extends javax.swing.JDialog {

    public StudentTransactionForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBG = new javax.swing.JPanel();
        panelEntry = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbClassId = new javax.swing.JComboBox();
        cmbMonthName = new javax.swing.JComboBox();
        cmbYear = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtBillNo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnSearch = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        panelTable = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtPreviousAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPaidAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDueAmount = new javax.swing.JTextField();
        dcPaidDate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbTransactionType = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTranDescription = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transaction Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBG.setBackground(new java.awt.Color(240, 253, 249));

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Transaction");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Class Id :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Bill Month :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Bill Year :");

        cmbClassId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbClassId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassIdActionPerformed(evt);
            }
        });

        cmbMonthName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbMonthName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cmbMonthName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonthNameActionPerformed(evt);
            }
        });

        cmbYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYearActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Bill No :");

        txtBillNo.setEditable(false);
        txtBillNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Student Id :");

        txtStudentId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEntryLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMonthName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEntryLayout.createSequentialGroup()
                                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbYear, 0, 240, Short.MAX_VALUE)
                                    .addComponent(txtBillNo)
                                    .addComponent(txtStudentId))))))
                .addGap(0, 126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))))
        );
        panelEntryLayout.setVerticalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbClassId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbMonthName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnClear))
                .addContainerGap())
        );

        panelTable.setBackground(new java.awt.Color(240, 253, 249));
        panelTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Previous Amount :");

        txtPreviousAmount.setEditable(false);
        txtPreviousAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Paid Amount :");

        txtPaidAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPaidAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaidAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaidAmountKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Due Amount :");

        txtDueAmount.setEditable(false);
        txtDueAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        dcPaidDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Paid Date :");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Transaction Type :");

        cmbTransactionType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbTransactionType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paid", "Adjustment" }));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Transaction Description :");

        txtAreaTranDescription.setColumns(20);
        txtAreaTranDescription.setRows(2);
        jScrollPane1.setViewportView(txtAreaTranDescription);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dcPaidDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPreviousAmount)
                    .addComponent(txtPaidAmount)
                    .addComponent(txtDueAmount)
                    .addComponent(cmbTransactionType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbTransactionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPreviousAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDueAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dcPaidDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBGLayout = new javax.swing.GroupLayout(panelBG);
        panelBG.setLayout(panelBGLayout);
        panelBGLayout.setHorizontalGroup(
            panelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBGLayout.createSequentialGroup()
                        .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelBGLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBGLayout.setVerticalGroup(
            panelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String message = isCompleteForm();
        if(!message.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String studentId = txtStudentId.getText().trim();
        String billNo = txtBillNo.getText().trim();
        double previousAmount = PropertiesFile.getTransactionManager().getPayableAmout(studentId, billNo);
        txtPreviousAmount.setText(NumberUtil.getNumberValueAsString(previousAmount));
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
        cmbClassId.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getClassManager().getClassName().toArray()));
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel(getYearList().toArray()));
        dcPaidDate.setDate(new Date());
    }catch(NullPointerException e)
    {
        JOptionPane.showMessageDialog(rootPane, "No Record Found !", "Alert", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_formWindowOpened

    private void cmbClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassIdActionPerformed
        txtBillNo.setText(getBillNo());
    }//GEN-LAST:event_cmbClassIdActionPerformed

    private void cmbMonthNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonthNameActionPerformed
        txtBillNo.setText(getBillNo());
    }//GEN-LAST:event_cmbMonthNameActionPerformed

    private void cmbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYearActionPerformed
        txtBillNo.setText(getBillNo());
    }//GEN-LAST:event_cmbYearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String message = isValidateForm();
        if(!message.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(null, "Do you sure to save Payment?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response != JOptionPane.YES_OPTION) {
            return;
        }
        
        String classId = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
        int academicYear = Integer.parseInt(cmbYear.getSelectedItem().toString().trim());
        String studentId = txtStudentId.getText().trim();
        String billNo = txtBillNo.getText().trim();
        String transactionType = cmbTransactionType.getSelectedItem().toString().trim();
        String transactionDescription = txtAreaTranDescription.getText().trim();
        double previousAmount = NumberUtil.getNumberValueAsDouble(txtPreviousAmount.getText().trim());
        double paidAmount = NumberUtil.getNumberValueAsDouble(txtPaidAmount.getText().trim());
        double dueAmont = NumberUtil.getNumberValueAsDouble(txtDueAmount.getText().trim());
        String transactionDate = DateUtil.getDateAsString(dcPaidDate.getCalendar().getTime());
        String createdBy = PropertiesFile.getUserManager().getLoginUser().getUserName();
        
        StudentTransactionBean stb = new StudentTransactionBean(classId, academicYear, studentId, billNo, transactionType, transactionDescription, previousAmount, paidAmount, dueAmont, transactionDate, createdBy);
        
        String confirm = PropertiesFile.getTransactionManager().saveTransaction(stb);
        if(!confirm.equalsIgnoreCase("successful"))
        {
            JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        JOptionPane.showMessageDialog(rootPane, "Successfully Save Bill", "Info", JOptionPane.INFORMATION_MESSAGE);
        clearForm();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtPaidAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidAmountKeyTyped
        char c = evt.getKeyChar();
          if (!((c=='.') ||
             (c >= '0') && (c <= '9')||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
          }
    }//GEN-LAST:event_txtPaidAmountKeyTyped

    private void txtPaidAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidAmountKeyReleased
        double dueAmount = NumberUtil.getNumberValueAsDouble(txtPreviousAmount.getText().trim()) - NumberUtil.getNumberValueAsDouble(txtPaidAmount.getText().trim());
        txtDueAmount.setText(NumberUtil.getNumberValueAsString(dueAmount));
    }//GEN-LAST:event_txtPaidAmountKeyReleased

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
    
    private String getBillNo()
    {
        return cmbClassId.getSelectedItem().toString().trim()+"_"+cmbMonthName.getSelectedItem().toString().trim()+"_"+cmbYear.getSelectedItem().toString().trim();
    }
     
    private String isValidateForm()
    {
        try{
            cmbClassId.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Class Name";
        }
        
        try{
            cmbYear.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Year";
        }
        if(txtBillNo.getText().trim().isEmpty() || txtBillNo.getText().trim() == null)
        {
            return "No Bill No";
        }
        if(txtPreviousAmount.getText().trim().isEmpty() || txtPreviousAmount.getText().trim() == null)
        {
            return "Enter Previous Amount";
        }
        if(txtPaidAmount.getText().trim().isEmpty() || txtPaidAmount.getText().trim() == null)
        {
            return "Enter Paid Amount";
        }
        if(txtDueAmount.getText().trim().isEmpty() || txtDueAmount.getText().trim() == null)
        {
            return "Enter Due Amount";
        }
        if(NumberUtil.getNumberValueAsDouble(txtPreviousAmount.getText().trim())<=0)
        {
            return "No Previous Amount";
        }
        if(NumberUtil.getNumberValueAsDouble(txtPreviousAmount.getText().trim()) < NumberUtil.getNumberValueAsDouble(txtPaidAmount.getText().trim()))
        {
            return "Enter Upto Previous Amount";
        }
        return "success";
    }
    
    private String isCompleteForm()
    {
     
        try{
            cmbClassId.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Class Name";
        }
        
        try{
            cmbYear.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Year";
        }
        if(txtBillNo.getText().trim().isEmpty() || txtBillNo.getText().trim() == null)
        {
            return "Select Any Of them";
        }
        
        if(txtStudentId.getText().trim().isEmpty() || txtStudentId.getText().trim() == null)
        {
            return "Enter Student Id";
        }
        
        
        return "success";
    }
    
    private void clearForm()
    {
        txtBillNo.setText("");
        txtPreviousAmount.setText("");
        txtPaidAmount.setText("");
        txtDueAmount.setText("");
        txtStudentId.setText("");
        txtPreviousAmount.setText("");
        txtPaidAmount.setText("");
        txtDueAmount.setText("");
        txtAreaTranDescription.setText("");
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmbClassId;
    private javax.swing.JComboBox cmbMonthName;
    private javax.swing.JComboBox cmbTransactionType;
    private javax.swing.JComboBox cmbYear;
    private com.toedter.calendar.JDateChooser dcPaidDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelBG;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelTable;
    private javax.swing.JTextArea txtAreaTranDescription;
    private javax.swing.JTextField txtBillNo;
    private javax.swing.JTextField txtDueAmount;
    private javax.swing.JTextField txtPaidAmount;
    private javax.swing.JTextField txtPreviousAmount;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables

    
}
