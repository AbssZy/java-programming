/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */
import java.io.DataInputStream;
import java.io.IOException;
public class Area {
    public static void main (String args[])throws IOException
    {
        float r,area,cir;
        DataInputStream m=new DataInputStream(System.in);
        System.out.println("Enter the Radius of Circle to find the area and circumference ");
        r=Float.parseFloat(m.readLine());
        area= 3.14F*r*r;
        cir=2*3.14F*r;
        System.out.println("The area and circumference of the circle with radius "+r+" are "
        +area+" and "+cir+" respectively.");
    }
}
