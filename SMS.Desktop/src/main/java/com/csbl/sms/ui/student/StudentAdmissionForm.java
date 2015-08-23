
package main.java.com.csbl.sms.ui.student;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import main.java.com.csbl.sms.bean.StudentBean;
import main.java.com.csbl.sms.util.DateUtil;
import main.java.com.csbl.sms.util.NumberConverterUtil;
import main.java.com.csbl.sms.util.PropertiesFile;


public class StudentAdmissionForm extends javax.swing.JDialog {

    String gender = "male";

    public StudentAdmissionForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(840, 700);
        setLocationRelativeTo(null);
        radioMale.setSelected(true);
        cmbGroup.setEnabled(false);
        
        
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
        btnReport = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
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
        radioOther = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtClassRoll = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbStudentType = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cmbMedium = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbShift = new javax.swing.JComboBox();
        cmbSection = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        txtbloodGroup = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        dcBirthDate = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        txtPictureUrl = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmbClass = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbSession = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmbGroup = new javax.swing.JComboBox();
        lblPicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Entry Form");
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
            .addComponent(jScrollPane1)
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
        );

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setText("Student Entry Form");

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

        jPanel2.setBackground(new java.awt.Color(240, 253, 249));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblName.setText("Student Name :");

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
        txtAreaPresentAddress.setRows(5);
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
        txtAreaPermanentAddress.setRows(5);
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

        radioOther.setBackground(new java.awt.Color(240, 253, 249));
        btnGroupGender.add(radioOther);
        radioOther.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioOther.setText("Other");
        radioOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOtherActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Class Roll :");

        txtClassRoll.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtClassRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClassRollActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Student ID :");

        txtStudentID.setEditable(false);
        txtStudentID.setBackground(new java.awt.Color(240, 253, 249));
        txtStudentID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Student Type :");

        cmbStudentType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbStudentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Regular", "Irregular" }));
        cmbStudentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStudentTypeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Medium :");

        cmbMedium.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbMedium.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BANGLA", "ENGLISH" }));
        cmbMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMediumActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Shift :");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Section :");

        cmbShift.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        cmbSection.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Blood Group :");

        txtbloodGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Birth Date :");

        dcBirthDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Picture :");

        txtPictureUrl.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        btnBrowse.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(lblName)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMotherName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFatherName, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(radioMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioOther))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAddress)
                    .addComponent(jLabel4)
                    .addComponent(lblPhone)
                    .addComponent(lblEmail)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPictureUrl)
                    .addComponent(txtbloodGroup)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(txtPhoneNo)
                    .addComponent(txtEmailID)
                    .addComponent(txtClassRoll)
                    .addComponent(cmbStudentType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbMedium, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbShift, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbSection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrowse))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(radioFemale)
                    .addComponent(radioOther))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClassRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbStudentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbMedium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmbSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtbloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(dcBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtPictureUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse)))
        );

        jScrollPane2.setViewportView(jPanel2);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Addmission Class :");

        cmbClass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassActionPerformed(evt);
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbSession, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbGroup, 0, 284, Short.MAX_VALUE))))
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
                    .addComponent(jLabel11)
                    .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    //TestReportMain.showEmployeeReportSummary();
}//GEN-LAST:event_btnReportActionPerformed


