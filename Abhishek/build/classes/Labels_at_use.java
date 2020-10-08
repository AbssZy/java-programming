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
public class Labels_at_use extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        Label L1=new Label("One");
        Label L2=new Label("Two");
        Label L3=new Label("Three");
        add(L1);
        add(L2);
        add(L3);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
