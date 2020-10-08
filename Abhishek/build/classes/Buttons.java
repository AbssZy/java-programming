/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author abhis
 */
public class Buttons extends Applet implements ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */String msg="";
     Button B1,B2,B3;
    public void init() {
        // TODO start asynchronous download of heavy resources
        B1=new Button("Yes");
        B2=new Button("No");
        B3=new Button("Undecided");
        add(B1);
        add(B2);
        add(B3);
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()==B1)
        {
            msg="You pressed Yes";
        }
        else if(e.getSource()==B2)
        {
            msg="You pressed No";
        }
        else
        {
            msg="You havent undecided.";
        }
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,6,100);
    }
   

    // TODO overwrite start(), stop() and destroy() methods
}
