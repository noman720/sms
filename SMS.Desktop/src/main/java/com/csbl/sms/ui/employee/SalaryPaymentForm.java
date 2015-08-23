
package main.java.com.csbl.sms.ui.employee;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.java.com.csbl.sms.bean.SalaryPaymentBean;
import main.java.com.csbl.sms.util.DateUtil;
import main.java.com.csbl.sms.util.NumberUtil;
import main.java.com.csbl.sms.util.PropertiesFile;


public class SalaryPaymentForm extends javax.swing.JDialog {

    List<String> selectedMonths;
    int totalMonth = 0;
    double tAmount = 0;
    double tPaidAmount = 0;
    double tDueAmount = 0;
    SalaryPaymentBean salaryBean;
    
    
    public SalaryPaymentForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(725, 715);
        setLocationRelativeTo(null);
        
    }
    
    private void resizeTable()
    {
        tableStudentList.getColumnModel().getColumn(0).setPreferredWidth(5);
        tableStudentList.getColumnModel().getColumn(1).setPreferredWidth(35);
        tableStudentList.getColumnModel().getColumn(2).setPreferredWidth(10);
        tableStudentList.getColumnModel().getColumn(3).setPreferredWidth(100);
        tableStudentList.getColumnModel().getColumn(4).setPreferredWidth(20);
        tableStudentList.getColumnModel().getColumn(5).setPreferredWidth(20);
        tableStudentList.getColumnModel().getColumn(6).setPreferredWidth(20);
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
        lblTotalDue = new javax.swing.JLabel();
        lblTotalPaid = new javax.swing.JLabel();
        lblTotalAmount = new javax.swing.JLabel();
        panelEntry = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaMonths = new javax.swing.JTextArea();
        btnAddMonth = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbPaymentYear = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        txtPaidAmount = new javax.swing.JTextField();
        txtDueAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        txtEmployeeId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        txtBonus = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Salary Payment");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelLists.setBackground(new java.awt.Color(240, 253, 249));
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Of Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18))); // NOI18N

        tableStudentList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Student Id", "Months", "Total Amount", "Paid Amount", "Due Amount"
            }
        ));
        jScrollPane1.setViewportView(tableStudentList);
        tableStudentList.getAccessibleContext().setAccessibleName("Lists Of Products");

        lblTotalDue.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTotalDue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalDue.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblTotalPaid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTotalPaid.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalPaid.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblTotalAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTotalAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalAmount.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout panelListsLayout = new javax.swing.GroupLayout(panelLists);
        panelLists.setLayout(panelListsLayout);
        panelListsLayout.setHorizontalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        panelEntry.setBackground(new java.awt.Color(240, 253, 249));
        panelEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEntry.setPreferredSize(new java.awt.Dimension(516, 401));

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setText("Salary Payment Form");

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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Employee Id :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Months Name :");

        txtAreaMonths.setEditable(false);
        txtAreaMonths.setBackground(new java.awt.Color(204, 204, 204));
        txtAreaMonths.setColumns(20);
        txtAreaMonths.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtAreaMonths.setRows(2);
        txtAreaMonths.setToolTipText("Enter Subject Code Seperated By Comma (,)");
        txtAreaMonths.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAreaMonthsMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtAreaMonths);

        btnAddMonth.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAddMonth.setText("Add");
        btnAddMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMonthActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Payment Year :");

        cmbPaymentYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbPaymentYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaymentYearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Total Amount :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Paid Amount :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Due Amount :");

        txtTotalAmount.setEditable(false);
        txtTotalAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtPaidAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPaidAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaidAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaidAmountKeyTyped(evt);
            }
        });

        txtDueAmount.setEditable(false);
        txtDueAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Paid Date :");

        dateChooser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtEmployeeId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Salary :");

        txtSalary.setEditable(false);
        txtSalary.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtBonus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBonusActionPerformed(evt);
            }
        });
        txtBonus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBonusKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBonusKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Bonous :");

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtEmployeeName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Employee Name :");

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSearch)
                .addGap(211, 211, 211))
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPaymentYear, 0, 286, Short.MAX_VALUE)
                            .addComponent(txtEmployeeName)))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(txtPaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(txtDueAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnAddMonth)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEntryLayout.setVerticalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addComponent(lblHeader)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(8, 8, 8)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbPaymentYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddMonth))
                .addGap(4, 4, 4)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtDueAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelLists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    int response = JOptionPane.showConfirmDialog(null, "Do you sure to save Payment?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response != JOptionPane.YES_OPTION) {
            return;
        }
    
    String employeeId = txtEmployeeId.getText().toString().trim();
    String paymentYear = cmbPaymentYear.getSelectedItem().toString().trim();
    String paymentMonth = txtAreaMonths.getText().trim();
    double basicSalary = NumberUtil.getNumberValueAsDouble(txtSalary.getText().trim());
    double bonus = NumberUtil.getNumberValueAsDouble(txtBonus.getText().trim());
    double paidAmount = NumberUtil.getNumberValueAsDouble(txtPaidAmount.getText().trim());
    double dueAmount = NumberUtil.getNumberValueAsDouble(txtDueAmount.getText().trim());
    String paymentDate = DateUtil.getDateAsString(dateChooser.getCalendar().getTime());
    String createdBy = PropertiesFile.getUserManager().getLoginUser().getUserName();
    
    SalaryPaymentBean salaryPaymentBean = new SalaryPaymentBean(employeeId, paymentMonth, paymentYear, totalMonth, basicSalary, bonus, paidAmount, dueAmount, paymentDate, createdBy);
    String confirm = PropertiesFile.getPaymentManger().saveSalaryPayment(salaryPaymentBean);
    
    if(!confirm.equalsIgnoreCase("successful"))
    {
        JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    JOptionPane.showMessageDialog(rootPane, "Successfully Save Employee Salary", "Info", JOptionPane.INFORMATION_MESSAGE);

    tableStudentList.setModel(createTable(getTableData(PropertiesFile.getPaymentManger().getPaidSalaryList(cmbPaymentYear.getSelectedItem().toString().trim())),getTableHeader()));
    resizeTable();
    
    calculateAmounts();
    
    clearForm();
    
   
}//GEN-LAST:event_btnSaveActionPerformed

