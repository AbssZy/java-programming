/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author abhis
 */
public class RadioB_Intro extends JApplet implements ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    JTextField T;
    public void init() {
        // TODO start asynchronous download of heavy resources
        Container C=getContentPane();
        C.setLayout(new FlowLayout());
        
        JRadioButton B1=new JRadioButton("A");
        B1.addActionListener(this);
        C.add(B1);
        
        JRadioButton B2=new JRadioButton("B");
        B2.addActionListener(this);
        C.add(B2);
        
        JRadioButton B3=new JRadioButton("C");
        B3.addActionListener(this);
        C.add(B3);
        
        ButtonGroup B=new ButtonGroup();
        B.add(B1);
        B.add(B2);
        B.add(B3);
        
        T=new JTextField(6);
        C.add(T);
    }
    public void actionPerformed(ActionEvent e)
    {
        T.setText(e.getActionCommand());
    }

    // TODO overwrite start(), stop() and destroy() methods
}
