
package main.java.com.csbl.sms.ui.subject;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import main.java.com.csbl.sms.bean.SubjectBean;
import main.java.com.csbl.sms.util.PropertiesFile;
import main.java.com.csbl.sms.util.NumberConverterUtil;


public class SubjectEntryForm extends javax.swing.JDialog {

    JTextField tf;
    List<String> listOfSubjectCode = new ArrayList<>();
    
    public SubjectEntryForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(680, 500);
        setLocationRelativeTo(null);
        
        
        //////Auto Suggest
        tf = (JTextField)  cmbSubjectCode.getEditor().getEditorComponent();
        tf.addKeyListener(new KeyAdapter() {
            @Override
                public void keyTyped(KeyEvent e) {
             EventQueue.invokeLater(new Runnable() {
                 @Override
            public void run() {
                String text = tf.getText();
                      if(text.length()==0) {
                         cmbSubjectCode.hidePopup();
                          setModel(new DefaultComboBoxModel(listOfSubjectCode.toArray()), "");
                      }
                      else{
                         DefaultComboBoxModel m = getSuggestedModel(listOfSubjectCode, text);
                         if(m.getSize()==0 || hide_flag) {
                          cmbSubjectCode.hidePopup();
                         hide_flag = false;
                        }else{
                        setModel(m, text);
                         cmbSubjectCode.showPopup();
                    }
                }
            }
        });
            }
            @Override
                public void keyPressed(KeyEvent e) {
                    String text = tf.getText();
         int code = e.getKeyCode();
             if(code==KeyEvent.VK_ENTER) {
            if(!listOfSubjectCode.contains(text)) {
                listOfSubjectCode.add(text);
                Collections.sort(listOfSubjectCode);
                setModel(getSuggestedModel(listOfSubjectCode, text), text);
            }
            hide_flag = true;
        }else if(code==KeyEvent.VK_ESCAPE) {
            hide_flag = true;
        }else if(code==KeyEvent.VK_RIGHT) {
            for(int i=0;i<listOfSubjectCode.size();i++) {
                String str = listOfSubjectCode.get(i)+"";
                if(str.startsWith(text)) {
                    cmbSubjectCode.setSelectedIndex(-1);
                    tf.setText(str);
                    return;
                }
            }
        }
            }
      });
      //setModel(new DefaultComboBoxModel(listOfSubjectCode), "");
        
    }

    
    private boolean hide_flag = false;
    private void setModel(DefaultComboBoxModel mdl, String str) {
        cmbSubjectCode.setModel(mdl);
        cmbSubjectCode.setSelectedIndex(-1);
        tf.setText(str);
    }
    private static DefaultComboBoxModel getSuggestedModel(java.util.List<String> list, String text) {
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        for(String s: list) {
            if(s.startsWith(text)) {
                m.addElement(s);
            }
        }
        return m;
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        btnGroupMaritalStatus = new javax.swing.ButtonGroup();
        panelBackground = new javax.swing.JPanel();
        panelLists = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSubjectList = new javax.swing.JTable();
        panelEntry = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        cmbClass = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbSubjectCode = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtSubjectName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmbSubjectType = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Subject Entry Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelLists.setBackground(new java.awt.Color(240, 253, 249));
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Of Subject", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18))); // NOI18N

        tableSubjectList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableSubjectList.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSubjectList.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tableSubjectList);
        tableSubjectList.getAccessibleContext().setAccessibleName("Lists Of Student");

        javax.swing.GroupLayout panelListsLayout = new javax.swing.GroupLayout(panelLists);
        panelLists.setLayout(panelListsLayout);
        panelListsLayout.setHorizontalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setText("Subject Entry Form");

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
        jLabel11.setText("Class Id :");

        cmbClass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Subject Code :");

        cmbSubjectCode.setEditable(true);
        cmbSubjectCode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbSubjectCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSubjectCodeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Subject Name :");

        txtSubjectName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSubjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Subject Type :");

        cmbSubjectType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbSubjectType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMP", "ELEC", "ADDI" }));

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
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbSubjectCode, 0, 284, Short.MAX_VALUE)
                            .addComponent(cmbClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSubjectName)
                            .addComponent(cmbSubjectType, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jLabel5)
                    .addComponent(cmbSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbSubjectType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBackground.getAccessibleContext().setAccessibleName("ProductEntryForm");

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
    setVisible(false);
    PropertiesFile.getClassManager().showSubjects();
}//GEN-LAST:event_btnReportActionPerformed


