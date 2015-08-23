
package main.java.com.csbl.sms.ui.payment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.java.com.csbl.sms.bean.PrepareBillBean;
import main.java.com.csbl.sms.util.DateUtil;
import main.java.com.csbl.sms.util.NumberUtil;
import main.java.com.csbl.sms.util.PropertiesFile;
import main.java.com.csbl.sms.util.NumberConverterUtil;

public class PrepareBillForm extends javax.swing.JDialog {

    List<PrepareBillBean> prepareBillList = new ArrayList<>();
    double tAmount = 0;
    public PrepareBillForm(java.awt.Frame parent, boolean modal) {
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
        jLabel5 = new javax.swing.JLabel();
        cmbClassId = new javax.swing.JComboBox();
        cmbMonthName = new javax.swing.JComboBox();
        cmbYear = new javax.swing.JComboBox();
        dcMonthDate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtBillNo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBillList = new javax.swing.JTable();
        lblTotalBill = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bill Prepare Form");
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
        jLabel1.setText("Prepare Bill");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Class Id :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Bill Month :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Bill Year :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Moth Date :");

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

        dcMonthDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Bill No :");

        txtBillNo.setEditable(false);
        txtBillNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEntryLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEntryLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMonthName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEntryLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEntryLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(dcMonthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
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
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(dcMonthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear))
                .addGap(41, 41, 41))
        );

        panelTable.setBackground(new java.awt.Color(240, 253, 249));
        panelTable.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "List of Bill", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14))); // NOI18N

        tableBillList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableBillList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Bill Description", "Bill Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBillList);

        lblTotalBill.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTotalBill.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Total Bill :");

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGroup(panelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String message = isCompleteForm();
        if(!message.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String classId = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
        String billMonth = cmbMonthName.getSelectedItem().toString().trim();
        int billYear = Integer.parseInt(cmbYear.getSelectedItem().toString().trim());
        String billNo = txtBillNo.getText().trim();
        String monthDate = DateUtil.getDateAsString(dcMonthDate.getCalendar().getTime());
        PrepareBillBean pbb = new PrepareBillBean(classId, billNo, billMonth, billYear, monthDate);
        new CheckBoxBill(null, rootPaneCheckingEnabled, this, pbb).setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
        cmbClassId.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getClassManager().getClassName().toArray()));
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel(getYearList().toArray()));
        dcMonthDate.setDate(new Date());
    }catch(NullPointerException e)
    {
        JOptionPane.showMessageDialog(rootPane, "No Record Found !", "Alert", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_formWindowOpened

    private void cmbClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassIdActionPerformed
        txtBillNo.setText(getBillNo());
        tableBillList.setModel(createTable(getTableData(PropertiesFile.getPaymentManger().getPreparedBill(txtBillNo.getText().trim())),getTableHeader()));
        lblTotalBill.setText(NumberUtil.getNumberValueAsString(tAmount));
    }//GEN-LAST:event_cmbClassIdActionPerformed

    private void cmbMonthNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonthNameActionPerformed
        txtBillNo.setText(getBillNo());
        tableBillList.setModel(createTable(getTableData(PropertiesFile.getPaymentManger().getPreparedBill(txtBillNo.getText().trim())),getTableHeader()));
        lblTotalBill.setText(NumberUtil.getNumberValueAsString(tAmount));
    }//GEN-LAST:event_cmbMonthNameActionPerformed

    private void cmbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYearActionPerformed
        txtBillNo.setText(getBillNo());
        tableBillList.setModel(createTable(getTableData(PropertiesFile.getPaymentManger().getPreparedBill(txtBillNo.getText().trim())),getTableHeader()));
        lblTotalBill.setText(NumberUtil.getNumberValueAsString(tAmount));
    }//GEN-LAST:event_cmbYearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String message = isCompleteForm();
        if(!message.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int response = JOptionPane.showConfirmDialog(null, "Do you sure to save Payment?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response != JOptionPane.YES_OPTION) {
            return;
        }
        
        String confirm = PropertiesFile.getPaymentManger().savePreparedBill(prepareBillList);
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
        
        return "success";
    }
    
    private void clearForm()
    {
        txtBillNo.setText("");
        lblTotalBill.setText("");
        prepareBillList.clear();
        tableBillList.setModel(createTable(getTableData(null),getTableHeader()));
    }
    
    
    private String [] getTableHeader()
    {
        String [] s = {"Serial","Bill Description", "Amount"};
        return s;
    }

    private Object[][] getTableData(List<PrepareBillBean> prepareBillBeans)
    {
        tAmount = 0;
        if(prepareBillBeans == null || prepareBillBeans.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[prepareBillBeans.size()][3];
        for(int i=0; i<prepareBillBeans.size();i++)
        {
            PrepareBillBean pbb = prepareBillBeans.get(i);
            obj[i][0] = i+1;
            obj[i][1] = pbb.getBillDescription();
            obj[i][2] = pbb.getBillAmount();
            tAmount += pbb.getBillAmount();
            
        }
        return obj;
    }

    private DefaultTableModel createTable(Object [][]object, String []String)
    {
        return new DefaultTableModel(object,String) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
            
        };
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbClassId;
    private javax.swing.JComboBox cmbMonthName;
    private javax.swing.JComboBox cmbYear;
    private com.toedter.calendar.JDateChooser dcMonthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblTotalBill;
    private javax.swing.JPanel panelBG;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelTable;
    private javax.swing.JTable tableBillList;
    private javax.swing.JTextField txtBillNo;
    // End of variables declaration//GEN-END:variables

    public List<PrepareBillBean> getPrepareBillList() {
        return prepareBillList;
    }

    public void setPrepareBillList(List<PrepareBillBean> prepareBillList) {
        this.prepareBillList = prepareBillList;
    }

    public void refreshWindow(PrepareBillForm prepareBillForm)
    {
        tableBillList.setModel(createTable(getTableData(prepareBillForm.getPrepareBillList()),getTableHeader()));
        lblTotalBill.setText(NumberUtil.getNumberValueAsString(tAmount));
    }
}
