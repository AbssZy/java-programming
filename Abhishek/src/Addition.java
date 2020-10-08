/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.*;
import java.awt.*;
/**
 *
 * @author abhis
 */
public class Addition extends Applet {
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    TextField T1=new TextField(8);
    TextField T2=new TextField(8);
    public void init() {
        // TODO start asynchronous download of heavy resources
        
        add(T1);
        add(T2);
        T1.setText("0");
        T2.setText("0");
    }
    public void paint(Graphics g)
    {
        int x=0,y=0,z=0;
        String S1,S2,S3;
        g.drawString("Enter the numbers to be added",10,100);
        try
        {
            S1=T1.getText();
            x=Integer.parseInt(S1);
            S2=T2.getText();
            y=Integer.parseInt(S2);
        }
        catch(Exception E){}
        z=x+y;
        S3=String.valueOf(z);
        g.drawString("The sum is: ",10,150);
        g.drawString(S3,78,150);
    }
    public boolean action(Event Ev,Object obj)
    {
        repaint();
        return true;
    }

    // TODO overwrite start(), stop() and destroy() methods
}
