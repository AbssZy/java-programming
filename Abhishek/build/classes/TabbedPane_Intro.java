/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author abhis
 */
public class TabbedPane_Intro extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        ;
        JTabbedPane J=new JTabbedPane();
        J.addTab("Cities",new CP());
        J.addTab("Colours",new CLP());
        J.addTab("Flavour",new FP());
        getContentPane().add(J);
    }
    public class CP extends JPanel{
        public CP()
        {
            JButton B1=new JButton("Delhi");
            add(B1);
            JButton B2=new JButton("Mumbai");
            add(B2);
            JButton B3=new JButton("Kolkata");
            add(B3);
            JButton B4=new JButton("Chennai");
            add(B4);
        }
    }
    public class CLP extends JPanel
    {
        public CLP()
        {
            JCheckBox C1=new JCheckBox("Red");
            add(C1);
            JCheckBox C2=new JCheckBox("Blue");
            add(C2);
            JCheckBox C3=new JCheckBox("Green");
            add(C3);
        }
    }
    public class FP extends JPanel
    {
        public FP()
        {
            JComboBox CB=new JComboBox();
            CB.addItem("Vanilla");
            CB.addItem("Chocolate");
            CB.addItem("Strawberry");
            add(CB);
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}
