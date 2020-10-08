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
public class CheckBoxes extends Applet implements ItemListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */String msg="";
     Checkbox C1,C2,C3,C4;
     CheckboxGroup C;
    public void init() {
        // TODO start asynchronous download of heavy resources
        C=new CheckboxGroup();
        C1=new Checkbox("Windows XP",C,true);
        C2=new Checkbox("Windows 7",C,false);
        C3=new Checkbox("Windows 10",C,false);
        C4=new Checkbox("MacOS",C,false);
        
        add(C1);
        add(C2);
        add(C3);
        add(C4);
        C1.addItemListener(this);
        C2.addItemListener(this);
        C3.addItemListener(this);
        C4.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        msg="Current State";
        msg=C.getSelectedCheckbox().getLabel();
        g.drawString(msg,6,100);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
