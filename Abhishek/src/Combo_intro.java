/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author abhis
 */
public class Combo_intro extends JApplet implements ItemListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    JLabel L;
    //ImageIcon I,F,G,J;
    public void init() {
        // TODO start asynchronous download of heavy resources
        Container C = getContentPane();
        C.setLayout(new FlowLayout());
        JComboBox J=new JComboBox();
        J.addItem("Italy");
        J.addItem("Germany");
        J.addItem("Japan");
        J.addItem("India");
        J.addItemListener(this);
        C.add(J);
        L=new JLabel(new ImageIcon("C:\\Users\\abhis\\Desktop\\Italy.gif"));
        C.add(L);
    }
    public void itemStateChanged(ItemEvent e)
    {
        String S=(String)e.getItem();
        ImageIcon Ii=new ImageIcon("C:\\Users\\abhis\\Desktop\\"+S+".gif");
        L.setIcon(Ii);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
