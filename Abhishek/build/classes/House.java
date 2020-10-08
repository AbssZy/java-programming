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
public class House extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics g)
    {
        g.drawLine(321,125,236,224);
        g.drawLine(321,125,391,224);
        g.drawRect(236,224,155,147);
        g.drawRect(257,249,33,31);
        g.drawRect(330,249,33,31);
        g.drawRect(291,328,31,45);
        g.drawOval(303,180,33,35);
    }
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
