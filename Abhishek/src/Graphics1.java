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
public class Graphics1 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics g){
    g.drawLine(10,10,50,50);
    g.drawRect(10,60,40,30);
    g.fillRect(60,10,30,80);
    g.drawRoundRect(10,100,80,50,10,10);
    g.fillRoundRect(20,110,60,30,5,5);
    g.drawLine(100,10,230,140);
    g.drawLine(100,140,230,10);
    g.drawOval(200,200,200,120);
    g.setColor(Color.gray);
    g.fillOval(250,210,100,100);
    }
    public void init() {
        // TODO start asynchronous download of heavy resources
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
