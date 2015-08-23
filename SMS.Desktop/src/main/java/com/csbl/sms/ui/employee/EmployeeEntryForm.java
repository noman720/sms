
package main.java.com.csbl.sms.ui.employee;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import main.java.com.csbl.sms.bean.EmployeeBean;
import main.java.com.csbl.sms.ui.student.StudentDetailEntryForm;
import main.java.com.csbl.sms.util.DateUtil;
import main.java.com.csbl.sms.util.ImageConverterUtil;
import main.java.com.csbl.sms.util.PropertiesFile;


public class EmployeeEntryForm extends javax.swing.JDialog {

    String gender = "Male";
    String maritalStatus = "Unmarried";

    public EmployeeEntryForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(810, 680);
        setLocationRelativeTo(null);
        radioMale.setSelected(true);
        radioUnmarried.setSelected(true);
        scrlPane.getVerticalScrollBar().setUnitIncrement(20);
        
    }


    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        btnGroupMaritalStatus = new javax.swing.ButtonGroup();
        panelBackground = new javax.swing.JPanel();
        panelLists = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmployeeList = new javax.swing.JTable();
        panelEntry = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        scrlPane = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaPresentAddress = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMotherName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaPermanentAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        radioMarried = new javax.swing.JRadioButton();
        radioUnmarried = new javax.swing.JRadioButton();
        radioEngaged = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPictureUrl = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        lblPictureUrl = new javax.swing.JLabel();
        dtChooserBirthDate = new com.toedter.calendar.JDateChooser();
        dtChooserJoinedDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Entry Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelLists.setBackground(new java.awt.Color(240, 253, 249));
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Of Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18))); // NOI18N

        tableEmployeeList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableEmployeeList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableEmployeeList);
        tableEmployeeList.getAccessibleContext().setAccessibleName("Lists Of Products");

        javax.swing.GroupLayout panelListsLayout = new javax.swing.GroupLayout(panelLists);
        panelLists.setLayout(panelListsLayout);
        panelListsLayout.setHorizontalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setText("Employee Entry Form");

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Employee ID :");

        txtEmployeeID.setEditable(false);
        txtEmployeeID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        scrlPane.setAutoscrolls(true);
        scrlPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrlPane.setFocusTraversalPolicyProvider(true);
        scrlPane.setInheritsPopupMenu(true);
        scrlPane.setNextFocusableComponent(btnBrowse);

        jPanel2.setBackground(new java.awt.Color(240, 253, 249));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblName.setText("Name :");

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAddress.setText("Present Address :");

        lblPhone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPhone.setText("Phone :");

        txtPhoneNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEmail.setText("E-mail :");

        txtEmailID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        txtAreaPresentAddress.setColumns(20);
        txtAreaPresentAddress.setRows(2);
        jScrollPane3.setViewportView(txtAreaPresentAddress);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Father Name :");

        txtFatherName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Mother Name :");

        txtMotherName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMotherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotherNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Permanet Address :");

        txtAreaPermanentAddress.setColumns(20);
        txtAreaPermanentAddress.setRows(2);
        jScrollPane4.setViewportView(txtAreaPermanentAddress);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Gender :");

        radioMale.setBackground(new java.awt.Color(240, 253, 249));
        btnGroupGender.add(radioMale);
        radioMale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        radioFemale.setBackground(new java.awt.Color(240, 253, 249));
        btnGroupGender.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Marital Status :");

        radioMarried.setBackground(new java.awt.Color(240, 253, 249));
        btnGroupMaritalStatus.add(radioMarried);
        radioMarried.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioMarried.setText("Married");
        radioMarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMarriedActionPerformed(evt);
            }
        });

        radioUnmarried.setBackground(new java.awt.Color(240, 253, 249));
        btnGroupMaritalStatus.add(radioUnmarried);
        radioUnmarried.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioUnmarried.setText("Unmarried");
        radioUnmarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUnmarriedActionPerformed(evt);
            }
        });

        radioEngaged.setBackground(new java.awt.Color(240, 253, 249));
        btnGroupMaritalStatus.add(radioEngaged);
        radioEngaged.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioEngaged.setText("Engaged");
        radioEngaged.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEngagedActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Position :");

        txtPosition.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Basic Salary :");

        txtSalary.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });
        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaryKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Joined Date :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Category :");

        cmbCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Teacher", "Employee" }));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Blood Group :");

        txtBloodGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodGroupActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Birth Date :");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Picture :");

        txtPictureUrl.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        btnBrowse.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        dtChooserBirthDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        dtChooserJoinedDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(lblName)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(lblAddress)
                                .addComponent(lblPhone)
                                .addComponent(lblEmail)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel10)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmailID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPhoneNo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFatherName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                .addComponent(txtMotherName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(radioMarried)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(radioUnmarried)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(radioEngaged))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(radioMale)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(radioFemale))
                                .addComponent(txtBloodGroup, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPictureUrl)
                                .addComponent(dtChooserBirthDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dtChooserJoinedDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBrowse)
                        .addGap(0, 148, Short.MAX_VALUE))
                    .addComponent(lblPictureUrl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(radioMale)
                            .addComponent(radioFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(radioMarried)
                            .addComponent(radioUnmarried)
                            .addComponent(radioEngaged))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(dtChooserBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(dtChooserJoinedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPictureUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPictureUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBrowse))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        scrlPane.setViewportView(jPanel2);

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(scrlPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        panelEntryLayout.setVerticalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addComponent(lblHeader)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrlPane, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(51, 51, 51)
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
    PropertiesFile.getEmployeeManager().showEmployeeList();
}//GEN-LAST:event_btnReportActionPerformed


private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    String message = isCompleteForm();
    if(!message.equalsIgnoreCase("successful"))
    {
        JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    int response = JOptionPane.showConfirmDialog(null, "Do you sure to Save Employee?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response != JOptionPane.YES_OPTION) {
        return;
    }

    String pictureUrl = ImageConverterUtil.getPicturePathForEmployee(txtPictureUrl.getText().trim(), txtEmployeeID.getText().trim());

    if(pictureUrl.equalsIgnoreCase("unsuccessful"))
    {
        JOptionPane.showMessageDialog(rootPane, "Couldn't Convert Picture\nPlease Change The Picture", "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String employeeId = txtEmployeeID.getText().trim();
    String employeeName = txtName.getText().trim();
    String fatherName = txtFatherName.getText().trim();
    String motherName = txtMotherName.getText().trim();
    String presentAddress = txtAreaPresentAddress.getText().trim();
    String permanentAddress = txtAreaPermanentAddress.getText().trim();
    String mobile = txtPhoneNo.getText().trim();
    String emailId = txtEmailID.getText().trim();
    String category = cmbCategory.getSelectedItem().toString().trim();
    String position = txtPosition.getText().trim();
    Double basicSalary = Double.parseDouble(txtSalary.getText().trim());
    String bloodGroup = txtBloodGroup.getText().trim();
    String birthDate = DateUtil.getDateAsString(dtChooserBirthDate.getCalendar().getTime());
    String joinedDate = DateUtil.getDateAsString(dtChooserJoinedDate.getCalendar().getTime());
    
    EmployeeBean employeeBean = new EmployeeBean(employeeId, employeeName, fatherName, motherName, gender, maritalStatus, presentAddress, permanentAddress, mobile, emailId, category, position, basicSalary, bloodGroup, birthDate, joinedDate, pictureUrl);
    
    String confirm = PropertiesFile.getEmployeeManager().saveEmployee(employeeBean);
    if(!confirm.equalsIgnoreCase("successful"))
    {
        JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    JOptionPane.showMessageDialog(rootPane, "Successfully Save Employee", "Confirm", JOptionPane.INFORMATION_MESSAGE);

    clearForm();
    showTable();
}//GEN-LAST:event_btnSaveActionPerformed

private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    clearForm();
}//GEN-LAST:event_btnResetActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try{
        setEmployeeId();
        showTable();
    }catch(NullPointerException e)
    {
    }
}//GEN-LAST:event_formWindowOpened
    private void setEmployeeId()
    {
        txtEmployeeID.setText(PropertiesFile.getIdGenerator().getEmployeeId());
    }
    
    private void showTable()
    {
        tableEmployeeList.setModel(createTable(getTableData(PropertiesFile.getEmployeeManager().getEmployeeAll()),getTableHeader()));
        tableEmployeeList.getColumnModel().getColumn(2).setPreferredWidth(100);
    }

private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
    txtPosition.requestFocusInWindow();
}//GEN-LAST:event_txtEmailIDActionPerformed

