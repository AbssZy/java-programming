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
public class ScrollBar_123 extends Applet implements AdjustmentListener, MouseMotionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Scrollbar S1;//,S2;
    int C;
    float F;
    String m,msg="";
    public void init() {
        // TODO start asynchronous download of heavy resources
       // int width=Integer.parseInt(getParameter("width"));
        //int height=Integer.parseInt(getParameter("height"));
        S1=new Scrollbar(Scrollbar.VERTICAL,0,1,-40,150);
        //S2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,-40,302);
        add(S1);
        //add(S2);
        S1.addAdjustmentListener(this);
        //S2.addAdjustmentListener(this);
        addMouseMotionListener(this);
        //int n=1;       
        //m=S1.getValue();
        
        //S1.setValue(f);
        //S2.setValue(c);      
    }
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        repaint();
    }
    public void mouseDragged(MouseEvent m)
    {     
    }
    public void mouseMoved(MouseEvent m)
    {
    }
    public void paint(Graphics g)
    {
        C=S1.getValue();
        F=(1.8F*C)+32;
        //msg="Celsius: "+S2.getValue()+" ";
        msg="Celsius: "+String.valueOf(C);
        msg+=" Farenheit: "+String.valueOf(F);//S1.getValue();
        g.drawString(msg,6,120);
        //g.drawString("*",100,S1.getValue());
    }

    // TODO overwrite start(), stop() and destroy() methods
}
