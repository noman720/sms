
package main.java.com.csbl.sms.ui.mark;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.java.com.csbl.sms.bean.TabulationSheetBean;
import main.java.com.csbl.sms.util.PropertiesFile;
import main.java.com.csbl.sms.util.NumberConverterUtil;


public class ShowTabulationSheet extends javax.swing.JDialog {

    List<TabulationSheetBean> tabulationSheet;
    
    public ShowTabulationSheet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(780, 550);
        setLocationRelativeTo(null);
        
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
        btnShow = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmbExamYear = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbExamName = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbClassId = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Show Tabulation Sheet Form");
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
            .addComponent(jScrollPane1)
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
        );

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Show Tabulation Sheet");

        btnShow.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
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

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbExamYear, 0, 303, Short.MAX_VALUE)
                    .addComponent(cmbExamName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbClassId, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
       String classId = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
       String examName = cmbExamName.getSelectedItem().toString().trim().toUpperCase();
       String examYear = cmbExamYear.getSelectedItem().toString().trim();
       if(tabulationSheet.isEmpty())
       {
           JOptionPane.showMessageDialog(rootPane, "No Record Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
       }
       
       setVisible(false);
       
       PropertiesFile.getResultManager().showTabulationSheet(tabulationSheet, classId, examName, examYear);
       //PropertiesFile.getResultManager().showSupplierSummary();
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        
        String message = isCompleteForm();
        if(!message.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
            return;

        }
        
        String classId = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
        String examYear = cmbExamYear.getSelectedItem().toString().trim();
        String examName = cmbExamName.getSelectedItem().toString().trim();
       
        List<TabulationSheetBean> tabulationSheetBeans = PropertiesFile.getResultManager().getTebulationSheet(classId, examYear, examName);
        
        Collections.sort(tabulationSheetBeans, new Comparator <TabulationSheetBean>() {
            @Override
            public int compare(TabulationSheetBean tsb1, TabulationSheetBean tsb2) {
                if(new Double(tsb2.getGpaWithAdditional()).compareTo(new Double(tsb1.getGpaWithAdditional()))==0) {
                    if(new Double(tsb2.getGpaWtihoutAdditional()).compareTo(new Double(tsb1.getGpaWtihoutAdditional()))==0) {
                        return new Double(tsb2.getTotalMark()).compareTo(new Double(tsb1.getTotalMark()));
                    }
                else {
                        return new Double(tsb2.getGpaWtihoutAdditional()).compareTo(new Double(tsb1.getGpaWtihoutAdditional()));
                    }
                }
                
                
                 return (new Double(tsb2.getGpaWithAdditional()).compareTo(new Double(tsb1.getGpaWithAdditional())));
            }
        });
        
        
        /*
        if(classId.equalsIgnoreCase("IX") || classId.equalsIgnoreCase("X") || classId.equalsIgnoreCase("XI") || classId.equalsIgnoreCase("XII"))
        {
            String sub = String.format("%02d", Integer.parseInt(studentBean.getAcademicYear().substring(2))+1);
            transcriptBean.setAcademicYear(studentBean.getAcademicYear()+"-"+sub);
        }
        else
        {
            transcriptBean.setAcademicYear(studentBean.getAcademicYear());
        }
        */
        tableMarksList.setModel(createTable(getTableData(tabulationSheetBeans),getTableHeader()));
        tabulationSheet = null;
        tabulationSheet = tabulationSheetBeans;
        
        
    }//GEN-LAST:event_btnShowActionPerformed

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

    

    private void clearForm()
    {        
    }

    private String [] getTableHeader()
    {
        String [] s = {"Merit Position", "Student Id", "Student Name", "Total Mark", "GPA", "GPA With Add", "Grade Letter"};
        return s;
    }

    private Object[][] getTableData(List<TabulationSheetBean> tabulationSheetBeans)
    {
        if(tabulationSheetBeans == null || tabulationSheetBeans.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[tabulationSheetBeans.size()][7];
        for(int i=0; i<tabulationSheetBeans.size();i++)
        {
            TabulationSheetBean tabulationSheetBean = tabulationSheetBeans.get(i);
            obj[i][0] = i+1;
            obj[i][1] = tabulationSheetBean.getStudentId();
            obj[i][2] = tabulationSheetBean.getStudentName();
            obj[i][3] = tabulationSheetBean.getTotalMark();
            obj[i][4] = tabulationSheetBean.getGpaWtihoutAdditional();
            obj[i][5] = tabulationSheetBean.getGpaWithAdditional();
            obj[i][6] = tabulationSheetBean.getGradeLetter();
                        
        }
        return obj;
    }

    private DefaultTableModel createTable(Object [][]object, String []String)
    {
        return new DefaultTableModel(object,String) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class,  java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox cmbClassId;
    private javax.swing.JComboBox cmbExamName;
    private javax.swing.JComboBox cmbExamYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelLists;
    private javax.swing.JTable tableMarksList;
    // End of variables declaration//GEN-END:variables

}
