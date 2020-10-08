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
public class Line_Graph extends Applet {
int x1[]={0,60,120,180,240,300,360,420};
int y1[]={400,280,120,140,60,60,100,220};
public void paint(Graphics g)
{
    g.drawPolygon(x1,y1,8);
}
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
