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
class test2{
int x,y;
void getdata()throws IOException
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter x: ");
    x=s.nextInt();
    System.out.println("Enter y: ");
    y=s.nextInt();
}
test2 addobj(test2 t2)throws IOException
{
    test2 t4=new test2();
    t4.x=x+t2.x;
    t4.y=y+t2.y;
    return t4;
}
void display()throws IOException
{
    System.out.println("The added values of x's and y's are "+x+" & "+y+" resp.");
}
}
public class Returning_Object {
    public static void main(String args[])throws IOException
    {
        test2 t1=new test2();
        test2 t2=new test2();
        test2 t3=new test2();
        System.out.println("Enter the values of t1: ");
        t1.getdata();
        System.out.println("Enter the values of t2: ");
        t2.getdata();
        t3=t1.addobj(t2);
        t3.display();
    }
}
