/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */
import java.io.IOException;
import java.util.Scanner;
import Pack1.Area;
import Pack2.Circumference;
public class Circle_1 {
    public static void main(String args[])throws IOException
    {
        int a;
        float b,c;
        Area A=new Area();
        Circumference C=new Circumference();
        System.out.println("Enter the radius of circle: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=A.area(a);
        c=C.circum(a);
        System.out.println("The area is "+b+" & the circumference is "+c);
    }
    
}
