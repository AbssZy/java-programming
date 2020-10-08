/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.io.IOException;

/**
 *
 * @author abhis
 */
public class Circles_Solved extends Applet {
    TextField T1=new TextField(8);
    public void paint(Graphics g)
    {
        int i,j,k=0,a=30,b=30,x;
        g.drawString("Enter an odd number: ",10,20);
        x=Integer.parseInt(T1.getText());
        if(x%2!=0)
        {
        for(i=0;i<x;i++)
        {            
            for(j=0;j<x;j++)
            {
                k++;
                if(k%2!=0)
                {
                    g.drawOval(a,b,50,50);
                }
                else
                {
                    g.fillOval(a,b,50,50);
                }
                a=a+60;                
            }
            a=30;
            b=b+60;                
        }
        }
        else
        {
            g.drawString("Wrong Input",30,50);
        }
    }
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        add(T1);
        // TODO start asynchronous download of heavy resources
    }
    public boolean action(Event e,Object obj)
    {
        repaint();
        return true;
    }
    // TODO overwrite start(), stop() and destroy() methods
}
