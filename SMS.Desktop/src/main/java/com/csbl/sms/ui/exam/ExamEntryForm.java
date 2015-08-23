
package main.java.com.csbl.sms.ui.exam;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import main.java.com.csbl.sms.bean.ExamBean;
import main.java.com.csbl.sms.util.PropertiesFile;
import main.java.com.csbl.sms.util.NumberConverterUtil;


public class ExamEntryForm extends javax.swing.JDialog {
    final JPopupMenu cutpasteMenu;

    public ExamEntryForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int)d.getWidth();
        int h = (int)d.getHeight();
        setSize(680, 500);
        setLocation(w/2-325, h/2-250);   
        cutpasteMenu = PropertiesFile.getPopUpMenu().showPopup("textField");      
    }

    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        btnGroupMaritalStatus = new javax.swing.ButtonGroup();
        panelBackground = new javax.swing.JPanel();
        panelLists = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableExamList = new javax.swing.JTable();
        panelEntry = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        cmbClass = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtExamName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Examination Entry");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelLists.setBackground(new java.awt.Color(240, 253, 249));
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Of Exam", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18))); // NOI18N

        tableExamList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableExamList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableExamList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableExamListMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableExamList);
        tableExamList.getAccessibleContext().setAccessibleName("Lists Of Products");

        javax.swing.GroupLayout panelListsLayout = new javax.swing.GroupLayout(panelLists);
        panelLists.setLayout(panelListsLayout);
        panelListsLayout.setHorizontalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
        );

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setText("Exam Entry Form");

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReport.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Class :");

        cmbClass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Exam Name :");

        txtExamName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtExamName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtExamNameMousePressed(evt);
            }
        });
        txtExamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExamNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEntryLayout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEntryLayout.createSequentialGroup()
                                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbClass, 0, 284, Short.MAX_VALUE)
                                    .addComponent(txtExamName))))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        panelEntryLayout.setVerticalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addComponent(lblHeader)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtExamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelLists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
    if(cmbClass.getSelectedItem().toString().trim().isEmpty() || cmbClass.getSelectedItem().toString().trim() == null)
    {
        JOptionPane.showMessageDialog(rootPane, "No Class Found !", "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    setVisible(false);
    //PropertiesFile.getExamManager().showExams();
}//GEN-LAST:event_btnReportActionPerformed


private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    
    String message = isCompleteForm();
    if(!message.equalsIgnoreCase("success"))
    {
        JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
        return;

    }
    String classId = NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim());
    String examName = txtExamName.getText().toString().trim();
    
    ExamBean examBean = new ExamBean(classId, examName);
    
    String confirm = PropertiesFile.getExamManager().saveExam(examBean);
    
    if(!confirm.equalsIgnoreCase("successful"))
    {
        JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    JOptionPane.showMessageDialog(rootPane, "Successfully Save Exam", "Info", JOptionPane.INFORMATION_MESSAGE);

    tableExamList.setModel(createTable(getTableData(PropertiesFile.getExamManager().getExamList(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim()))),getTableHeader()));
    
    clearForm();
    
    cmbClassActionPerformed(evt);
    
}//GEN-LAST:event_btnSaveActionPerformed

private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    clearForm();
}//GEN-LAST:event_btnResetActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try{
        cmbClass.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getClassManager().getClassName().toArray()));
    }catch(NullPointerException e)
    {
        
    }
}//GEN-LAST:event_formWindowOpened

    private void cmbClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassActionPerformed
        try{   
            tableExamList.setModel(createTable(getTableData(PropertiesFile.getExamManager().getExamList(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim()))),getTableHeader()));
        }catch(NullPointerException e)
        {
        }
    }//GEN-LAST:event_cmbClassActionPerformed

    private void txtExamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamNameActionPerformed
       btnSaveActionPerformed(evt);
    }//GEN-LAST:event_txtExamNameActionPerformed

    private void txtExamNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExamNameMousePressed
       switch(evt.getModifiers()) {
            case InputEvent.BUTTON3_MASK: {
                cutpasteMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                cutpasteMenu.setInvoker(evt.getComponent());
                break;
            }
       }
    }//GEN-LAST:event_txtExamNameMousePressed

    private void tableExamListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableExamListMousePressed
       
    }//GEN-LAST:event_tableExamListMousePressed

    private String isCompleteForm()
    {
        if(txtExamName.getText().trim().isEmpty()|| txtExamName.getText().trim()==null)
        {
            return "Enter Exam Name";
        }
        
        try{
        }catch (NullPointerException e){
            return "Select Class ID";
        }
        
        if(cmbClass.getSelectedItem() == null || cmbClass.getSelectedItem().toString().trim().isEmpty())
        {
            return "Select Class ID";
        }

        
        return "success";
    }


    private void clearForm()
    {        
        txtExamName.setText("");
    }

    private String [] getTableHeader()
    {
        String [] s = {"Serial", "Class", "Exam Name"};
        return s;
    }

    private Object[][] getTableData(List<ExamBean> examList)
    {
        if(examList == null || examList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[examList.size()][3];
        for(int i=0; i<examList.size();i++)
        {
            ExamBean examBean = examList.get(i);
            obj[i][0] = i+1;
            obj[i][1] = examBean.getClassId();
            obj[i][2] = examBean.getExamName();
            
        }
        return obj;
    }

    private DefaultTableModel createTable(Object [][]object, String []String)
    {
        return new DefaultTableModel(object,String) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
    }


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupMaritalStatus;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbClass;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelLists;
    private javax.swing.JTable tableExamList;
    private javax.swing.JTextField txtExamName;
    // End of variables declaration//GEN-END:variables

}
