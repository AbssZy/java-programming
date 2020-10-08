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
public class ChoiceLists extends Applet implements ItemListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Choice A,B;
    String msg="";
    public void init() {
        // TODO start asynchronous download of heavy resources
        A=new Choice();
        B=new Choice();
        A.add("Windows XP");
        A.add("Linux");
        A.add("MacOS");
        A.add("Ubuntu");
        B.add("Chrome 1.0");
        B.add("Mozilla Firefox");
        B.add("Bing");
        B.add("Chrome 2.0");
        B.select("Chrome 2.0");
        add(A);
        add(B);
        A.addItemListener(this);
        B.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        repaint();  
    }
    public void paint(Graphics g)
    {
        msg="Current OS: ";
        msg+=A.getSelectedItem();
        g.drawString(msg,6,120);
        msg="Current Browser: ";
        msg+=B.getSelectedItem();
        g.drawString(msg,6,140);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
