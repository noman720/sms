
package main.java.com.csbl.sms.ui.student;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import main.java.com.csbl.sms.bean.StudentBean;
import main.java.com.csbl.sms.util.DateUtil;
import main.java.com.csbl.sms.util.ImageConverterUtil;
import main.java.com.csbl.sms.util.PropertiesFile;


public class StudentDetailEntryForm extends javax.swing.JDialog {

    String pictureUrl;
    Admission admission;
    String gender = "male";

    public StudentDetailEntryForm(java.awt.Frame parent, boolean modal, Admission admission) {
        super(parent, modal);
        this.admission = admission;
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
        setLocationRelativeTo(null);
        radioMale.setSelected(true);
        txtStudentId.setText(admission.getStudentId());
        txtClassRoll.setText(admission.getRollNo()+"");
        
    }


    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        btnGroupMaritalStatus = new javax.swing.ButtonGroup();
        panelBackground = new javax.swing.JPanel();
        panelEntry = new javax.swing.JPanel();
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
        txtStudentId = new javax.swing.JTextField();
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
        btnBrowse = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblPictureUrl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPictureUrl = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Entry Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        txtClassRoll.setEditable(false);
        txtClassRoll.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtClassRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClassRollActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Student ID :");

        txtStudentId.setEditable(false);
        txtStudentId.setBackground(new java.awt.Color(240, 253, 249));
        txtStudentId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        btnBrowse.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Student Details");

        lblPictureUrl.setBackground(new java.awt.Color(0, 153, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Picture :");

        txtPictureUrl.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblName))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel6))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblAddress))
                    .addComponent(jLabel4))
                .addGap(2, 2, 2)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addComponent(radioMale)
                        .addGap(2, 2, 2)
                        .addComponent(radioFemale)
                        .addGap(2, 2, 2)
                        .addComponent(radioOther))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(lblPictureUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblPhone)
                .addGap(4, 4, 4)
                .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lblEmail)
                .addGap(4, 4, 4)
                .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(txtClassRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addComponent(cmbStudentType, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(cmbMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(cmbShift, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addComponent(cmbSection, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel14)
                .addGap(4, 4, 4)
                .addComponent(txtbloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPictureUrl)
                    .addComponent(dcBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBrowse))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEntryLayout.setVerticalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(lblName)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(lblAddress)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioMale)
                            .addComponent(radioFemale)
                            .addComponent(radioOther))
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblPictureUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtClassRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbStudentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbMedium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtbloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(dcBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPictureUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse))
                .addGap(2, 2, 2))
        );

        panelBackground.add(panelEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 0, -1, -1));

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panelBackground.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 102, -1));

        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panelBackground.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 102, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelBackground.getAccessibleContext().setAccessibleName("ProductEntryForm");

        pack();
    }// </editor-fold>//GEN-END:initComponents


private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    cmbShift.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getStudentManager().getShiftNameList(admission.getClassId()).toArray()));
    cmbSection.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getStudentManager().getSectionNameList(admission.getClassId()).toArray()));
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

    private void cmbStudentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStudentTypeActionPerformed
        cmbMedium.requestFocusInWindow();
    }//GEN-LAST:event_cmbStudentTypeActionPerformed

    private void cmbMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMediumActionPerformed
        cmbShift.requestFocusInWindow();
    }//GEN-LAST:event_cmbMediumActionPerformed

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

    
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String message = isCompleteForm();
        if(!message.equalsIgnoreCase("success"))
        {
            JOptionPane.showMessageDialog(rootPane, message, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(null, "Do you sure to Save Student?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response != JOptionPane.YES_OPTION) {
            return;
        }
        
        String pictureurl = ImageConverterUtil.getPicturePathForStudent(txtPictureUrl.getText().trim(), txtStudentId.getText().trim());
        
        if(pictureurl.equalsIgnoreCase("unsuccessful"))
        {
            JOptionPane.showMessageDialog(rootPane, "Couldn't Convert Picture\nPlease Change The Picture", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String studentClass = admission.getClassId();
        String accademicYear = admission.getAcademicYear();
        String studentGroup = admission.getStudentGroup();
        String studentID = txtStudentId.getText().trim();
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
        

        StudentBean studentBean = new StudentBean(studentID, studentName, fatherName, motherName, presentAddress, permanentAddress, mobileNo, email, gender, studentGroup, studentType, medium, accademicYear, shift, studentClass, section, classRoll, bloodGroup, birthDate, pictureurl);

        String confirm = PropertiesFile.getStudentManager().saveStudent(studentBean);

        if(!confirm.equalsIgnoreCase("successful"))
        {
            JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(rootPane, "Successfully Save Student", "Info", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        admission.refreshWindow(admission);
    
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearForm();
    }//GEN-LAST:event_btnResetActionPerformed

    
    private String isCompleteForm()
    {
        
        if(txtStudentId.getText() == null || txtStudentId.getText().trim().isEmpty())
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
        txtbloodGroup.setText("");
        dcBirthDate.setDate(null);
        txtPictureUrl.setText(""); 
        lblPictureUrl.setIcon(null);
    }

    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupMaritalStatus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbMedium;
    private javax.swing.JComboBox cmbSection;
    private javax.swing.JComboBox cmbShift;
    private javax.swing.JComboBox cmbStudentType;
    private com.toedter.calendar.JDateChooser dcBirthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPictureUrl;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioOther;
    private javax.swing.JTextArea txtAreaPermanentAddress;
    private javax.swing.JTextArea txtAreaPresentAddress;
    private javax.swing.JTextField txtClassRoll;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtPictureUrl;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtbloodGroup;
    // End of variables declaration//GEN-END:variables

}
