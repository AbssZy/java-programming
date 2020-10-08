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
public class Circles_create_problems extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics g)
    {
       /* int i,j=100,k=0,a;
        
        for(i=1;i<=3;i++)
        {
            if(k%3!=0)
            {                
                if(i%2!=0)
                {
                    g.drawOval(j,10,50,50);
                    j=j+60;
                }
                else
                {
                    g.fillOval(j,10,50,50);
                    j=j+60;
                }
            }
            else if(k%3==0)
            {
                j=100;
                a=10;
                if(i%2==1)
                {   
                    g.drawOval(j,a,50,50);
                    j=j+60;
                    a=a+60;
                }
                else if(i%2==0)
                {                   
                    g.fillOval(j,a,50,50);
                    j=j+60;
                    a=a+60;
                }
            }
        k++;  
        }*/
        g.drawOval(0,0,50,50);  
    }
        
        
    
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
