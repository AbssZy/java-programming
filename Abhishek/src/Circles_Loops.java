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
public class Circles_Loops extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics g)
    {
        for(int i=10;i<=250;)
        {
            g.drawOval(100,i,50,50);
            i=i+120;
        }
        for(int j=70;j<=190;)
        {
            g.fillOval(100,j,50,50);
            j=j+120;
        }
    }
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