private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    
    String message = isCompleteForm();
    if(!message.equalsIgnoreCase("success"))
    {
        JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
        return;

    }
    String classId = NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim());
    String subjectCode = cmbSubjectCode.getSelectedItem().toString().trim();
    String subjectName = txtSubjectName.getText().toString().trim();
    int groupStatus = 0;
    String subjectType = cmbSubjectType.getSelectedItem().toString().trim();
    
    SubjectBean subjectBean = new SubjectBean(classId, subjectType, subjectCode, subjectName, groupStatus);
    String confirm = PropertiesFile.getSubjectManager().saveSubject(subjectBean);
    
    if(!confirm.equalsIgnoreCase("successful"))
    {
        JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    JOptionPane.showMessageDialog(rootPane, "Successfully Save Subject", "Info", JOptionPane.INFORMATION_MESSAGE);

    listOfSubjectCode.add(subjectCode);
    tableSubjectList.setModel(createTable(getTableData(PropertiesFile.getSubjectManager().getSubjectList(classId)),getTableHeader()));
    
    
    clearForm();
    
    
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
            listOfSubjectCode = PropertiesFile.getSubjectManager().getSubjectCodeListByClassId(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim()));
            tableSubjectList.setModel(createTable(getTableData(PropertiesFile.getSubjectManager().getSubjectList(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim()))),getTableHeader()));
        }catch(NullPointerException e){
        }
        
        
        clearForm();
    }//GEN-LAST:event_cmbClassActionPerformed

    private void cmbSubjectCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSubjectCodeActionPerformed
        
    }//GEN-LAST:event_cmbSubjectCodeActionPerformed

    private void txtSubjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectNameActionPerformed
        btnSaveActionPerformed(evt);
    }//GEN-LAST:event_txtSubjectNameActionPerformed

    private String isCompleteForm()
    {
                
        if(cmbClass.getSelectedItem() == null || cmbClass.getSelectedItem().toString().trim().isEmpty())
        {
            return "Select Class Name";
        }
        if(cmbSubjectCode.getSelectedItem() == null || cmbSubjectCode.getSelectedItem().toString().trim().isEmpty())
        {
            return "Select Subject Code";
        }
        if(txtSubjectName.getText().trim() == null || txtSubjectName.getText().trim().isEmpty())
        {
            return "Select Subject Name";
        }
        
        return "success";
    }


    private void clearForm()
    {
        cmbSubjectCode.setSelectedItem("");           
        txtSubjectName.setText("");
    }

    private String [] getTableHeader()
    {
        String [] s = {"Serial", "Class", "Subject Code", "Subject Name", "Subject Type"};
        return s;
    }

    private Object[][] getTableData(List<SubjectBean> subjectList)
    {
        if(subjectList == null || subjectList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[subjectList.size()][5];
        for(int i=0; i<subjectList.size();i++)
        {
            SubjectBean subjectBean = subjectList.get(i);
            obj[i][0] = i+1;
            obj[i][1] = subjectBean.getClassId();
            obj[i][2] = subjectBean.getSubjectCode();
            obj[i][3] = subjectBean.getSubjectName(); 
            obj[i][4] = subjectBean.getSubjectType();
            
        }
        return obj;
    }

    private DefaultTableModel createTable(Object [][]object, String []String)
    {
        return new DefaultTableModel(object,String) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupMaritalStatus;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbClass;
    private javax.swing.JComboBox cmbSubjectCode;
    private javax.swing.JComboBox cmbSubjectType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelLists;
    private javax.swing.JTable tableSubjectList;
    private javax.swing.JTextField txtSubjectName;
    // End of variables declaration//GEN-END:variables

}
