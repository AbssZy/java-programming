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
public class Hello extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */public void paint(Graphics g)
     {
         g.drawString("Hey Boy",500,500);
     }
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
