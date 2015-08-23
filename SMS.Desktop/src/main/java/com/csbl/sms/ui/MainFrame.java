
package main.java.com.csbl.sms.ui;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import main.java.com.csbl.sms.ui.employee.EmployeeEntryForm;
import main.java.com.csbl.sms.ui.employee.EmployeeInfoById;
import main.java.com.csbl.sms.ui.employee.SalaryPaymentForm;
import main.java.com.csbl.sms.ui.exam.ExamEntryForm;
import main.java.com.csbl.sms.ui.exam.ExamRegistrationForm;
import main.java.com.csbl.sms.ui.expense.ExpenseEntryForm;
import main.java.com.csbl.sms.ui.mail.SendMailForm;
import main.java.com.csbl.sms.ui.mark.MarkEntryForm;
import main.java.com.csbl.sms.ui.mark.ShowMarks;
import main.java.com.csbl.sms.ui.mark.ShowTabulationSheet;
import main.java.com.csbl.sms.ui.payment.PrepareBillForm;
import main.java.com.csbl.sms.ui.payment.StudentTransactionForm;
import main.java.com.csbl.sms.ui.reg.acc.CommitResultForm;
import main.java.com.csbl.sms.ui.reg.acc.YearChangeCheckBoxForm;
import main.java.com.csbl.sms.ui.student.Admission;
import main.java.com.csbl.sms.ui.student.StudentInfoById;
import main.java.com.csbl.sms.ui.student.SubjectChoiceForm;
import main.java.com.csbl.sms.ui.subject.SubjectEntryForm;
import main.java.com.csbl.sms.ui.subject.SubjectGroupEntryForm;
import main.java.com.csbl.sms.ui.user.ChangePasswordForm;
import main.java.com.csbl.sms.ui.user.UserEntryForm;
import main.java.com.csbl.sms.util.PropertiesFile;
import org.apache.log4j.Logger;


public class MainFrame extends javax.swing.JFrame {
                
