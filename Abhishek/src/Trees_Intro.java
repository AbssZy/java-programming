/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;
/**
 *
 * @author abhis
 */
public class Trees_Intro extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    JTree Z;
    JTextField Jt; 
    public void init() {
        // TODO start asynchronous download of heavy resources
        Container C= getContentPane();
        C.setLayout(new BorderLayout());
        DefaultMutableTreeNode T=new DefaultMutableTreeNode("Options");
        DefaultMutableTreeNode a=new DefaultMutableTreeNode("A");
        T.add(a);
        DefaultMutableTreeNode a1=new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2=new DefaultMutableTreeNode("A2");
        a.add(a2);
        DefaultMutableTreeNode b=new DefaultMutableTreeNode("B");
        T.add(b);
        DefaultMutableTreeNode b1=new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2=new DefaultMutableTreeNode("B2");
        b.add(b2);
        DefaultMutableTreeNode b3=new DefaultMutableTreeNode("B3");
        b.add(b3);
        Z=new JTree(T);
        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane J=new JScrollPane(Z,v,h);
        C.add(J,BorderLayout.WEST);
        Jt=new JTextField("",20);
        C.add(Jt,BorderLayout.CENTER);
        Z.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
        {
            M(e);
        }
        });
       
    }
     void M(MouseEvent e)
        {
            TreePath T=Z.getPathForLocation(e.getX(),e.getY());
            if(T!=null)
            {
                Jt.setText(T.toString());
            }
            else
            {
                Jt.setText("");
            }
        }
    // TODO overwrite start(), stop() and destroy() methods
}
