
package main.java.com.csbl.sms.ui.payment;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import main.java.com.csbl.sms.bean.PrepareBillBean;
import main.java.com.csbl.sms.util.PropertiesFile;



public class CheckBoxBill extends javax.swing.JDialog {
    JPanel panel = new JPanel();
    PrepareBillForm prepareBillForm;

    public CheckBoxBill(java.awt.Frame parent, boolean modal, PrepareBillForm prepareBillForm, PrepareBillBean prepareBillBean) {
        super(parent, modal);
        this.prepareBillForm = prepareBillForm;
        initComponents();
        setSize(600, 420);
        setLocationRelativeTo(null);
        billList.clear();
        billList = PropertiesFile.getPaymentManger().getAmountDescription(prepareBillBean);
        showTableData();
    }

      
    
    @SuppressWarnings("unchecked")

// <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        panelLists = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBillList = new javax.swing.JTable();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bill Prepare Form");
        setResizable(false);

        panelBackground.setBackground(new java.awt.Color(240, 253, 249));

        panelLists.setBackground(new java.awt.Color(240, 253, 249));
        panelLists.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Of Bill Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24))); // NOI18N

        tableBillList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableBillList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "Select", "Bill Description", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Double.class
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
        tableBillList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBillListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBillList);
        tableBillList.getColumnModel().getColumn(0).setResizable(false);
        tableBillList.getColumnModel().getColumn(1).setResizable(false);
        tableBillList.getColumnModel().getColumn(2).setResizable(false);
        tableBillList.getAccessibleContext().setAccessibleName("Lists Of Products");

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
                .addGap(208, 208, 208))
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelLists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
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
    }// </editor-fold>

private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {                                         
    List<PrepareBillBean> selectedBillList = new ArrayList<>();
    int i = 0;
    for(PrepareBillBean pbb : billList)
    {
        if(tableBillList.getModel().getValueAt(i, 0) == null || (Boolean)tableBillList.getModel().getValueAt(i, 0) == false)
        {
            i++;
            continue;
        }       
        selectedBillList.add(pbb);
        i++;
    }
    if(selectedBillList.isEmpty())
    {
        JOptionPane.showMessageDialog(null, "Please Select one or more Month", "Alert", JOptionPane.ERROR_MESSAGE);
        return;
    }
    prepareBillForm.setPrepareBillList(selectedBillList);
    this.setVisible(false);
    prepareBillForm.refreshWindow(prepareBillForm);
    
}                                       
 
private void tableBillListMouseClicked(java.awt.event.MouseEvent evt) {                                         
    
}

private void showTableData()
    {

        try{
        Object[] columnNames = {MyTestStatus.INDETERMINATE, "Bill Description", "Amount"};
        
        DefaultTableModel model = new DefaultTableModel(getTableData(billList), columnNames)
        {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Double.class};
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


        tableBillList = new javax.swing.JTable(model) {
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

        tableBillList.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jScrollPane1.setViewportView(tableBillList);
        

        int modelColmunIndex = 0;
        TableCellRenderer renderer = new MyTestHeaderRenderer(tableBillList.getTableHeader(), modelColmunIndex);
        tableBillList.getColumnModel().getColumn(modelColmunIndex).setHeaderRenderer(renderer);
        model.addTableModelListener(new MyTestHeaderCheckBoxHandler(tableBillList, modelColmunIndex));

        }catch(NullPointerException e){}
    }

   
    private Object[][] getTableData(java.util.List<PrepareBillBean> billBeanList)
    {
        if(billBeanList == null || billBeanList.isEmpty())
        {
        return null;
        }
        Object[][] obj = new Object[billBeanList.size()][3];
        for(int i=0; i<billBeanList.size();i++)
        {
            obj[i][0] = false;
            obj[i][1] = billBeanList.get(i).getBillDescription();
            obj[i][2] = billBeanList.get(i).getBillAmount();
        }
        return obj;
    }
    

    List<PrepareBillBean> billList = new ArrayList<>();
    

    // Variables declaration - do not modify
    private javax.swing.JButton btnOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelLists;
    private javax.swing.JTable tableBillList;
    // End of variables declaration

}




