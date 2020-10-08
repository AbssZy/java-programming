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
public class Face extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics g)
    {
        g.setColor(Color.ORANGE);
        g.fillOval(40,40,120,150);
        g.drawOval(57,75,30,20);
        g.drawOval(110,75,30,20);
        g.setColor(Color.DARK_GRAY);
        g.fillOval(68,81,10,10);
        g.fillOval(121,81,10,10);
        g.setColor(Color.lightGray);
        g.fillOval(85,100,30,30);
        g.setColor(Color.PINK);
        g.fillArc(60,125,80,40,0,-180);
        g.setColor(Color.lightGray);
        g.fillOval(25,92,15,30);
        g.fillOval(160,92,15,30);
    }
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
