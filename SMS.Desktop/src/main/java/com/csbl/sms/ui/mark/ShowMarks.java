
package main.java.com.csbl.sms.ui.mark;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import main.java.com.csbl.sms.bean.MarkSheetBean;
import main.java.com.csbl.sms.bean.StudentBean;
import main.java.com.csbl.sms.bean.TranscriptBean;
import main.java.com.csbl.sms.util.NumberConverterUtil;
import main.java.com.csbl.sms.util.PropertiesFile;


public class ShowMarks extends javax.swing.JDialog {

    TranscriptBean transcriptBean = new TranscriptBean();
    JTextField tf;
    List<String> listOfStudentId = new ArrayList<>();

    public ShowMarks(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int)d.getWidth();
        int h = (int)d.getHeight();
        setSize(680, 550);
        setLocation(w/2-325, h/2-275);   
        
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
        tableMarksList = new javax.swing.JTable();
        panelEntry = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmbExamYear = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbExamName = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbClassId = new javax.swing.JComboBox();
        cmbStudentId = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        lblGPAWithoutAdd = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblGPAWithAdd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Show Mark Sheet Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelLists.setBackground(new java.awt.Color(240, 253, 249));
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Of Marks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18))); // NOI18N

        tableMarksList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableMarksList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableMarksList);
        tableMarksList.getAccessibleContext().setAccessibleName("Lists Of Products");

        javax.swing.GroupLayout panelListsLayout = new javax.swing.GroupLayout(panelLists);
        panelLists.setLayout(panelListsLayout);
        panelListsLayout.setHorizontalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Show Marks Sheet");

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Show");
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
        jLabel11.setText("Student Id :");

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

        cmbExamName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbExamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbExamNameActionPerformed(evt);
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

        cmbStudentId.setEditable(true);
        cmbStudentId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbExamYear, 0, 303, Short.MAX_VALUE)
                            .addComponent(cmbExamName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbClassId, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbStudentId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelEntryLayout.setVerticalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addComponent(lblHeader)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbClassId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbExamYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbExamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(cmbStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel4.setText("GPA Without Add :");

        jLabel6.setText("GPA With Add :");

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblGPAWithoutAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lblGPAWithAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 334, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGPAWithoutAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGPAWithAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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


private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    cmbClassId.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getClassManager().getClassName().toArray()));    
    //cmbClassIdActionPerformed(null);
}//GEN-LAST:event_formWindowOpened

    private void cmbExamYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbExamYearActionPerformed
        List<String> examNameList = PropertiesFile.getMarkEntryManager().getExamName(NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim()), cmbExamYear.getSelectedItem().toString().trim());
        if(examNameList.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No Exam Name Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cmbExamName.setModel(new javax.swing.DefaultComboBoxModel(examNameList.toArray()));  
        cmbExamNameActionPerformed(evt);
    }//GEN-LAST:event_cmbExamYearActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
       setVisible(false);
       PropertiesFile.getResultManager().showTranscript(transcriptBean);
       //PropertiesFile.getResultManager().showSupplierSummary();
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        String message = isCompleteForm();
        if(!message.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
            return;

        }
        
        String classId = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
        String studentId = cmbStudentId.getSelectedItem().toString().trim();
        String examYear = cmbExamYear.getSelectedItem().toString().trim();
        String examName = cmbExamName.getSelectedItem().toString().trim();
       
        List<MarkSheetBean> markSheetBeans = PropertiesFile.getResultManager().getMarkSheet(classId, studentId, examYear, examName);
        if(markSheetBeans.isEmpty() || markSheetBeans == null)
        {
            JOptionPane.showMessageDialog(rootPane, "No Record Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        transcriptBean.setMarksList(markSheetBeans); 
        transcriptBean = PropertiesFile.getResultManager().getResult(transcriptBean);
        
        StudentBean studentBean = PropertiesFile.getStudentManager().getStudentInfo(classId, studentId);
        transcriptBean.setExamName(examName);
        transcriptBean.setExamYear(examYear);
        transcriptBean.setStudentId(studentId);
        transcriptBean.setStudentName(studentBean.getStudentName());
        transcriptBean.setFatherName(studentBean.getFatherName());
        transcriptBean.setMotherName(studentBean.getMotherName());
        transcriptBean.setBirthDate(studentBean.getBirthDate());
        if(classId.equalsIgnoreCase("IX") || classId.equalsIgnoreCase("X") || classId.equalsIgnoreCase("XI") || classId.equalsIgnoreCase("XII"))
        {
            String sub = String.format("%02d", Integer.parseInt(studentBean.getAcademicYear().substring(2))+1);
            transcriptBean.setAcademicYear(studentBean.getAcademicYear()+"-"+sub);
        }
        else
        {
            transcriptBean.setAcademicYear(studentBean.getAcademicYear());
        }
        
        transcriptBean.setClassId(classId.toUpperCase());
        transcriptBean.setMedium(studentBean.getMedium());
        transcriptBean.setGroup(studentBean.getStudentGroup());
        transcriptBean.setSection(studentBean.getSectionName());
        transcriptBean.setShift(studentBean.getShift());
        transcriptBean.setType(studentBean.getStudentType());
        transcriptBean.setClassRoll(studentBean.getClassRoll());
        
        lblGPAWithoutAdd.setText(transcriptBean.getGPAwithoutAdditional()+"");
        lblGPAWithAdd.setText(transcriptBean.getGPAwithAdditional()+"");
        tableMarksList.setModel(createTable(getTableData(markSheetBeans),getTableHeader()));
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbExamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbExamNameActionPerformed
        listOfStudentId = PropertiesFile.getResultManager().getStudentId(NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim()), cmbExamYear.getSelectedItem().toString().trim(), cmbExamName.getSelectedItem().toString().trim());
        if(listOfStudentId.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No Student Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cmbStudentId.setModel(new javax.swing.DefaultComboBoxModel(listOfStudentId.toArray()));
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
           
        try{
            cmbStudentId.getSelectedItem().toString().trim();
        }catch(NullPointerException e){
            return "Enter StudentId";
        }
        return "success";
    }

    private List<Integer> getYearList()
    {
        List<Integer> yearList = new ArrayList<>();
            Date d = new Date();
            int date = d.getYear()+1900;
            System.out.println(date);
            for(int i=date; i>=2000; i--)
            {
            yearList.add(i);
            }
        return yearList;
    }

    private void clearForm()
    {        
    }

    private String [] getTableHeader()
    {
        String [] s = {"Subjct Type", "Subject Code", "Subject Name", " Marks", "Grade Point", "Grade Letter"};
        return s;
    }

    private Object[][] getTableData(List<MarkSheetBean> subjectMarkBeanList)
    {
        if(subjectMarkBeanList == null || subjectMarkBeanList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[subjectMarkBeanList.size()][6];
        for(int i=0; i<subjectMarkBeanList.size();i++)
        {
            MarkSheetBean subjectMarkBean = subjectMarkBeanList.get(i);
            obj[i][0] = subjectMarkBean.getSubjectType().toUpperCase();
            obj[i][1] = subjectMarkBean.getSubjectCode();
            obj[i][2] = subjectMarkBean.getSubjectName();
            obj[i][3] = subjectMarkBean.getMark();
            obj[i][4] = subjectMarkBean.getGradePoint();
            obj[i][5] = subjectMarkBean.getGradeLetter();
                        
        }
        return obj;
    }

    private DefaultTableModel createTable(Object [][]object, String []String)
    {
        return new DefaultTableModel(object,String) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class,  java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
    private javax.swing.JComboBox cmbClassId;
    private javax.swing.JComboBox cmbExamName;
    private javax.swing.JComboBox cmbExamYear;
    private javax.swing.JComboBox cmbStudentId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblGPAWithAdd;
    private javax.swing.JLabel lblGPAWithoutAdd;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelLists;
    private javax.swing.JTable tableMarksList;
    // End of variables declaration//GEN-END:variables

}
