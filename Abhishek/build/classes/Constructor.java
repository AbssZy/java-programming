/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */import java.io.IOException;
 import java.util.Scanner;
class test3{
int x,y;
test3()
{
    x=10;
    y=20;
}
test3(int u,int v)
{
    x=u;
    y=v;
}
test3(test3 a)
{
    x=a.x;
    y=a.y;
}
void display()throws IOException
{
    System.out.println("The 2 values are: "+x+" & "+y);
}
}
public class Constructor {
    public static void main(String args[])throws IOException
    {
        test3 T1=new test3();
        int u,v;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        u=s.nextInt();
        System.out.println("Enter 2nd value: ");
        v=s.nextInt();
        test3 T2= new test3(u,v);
        test3 T3= new test3(T2);
        T1.display();
        T2.display();
        T3.display();
        
    }
}