private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    clearForm();
}//GEN-LAST:event_btnResetActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try{
        cmbPaymentYear.setModel(new javax.swing.DefaultComboBoxModel(getYearList().toArray()));
        dateChooser.setDate(new Date());
    }catch(NullPointerException e)
    {
        //JOptionPane.showMessageDialog(rootPane, "No Record Found !", "Alert", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_formWindowOpened

    private void txtAreaMonthsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaMonthsMousePressed
        
    }//GEN-LAST:event_txtAreaMonthsMousePressed

    private void btnAddMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMonthActionPerformed
        new CheckBoxMonthForSalary(null, true, this).setVisible(true);
    }//GEN-LAST:event_btnAddMonthActionPerformed

    private void txtPaidAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidAmountKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == '.') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
        {
          getToolkit().beep();
          evt.consume();
        }
    }//GEN-LAST:event_txtPaidAmountKeyTyped

    private void txtPaidAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidAmountKeyReleased
        
        double dueAmount = NumberUtil.getNumberValueAsDouble(txtTotalAmount.getText().trim()) - NumberUtil.getNumberValueAsDouble(txtPaidAmount.getText().trim());
        txtDueAmount.setText(NumberUtil.getNumberValueAsString(dueAmount));
    }//GEN-LAST:event_txtPaidAmountKeyReleased

    private void cmbPaymentYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaymentYearActionPerformed
        try{
            tableStudentList.setModel(createTable(getTableData(PropertiesFile.getPaymentManger().getPaidSalaryList(cmbPaymentYear.getSelectedItem().toString().trim())),getTableHeader()));
            resizeTable();
            calculateAmounts();
        }catch(NullPointerException e)
        {}
    }//GEN-LAST:event_cmbPaymentYearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(txtEmployeeId.getText().trim().isEmpty() || txtEmployeeId.getText().trim() == null)
        {
            JOptionPane.showMessageDialog(rootPane, "Enter Employee Id", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        salaryBean = PropertiesFile.getPaymentManger().getSalaryInfoByEmployeeId(txtEmployeeId.getText().trim());
        if(salaryBean.getEmployeeName() == null || salaryBean.getEmployeeName().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(rootPane, "No Record Found !", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        txtEmployeeName.setText(salaryBean.getEmployeeName());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBonusActionPerformed
        txtPaidAmount.requestFocusInWindow();
    }//GEN-LAST:event_txtBonusActionPerformed

    private void txtBonusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBonusKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == '.') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
        {
          getToolkit().beep();
          evt.consume();
        }
    }//GEN-LAST:event_txtBonusKeyTyped

    private void txtBonusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBonusKeyReleased
        double totalAmount = NumberUtil.getNumberValueAsDouble(txtSalary.getText().trim())+NumberUtil.getNumberValueAsDouble(txtBonus.getText().trim());
        txtTotalAmount.setText(NumberUtil.getNumberValueAsString(totalAmount));
    }//GEN-LAST:event_txtBonusKeyReleased

    private void txtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdActionPerformed
        btnSearchActionPerformed(evt);
    }//GEN-LAST:event_txtEmployeeIdActionPerformed

    private String isCompleteForm()
    {        
        if(txtAreaMonths.getText() == null || txtAreaMonths.getText().isEmpty())
        {
            return "Enter Months";
        }
        if(txtTotalAmount.getText() == null || txtTotalAmount.getText().isEmpty())
        {
            return "Enter Total Amount";
        }
        if(txtPaidAmount.getText() == null || txtPaidAmount.getText().isEmpty())
        {
            return "Enter Paid Amount";
        }
        if(txtDueAmount.getText() == null || txtDueAmount.getText().isEmpty())
        {
            return "Enter Total Amount";
        }
        if(NumberUtil.getNumberValueAsDouble(txtDueAmount.getText().trim()) < 0.0)
        {
            return "Enter Upto Total Amount";
        }
        
        
        return "success";
    }


    private void clearForm()
    {        
        txtEmployeeId.setText("");
        txtEmployeeName.setText("");
        txtSalary.setText("");
        txtBonus.setText("");
        txtTotalAmount.setText("");
        txtPaidAmount.setText("");
        txtDueAmount.setText("");
        dateChooser.setDate(null);

    }

    private void calculateAmounts()
    {
        lblTotalAmount.setText(NumberUtil.getNumberValueAsString(tAmount));
        lblTotalPaid.setText(NumberUtil.getNumberValueAsString(tPaidAmount));
        lblTotalDue.setText(NumberUtil.getNumberValueAsString(tDueAmount));
    }
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
    
    private String [] getTableHeader()
    {
        String [] s = {"Serial", "Receipt No", "Employee ID", "Months", "Total Amount", "Paid Amount", "Due Amount"};
        return s;
    }

    private Object[][] getTableData(List<SalaryPaymentBean> salaryPaymentList)
    {
        tAmount = 0;
        tPaidAmount = 0;
        tDueAmount = 0;
        
        if(salaryPaymentList == null || salaryPaymentList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[salaryPaymentList.size()][7];
        
        for(int i=0; i<salaryPaymentList.size();i++)
        {
            SalaryPaymentBean spb = salaryPaymentList.get(i);
            obj[i][0] = i+1;
            obj[i][1] = spb.getMoneyReceiptNo();
            obj[i][2] = spb.getEmployeeId();
            obj[i][3] = spb.getPaymentMonth()+spb.getPaymentYear();
            obj[i][4] = spb.getBasicSalary()+spb.getBonus();
            obj[i][5] = spb.getPaidAmount();
            obj[i][6] = spb.getDueAmount();
            tAmount += spb.getBasicSalary()+spb.getBonus();;
            tPaidAmount += spb.getPaidAmount();
            tDueAmount += spb.getDueAmount();
        }
        return obj;
    }

    private DefaultTableModel createTable(Object [][]object, String []String)
    {
        return new DefaultTableModel(object,String) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
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
    private javax.swing.JButton btnAddMonth;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupMaritalStatus;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmbPaymentYear;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JLabel lblTotalDue;
    private javax.swing.JLabel lblTotalPaid;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JPanel panelLists;
    private javax.swing.JTable tableStudentList;
    private javax.swing.JTextArea txtAreaMonths;
    private javax.swing.JTextField txtBonus;
    private javax.swing.JTextField txtDueAmount;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtPaidAmount;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables

    public List<String> getSelectedMonths() {
        return selectedMonths;
    }

    public void setSelectedMonths(List<String> selectedMonths) {
        this.selectedMonths = selectedMonths;
    }

    public void refreshWindow(SalaryPaymentForm studentPaymentForm)
    {
        this.totalMonth = studentPaymentForm.getSelectedMonths().size();
        double totalAmount = salaryBean.getBasicSalary() * totalMonth;
        txtAreaMonths.setText(studentPaymentForm.getSelectedMonths().toString());
        txtSalary.setText(NumberUtil.getNumberValueAsString(totalAmount));
        
        studentPaymentForm.show();

    }
    
}
