
package main.java.com.csbl.sms.util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class PopUpMenu implements ActionListener {
    
    JPopupMenu cutpasteMenu = new JPopupMenu();
    JMenuItem cutMenuItem = new JMenuItem("Cut");
    JMenuItem copyMenuItem = new JMenuItem("Copy");
    JMenuItem pasteMenuItem = new JMenuItem("Paste");
    
    String fieldName;
    
    public JPopupMenu showPopup(String fieldName)
    {
        
        this.fieldName = fieldName;
        
        cutMenuItem.addActionListener(this);
        copyMenuItem.addActionListener(this);
        pasteMenuItem.addActionListener(this);
        
        cutpasteMenu.add(cutMenuItem);
        cutpasteMenu.add(copyMenuItem);
        cutpasteMenu.add(pasteMenuItem);
        
        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        
        
        return cutpasteMenu;
              
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        if(fieldName.equalsIgnoreCase("textField")){
            if (source == cutMenuItem) {
                JTextField jte = (JTextField)cutpasteMenu.getInvoker();
                jte.cut();
            }
            if (source == copyMenuItem) {
                JTextField jte = (JTextField)cutpasteMenu.getInvoker();
                jte.copy();
            }
            if (source == pasteMenuItem) {
                JTextField jte = (JTextField)cutpasteMenu.getInvoker();
                jte.paste();
            }
        }
        
        if(fieldName.equalsIgnoreCase("textArea"))
        {
            if (source == cutMenuItem) {
                JTextArea jte = (JTextArea)cutpasteMenu.getInvoker();
                jte.cut();
            }
            if (source == copyMenuItem) {
                JTextArea jte = (JTextArea)cutpasteMenu.getInvoker();
                jte.copy();
            }
            if (source == pasteMenuItem) {
                JTextArea jte = (JTextArea)cutpasteMenu.getInvoker();
                jte.paste();
            }
        }
    }
    
    
}