private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    
    String message = isCompleteForm();
    if(!message.equalsIgnoreCase("success"))
    {
        JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
        return;

    }
    String studentClass = NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim());
    String accademicYear = cmbSession.getSelectedItem().toString().trim();
    String studentGroup = cmbGroup.getSelectedItem().toString().trim();
    String studentID = txtStudentID.getText().trim();
    String studentName = txtName.getText().trim();
    String fatherName = txtFatherName.getText().trim();
    String motherName = txtMotherName.getText().trim();
    String presentAddress = txtAreaPresentAddress.getText().trim();
    String permanentAddress = txtAreaPermanentAddress.getText().trim();
    String mobileNo = txtPhoneNo.getText().trim();
    String email = txtEmailID.getText().trim();
    String studentType = cmbStudentType.getSelectedItem().toString().trim();
    String medium = cmbMedium.getSelectedItem().toString().trim();
    String shift = cmbShift.getSelectedItem().toString().trim();
    String section = cmbSection.getSelectedItem().toString().trim();
    int classRoll = Integer.parseInt(txtClassRoll.getText().toString().trim());
    String bloodGroup = txtbloodGroup.getText().trim();
    String birthDate = DateUtil.getDateAsString(dcBirthDate.getCalendar().getTime());
    String pictureurl = "";
    
    StudentBean studentBean = new StudentBean(studentID, studentName, fatherName, motherName, presentAddress, permanentAddress, mobileNo, email, gender, studentGroup, studentType, medium, accademicYear, shift, studentClass, section, classRoll, bloodGroup, birthDate, pictureurl);
    
    String confirm = PropertiesFile.getStudentManager().saveStudent(studentBean);
    
    if(!confirm.equalsIgnoreCase("successful"))
    {
        JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    JOptionPane.showMessageDialog(rootPane, "Successfully Save Student", "Info", JOptionPane.INFORMATION_MESSAGE);

    tableStudentList.setModel(createTable(getTableData(PropertiesFile.getStudentManager().getStudentList(studentClass, cmbSession.getSelectedItem().toString().trim())),getTableHeader()));
    
    clearForm();
    
}//GEN-LAST:event_btnSaveActionPerformed

private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    clearForm();
}//GEN-LAST:event_btnResetActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try{
        cmbClass.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getClassManager().getClassName().toArray()));
        cmbSession.setModel(new javax.swing.DefaultComboBoxModel(getYearList().toArray()));
    }catch(NullPointerException e)
    {
        
    }
}//GEN-LAST:event_formWindowOpened

private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
    txtClassRoll.requestFocusInWindow();
}//GEN-LAST:event_txtEmailIDActionPerformed

private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
    txtEmailID.requestFocusInWindow();
}//GEN-LAST:event_txtPhoneNoActionPerformed

private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
    txtFatherName.requestFocusInWindow();
}//GEN-LAST:event_txtNameActionPerformed

private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
    gender = "male";
    
}//GEN-LAST:event_radioMaleActionPerformed

private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
    gender = "female";
    
}//GEN-LAST:event_radioFemaleActionPerformed

private void radioOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOtherActionPerformed
    gender = "other";
    
}//GEN-LAST:event_radioOtherActionPerformed

private void txtFatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFatherNameActionPerformed
    txtMotherName.requestFocusInWindow();
}//GEN-LAST:event_txtFatherNameActionPerformed

private void txtMotherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotherNameActionPerformed
    radioMale.requestFocusInWindow();
}//GEN-LAST:event_txtMotherNameActionPerformed

