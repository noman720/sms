
package main.java.com.csbl.sms.ui.exam;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
import main.java.com.csbl.sms.util.PropertiesFile;
import main.java.com.csbl.sms.util.NumberConverterUtil;



public class ExamRegistrationForm extends javax.swing.JDialog
{
    JPanel panel = new JPanel();
    
    
    
    
    public ExamRegistrationForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int)d.getWidth();
        int h = (int)d.getHeight();
        setLocation(w/2-375, h/2-330);
        //categoryBeanList.clear();
        //categoryBeanList.addAll(PropertiesFile.getCategoryManager().getCategories());
        //tableCategory.setModel(createTable(getTableData(categoryBeanList),getTableHeader()));
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        panelLists = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudentList = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cmbClass = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbExamName = new javax.swing.JComboBox();
        cmbAcademicYear = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exam Registration Entry Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelLists.setBackground(new java.awt.Color(240, 253, 249));
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Of Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18))); // NOI18N

        tableStudentList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Select", "Student ID", "Class Roll", "Student Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableStudentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //tableStudentListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableStudentList);
        tableStudentList.getColumnModel().getColumn(0).setResizable(false);
        tableStudentList.getColumnModel().getColumn(1).setResizable(false);
        tableStudentList.getColumnModel().getColumn(2).setResizable(false);
        tableStudentList.getColumnModel().getColumn(3).setResizable(false);
        tableStudentList.getAccessibleContext().setAccessibleName("Lists Of Products");

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListsLayout = new javax.swing.GroupLayout(panelLists);
        panelLists.setLayout(panelListsLayout);
        panelListsLayout.setHorizontalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(240, 253, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel1.setText("Exam Registration Form");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Class Id:");

        cmbClass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Exam Name :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Academic Year :");

        cmbExamName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbExamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbExamNameActionPerformed(evt);
            }
        });

        cmbAcademicYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbAcademicYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAcademicYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbAcademicYear, javax.swing.GroupLayout.Alignment.LEADING, 0, 217, Short.MAX_VALUE)
                    .addComponent(cmbClass, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbExamName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbExamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }
    
    
    
    private void showTableData()
    {

        try{
        Object[] columnNames = {MyTestStatus.INDETERMINATE, "Student ID", "Class Roll", "Student Name"};
        studentBeanList.clear();
        studentBeanList.addAll(PropertiesFile.getExamRegistrationManager().getStudentForRegistration(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim()), cmbAcademicYear.getSelectedItem().toString().trim(), cmbExamName.getSelectedItem().toString().trim()));
        DefaultTableModel model = new DefaultTableModel(getTableData(studentBeanList), columnNames)
        {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class};
            boolean[] canEdit = new boolean [] {
                true, false, true, false
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
            @Override public void updateUI() {
                super.updateUI();
                TableCellRenderer r = getDefaultRenderer(Boolean.class);
                if(r instanceof JComponent) {
                    ((JComponent)r).updateUI();
                }
            }
            @Override public Component prepareEditor(TableCellEditor editor, int row, int column) {
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
        tableStudentList.getColumnModel().getColumn(0).setResizable(false);
        tableStudentList.getColumnModel().getColumn(1).setResizable(false);
        tableStudentList.getColumnModel().getColumn(2).setResizable(false);
        tableStudentList.getColumnModel().getColumn(3).setResizable(false);
        tableStudentList.getAccessibleContext().setAccessibleName("Lists Of Student");

        int modelColmunIndex = 0;
        TableCellRenderer renderer = new MyTestHeaderRenderer(tableStudentList.getTableHeader(), modelColmunIndex);
        tableStudentList.getColumnModel().getColumn(modelColmunIndex).setHeaderRenderer(renderer);
        model.addTableModelListener(new MyTestHeaderCheckBoxHandler(tableStudentList, modelColmunIndex));

        }catch(NullPointerException e){}
    }
     
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) { 
        try{
        cmbClass.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getClassManager().getClassName().toArray()));
        }catch(NullPointerException e)
        {
        }
        cmbClassActionPerformed(null);
    }
    
   
    private void cmbClassActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
        try{
        cmbAcademicYear.setModel(new javax.swing.DefaultComboBoxModel(getYearList().toArray()));
        cmbExamName.setModel(new javax.swing.DefaultComboBoxModel(PropertiesFile.getExamManager().getExamNameList(NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim())).toArray()));
        }catch(NullPointerException e)
        {}
        
        showTableData();
        
        
    }   
    
    private void cmbAcademicYearActionPerformed(java.awt.event.ActionEvent evt) {
        /*try{
        String className = cmbClass.getSelectedItem().toString().trim();
        String academicYear = cmbAcademicYear.getSelectedItem().toString().trim();
        String examName = cmbExamName.getSelectedItem().toString().trim();
             
        studentBeanList.clear();
        studentBeanList.addAll(PropertiesFile.getExamRegistrationManager().getStudentForRegistration(className, academicYear, examName));
        tableStudentList.setModel(createTable(getTableData(studentBeanList),getTableHeader()));    
        }catch(NullPointerException e){
            studentBeanList.clear();
            tableStudentList.setModel(createTable(getTableData(studentBeanList),getTableHeader()));
        }
        */
        showTableData();
    }

    
    
    private void cmbExamNameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        cmbAcademicYearActionPerformed(evt);
    }
    
    
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        java.util.List<StudentBean> selectedStudentList = new java.util.ArrayList<>();
        
        for(int i=0;i<studentBeanList.size();i++)
        {
            if(tableStudentList.getModel().getValueAt(i, 0) == null || (Boolean)tableStudentList.getModel().getValueAt(i, 0) == false)
            {
                continue;
            }       
            selectedStudentList.add(studentBeanList.get(i));
        }
        if(selectedStudentList.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Select one or more Student", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String classId = NumberConverterUtil.convertWordToNumber(cmbClass.getSelectedItem().toString().trim().toLowerCase());
        String examYear = cmbAcademicYear.getSelectedItem().toString().trim();
        String examName = cmbExamName.getSelectedItem().toString().trim();
        
        String confirm = PropertiesFile.getExamRegistrationManager().registerStudentForExam(selectedStudentList, classId, examYear, examName);
        
        if(!confirm.equalsIgnoreCase("successful"))
        {
            JOptionPane.showMessageDialog(rootPane, confirm, "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(rootPane, "Successfully Save Exam Registration", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        this.setVisible(false);
        
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
    
    
    private Object[][] getTableData(java.util.List<StudentBean> studentBeanList)
    {
        if(studentBeanList == null || studentBeanList.isEmpty())
        {
        return null;
        }
        Object[][] obj = new Object[studentBeanList.size()][4];
        for(int i=0; i<studentBeanList.size();i++)
        {
            StudentBean studentBean = studentBeanList.get(i);
            obj[i][0] = false;
            obj[i][1] = studentBean.getStudentID();
            obj[i][2] = studentBean.getClassRoll();
            obj[i][3] = studentBean.getStudentName();
        }
        return obj;
    }
    
   
    List<StudentBean> studentBeanList = new ArrayList();    
   
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbAcademicYear;
    private javax.swing.JComboBox cmbClass;
    private javax.swing.JComboBox cmbExamName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelLists;
    private javax.swing.JTable tableStudentList;
    
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
                    for(int i=0; i<m.getRowCount(); i++) {
                        m.setValueAt(b, i, mci);
                    }
                    column.setHeaderValue(b?MyTestStatus.SELECTED:MyTestStatus.DESELECTED);
                    //header.repaint();
                }
            }
        });
    }
    
    
    @Override 
    public Component getTableCellRendererComponent(JTable tbl, Object val, boolean isS, boolean hasF, int row, int col) {
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
//class action performe





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
                    if(selected==deselected) return;
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

