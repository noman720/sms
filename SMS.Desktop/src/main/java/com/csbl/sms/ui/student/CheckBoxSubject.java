
package main.java.com.csbl.sms.ui.student;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
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
import main.java.com.csbl.sms.bean.SubjectBean;
import main.java.com.csbl.sms.util.PropertiesFile;



public class CheckBoxSubject extends javax.swing.JDialog {
    JPanel panel = new JPanel();
    SubjectChoiceForm subjectChoiceForm;

    public CheckBoxSubject(java.awt.Frame parent, boolean modal, SubjectChoiceForm subjectChoiceForm) {
        super(parent, modal);
        this.subjectChoiceForm = subjectChoiceForm;
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int)d.getWidth();
        int h = (int)d.getHeight();
        setSize(550, 420);
        setLocation(w/2-275, h/2-210);
        //subjectBeanList.clear();
        //subjectBeanList.addAll(PropertiesFile.getSubjectManager().getSubjectList(classId));
        //tableSubjects.setModel(createTable(getTableData(subjectBeanList),getTableHeader()));
        showTableData();
    }

      
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        panelLists = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSubjects = new javax.swing.JTable();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Subject Selection Form");
        setResizable(false);

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelLists.setBackground(new java.awt.Color(240, 253, 249));
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subjects Of Class "+subjectChoiceForm.getClassIdForGlobal(), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24))); // NOI18N

        tableSubjects.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableSubjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Select", "Subject Code", "Subject Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSubjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSubjectsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSubjects);
        tableSubjects.getColumnModel().getColumn(0).setResizable(false);
        tableSubjects.getColumnModel().getColumn(1).setResizable(false);
        tableSubjects.getColumnModel().getColumn(2).setResizable(false);
        tableSubjects.getAccessibleContext().setAccessibleName("Lists Of Subjects");

        btnOk.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListsLayout = new javax.swing.GroupLayout(panelLists);
        panelLists.setLayout(panelListsLayout);
        panelListsLayout.setHorizontalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelLists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelLists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        panelBackground.getAccessibleContext().setAccessibleName("SubjectEntryForm");

        pack();
    }// </editor-fold>

private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {                                         
    String subjects = "";
    
    for(int i=0;i<subjectBeanList.size();i++)
        {
            if(tableSubjects.getModel().getValueAt(i, 0) == null || (Boolean)tableSubjects.getModel().getValueAt(i, 0) == false)
            {
                continue;
            }       
            subjects += tableSubjects.getModel().getValueAt(i, 1).toString()+", ";
        }
        if(subjects.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please Select one or more Subject", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        subjectChoiceForm.setSelectdeSubjects(subjects.substring(0, subjects.length()-2));
        subjectChoiceForm.refreshWindow(subjectChoiceForm);
        this.setVisible(false);
}                                       
 
private void tableSubjectsMouseClicked(java.awt.event.MouseEvent evt) {                                         
    
}

private void showTableData()
    {

        try{
        Object[] columnNames = {MyTestStatus.INDETERMINATE, "Subject Code", "Subject Name"};
        subjectBeanList.clear();
        subjectBeanList.addAll(PropertiesFile.getSubjectManager().getSubjectList(subjectChoiceForm.getClassIdForGlobal()));
        DefaultTableModel model = new DefaultTableModel(getTableData(subjectBeanList), columnNames)
        {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class};
            boolean[] canEdit = new boolean [] {
                true, false, false
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


        tableSubjects = new javax.swing.JTable(model) {
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

        tableSubjects.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jScrollPane1.setViewportView(tableSubjects);
        

        int modelColmunIndex = 0;
        TableCellRenderer renderer = new MyTestHeaderRenderer(tableSubjects.getTableHeader(), modelColmunIndex);
        tableSubjects.getColumnModel().getColumn(modelColmunIndex).setHeaderRenderer(renderer);
        model.addTableModelListener(new MyTestHeaderCheckBoxHandler(tableSubjects, modelColmunIndex));

        }catch(NullPointerException e){}
    }

   
    private Object[][] getTableData(java.util.List<SubjectBean> subjectBeanList)
    {
        if(subjectBeanList == null || subjectBeanList.isEmpty())
        {
        return null;
        }
        Object[][] obj = new Object[subjectBeanList.size()][3];
        for(int i=0; i<subjectBeanList.size();i++)
        {
            SubjectBean subjectBean = subjectBeanList.get(i);
            obj[i][0] = false;
            obj[i][1] = subjectBean.getSubjectCode();
            obj[i][2] = subjectBean.getSubjectName();
        }
        return obj;
    }
    

    List<SubjectBean> subjectBeanList = new ArrayList<SubjectBean>();
    

    // Variables declaration - do not modify
    private javax.swing.JButton btnOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelLists;
    private javax.swing.JTable tableSubjects;
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
                    column.setHeaderValue(b?MyTestStatus.SELECTED:MyTestStatus.DESELECTED);
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



