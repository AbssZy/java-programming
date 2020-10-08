/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author abhis
 */
public class CardLayout_at_use extends Applet implements ActionListener, MouseListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Checkbox W1,W2,O1,O2;
    Panel P;
    CardLayout C;
    Button B1,B2;
    public void init() {
        // TODO start asynchronous download of heavy resources
        B1=new Button("Windows");
        B2=new Button("Others");
        add(B1);
        add(B2);
        C=new CardLayout();
        P=new Panel();
        P.setLayout(C);
        W1=new Checkbox("Windows 98",null,true);
        W2=new Checkbox("Windows 10");
        O1=new Checkbox("Solaris");
        O2=new Checkbox("MacOS");
        Panel P1=new Panel();
        P1.add(W1);
        P1.add(W2);
        Panel P2=new Panel();
        P2.add(O1);
        P2.add(O2);
        P.add(P1,"Windows");
        P.add(P2,"Others");
        add(P);
        B1.addActionListener(this);
        B2.addActionListener(this);
        addMouseListener(this);
    }
    public void mousePressed(MouseEvent e)
    {
    //    C.next(P);
    }
    public void mouseExited(MouseEvent e)
    {}
    public void mouseEntered(MouseEvent e)
    {}
    public void mouseClicked(MouseEvent e)
    {}
    public void mouseReleased(MouseEvent e)
    {}
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==B1)
        {
            C.show(P,"Windows");
        }
        if(e.getSource()==B2)
        {
            C.show(P,"Others");
        }
    }

    // TODO overwrite start(), stop() and destroy() methods
}