private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
    txtEmailID.requestFocusInWindow();
    scrlPane.getViewport().scrollRectToVisible(txtPictureUrl.getBounds());
}//GEN-LAST:event_txtPhoneNoActionPerformed

private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
    txtFatherName.requestFocusInWindow();
}//GEN-LAST:event_txtNameActionPerformed

private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
    gender = "Male";
    radioUnmarried.requestFocusInWindow();
}//GEN-LAST:event_radioMaleActionPerformed

private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
    gender = "Female";
    radioUnmarried.requestFocusInWindow();
}//GEN-LAST:event_radioFemaleActionPerformed

private void radioMarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMarriedActionPerformed
    maritalStatus = "Married";
    txtAreaPresentAddress.requestFocusInWindow();
}//GEN-LAST:event_radioMarriedActionPerformed

private void radioUnmarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUnmarriedActionPerformed
    maritalStatus = "Unmarried";
    txtAreaPresentAddress.requestFocusInWindow();
}//GEN-LAST:event_radioUnmarriedActionPerformed

private void radioEngagedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEngagedActionPerformed
    maritalStatus = "Engaged";
    txtAreaPresentAddress.requestFocusInWindow();
}//GEN-LAST:event_radioEngagedActionPerformed

private void txtFatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFatherNameActionPerformed
    txtMotherName.requestFocusInWindow();
}//GEN-LAST:event_txtFatherNameActionPerformed

