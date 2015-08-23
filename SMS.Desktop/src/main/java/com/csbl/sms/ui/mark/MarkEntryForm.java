
package main.java.com.csbl.sms.ui.mark;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import main.java.com.csbl.sms.bean.CommitResultBean;
import main.java.com.csbl.sms.bean.MarkBean;
import main.java.com.csbl.sms.util.PropertiesFile;
import main.java.com.csbl.sms.util.NumberConverterUtil;


public class MarkEntryForm extends javax.swing.JDialog {

    List<MarkBean> markList = new ArrayList<>();

    public MarkEntryForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int)d.getWidth();
        int h = (int)d.getHeight();
        setSize(680, 550);
        setLocation(w/2-325, h/2-275);   
        
        
        
    }

    private void resizeTable()
    {
        tableStudentList.getColumnModel().getColumn(0).setPreferredWidth(10);
        tableStudentList.getColumnModel().getColumn(1).setPreferredWidth(20);
        tableStudentList.getColumnModel().getColumn(2).setPreferredWidth(10);
        tableStudentList.getColumnModel().getColumn(3).setPreferredWidth(100);
        tableStudentList.getColumnModel().getColumn(4).setPreferredWidth(30);
        tableStudentList.setRowHeight(20);
    }
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        btnGroupMaritalStatus = new javax.swing.ButtonGroup();
        panelBackground = new javax.swing.JPanel();
        panelLists = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudentList = new javax.swing.JTable();
        panelEntry = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBrowse = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        cmbClassId = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmbExamYear = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbExamName = new javax.swing.JComboBox();
        cmbSubject = new javax.swing.JComboBox();
        cmbMarkType = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mark Entry Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelLists.setBackground(new java.awt.Color(240, 253, 249));
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Of Subject", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18))); // NOI18N

        tableStudentList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableStudentList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableStudentList);
        tableStudentList.getAccessibleContext().setAccessibleName("Lists Of Products");

        javax.swing.GroupLayout panelListsLayout = new javax.swing.GroupLayout(panelLists);
        panelLists.setLayout(panelListsLayout);
        panelListsLayout.setHorizontalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setText("Mark Entry Form");

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBrowse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.setToolTipText("Browse MS Excel File");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Class Id :");

        cmbClassId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbClassId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Exam Year :");

        cmbExamYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbExamYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbExamYearActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Exam Name :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Subject :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Mark Type :");

        cmbExamName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbExamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbExamNameActionPerformed(evt);
            }
        });

        cmbSubject.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSubjectActionPerformed(evt);
            }
        });

        cmbMarkType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbMarkType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Theory", "Objective", "Practical", "Attendence", "ClassTest" }));
        cmbMarkType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarkTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbClassId, 0, 284, Short.MAX_VALUE)
                            .addComponent(cmbExamYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbExamName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbSubject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbMarkType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
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
                    .addComponent(cmbClassId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbExamYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbExamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(cmbMarkType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnBrowse.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgroundLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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


private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            cmbClassId.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getClassManager().getClassName().toArray()));
        }catch(NullPointerException e)
        {
        }
}//GEN-LAST:event_formWindowOpened

    private void cmbExamYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbExamYearActionPerformed
        cmbExamNameActionPerformed(evt);
    }//GEN-LAST:event_cmbExamYearActionPerformed

    private void cmbClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassIdActionPerformed
        try{
            String clazzid = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
            cmbExamYear.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getMarkEntryManager().getExamYear(clazzid).toArray()));
            cmbExamName.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getMarkEntryManager().getExamName(clazzid, cmbExamYear.getSelectedItem().toString().trim()).toArray()));
            cmbSubject.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getMarkEntryManager().getSubjectCode(clazzid, cmbExamYear.getSelectedItem().toString().trim(), cmbExamName.getSelectedItem().toString().trim()).toArray()));
           
        }catch(NullPointerException e)
        {
        }
        
    }//GEN-LAST:event_cmbClassIdActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed

        if(markList.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No Student Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        File excelFile = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Select MSExcel File");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter sqlfilter = new FileNameExtensionFilter("MSExcel files (*.xlsx, *.xls)", "xlsx", "xls");
        chooser.setFileFilter(sqlfilter);
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        //
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            excelFile = chooser.getSelectedFile();
            readMarksFromExcelSheet(excelFile);
        }
        

    }//GEN-LAST:event_btnBrowseActionPerformed
    
    private void readMarksFromExcelSheet(File file)
    {
        List<MarkBean> markBeans = PropertiesFile.getExcelSheetManager().getMarksFromExcelSheet(file);
        
        for(int i=0; i<markList.size(); i++)
        {
            for(MarkBean excelMB : markBeans)
            {
                if(markList.get(i).getStudentId().equalsIgnoreCase(excelMB.getStudentId()))
                {
                    markList.get(i).setMark(excelMB.getMark());
                    break;
                }
            }
        }
        
        tableStudentList.setModel(createTable(getTableData(markList),getTableHeader()));        
        resizeTable();
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String isValid = isValidForm();
        if(!isValid.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, isValid, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String classId = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
        String markType = cmbMarkType.getSelectedItem().toString().trim()+"Mark";
        String examYear = cmbExamYear.getSelectedItem().toString().trim();
        String examName = cmbExamName.getSelectedItem().toString().trim();
        String subjectCode = cmbSubject.getSelectedItem().toString().trim();
        
        CommitResultBean crb = new CommitResultBean(classId, examYear, examName);
        boolean isCommited = PropertiesFile.getResultManager().isCommitedResult(crb);
        if(isCommited)
        {
            JOptionPane.showMessageDialog(rootPane, "Access denied !\nAlready Commited Result !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(markList.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No Student Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
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
            
        
        String confirm = PropertiesFile.getMarkEntryManager().saveMarks(getStudentsMarkList(), classId, markType, examYear, examName, subjectCode);

        if(!confirm.equalsIgnoreCase("successful"))
        {
            JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(rootPane, "Successfully Save Marks", "Info", JOptionPane.INFORMATION_MESSAGE);

        showTableData();
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbExamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbExamNameActionPerformed
        cmbSubjectActionPerformed(evt);
    }//GEN-LAST:event_cmbExamNameActionPerformed

    private void cmbSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSubjectActionPerformed
        cmbMarkTypeActionPerformed(evt);
    }//GEN-LAST:event_cmbSubjectActionPerformed

    private void cmbMarkTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarkTypeActionPerformed
        showTableData();
    }//GEN-LAST:event_cmbMarkTypeActionPerformed

    private synchronized void showTableData()
    {
        String message = isValidForm();
        if(!message.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String classId = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
        String examYear = cmbExamYear.getSelectedItem().toString().trim();
        String examName = cmbExamName.getSelectedItem().toString().trim();
        String subjectCode = cmbSubject.getSelectedItem().toString().trim();
        String markType = cmbMarkType.getSelectedItem().toString().trim()+"Mark";
        
        MarkBean markBean = new MarkBean(examYear, examName, subjectCode, markType);
        markList.clear();
        markList = PropertiesFile.getMarkEntryManager().getStudentList(markBean, classId);
        tableStudentList.setModel(createTable(getTableData(markList),getTableHeader()));
        resizeTable();
    }
    
    private synchronized List<MarkBean> getStudentsMarkList()
    {
        for(int i=0; i<markList.size(); i++)
            {
                markList.get(i).setStudentId(tableStudentList.getValueAt(i, 1).toString());
                markList.get(i).setMark(Double.parseDouble(tableStudentList.getValueAt(i, 4).toString()));   
            }   
        return markList;
    }
  
 
    private String isValidForm()
    {
        try{
            cmbClassId.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Class Name";
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
        try{
            cmbSubject.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Subject Code";
        }
        try{
            cmbMarkType.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Select Mark Type";
        }
        return "success";
    }
    
    private String isCompleteForm()
    {
        
        for(int i=0; i<tableStudentList.getRowCount(); i++)
        {
            if(tableStudentList.getValueAt(i, 4) == null || tableStudentList.getValueAt(i, 4).toString().isEmpty()){
                return "Enter Valid Mark For Student ID = "+tableStudentList.getValueAt(i, 1).toString()+"";
            }
            
            try{
                Double.parseDouble(tableStudentList.getValueAt(i, 4).toString());
            }catch(NumberFormatException e)
            {
                return "Enter Valid Mark For Student ID = "+tableStudentList.getValueAt(i, 1).toString()+"";
            }
        }
                
        return "success";
    }


    private void clearForm()
    {        
    }

    private String [] getTableHeader()
    {
        String [] s = {"Serial", "Student ID", "Cass Roll", "Student Name", cmbMarkType.getSelectedItem().toString().trim()+" Marks"};
        return s;
    }

    private Object[][] getTableData(List<MarkBean> studentList)
    {
        if(studentList == null || studentList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[studentList.size()][5];
        for(int i=0; i<studentList.size();i++)
        {
            MarkBean markBean = studentList.get(i);
            obj[i][0] = i+1;
            obj[i][1] = markBean.getStudentId();
            obj[i][2] = markBean.getClassRoll();
            obj[i][3] = markBean.getStudentName();
            obj[i][4] = markBean.getMark();
                        
        }
        return obj;
    }

    private DefaultTableModel createTable(Object [][]object, String []String)
    {
        return new DefaultTableModel(object,String) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
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
    private javax.swing.JButton btnBrowse;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupMaritalStatus;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbClassId;
    private javax.swing.JComboBox cmbExamName;
    private javax.swing.JComboBox cmbExamYear;
    private javax.swing.JComboBox cmbMarkType;
    private javax.swing.JComboBox cmbSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelLists;
    private javax.swing.JTable tableStudentList;
    // End of variables declaration//GEN-END:variables

}
