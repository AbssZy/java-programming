/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AbssZy
 */import java.io.IOException;
 import java.util.Scanner;
class test{
    private int x,y;
    public int a;
    void getdata()throws IOException
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values of two numbers: ");
        x=s.nextInt();
        y=s.nextInt();
    }
    private int calculate()throws IOException
    {
        if(x>y)
        {
            return 1;
        }
        else if(x==y)
        {
            return 0;
        }
        else
        {
            return 2;
        }
        
    }
    void display()throws IOException
    {
        a=calculate();
        if(a==1)
        {
            System.out.println(x+" is the greater number");
        }
        else if(a==0)
        {
            System.out.println("Both numbers are equal");
        }
        else if(a==2)
        {
            System.out.println(y+" is the greater number");
        }
        
    }
 }
public class Comparision_2 {
    public static void main(String args[])throws IOException
    {
        test d=new test();
        d.getdata();
        d.display();
    }
}
