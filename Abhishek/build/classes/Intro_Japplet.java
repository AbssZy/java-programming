/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author abhis
 */
public class Intro_Japplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        Container C= getContentPane();
        ImageIcon I=new ImageIcon("C:\\Users\\abhis\\Desktop\\India.gif");
        JLabel J=new JLabel("India",I,JLabel.CENTER);
        C.add(J);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
