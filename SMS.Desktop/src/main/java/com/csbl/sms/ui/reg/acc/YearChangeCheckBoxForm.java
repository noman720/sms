
package main.java.com.csbl.sms.ui.reg.acc;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import main.java.com.csbl.sms.bean.StudentBean;
import main.java.com.csbl.sms.bean.TabulationSheetBean;
import main.java.com.csbl.sms.bean.TranscriptBean;
import main.java.com.csbl.sms.util.NumberConverterUtil;
import main.java.com.csbl.sms.util.NumberUtil;
import main.java.com.csbl.sms.util.PropertiesFile;


public class YearChangeCheckBoxForm extends javax.swing.JDialog {

    TranscriptBean transcriptBean = new TranscriptBean();
    List<String> examNameList = new ArrayList<>();
    List<TabulationSheetBean> finalList = new ArrayList<>();
            
    
    public YearChangeCheckBoxForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //setSize(820, 610);
        setLocationRelativeTo(null);
        
        
       
        
    }
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        panelBackground = new javax.swing.JPanel();
        panelLists = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudentList = new javax.swing.JTable();
        panelEntry = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmbExamYear = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbExamName = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbClassId = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtClassId = new javax.swing.JTextField();
        txtAcademicYear = new javax.swing.JTextField();
        cmbStudentGroup = new javax.swing.JComboBox();
        cmbType = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbMedium = new javax.swing.JComboBox();
        cmbShift = new javax.swing.JComboBox();
        cmbSection = new javax.swing.JComboBox();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();

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
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Of Students", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18))); // NOI18N

        tableStudentList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Merit Position", "Student Id", "Student Name", "Total Mark", "GPA", "GPA with Add"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setText("Year Change Operation Form");

        btnShow.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
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

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel4.setText("From Class");

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel5.setText("To Class");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Class Id :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Academic Year :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Student Group :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Student Type :");

        txtClassId.setEditable(false);
        txtClassId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtAcademicYear.setEditable(false);
        txtAcademicYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        cmbStudentGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbStudentGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SCIENCE", "COMERCE", "HUMANITIES" }));

        cmbType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Regular", "Irregular" }));
        cmbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Medium :");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Shift :");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Section :");

        cmbMedium.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbMedium.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BANGLA", "ENGLISH" }));

        cmbShift.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        cmbSection.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEntryLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEntryLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbExamYear, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbClassId, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbExamName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEntryLayout.createSequentialGroup()
                                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelEntryLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                        .addComponent(txtAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelEntryLayout.createSequentialGroup()
                                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtClassId)
                                            .addComponent(cmbStudentGroup, 0, 1, Short.MAX_VALUE)
                                            .addComponent(cmbType, 0, 100, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbMedium, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbShift, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbSection, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(jSeparator6)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))))
        );
        panelEntryLayout.setVerticalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addComponent(lblHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtClassId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(cmbMedium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbStudentGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(cmbShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(cmbSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbClassId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbExamYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbExamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelBackground.getAccessibleContext().setAccessibleName("ProductEntryForm");

        pack();
    }// </editor-fold>


private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
    cmbClassId.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getClassManager().getClassName().toArray()));    
    //cmbClassIdActionPerformed(null);
}                                 

    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cmbClassIdActionPerformed(java.awt.event.ActionEvent evt) {
        List<String> examYearList = PropertiesFile.getMarkEntryManager().getExamYear(NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim()));
        if(examYearList.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No Exam Year Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cmbExamYear.setModel(new javax.swing.DefaultComboBoxModel(examYearList.toArray()));
        String classId = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
        txtClassId.setText(NumberConverterUtil.getNextClassName(cmbClassId.getSelectedItem().toString().trim()));
        cmbShift.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getStudentManager().getShiftNameList(classId).toArray()));
        cmbSection.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getStudentManager().getSectionNameList(classId).toArray()));
        cmbExamYearActionPerformed(evt);
    }

    private void cmbExamNameActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void cmbExamYearActionPerformed(java.awt.event.ActionEvent evt) {
        examNameList = PropertiesFile.getMarkEntryManager().getExamName(NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim()), cmbExamYear.getSelectedItem().toString().trim());
        examNameList.add("All");
        if(examNameList.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No Exam Name Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cmbExamName.setModel(new javax.swing.DefaultComboBoxModel(examNameList.toArray()));
        txtAcademicYear.setText((Integer.parseInt(cmbExamYear.getSelectedItem().toString().trim())+1)+"");
        
        cmbExamNameActionPerformed(evt);
    }

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {

        String message = isCompleteForm();
        if(!message.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
            return;

        }

        String classId = NumberConverterUtil.convertWordToNumber(cmbClassId.getSelectedItem().toString().trim());
        String examYear = cmbExamYear.getSelectedItem().toString().trim();

        

        if(cmbExamName.getSelectedItem().toString().trim().equalsIgnoreCase("All"))
        {
            List<List<TabulationSheetBean>> examNumberList = new ArrayList<>();
            for(int i=0; i<examNameList.size()-1; i++)
            {
                examNumberList.add(PropertiesFile.getResultManager().getTebulationSheet(classId, examYear, examNameList.get(i).toString()));
            }

            int examNumber = examNumberList.size();

            for(int i = 0; i<examNumber-1; i++)
            {
                for(int j = 0; j < examNumberList.get(i).size(); j++)
                {
                    TabulationSheetBean tsb = getTabulationSheetBean(examNumberList.get(0).get(j), examNumberList.get(i+1));
                    examNumberList.get(0).get(j).setTotalMark(tsb.getTotalMark());
                    examNumberList.get(0).get(j).setGpaWtihoutAdditional(tsb.getGpaWtihoutAdditional());
                    examNumberList.get(0).get(j).setGpaWithAdditional(tsb.getGpaWithAdditional());
                }

            }

            finalList = examNumberList.get(0);

            for(int i=0; i<finalList.size(); i++)
            {
                finalList.get(i).setTotalMark(finalList.get(i).getTotalMark()/examNumber);
                finalList.get(i).setGpaWtihoutAdditional(finalList.get(i).getGpaWtihoutAdditional()/examNumber);
                finalList.get(i).setGpaWithAdditional(finalList.get(i).getGpaWithAdditional()/examNumber);
            }
        }
        else
        {
            finalList = PropertiesFile.getResultManager().getTebulationSheet(classId, examYear, cmbExamName.getSelectedItem().toString().trim());
        }

        Collections.sort(finalList, new Comparator <TabulationSheetBean>() {
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

        for(int i=0; i<finalList.size(); i++)
        {
            finalList.get(i).setMeritPosition(i+1);
        }
        
        finalList = PropertiesFile.getYearChangeManager().getUnregistedStudentList(finalList, NumberConverterUtil.convertWordToNumber(txtClassId.getText().trim()), txtAcademicYear.getText().trim());
        
        showTableData(finalList);

    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        java.util.List<TabulationSheetBean> selectedStudentList = new java.util.ArrayList<>();
        
        for(int i=0;i<finalList.size();i++)
        {
            if(tableStudentList.getModel().getValueAt(i, 0) == null || (Boolean)tableStudentList.getModel().getValueAt(i, 0) == false)
            {
                continue;
            }       
            selectedStudentList.add(finalList.get(i));
        }
        if(selectedStudentList.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Select one or more Student", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        StudentBean studentBean = new StudentBean();
        studentBean.setClassId(NumberConverterUtil.convertWordToNumber(txtClassId.getText().trim()));
        studentBean.setAcademicYear(txtAcademicYear.getText().trim());
        studentBean.setStudentGroup(cmbStudentGroup.getSelectedItem().toString().trim());
        studentBean.setStudentType(cmbType.getSelectedItem().toString().trim());
        studentBean.setMedium(cmbMedium.getSelectedItem().toString().trim());
        studentBean.setShift(cmbShift.getSelectedItem().toString().trim());
        studentBean.setSectionName(cmbSection.getSelectedItem().toString().trim());
        
        String confirm = PropertiesFile.getYearChangeManager().saveStudent(finalList, studentBean);
        
        if(!confirm.equalsIgnoreCase("successful"))
        {
            JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(rootPane, "Successfully Save Exam Registration", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        this.setVisible(false);
    }

    private TabulationSheetBean getTabulationSheetBean(TabulationSheetBean tabulationSheetBean, List<TabulationSheetBean> list)
    {
        for(TabulationSheetBean tsb : list)
        {
            if(tsb.getStudentId().equalsIgnoreCase(tabulationSheetBean.getStudentId()))
                {
                    tabulationSheetBean.setTotalMark(tabulationSheetBean.getTotalMark()+tsb.getTotalMark());
                    tabulationSheetBean.setGpaWtihoutAdditional(tabulationSheetBean.getGpaWtihoutAdditional()+tsb.getGpaWtihoutAdditional());
                    tabulationSheetBean.setGpaWithAdditional(tabulationSheetBean.getGpaWithAdditional()+tsb.getGpaWithAdditional());

                    break;
                }
        }
        
        return tabulationSheetBean;
    }
    
    
    
       
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

    
    private void showTableData(List<TabulationSheetBean> studentList)
    {

        try{
        Object[] columnNames = {MyTestStatus.INDETERMINATE, "Merit List", "Studet Id", "Student Name", "Total Mark", "GPA", "GPA With Add"};
        
        DefaultTableModel model = new DefaultTableModel(getTableData(studentList), columnNames)
        {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class};
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
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


        tableStudentList = new javax.swing.JTable(model) {
            @Override 
            public void updateUI() {
                super.updateUI();
                TableCellRenderer r = getDefaultRenderer(Boolean.class);
                if(r instanceof JComponent) {
                    ((JComponent)r).updateUI();
                }
            }
            @Override 
            public Component prepareEditor(TableCellEditor editor, int row, int column) {
                Component c = super.prepareEditor(editor, row, column);
                if(c instanceof JCheckBox) {
                    JCheckBox b = (JCheckBox)c;
                    b.setBackground(getSelectionBackground());
                    b.setBorderPainted(true);
                }
                return c;
            }

        };

        tableStudentList.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jScrollPane1.setViewportView(tableStudentList);
        

        int modelColmunIndex = 0;
        TableCellRenderer renderer = new MyTestHeaderRenderer(tableStudentList.getTableHeader(), modelColmunIndex);
        tableStudentList.getColumnModel().getColumn(modelColmunIndex).setHeaderRenderer(renderer);
        model.addTableModelListener(new MyTestHeaderCheckBoxHandler(tableStudentList, modelColmunIndex));

        }catch(NullPointerException e){}
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
            obj[i][0] = false;
            obj[i][1] = tabulationSheetBean.getMeritPosition();
            obj[i][2] = tabulationSheetBean.getStudentId();
            obj[i][3] = tabulationSheetBean.getStudentName();
            obj[i][4] = tabulationSheetBean.getTotalMark();
            obj[i][5] = NumberUtil.getValueByRounding(tabulationSheetBean.getGpaWtihoutAdditional());
            obj[i][6] = NumberUtil.getValueByRounding(tabulationSheetBean.getGpaWithAdditional());
                        
        }
        return obj;
    }

    




    // Variables declaration - do not modify
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox cmbClassId;
    private javax.swing.JComboBox cmbExamName;
    private javax.swing.JComboBox cmbExamYear;
    private javax.swing.JComboBox cmbMedium;
    private javax.swing.JComboBox cmbSection;
    private javax.swing.JComboBox cmbShift;
    private javax.swing.JComboBox cmbStudentGroup;
    private javax.swing.JComboBox cmbType;
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
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelLists;
    private javax.swing.JTable tableStudentList;
    private javax.swing.JTextField txtAcademicYear;
    private javax.swing.JTextField txtClassId;
    // End of variables declaration

}


class MyTestHeaderRenderer extends JCheckBox implements TableCellRenderer {
    private final JLabel label = new JLabel("Check All");
    private int targetColumnIndex;

    public MyTestHeaderRenderer(JTableHeader header, int index) {
        super((String)null);
        this.targetColumnIndex = index;
        setOpaque(false);
        setFont(header.getFont());
        header.addMouseListener(new MouseAdapter() {
            @Override public void mouseClicked(MouseEvent e) {
                JTableHeader header = (JTableHeader)e.getSource();
                JTable table = header.getTable();
                TableColumnModel columnModel = table.getColumnModel();
                int vci = columnModel.getColumnIndexAtX(e.getX());
                int mci = table.convertColumnIndexToModel(vci);
                if(mci == targetColumnIndex) {
                    TableColumn column = columnModel.getColumn(vci);
                    Object v = column.getHeaderValue();
                    boolean b = MyTestStatus.DESELECTED.equals(v)?true:false;
                    TableModel m = table.getModel();
                    for(int i=0; i<m.getRowCount(); i++) m.setValueAt(b, i, mci);
                    column.setHeaderValue(b? MyTestStatus.SELECTED:MyTestStatus.DESELECTED);
                    //header.repaint();
                }
            }
        });
    }
    @Override public Component getTableCellRendererComponent(JTable tbl, Object val, boolean isS, boolean hasF, int row, int col) {
        TableCellRenderer r = tbl.getTableHeader().getDefaultRenderer();
        JLabel l =(JLabel)r.getTableCellRendererComponent(tbl, val, isS, hasF, row, col);
        if(targetColumnIndex==tbl.convertColumnIndexToModel(col)) {
            if(val instanceof MyTestStatus) {
                switch((MyTestStatus)val) {
                  case SELECTED:      setSelected(true);  setEnabled(true);  break;
                  case DESELECTED:    setSelected(false); setEnabled(true);  break;
                  case INDETERMINATE: setSelected(true);  setEnabled(false); break;
                }
            }else{
                setSelected(true); setEnabled(false);
            }
            label.setIcon(new MyTestComponentIcon(this));
            l.setIcon(new MyTestComponentIcon(label));
            l.setText(null);
        }

        return l;
    }

}

class MyTestHeaderCheckBoxHandler implements TableModelListener
{
    private final JTable table;
    private final int targetColumnIndex;
    public MyTestHeaderCheckBoxHandler(JTable table, int index) {
        this.table = table;
        this.targetColumnIndex = index;
    }
    @Override public void tableChanged(TableModelEvent e) {
        if(e.getType()==TableModelEvent.UPDATE && e.getColumn()==targetColumnIndex) {
            int vci = table.convertColumnIndexToView(targetColumnIndex);
            TableColumn column = table.getColumnModel().getColumn(vci);
            if(!MyTestStatus.INDETERMINATE.equals(column.getHeaderValue())) {
                column.setHeaderValue(MyTestStatus.INDETERMINATE);
            }else{
                boolean selected = true, deselected = true;
                TableModel m = table.getModel();
                for(int i=0; i<m.getRowCount(); i++) {
                    Boolean b = (Boolean)m.getValueAt(i, targetColumnIndex);
                    selected &= b; deselected &= !b;
                    if(selected==deselected) {
                        return;
                    }
                }
                if(selected) {
                    column.setHeaderValue(MyTestStatus.SELECTED);
                }else if(deselected) {
                    column.setHeaderValue(MyTestStatus.DESELECTED);
                }else{
                    return;
                }
            }
            JTableHeader h = table.getTableHeader();
            h.repaint(h.getHeaderRect(vci));
        }
    }
}
class MyTestComponentIcon implements Icon{
    private final JComponent cmp;
    public MyTestComponentIcon(JComponent cmp) {
        this.cmp = cmp;
    }
    @Override public int getIconWidth() {
        return cmp.getPreferredSize().width;
    }
    @Override public int getIconHeight() {
        return cmp.getPreferredSize().height;
    }
    @Override public void paintIcon(Component c, Graphics g, int x, int y) {
        SwingUtilities.paintComponent(g, cmp, (Container)c, x, y, getIconWidth(), getIconHeight());
    }
}

enum MyTestStatus { SELECTED, DESELECTED, INDETERMINATE }
