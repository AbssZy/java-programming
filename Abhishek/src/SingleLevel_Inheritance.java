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
class ABC
{
    private int A,B;
    void getdata()throws IOException
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A value: ");
        A=s.nextInt();
        System.out.println("Enter B value: ");
        B=s.nextInt();
    }
    int getA()throws IOException
    {
        return A;
    }
    int getB()throws IOException
    {
        return B;
    }
}
class XYZ extends ABC
{
    int C;
    
    void add()throws IOException
    {
       C=getA()+getB();
    }
    void display()throws IOException
    {
        System.out.println("The added value is: "+C);
    }
}
public class SingleLevel_Inheritance {
    public static void main(String args[])throws IOException
    {
        XYZ x=new XYZ();
        x.getdata();
        x.add();
        x.display();
    }
    
}