    private Logger log = Logger.getLogger(this.getClass());
    SoftwareLabel label;
    
   
    public MainFrame() {
        
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);
        setBackground(new java.awt.Color(240, 253, 249));
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/images/background.png"))));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
        setLayout(new BorderLayout());
        label = new SoftwareLabel("Developed By - \n Md. Abu Noman \n Software Programmer \n Mobile - 01717717488");
        label.setBlinkingOn(true);
        add("South",label);
        setPreferredSize(new Dimension(600, 500));
        gotoFacebook();
        
    }

    private void gotoFacebook()
    {
        label.setToolTipText("Click here to see me in Facebook");
        label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                        final URI myURI = new URI("http://www.facebook.com/noman.ict.mbstu");
                        open(myURI);
                    }catch (URISyntaxException ex) {
                    }
            }
        });
    }
    
    private static void open(URI uri) {
        if (Desktop.isDesktopSupported()) {
          try {
            Desktop.getDesktop().browse(uri);
          } catch (IOException e) {}
        } else {}
    }
    
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemSaveExam = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuExpense = new javax.swing.JMenu();
        menuItemExpense = new javax.swing.JMenuItem();
        menuExpenseReport = new javax.swing.JMenu();
        menuItemExpenseReportByDate = new javax.swing.JMenuItem();
        menuItemExpenseReportByEmployee = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        menuItemExit = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenu();
        menuItemAddUser = new javax.swing.JMenuItem();
        menuSubject = new javax.swing.JMenu();
        menuItemAddSubject = new javax.swing.JMenuItem();
        menuItemAddGroupSubject = new javax.swing.JMenuItem();
        menuStudent = new javax.swing.JMenu();
        menuItemAdmitStudent = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuItemRegisterStudent = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuItemExamRegistration = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        menuItemShowStudentInfo = new javax.swing.JMenuItem();
        menuPayment = new javax.swing.JMenu();
        menuItemPrepareBill = new javax.swing.JMenuItem();
        menuItemTransaction = new javax.swing.JMenuItem();
        menuEmployee = new javax.swing.JMenu();
        menuItemAddEmployee = new javax.swing.JMenuItem();
        menuItemShowEmployee = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuItemSalaryPayment = new javax.swing.JMenuItem();
        menuResult = new javax.swing.JMenu();
        menuItemMarkEntry = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuItemMarkSheet = new javax.swing.JMenuItem();
        menuItemTabulationSheet = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuItemYearChangeOperation = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        menuItemCommitResult = new javax.swing.JMenuItem();
        menuSetting = new javax.swing.JMenu();
        menuItemLogout = new javax.swing.JMenuItem();
        menuItemChangePassword = new javax.swing.JMenuItem();
        menuItemBackupDatabase = new javax.swing.JMenuItem();
        menuMail = new javax.swing.JMenu();
        menuItemSendMail = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuItemHelpContent = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("School Management System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        menuFile.setText("File");

        menuItemSaveExam.setText("Add Exams");
        menuItemSaveExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveExamActionPerformed(evt);
            }
        });
        menuFile.add(menuItemSaveExam);
        menuFile.add(jSeparator2);

        menuExpense.setText("Expense");

        menuItemExpense.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItemExpense.setText("Save Expense");
        menuItemExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExpenseActionPerformed(evt);
            }
        });
        menuExpense.add(menuItemExpense);

        menuExpenseReport.setText("Report");

        menuItemExpenseReportByDate.setText("Expense By Date");
        menuExpenseReport.add(menuItemExpenseReportByDate);

        menuItemExpenseReportByEmployee.setText("Expense By Employee");
        menuExpenseReport.add(menuItemExpenseReportByEmployee);

        menuExpense.add(menuExpenseReport);

        menuFile.add(menuExpense);
        menuFile.add(jSeparator10);

        menuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuFile.add(menuItemExit);

        menuBar.add(menuFile);

        menuUser.setText("User");

        menuItemAddUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAddUser.setText("Add User");
        menuItemAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddUserActionPerformed(evt);
            }
        });
        menuUser.add(menuItemAddUser);

        menuBar.add(menuUser);

        menuSubject.setText("Subject");

        menuItemAddSubject.setText("Add Subject");
        menuItemAddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddSubjectActionPerformed(evt);
            }
        });
        menuSubject.add(menuItemAddSubject);

        menuItemAddGroupSubject.setText("Add Group Subject");
        menuItemAddGroupSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddGroupSubjectActionPerformed(evt);
            }
        });
        menuSubject.add(menuItemAddGroupSubject);

        menuBar.add(menuSubject);

        menuStudent.setText("Student");

        menuItemAdmitStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAdmitStudent.setText("Admit Student");
        menuItemAdmitStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAdmitStudentActionPerformed(evt);
            }
        });
        menuStudent.add(menuItemAdmitStudent);
        menuStudent.add(jSeparator4);

        menuItemRegisterStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemRegisterStudent.setText("Choice Subject");
        menuItemRegisterStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegisterStudentActionPerformed(evt);
            }
        });
        menuStudent.add(menuItemRegisterStudent);
        menuStudent.add(jSeparator5);

        menuItemExamRegistration.setText("Registration");
        menuItemExamRegistration.setToolTipText("Student Registration for Exam");
        menuItemExamRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExamRegistrationActionPerformed(evt);
            }
        });
        menuStudent.add(menuItemExamRegistration);
        menuStudent.add(jSeparator11);

        menuItemShowStudentInfo.setText("Show Student Info");
        menuItemShowStudentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemShowStudentInfoActionPerformed(evt);
            }
        });
        menuStudent.add(menuItemShowStudentInfo);

        menuBar.add(menuStudent);

        menuPayment.setText("Payment");

        menuItemPrepareBill.setText("Prepare Bill");
        menuItemPrepareBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPrepareBillActionPerformed(evt);
            }
        });
        menuPayment.add(menuItemPrepareBill);

        menuItemTransaction.setText("Transaction");
        menuItemTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTransactionActionPerformed(evt);
            }
        });
        menuPayment.add(menuItemTransaction);

        menuBar.add(menuPayment);

        menuEmployee.setText("Employee");

        menuItemAddEmployee.setText("Add Employee");
        menuItemAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddEmployeeActionPerformed(evt);
            }
        });
        menuEmployee.add(menuItemAddEmployee);

        menuItemShowEmployee.setText("Show Employee");
        menuItemShowEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemShowEmployeeActionPerformed(evt);
            }
        });
        menuEmployee.add(menuItemShowEmployee);
        menuEmployee.add(jSeparator8);

        menuItemSalaryPayment.setText("Salary Payment");
        menuItemSalaryPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalaryPaymentActionPerformed(evt);
            }
        });
        menuEmployee.add(menuItemSalaryPayment);

        menuBar.add(menuEmployee);

        menuResult.setText("Result");

        menuItemMarkEntry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuItemMarkEntry.setText("Mark Entry");
        menuItemMarkEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMarkEntryActionPerformed(evt);
            }
        });
        menuResult.add(menuItemMarkEntry);
        menuResult.add(jSeparator3);

        menuItemMarkSheet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemMarkSheet.setText("Mark Sheet");
        menuItemMarkSheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMarkSheetActionPerformed(evt);
            }
        });
        menuResult.add(menuItemMarkSheet);

        menuItemTabulationSheet.setText("Tabulation Sheet");
        menuItemTabulationSheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTabulationSheetActionPerformed(evt);
            }
        });
        menuResult.add(menuItemTabulationSheet);
        menuResult.add(jSeparator6);

        menuItemYearChangeOperation.setText("Year Change Operation");
        menuItemYearChangeOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemYearChangeOperationActionPerformed(evt);
            }
        });
        menuResult.add(menuItemYearChangeOperation);
        menuResult.add(jSeparator9);

        menuItemCommitResult.setText("Commit Result");
        menuItemCommitResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCommitResultActionPerformed(evt);
            }
        });
        menuResult.add(menuItemCommitResult);

        menuBar.add(menuResult);

        menuSetting.setText("Setting");

        menuItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        menuItemLogout.setText("Logout");
        menuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLogoutActionPerformed(evt);
            }
        });
        menuSetting.add(menuItemLogout);

        menuItemChangePassword.setText("Change Password");
        menuItemChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemChangePasswordActionPerformed(evt);
            }
        });
        menuSetting.add(menuItemChangePassword);

        menuItemBackupDatabase.setText("Backup Database");
        menuItemBackupDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBackupDatabaseActionPerformed(evt);
            }
        });
        menuSetting.add(menuItemBackupDatabase);

        menuBar.add(menuSetting);

        menuMail.setText("Mail");

        menuItemSendMail.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSendMail.setText("Send Mail");
        menuItemSendMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSendMailActionPerformed(evt);
            }
        });
        menuMail.add(menuItemSendMail);

        menuBar.add(menuMail);

        menuHelp.setText("Help");

        menuItemHelpContent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItemHelpContent.setText("Help Contents");
        menuItemHelpContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHelpContentActionPerformed(evt);
            }
        });
        menuHelp.add(menuItemHelpContent);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAdmitStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAdmitStudentActionPerformed
        //new StudentAdmissionForm(this, rootPaneCheckingEnabled).setVisible(true);
        new Admission(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemAdmitStudentActionPerformed

    private void menuItemAddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddSubjectActionPerformed
        new SubjectEntryForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemAddSubjectActionPerformed

    private void menuItemSaveExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveExamActionPerformed
        new ExamEntryForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemSaveExamActionPerformed

    private void menuItemRegisterStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegisterStudentActionPerformed
        new SubjectChoiceForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemRegisterStudentActionPerformed

    private void menuItemExamRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExamRegistrationActionPerformed
        new ExamRegistrationForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemExamRegistrationActionPerformed

    private void menuItemMarkEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMarkEntryActionPerformed
        new MarkEntryForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemMarkEntryActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        int conf = JOptionPane.showConfirmDialog(rootPane, "Do you want to EXIT ?", "Confirm !", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(conf == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        menuItemExitActionPerformed(null);
    }//GEN-LAST:event_formWindowClosing

    private void menuItemMarkSheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMarkSheetActionPerformed
        new ShowMarks(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemMarkSheetActionPerformed

    private void menuItemAddGroupSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddGroupSubjectActionPerformed
        new SubjectGroupEntryForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemAddGroupSubjectActionPerformed

    private void menuItemTabulationSheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTabulationSheetActionPerformed
        new ShowTabulationSheet(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemTabulationSheetActionPerformed

    private void menuItemYearChangeOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemYearChangeOperationActionPerformed
        new YearChangeCheckBoxForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemYearChangeOperationActionPerformed

    private void menuItemAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddEmployeeActionPerformed
        new EmployeeEntryForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemAddEmployeeActionPerformed

    private void menuItemSalaryPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalaryPaymentActionPerformed
        new SalaryPaymentForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemSalaryPaymentActionPerformed

    private void menuItemHelpContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHelpContentActionPerformed
        try{
        Desktop.getDesktop().open( new File("C:\\Program Files\\School\\help.chm"));
        }catch(Exception e){
            log.error("Error occured when open help file :", e);
        }
    }//GEN-LAST:event_menuItemHelpContentActionPerformed

    private void menuItemExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExpenseActionPerformed
        new ExpenseEntryForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemExpenseActionPerformed

    private void menuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogoutActionPerformed
        this.setVisible(false);
        new LoginForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemLogoutActionPerformed

    private void menuItemBackupDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBackupDatabaseActionPerformed
        
        int response = JOptionPane.showConfirmDialog(null, "Do you sure to Create Database Backup?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response != JOptionPane.YES_OPTION) {
            return;
        }
        String confirm = PropertiesFile.getDatabaseUtil().backupDatabase();
        if(!confirm.equalsIgnoreCase("Success"))
        {
            JOptionPane.showMessageDialog(rootPane, confirm, "Dadabase Backup", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(rootPane, "Successfully Backup Database", "Dadabase Backup", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_menuItemBackupDatabaseActionPerformed

    private void menuItemAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddUserActionPerformed
        new UserEntryForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemAddUserActionPerformed

    private void menuItemChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemChangePasswordActionPerformed
        new ChangePasswordForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemChangePasswordActionPerformed

    private void menuItemCommitResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCommitResultActionPerformed
        new CommitResultForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemCommitResultActionPerformed

    private void menuItemShowStudentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemShowStudentInfoActionPerformed
        new StudentInfoById(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemShowStudentInfoActionPerformed

    private void menuItemShowEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemShowEmployeeActionPerformed
        new EmployeeInfoById(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemShowEmployeeActionPerformed

    private void menuItemPrepareBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPrepareBillActionPerformed
        new PrepareBillForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemPrepareBillActionPerformed

    private void menuItemTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTransactionActionPerformed
        new StudentTransactionForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemTransactionActionPerformed

    private void menuItemSendMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSendMailActionPerformed
        new SendMailForm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemSendMailActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEmployee;
    private javax.swing.JMenu menuExpense;
    private javax.swing.JMenu menuExpenseReport;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuItemAddEmployee;
    private javax.swing.JMenuItem menuItemAddGroupSubject;
    private javax.swing.JMenuItem menuItemAddSubject;
    private javax.swing.JMenuItem menuItemAddUser;
    private javax.swing.JMenuItem menuItemAdmitStudent;
    private javax.swing.JMenuItem menuItemBackupDatabase;
    private javax.swing.JMenuItem menuItemChangePassword;
    private javax.swing.JMenuItem menuItemCommitResult;
    private javax.swing.JMenuItem menuItemExamRegistration;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemExpense;
    private javax.swing.JMenuItem menuItemExpenseReportByDate;
    private javax.swing.JMenuItem menuItemExpenseReportByEmployee;
    private javax.swing.JMenuItem menuItemHelpContent;
    private javax.swing.JMenuItem menuItemLogout;
    private javax.swing.JMenuItem menuItemMarkEntry;
    private javax.swing.JMenuItem menuItemMarkSheet;
    private javax.swing.JMenuItem menuItemPrepareBill;
    private javax.swing.JMenuItem menuItemRegisterStudent;
    private javax.swing.JMenuItem menuItemSalaryPayment;
    private javax.swing.JMenuItem menuItemSaveExam;
    private javax.swing.JMenuItem menuItemSendMail;
    private javax.swing.JMenuItem menuItemShowEmployee;
    private javax.swing.JMenuItem menuItemShowStudentInfo;
    private javax.swing.JMenuItem menuItemTabulationSheet;
    private javax.swing.JMenuItem menuItemTransaction;
    private javax.swing.JMenuItem menuItemYearChangeOperation;
    private javax.swing.JMenu menuMail;
    private javax.swing.JMenu menuPayment;
    private javax.swing.JMenu menuResult;
    private javax.swing.JMenu menuSetting;
    private javax.swing.JMenu menuStudent;
    private javax.swing.JMenu menuSubject;
    private javax.swing.JMenu menuUser;
    // End of variables declaration//GEN-END:variables

    
}
