
package main.java.com.csbl.sms.ui.payment;

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
import main.java.com.csbl.sms.bean.StudentPaymentBean;
import main.java.com.csbl.sms.util.DateUtil;
import main.java.com.csbl.sms.util.NumberUtil;
import main.java.com.csbl.sms.util.PropertiesFile;
import main.java.com.csbl.sms.util.NumberConverterUtil;


public class StudentPaymentForm extends javax.swing.JDialog {

    JTextField tf;
    List<String> listOfStudentId = new ArrayList<>();
    List<String> selectedMonths;
    int totalMonth = 0;
    double tAmount = 0;
    double tPaidAmount = 0;
    double tDueAmount = 0;
    
    
    
    public StudentPaymentForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int)d.getWidth();
        int h = (int)d.getHeight();
        setSize(680, 660);
        setLocation(w/2-340, h/2-330);   
        
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        lblHeader.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblHeader.setText("Student Payment Form");

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
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
                    .addComponent(cmbStudentId, 0, 284, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPaymentYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(txtTotalAmount)
                            .addComponent(txtPaidAmount)
                            .addComponent(txtDueAmount)
                            .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddMonth)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPaymentYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btnAddMonth)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtDueAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
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
                .addComponent(panelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    String classId = NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim());
    String studentId = cmbStudentId.getSelectedItem().toString();
    String paymentMonth = txtAreaMonths.getText().trim();
    String paymentYear = cmbPaymentYear.getSelectedItem().toString().trim();
    double totalAmount = NumberUtil.getNumberValueAsDouble(txtTotalAmount.getText().trim());
    double paidAmount = NumberUtil.getNumberValueAsDouble(txtPaidAmount.getText().trim());
    double dueAmount = NumberUtil.getNumberValueAsDouble(txtDueAmount.getText().trim());
    String paidDate = DateUtil.getDateAsString(dateChooser.getCalendar().getTime());
    String createdBy = PropertiesFile.getUserManager().getLoginUser().getUserName();
    
    StudentPaymentBean studentPaymentBean = new StudentPaymentBean(classId, studentId, paymentMonth, paymentYear, totalMonth, totalAmount, paidAmount, dueAmount, paidDate, createdBy);
    
    String confirm = PropertiesFile.getPaymentManger().saveStudentPayment(studentPaymentBean);
    
    if(!confirm.equalsIgnoreCase("successful"))
    {
        JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    JOptionPane.showMessageDialog(rootPane, "Successfully Save Student Payment", "Info", JOptionPane.INFORMATION_MESSAGE);

    tableStudentList.setModel(createTable(getTableData(PropertiesFile.getPaymentManger().getStudetsPaymentByClass(classId, paymentYear)),getTableHeader()));
    resizeTable();
    
    calculateAmounts();
    
    clearForm();
    
   
}//GEN-LAST:event_btnSaveActionPerformed

private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    clearForm();
}//GEN-LAST:event_btnResetActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try{
        cmbClass.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getClassManager().getClassName().toArray()));
        cmbPaymentYear.setModel(new javax.swing.DefaultComboBoxModel(getYearList().toArray()));
        dateChooser.setDate(new Date());
    }catch(NullPointerException e)
    {
        JOptionPane.showMessageDialog(rootPane, "No Record Found !", "Alert", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_formWindowOpened

    private void cmbClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassActionPerformed
        try{
            cmbAcademicYear.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getSubjectChoiceManager().getAcademicYear(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim())).toArray()));
            cmbAcademicYearActionPerformed(evt);
        }catch(NullPointerException e)
        {
        }
        clearForm();
        
    }//GEN-LAST:event_cmbClassActionPerformed

    private void txtAreaMonthsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaMonthsMousePressed
        
    }//GEN-LAST:event_txtAreaMonthsMousePressed

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
        
        clearForm();

    }//GEN-LAST:event_cmbAcademicYearActionPerformed

    private void btnAddMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMonthActionPerformed
        new CheckBoxMonth(null, true, this).setVisible(true);
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
            tableStudentList.setModel(createTable(getTableData(PropertiesFile.getPaymentManger().getStudetsPaymentByClass(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim()), cmbPaymentYear.getSelectedItem().toString().trim())),getTableHeader()));
            resizeTable();
            calculateAmounts();
        }catch(NullPointerException e)
        {}
    }//GEN-LAST:event_cmbPaymentYearActionPerformed

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
        txtAreaMonths.setText("");
        txtTotalAmount.setText("");
        txtPaidAmount.setText("");
        txtDueAmount.setText("");
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
        String [] s = {"Serial","Receipt No", "Student ID", "Months", "Total Amount", "Paid Amount", "Due Amount"};
        return s;
    }

    private Object[][] getTableData(List<StudentPaymentBean> studentPaymentList)
    {
        if(studentPaymentList == null || studentPaymentList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[studentPaymentList.size()][7];
        tAmount = 0;
        tPaidAmount = 0;
        tDueAmount = 0;
        for(int i=0; i<studentPaymentList.size();i++)
        {
            StudentPaymentBean spb = studentPaymentList.get(i);
            obj[i][0] = i+1;
            obj[i][1] = spb.getMoneyReceiptNo();
            obj[i][2] = spb.getStudentId();
            obj[i][3] = spb.getPaymentMonth()+spb.getPaymentYear();
            obj[i][4] = spb.getTotalAmount();
            obj[i][5] = spb.getPaidAmount();
            obj[i][6] = spb.getDueAmount();
            tAmount += spb.getTotalAmount();
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
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbAcademicYear;
    private javax.swing.JComboBox cmbClass;
    private javax.swing.JComboBox cmbPaymentYear;
    private javax.swing.JComboBox cmbStudentId;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JTextField txtDueAmount;
    private javax.swing.JTextField txtPaidAmount;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables

    public List<String> getSelectedMonths() {
        return selectedMonths;
    }

    public void setSelectedMonths(List<String> selectedMonths) {
        this.selectedMonths = selectedMonths;
    }

    public void refreshWindow(StudentPaymentForm studentPaymentForm)
    {
        double monthlyFee = PropertiesFile.getPaymentManger().getMonthlyFee(cmbClass.getSelectedItem().toString().trim());
        this.totalMonth = studentPaymentForm.getSelectedMonths().size();
        double totalAmount = monthlyFee * totalMonth;
        txtAreaMonths.setText(studentPaymentForm.getSelectedMonths().toString());
        txtTotalAmount.setText(NumberUtil.getNumberValueAsString(totalAmount));
        
        studentPaymentForm.show();

    }
    
}
