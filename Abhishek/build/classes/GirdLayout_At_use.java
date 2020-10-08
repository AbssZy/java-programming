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
public class GirdLayout_At_use extends Applet {
    static final int n=4;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        setLayout(new GridLayout(n,n));
        setFont(new Font("SansSerif",Font.BOLD,24));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int k=i*n+j;
                if(k>0)
                    add(new Button(" "+k));
            }
        }
    }

    // TODO overwrite start(), stop() and destroy() methods
}
