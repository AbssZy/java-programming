/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AbssZy
 */
import java.io.IOException;
import java.util.Scanner;
interface Area1
{
    final static float pi=3.14F;
    void calculate(float x,float y);
    void display();
    
}
class Circle implements Area1
{
    float z;
    public void calculate(float x,float y)
    {
        z=pi*x*x;
    }
    public void display()
    {
        System.out.println("The area of the circle is: "+z);
    }
}
class Rectangle implements Area1
{
    float z;
    public void calculate(float x,float y)
    {
        z=x*y;
    }
    public void display()
    {
        System.out.println("The area of the rectangle is: "+z);
    }
}
public class Interface_1 {
    public static void main(String agrs[])throws IOException
    {
        int c;
        float a,b;
        Scanner s=new Scanner(System.in);
        Rectangle R=new Rectangle();
        Circle C=new Circle();
        Area1 area;
        do{
        System.out.println("Press 1 to find area of circle:");
        System.out.println("Press 2 to find area of rectangle: ");
        int x;
        x=s.nextInt();
        switch(x)
        {
            case 1:
        area= C;
        System.out.println("Enter the radius of circle:");
        a=s.nextFloat();
        area.calculate(a,0);
        area.display();
        break;
            case 2:
        area= R;
        System.out.println("Enter the length of rectangle: ");
        a=s.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        b=s.nextFloat();
        area.calculate(a,b);
        area.display();
        break;
        }
        System.out.println("Press 1 to continue or 0 to exit: ");
        c=s.nextInt();
        }
        while(c!=0);
        
    }
}
