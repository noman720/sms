
package main.java.com.csbl.sms.ui.student;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import main.java.com.csbl.sms.bean.SubjectChoiceBean;
import main.java.com.csbl.sms.util.NumberConverterUtil;
import main.java.com.csbl.sms.util.PropertiesFile;


public class SubjectChoiceForm extends javax.swing.JDialog {

    final JPopupMenu cutpasteMenu;
    JTextField tf;
    List<String> listOfStudentId = new ArrayList<>();
    String classIdForGlobal;
    String selectdeSubjects;
    String activateArea = null;
    
    
    public SubjectChoiceForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int)d.getWidth();
        int h = (int)d.getHeight();
        setSize(680, 650);
        setLocation(w/2-340, h/2-325);   
        cutpasteMenu = PropertiesFile.getPopUpMenu().showPopup("textArea");
        resizeTable();
        
        //////Auto Suggest
        tf = (JTextField)  cmbStudentId.getEditor().getEditorComponent();
        tf.addKeyListener(new KeyAdapter() {
            @Override
                public void keyTyped(KeyEvent e) {
             EventQueue.invokeLater(new Runnable() {
                 @Override
            public void run() {
                String text = tf.getText();
                      if(text.length()==0) {
                         cmbStudentId.hidePopup();
                          setModel(new DefaultComboBoxModel(listOfStudentId.toArray()), "");
                      }
                      else{
                         DefaultComboBoxModel m = getSuggestedModel(listOfStudentId, text);
                         if(m.getSize()==0 || hide_flag) {
                          cmbStudentId.hidePopup();
                         hide_flag = false;
                        }else{
                        setModel(m, text);
                         cmbStudentId.showPopup();
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
            if(!listOfStudentId.contains(text)) {
                listOfStudentId.add(text);
                Collections.sort(listOfStudentId);
                setModel(getSuggestedModel(listOfStudentId, text), text);
            }
            hide_flag = true;
        }else if(code==KeyEvent.VK_ESCAPE) {
            hide_flag = true;
        }else if(code==KeyEvent.VK_RIGHT) {
            for(int i=0;i<listOfStudentId.size();i++) {
                String str = listOfStudentId.get(i)+"";
                if(str.startsWith(text)) {
                    cmbStudentId.setSelectedIndex(-1);
                    tf.setText(str);
                    return;
                }
            }
        }
            }
      });
    }

    private boolean hide_flag = false;
    private void setModel(DefaultComboBoxModel mdl, String str) {
        cmbStudentId.setModel(mdl);
        cmbStudentId.setSelectedIndex(-1);
        tf.setText(str);
    }
    private static DefaultComboBoxModel getSuggestedModel(java.util.List<String> list, String text) {
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        for(String s: list) {
            if(s.startsWith(text)) m.addElement(s);
        }
        return m;
    }
    
    
    private void resizeTable()
    {
        tableSubjectList.getColumnModel().getColumn(0).setPreferredWidth(10);
        tableSubjectList.getColumnModel().getColumn(1).setPreferredWidth(10);
        tableSubjectList.getColumnModel().getColumn(2).setPreferredWidth(200);
        tableSubjectList.getColumnModel().getColumn(3).setPreferredWidth(30);
        tableSubjectList.getColumnModel().getColumn(4).setPreferredWidth(30);
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
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmbAcademicYear = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbStudentId = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaCompulsory = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaElective = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaAdditional = new javax.swing.JTextArea();
        btnAddCompulsory = new javax.swing.JButton();
        btnAddElective = new javax.swing.JButton();
        btnAddAdditional = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Subject Choice Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelLists.setBackground(new java.awt.Color(240, 253, 249));
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Of Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18))); // NOI18N

        tableSubjectList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableSubjectList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Student Id", "Compulsory", "Elective", "Additional"
            }
        ));
        jScrollPane1.setViewportView(tableSubjectList);
        tableSubjectList.getAccessibleContext().setAccessibleName("Lists Of Products");

        javax.swing.GroupLayout panelListsLayout = new javax.swing.GroupLayout(panelLists);
        panelLists.setLayout(panelListsLayout);
        panelListsLayout.setHorizontalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setText("Subject Choice Form");

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Academic Year :");

        cmbAcademicYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbAcademicYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAcademicYearActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Student Id :");

        cmbStudentId.setEditable(true);
        cmbStudentId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStudentIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Compulsory :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Elective :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Additional :");

        txtAreaCompulsory.setEditable(false);
        txtAreaCompulsory.setBackground(new java.awt.Color(204, 204, 204));
        txtAreaCompulsory.setColumns(20);
        txtAreaCompulsory.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtAreaCompulsory.setRows(2);
        txtAreaCompulsory.setToolTipText("Enter Subject Code Seperated By Comma (,)");
        txtAreaCompulsory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAreaCompulsoryMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtAreaCompulsory);

        txtAreaElective.setEditable(false);
        txtAreaElective.setBackground(new java.awt.Color(204, 204, 204));
        txtAreaElective.setColumns(20);
        txtAreaElective.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtAreaElective.setRows(2);
        txtAreaElective.setToolTipText("Enter Subject Code Seperated By Comma (,)");
        txtAreaElective.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAreaElectiveMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtAreaElective);

        txtAreaAdditional.setEditable(false);
        txtAreaAdditional.setBackground(new java.awt.Color(204, 204, 204));
        txtAreaAdditional.setColumns(20);
        txtAreaAdditional.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtAreaAdditional.setRows(2);
        txtAreaAdditional.setToolTipText("Enter Subject Code Seperated By Comma (,)");
        txtAreaAdditional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAreaAdditionalMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(txtAreaAdditional);

        btnAddCompulsory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAddCompulsory.setText("Add");
        btnAddCompulsory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCompulsoryActionPerformed(evt);
            }
        });

        btnAddElective.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAddElective.setText("Add");
        btnAddElective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddElectiveActionPerformed(evt);
            }
        });

        btnAddAdditional.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAddAdditional.setText("Add");
        btnAddAdditional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdditionalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAcademicYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbStudentId, 0, 284, Short.MAX_VALUE)))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddCompulsory)
                    .addComponent(btnAddElective)
                    .addComponent(btnAddAdditional)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnAddCompulsory))
                .addGap(4, 4, 4)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnAddElective))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAddAdditional))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelLists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
     String message = isCompleteForm();
    if(!message.equalsIgnoreCase("success"))
    {
        JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String cId = NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim());
    String acYear = cmbAcademicYear.getSelectedItem().toString().trim();
    setVisible(false);
    PropertiesFile.getSubjectChoiceManager().showSelectedSubjects(cId, acYear);
}//GEN-LAST:event_btnReportActionPerformed


