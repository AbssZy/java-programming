/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhi
 */
import java.io.IOException;
import java.util.Scanner;
class test1{
public int x,y;
void getdata()throws IOException
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value of x: ");
    x=s.nextInt();
    System.out.println("Enter the value of y: ");
    y=s.nextInt();
}
void addobj(test1 t1,test1 t2)throws IOException
{
    x=t1.x+t2.x;
    y=t1.y+t2.y;
}
void display()throws IOException
{
    System.out.println("The value of added x's and addedd y's is: "+x+" & "+y+" resp.");
}
}
public class Object_Add {
    public static void main(String args[])throws IOException
    {
        test1 t1=new test1();
        test1 t2=new test1();
        test1 t3=new test1();
        System.out.println("Enter the values of x1 and y1");
        t1.getdata();
        System.out.println("Enter the values of x2 and y2");
        t2.getdata();
        t3.addobj(t1,t2);
        t3.display();
    }
}
