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
public class Listing_123 extends Applet implements ActionListener{


    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    List A,B;
    String msg="";
    public void init() {
        // TODO start asynchronous download of heavy resources
        A=new List(4,true);
        B=new List(4,false);
        A.add("Windows XP");
        A.add("MacOS");
        A.add("Linux");
        A.add("Ubuntu");
        B.add("Chrome 1.0");
        B.add("Bing");
        B.add("Internet Explorer");
        B.add("Mozilla FireFox");
        B.add("Chrome 2.0");
        B.add("Chrome 3.0");
        B.select(2);
        add(A);
        add(B);
        A.addActionListener(this);
        B.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        int x[];
        msg="Current OS: ";
        x=A.getSelectedIndexes();
        for(int i=0;i<x.length;i++)
        { 
            msg+=A.getItem(x[i])+", ";
        }
        g.drawString(msg,6,120);
        msg="Current Browser: ";
        msg+=B.getSelectedItem();
        g.drawString(msg,6,140);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
