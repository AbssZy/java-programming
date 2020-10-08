/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author abhis
 */
public class Insets_at_use extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.red);
        setLayout(new BorderLayout());
        Button B1=new Button("This is across the top.");
        add(B1,BorderLayout.NORTH);
        Label L1=new Label("The footer message might go here. ");
        add(L1,BorderLayout.SOUTH);
        Button B2=new Button("Right");
        Button B3=new Button("Left");
        add(B2,BorderLayout.EAST);
        add(B3,BorderLayout.WEST);
        String msg = "The reasonable man adapts "
                + "himself to the world;\n"
                + "the unreasonable one persists in "
                + "trying to adapt the world to himself.\n"
                + "Therefore all progress depends "
                + "on the unreasonable man.\n\n"
                + "        - George Bernard Shaw\n\n";
        TextArea A=new TextArea(msg);
        add(A,BorderLayout.CENTER);
    }
    public Insets getInsets()
    {
        return new Insets(10,10,10,10);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
