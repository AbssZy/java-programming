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
public class Polygon extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     * 
     */
    public void paint(Graphics g)
    {
    int x[]={20,170,80,20};
     int y[]={10,40,140,10};
     int np=x.length;
     g.drawPolygon(x,y,np);
             }
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
