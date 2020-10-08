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
public class Button_intro extends JApplet implements ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    JTextField A;
    public void init() {
        // TODO start asynchronous download of heavy resources
        Container C = getContentPane();
        C.setLayout(new FlowLayout());
        
        ImageIcon F=new ImageIcon("C:\\Users\\abhis\\Desktop\\Italy.gif");
        JButton B1=new JButton(F);
        B1.setActionCommand("Italy");
        B1.addActionListener(this);
        C.add(B1);
        
        ImageIcon G=new ImageIcon("C:\\Users\\abhis\\Desktop\\Germany.gif");
        JButton B2=new JButton(G);
        B2.setActionCommand("Germany");
        B2.addActionListener(this);
        C.add(B2);
        
        ImageIcon I=new ImageIcon("C:\\Users\\abhis\\Desktop\\India.gif");
        JButton B3=new JButton(I);
        B3.setActionCommand("India");
        B3.addActionListener(this);
        C.add(B3);
        
        ImageIcon J=new ImageIcon("C:\\Users\\abhis\\Desktop\\Japan.gif");
        JButton B4=new JButton(J);
        B4.setActionCommand("Japan");
        B4.addActionListener(this);
        C.add(B4);
        
        A=new JTextField(15);
        C.add(A);
    }
    public void actionPerformed(ActionEvent e)
    {
        A.setText(e.getActionCommand());
    }

    // TODO overwrite start(), stop() and destroy() methods
}
