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
public class TextFeild_Implentation extends Applet implements ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    TextField N,P;
    public void init() {
        // TODO start asynchronous download of heavy resources
        Label N1=new Label("Name: ",Label.RIGHT);
        Label P1=new Label("Password: ",Label.RIGHT);
        N=new TextField(12);
        P=new TextField(8);
        P.setEchoChar('*');
        add(N1);
        add(N);
        add(P1);     
        add(P);
        N.addActionListener(this);
        P.addActionListener(this);                
    }
    public void actionPerformed(ActionEvent e)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Name: "+N.getText(),6,120);
        g.drawString("Password: "+P.getText(),6,140);
        g.drawString("Selected text is: "+N.getSelectedText(),6,160);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