private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    
    String message = isCompleteForm();
    if(!message.equalsIgnoreCase("success"))
    {
        JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    int response = JOptionPane.showConfirmDialog(null, "Do you sure to save subjects?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response != JOptionPane.YES_OPTION) {
            return;
        }
    
    String studentId = cmbStudentId.getSelectedItem().toString();
    String classId = NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim());
    String academicYear = cmbAcademicYear.getSelectedItem().toString();            
    String compulsory = txtAreaCompulsory.getText().trim();
    String elective = txtAreaElective.getText().trim();
    String additional = txtAreaAdditional.getText().trim();
            
    
    SubjectChoiceBean subjectChoiceBean = new SubjectChoiceBean(studentId, classId, academicYear, compulsory, elective, additional);
    
    String confirm = PropertiesFile.getSubjectChoiceManager().saveSelectedSubject(subjectChoiceBean);
    
    if(!confirm.equalsIgnoreCase("successful"))
    {
        JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    JOptionPane.showMessageDialog(rootPane, "Successfully Save Choosed Subject", "Info", JOptionPane.INFORMATION_MESSAGE);

    tableSubjectList.setModel(createTable(getTableData(PropertiesFile.getSubjectChoiceManager().getStudentList(classId, cmbAcademicYear.getSelectedItem().toString().trim())),getTableHeader()));
    resizeTable();
    
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
            cmbAcademicYear.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getSubjectChoiceManager().getAcademicYear(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim())).toArray()));
            cmbStudentId.setModel(new javax.swing.DefaultComboBoxModel(new ArrayList().toArray()));
            cmbAcademicYearActionPerformed(evt);
        }catch(NullPointerException e)
        {
        }
        clearForm();
        
    }//GEN-LAST:event_cmbClassActionPerformed

    private void txtAreaCompulsoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaCompulsoryMousePressed
        switch(evt.getModifiers()) {
            case InputEvent.BUTTON3_MASK: {
                cutpasteMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                cutpasteMenu.setInvoker(evt.getComponent());
                break;
            }
       }
    }//GEN-LAST:event_txtAreaCompulsoryMousePressed

    private void txtAreaElectiveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaElectiveMousePressed
        switch(evt.getModifiers()) {
            case InputEvent.BUTTON3_MASK: {
                cutpasteMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                cutpasteMenu.setInvoker(evt.getComponent());
                break;
            }
       }
    }//GEN-LAST:event_txtAreaElectiveMousePressed

    private void txtAreaAdditionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaAdditionalMousePressed
        switch(evt.getModifiers()) {
            case InputEvent.BUTTON3_MASK: {
                cutpasteMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                cutpasteMenu.setInvoker(evt.getComponent());
                break;
            }
       }
    }//GEN-LAST:event_txtAreaAdditionalMousePressed

    private void cmbStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStudentIdActionPerformed

    private void cmbAcademicYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAcademicYearActionPerformed
        try{
            listOfStudentId = PropertiesFile.getSubjectChoiceManager().getStudentIdList(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim()), cmbAcademicYear.getSelectedItem().toString().trim());
            cmbStudentId.setModel(new javax.swing.DefaultComboBoxModel(listOfStudentId.toArray()));
        }catch(NullPointerException e)
        {
        }
        tableSubjectList.setModel(createTable(getTableData(PropertiesFile.getSubjectChoiceManager().getStudentList(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim()), cmbAcademicYear.getSelectedItem().toString().trim())),getTableHeader()));
        resizeTable();
        clearForm();

    }//GEN-LAST:event_cmbAcademicYearActionPerformed

    private void btnAddCompulsoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCompulsoryActionPerformed
        setClassIdForGlobal(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim()));
        setActivateArea("compulsory");
        new CheckBoxSubject(null, true, this).setVisible(true);
    }//GEN-LAST:event_btnAddCompulsoryActionPerformed

    private void btnAddElectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddElectiveActionPerformed
        setClassIdForGlobal(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim()));      
        setActivateArea("elective");
        new CheckBoxSubject(null, true, this).setVisible(true);
    }//GEN-LAST:event_btnAddElectiveActionPerformed

    private void btnAddAdditionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdditionalActionPerformed
        setClassIdForGlobal(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim())); 
        setActivateArea("additional");
        new CheckBoxSubject(null, true, this).setVisible(true);
    }//GEN-LAST:event_btnAddAdditionalActionPerformed

    private String isCompleteForm()
    {
        try{
            cmbClass.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Class Name";
        }
        try{
            cmbAcademicYear.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Academic Year";
        }
        try{
            cmbStudentId.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Student Id";
        }
        if(cmbStudentId.getSelectedItem().toString().trim() == null || cmbStudentId.getSelectedItem().toString().trim().isEmpty())
        {
            return "Enter Student Id";
        }
        
        if(txtAreaCompulsory.getText()==null)
        {
            return "Enter Compulsory Subjects";
        }
        
        return "success";
    }


    private void clearForm()
    {        
    }

    private String [] getTableHeader()
    {
        String [] s = {"Serial", "Student ID", "Compulsory Subject", "Elective Subject", "Additional Subject"};
        return s;
    }

    private Object[][] getTableData(List<SubjectChoiceBean> studentSubjectList)
    {
        if(studentSubjectList == null || studentSubjectList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[studentSubjectList.size()][5];
        for(int i=0; i<studentSubjectList.size();i++)
        {
            SubjectChoiceBean selectiveSubjectBean = studentSubjectList.get(i);
            obj[i][0] = i+1;
            obj[i][1] = selectiveSubjectBean.getStudentID();
            obj[i][2] = selectiveSubjectBean.getCompulsory();
            obj[i][3] = selectiveSubjectBean.getElective();
            obj[i][4] = selectiveSubjectBean.getAdditional();
            
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
    private javax.swing.JButton btnAddAdditional;
    private javax.swing.JButton btnAddCompulsory;
    private javax.swing.JButton btnAddElective;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupMaritalStatus;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbAcademicYear;
    private javax.swing.JComboBox cmbClass;
    private javax.swing.JComboBox cmbStudentId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelLists;
    private javax.swing.JTable tableSubjectList;
    private javax.swing.JTextArea txtAreaAdditional;
    private javax.swing.JTextArea txtAreaCompulsory;
    private javax.swing.JTextArea txtAreaElective;
    // End of variables declaration//GEN-END:variables

    public String getClassIdForGlobal() {
        return classIdForGlobal;
    }

    public void setClassIdForGlobal(String classIdForGlobal) {
        this.classIdForGlobal = classIdForGlobal;
    }

    public String getSelectdeSubjects() {
        return selectdeSubjects;
    }

    public void setSelectdeSubjects(String selectdeSubjects) {
        this.selectdeSubjects = selectdeSubjects;
    }

    public String getActivateArea() {
        return activateArea;
    }

    public void setActivateArea(String activateArea) {
        this.activateArea = activateArea;
    }
    
    
    
    public void refreshWindow(SubjectChoiceForm subjectChoiceForm)
    {
        subjectChoiceForm.show();

        if(activateArea.equalsIgnoreCase("compulsory")){
            txtAreaCompulsory.setText(subjectChoiceForm.getSelectdeSubjects());
        }
        if(activateArea.equalsIgnoreCase("elective"))
        {
            txtAreaElective.setText(subjectChoiceForm.getSelectdeSubjects());
        }
        if(activateArea.equalsIgnoreCase("additional"))
        {
            txtAreaAdditional.setText(subjectChoiceForm.getSelectdeSubjects());
        }
    }
    
}
