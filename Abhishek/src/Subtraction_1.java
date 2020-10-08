/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author abhis
 */
public class Subtraction_1 extends Applet {

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
      
    }
    public void paint(Graphics g)
    {
        int x=0,y=0,z=0;
        String S3;
        g.drawString("Enter the numbers to be subtracted: ",10,100);
        try
        {
            x=Integer.parseInt(T1.getText());
            y=Integer.parseInt(T2.getText());
        }
        catch(Exception E){}
            z=x-y;
            S3=String.valueOf(z);
            g.drawString("The difference is: ",10,150);
            g.drawString(S3,110,150);
    }
    public boolean action(Event Ex,Object obj)
    {
        repaint();
        return true;
    }

    // TODO overwrite start(), stop() and destroy() methods
}