private void txtMotherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotherNameActionPerformed
    radioMale.requestFocusInWindow();
}//GEN-LAST:event_txtMotherNameActionPerformed

private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
    txtSalary.requestFocusInWindow();
}//GEN-LAST:event_txtPositionActionPerformed

private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
    txtBloodGroup.requestFocusInWindow();
}//GEN-LAST:event_txtSalaryActionPerformed

private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped
    char c = evt.getKeyChar();
          if (!((c=='.') ||
             (c >= '0') && (c <= '9')||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
          }
}//GEN-LAST:event_txtSalaryKeyTyped

    private void txtBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodGroupActionPerformed
        dtChooserBirthDate.requestFocusInWindow();
    }//GEN-LAST:event_txtBloodGroupActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Select Picture");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter sqlfilter = new FileNameExtensionFilter("Images files (*.png, *.jpg, *.jpeg, *.gif, *.bmp)", "png", "jpg", "jpeg", "gif", "bmp");
        chooser.setFileFilter(sqlfilter);
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        //
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            txtPictureUrl.setText(chooser.getSelectedFile().toString());
            BufferedImage originalImage = null;
            try {
                originalImage = ImageIO.read(new File(String.valueOf(chooser.getSelectedFile())));
            } catch (IOException ex) {
                Logger.getLogger(StudentDetailEntryForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image image = originalImage.getScaledInstance(220, 230, Image.SCALE_SMOOTH);
            lblPictureUrl.setIcon(new ImageIcon(image));
            
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private String isCompleteForm()
    {

        if(txtEmployeeID.getText() == null || txtEmployeeID.getText().trim().isEmpty())
        {
            return "Check Employee ID";
        }
                
        if(txtName.getText() == null || txtName.getText().trim().isEmpty())
        {       
            return "Please Enter Employee Name";
        }

        if(txtFatherName.getText() == null || txtFatherName.getText().trim().isEmpty())
        {
            return "Please Enter Employee's Father Name";
        }

        if(txtMotherName.getText() == null || txtMotherName.getText().trim().isEmpty())
        {
            return "Please Enter Employee's Mother Name";
        }

        if(txtAreaPresentAddress.getText() == null || txtAreaPresentAddress.getText().trim().isEmpty())
        {
            return "Please Enter Present Address";
        }

        if(txtAreaPermanentAddress.getText() == null || txtAreaPermanentAddress.getText().trim().isEmpty())
        {
            return "Please Enter Permanent Address";
        }

        if(txtPhoneNo.getText() == null || txtPhoneNo.getText().trim().isEmpty())
        {
            return "Please Enter Phone Number";
        }
        

        if(txtPosition.getText() == null || txtPosition.getText().trim().isEmpty())
        {
            return "Please Enter Position";
        }

        if(txtSalary.getText() == null || txtSalary.getText().trim().isEmpty())
        {
            return "Please Enter Salary";
        }
        
        try
        {
            Double.parseDouble(txtSalary.getText().trim());
        }catch(NumberFormatException e){
            return "Enter Valid Salary";
        }

        
        return "successful";
    }


    private void clearForm()
    {
        setEmployeeId();
        txtName.setText("");
        txtFatherName.setText("");
        txtMotherName.setText("");
        radioMale.setSelected(true);
        radioUnmarried.setSelected(true);
        txtAreaPresentAddress.setText("");
        txtAreaPermanentAddress.setText("");
        txtPhoneNo.setText("");
        txtEmailID.setText("");
        txtPosition.setText("");
        txtSalary.setText("");
        txtBloodGroup.setText("");
        dtChooserBirthDate.setDate(null);
        dtChooserJoinedDate.setDate(null);
        txtPictureUrl.setText("");
        lblPictureUrl.setIcon(null);
        
    }

    private String [] getTableHeader()
    {
        String [] s = {"Serial", "Employee Id", "Employee Name", "Mobile", "Category", "Position", "Blood Group", "Birth Date"};
        return s;
    }

    private Object[][] getTableData(List<EmployeeBean> employeeList)
    {
        if(employeeList == null || employeeList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[employeeList.size()][8];
        for(int i=0; i<employeeList.size();i++)
        {
            EmployeeBean employeeBean = employeeList.get(i);
            obj[i][0] = i+1;
            obj[i][1] = employeeBean.getEmployeeId();
            obj[i][2] = employeeBean.getEmployeeName();
            obj[i][3] = employeeBean.getMobile();
            obj[i][4] = employeeBean.getCategory();
            obj[i][5] = employeeBean.getPosition();
            obj[i][6] = employeeBean.getBloodGroup();
            obj[i][7] = employeeBean.getBirthDate();
            
        }
        return obj;
    }

    private DefaultTableModel createTable(Object [][]object, String []String)
    {
        return new DefaultTableModel(object,String) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
    private javax.swing.JButton btnBrowse;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupMaritalStatus;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbCategory;
    private com.toedter.calendar.JDateChooser dtChooserBirthDate;
    private com.toedter.calendar.JDateChooser dtChooserJoinedDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPictureUrl;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelLists;
    private javax.swing.JRadioButton radioEngaged;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioMarried;
    private javax.swing.JRadioButton radioUnmarried;
    private javax.swing.JScrollPane scrlPane;
    private javax.swing.JTable tableEmployeeList;
    private javax.swing.JTextArea txtAreaPermanentAddress;
    private javax.swing.JTextArea txtAreaPresentAddress;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtPictureUrl;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables

}
