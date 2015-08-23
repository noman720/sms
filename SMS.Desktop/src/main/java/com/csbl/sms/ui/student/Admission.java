
package main.java.com.csbl.sms.ui.student;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.java.com.csbl.sms.bean.StudentBean;
import main.java.com.csbl.sms.util.NumberConverterUtil;
import main.java.com.csbl.sms.util.PropertiesFile;


public class Admission extends javax.swing.JDialog {
    
    String studentId;
    String classId;
    String academicYear;
    String studentGroup;
    int rollNo;
    
    public Admission(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(840, 680);
        setLocationRelativeTo(null);
        cmbGroup.setEnabled(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
        
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
        btnReport = new javax.swing.JButton();
        btnAddDetails = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        cmbClassId = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbSession = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmbGroup = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Entry Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelLists.setBackground(new java.awt.Color(240, 253, 249));
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Of Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18))); // NOI18N

        tableStudentList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setText("Student Entry Form");

        btnReport.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnAddDetails.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAddDetails.setText("Add Student");
        btnAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDetailsActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Addmission Class :");

        cmbClassId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbClassId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Addmission Year :");

        cmbSession.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSessionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Student Group :");

        cmbGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SCIENCE", "COMERCE", "HUMANITIES" }));
        cmbGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGroupActionPerformed(evt);
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
                        .addGap(21, 21, 21)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbClassId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbSession, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbGroup, 0, 284, Short.MAX_VALUE)))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnAddDetails)
                        .addGap(15, 15, 15)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    String message = isCompleteForm();
    if(!message.equalsIgnoreCase("success"))
    {
        JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String cId = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
    String acYear = cmbSession.getSelectedItem().toString().trim();
    setVisible(false);
    PropertiesFile.getStudentManager().showStudentByClass(cId, acYear);
}//GEN-LAST:event_btnReportActionPerformed


private void btnAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetailsActionPerformed
    String message = isCompleteForm();
    if(!message.equalsIgnoreCase("success"))
    {
        JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
        return;

    }
    
    setClassId(NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim()));
    setAcademicYear(cmbSession.getSelectedItem().toString().trim());
    setStudentGroup(cmbGroup.getSelectedItem().toString().trim());
    setStudentId(PropertiesFile.getIdGenerator().getStudentID(getClassId(), getAcademicYear(), getStudentGroup()));
    new StudentDetailEntryForm(null, rootPaneCheckingEnabled, this).setVisible(true);
}//GEN-LAST:event_btnAddDetailsActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try{
        cmbClassId.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getClassManager().getClassName().toArray()));
        cmbSession.setModel(new javax.swing.DefaultComboBoxModel(getYearList().toArray()));
    }catch(NullPointerException e)
    {
        
    }
}//GEN-LAST:event_formWindowOpened

    private void cmbGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGroupActionPerformed
        List<StudentBean> studentList = PropertiesFile.getStudentManager().getStudentList(NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim()), cmbSession.getSelectedItem().toString().trim());
        tableStudentList.setModel(createTable(getTableData(studentList),getTableHeader()));
        setRollNo(studentList.size()+1);
    }//GEN-LAST:event_cmbGroupActionPerformed

    private void cmbClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassIdActionPerformed
        String classId = "";
        try{
            classId = cmbClassId.getSelectedItem().toString().trim();
        }catch(NullPointerException e)
        {}
        if(classId.equalsIgnoreCase("") || classId.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No Classes Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(classId.equalsIgnoreCase("I") || classId.equalsIgnoreCase("II") || classId.equalsIgnoreCase("III") || classId.equalsIgnoreCase("IV") || classId.equalsIgnoreCase("V") || classId.equalsIgnoreCase("VI") || classId.equalsIgnoreCase("VII") || classId.equalsIgnoreCase("VIII"))
        {
            cmbGroup.setEnabled(false);
        }
        else
        {
            cmbGroup.setEnabled(true);
        }
        
        cmbGroupActionPerformed(evt);
    }//GEN-LAST:event_cmbClassIdActionPerformed

    private void cmbSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSessionActionPerformed
        cmbGroupActionPerformed(evt);
    }//GEN-LAST:event_cmbSessionActionPerformed

    
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
    
    private String isCompleteForm()
    {
        try{
            cmbClassId.getSelectedItem().toString().trim();
        }catch (NullPointerException e){
            return "Select Class Name";
        }
        
        if(cmbClassId.getSelectedItem() == null || cmbClassId.getSelectedItem().toString().trim().isEmpty())
        {
            return "Select Class Name";
        }

        try{
            cmbSession.getSelectedItem().toString().trim();
        }catch (NullPointerException e){
            return "Select Academic Year";
        }
        
        try{
            cmbGroup.getSelectedItem().toString().trim();
        }catch (NullPointerException e){
            return "Select Student Group";
        }
        
        return "success";
    }



    private String [] getTableHeader()
    {
        String [] s = {"Serial", "Student ID", "Class Roll", "Student Name", "Contact"};
        return s;
    }

    private Object[][] getTableData(List<StudentBean> studentList)
    {
        if(studentList == null || studentList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[studentList.size()][5];
        for(int i=0; i<studentList.size();i++)
        {
            StudentBean studentBean = studentList.get(i);
            obj[i][0] = i+1;
            obj[i][1] = studentBean.getStudentID();
            obj[i][2] = studentBean.getClassRoll();
            obj[i][3] = studentBean.getStudentName();
            obj[i][4] = studentBean.getMobileNo();
            
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
    private javax.swing.JButton btnAddDetails;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupMaritalStatus;
    private javax.swing.JButton btnReport;
    private javax.swing.JComboBox cmbClassId;
    private javax.swing.JComboBox cmbGroup;
    private javax.swing.JComboBox cmbSession;
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
    private javax.swing.JTable tableStudentList;
    // End of variables declaration//GEN-END:variables

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    
    public void refreshWindow(Admission admission)
    {
        admission.show();
        tableStudentList.setModel(createTable(getTableData(PropertiesFile.getStudentManager().getStudentList(NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim()), cmbSession.getSelectedItem().toString().trim())),getTableHeader()));
    }
}