private void txtClassRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClassRollActionPerformed
    cmbStudentType.requestFocusInWindow();
}//GEN-LAST:event_txtClassRollActionPerformed

    private void cmbGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGroupActionPerformed
        String clazzId = NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim());
        txtStudentID.setText(PropertiesFile.getIdGenerator().getStudentID(clazzId, cmbSession.getSelectedItem().toString().trim(), cmbGroup.getSelectedItem().toString().trim()));
        tableStudentList.setModel(createTable(getTableData(PropertiesFile.getStudentManager().getStudentList(clazzId, cmbSession.getSelectedItem().toString().trim())),getTableHeader()));
    }//GEN-LAST:event_cmbGroupActionPerformed

    private void cmbStudentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStudentTypeActionPerformed
        cmbMedium.requestFocusInWindow();
    }//GEN-LAST:event_cmbStudentTypeActionPerformed

    private void cmbMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMediumActionPerformed
        cmbShift.requestFocusInWindow();
    }//GEN-LAST:event_cmbMediumActionPerformed

    private void cmbClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassActionPerformed
        
        cmbGroupActionPerformed(evt);
        String classID = cmbClass.getSelectedItem().toString().trim();
        if(classID.equalsIgnoreCase("I") || classID.equalsIgnoreCase("II") || classID.equalsIgnoreCase("III") || classID.equalsIgnoreCase("IV") || classID.equalsIgnoreCase("V") || classID.equalsIgnoreCase("VI") || classID.equalsIgnoreCase("VII") || classID.equalsIgnoreCase("VIII"))
        {
            cmbGroup.setEnabled(false);
        }
        else
        {
            cmbGroup.setEnabled(true);
        }
        
        cmbShift.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getStudentManager().getShiftNameList(classID).toArray()));
        cmbSection.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getStudentManager().getSectionNameList(classID).toArray()));
    }//GEN-LAST:event_cmbClassActionPerformed

    private void cmbSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSessionActionPerformed
        cmbGroupActionPerformed(evt);
    }//GEN-LAST:event_cmbSessionActionPerformed

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
                Logger.getLogger(StudentAdmissionForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image image = originalImage.getScaledInstance(215, 230, Image.SCALE_SMOOTH);
            lblPicture.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    
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
            cmbClass.getSelectedItem().toString().trim();
        }catch (NullPointerException e){
            return "Select Class Name";
        }
        
        if(cmbClass.getSelectedItem() == null || cmbClass.getSelectedItem().toString().trim().isEmpty())
        {
            return "Select Class Name";
        }

        if(txtStudentID.getText() == null || txtStudentID.getText().trim().isEmpty())
        {
            return "Check Student ID";
        }
                
        if(txtName.getText() == null || txtName.getText().trim().isEmpty())
        {       
            return "Please Enter Student Name";
        }

        if(txtFatherName.getText() == null || txtFatherName.getText().trim().isEmpty())
        {
            return "Please Enter Student's Father Name";
        }

        if(txtMotherName.getText() == null || txtMotherName.getText().trim().isEmpty())
        {
            return "Please Enter Student's Mother Name";
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
        
        if(txtClassRoll.getText() == null || txtClassRoll.getText().trim().isEmpty())
        {
            return "Please Enter Class Roll";
        }
        
        try{
            Integer.parseInt(txtClassRoll.getText().trim());
        }catch (NumberFormatException e){
            return "Enter Valid Class Roll";
        }
        
        return "success";
    }


    private void clearForm()
    {
        txtName.setText("");
        txtFatherName.setText("");
        txtMotherName.setText("");
        radioMale.setSelected(true);
        txtAreaPresentAddress.setText("");
        txtAreaPermanentAddress.setText("");
        txtPhoneNo.setText("");
        txtEmailID.setText("");
        txtClassRoll.setText("");
                        
    }

    private String [] getTableHeader()
    {
        String [] s = {"Serial", "Student ID", "Class Name", "Class Roll", "Student Name", "Contact"};
        return s;
    }

    private Object[][] getTableData(List<StudentBean> studentList)
    {
        if(studentList == null || studentList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[studentList.size()][6];
        for(int i=0; i<studentList.size();i++)
        {
            StudentBean studentBean = studentList.get(i);
            obj[i][0] = i+1;
            obj[i][1] = studentBean.getStudentID();
            obj[i][2] = studentBean.getClassId();
            obj[i][3] = studentBean.getClassRoll();
            obj[i][4] = studentBean.getStudentName();
            obj[i][5] = studentBean.getMobileNo();
            
        }
        return obj;
    }

    private DefaultTableModel createTable(Object [][]object, String []String)
    {
        return new DefaultTableModel(object,String) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
    private javax.swing.JButton btnBrowse;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupMaritalStatus;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbClass;
    private javax.swing.JComboBox cmbGroup;
    private javax.swing.JComboBox cmbMedium;
    private javax.swing.JComboBox cmbSection;
    private javax.swing.JComboBox cmbSession;
    private javax.swing.JComboBox cmbShift;
    private javax.swing.JComboBox cmbStudentType;
    private com.toedter.calendar.JDateChooser dcBirthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelLists;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioOther;
    private javax.swing.JTable tableStudentList;
    private javax.swing.JTextArea txtAreaPermanentAddress;
    private javax.swing.JTextArea txtAreaPresentAddress;
    private javax.swing.JTextField txtClassRoll;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtPictureUrl;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtbloodGroup;
    // End of variables declaration//GEN-END:variables

}
