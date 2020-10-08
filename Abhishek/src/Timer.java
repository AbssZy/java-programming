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
 class timer1{
 int hr,min;
 timer1()
 {
 }
 timer1(int a,int b)
 {
     hr=a;
     min=b;
 }
 timer1 add(timer1 t2)throws IOException
 {
     timer1 T4=new timer1();
     T4.min=min+t2.min;
     T4.hr=hr+t2.hr+T4.min/60;
     T4.min=T4.min%60;
     return T4;
 }
 void display()throws IOException
 {
     System.out.println("Min:Hr is "+min+":"+hr);
 }
 }
public class Timer {
    public static void main(String args[])throws IOException
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1st Hr and Min: ");
        a=s.nextInt();
        b=s.nextInt();
        timer1 T1=new timer1(a,b);
        System.out.println("Enter the 2st Hr and Min: ");
        a=s.nextInt();
        b=s.nextInt();
        timer1 T2=new timer1(a,b);
        timer1 T3=new timer1();
        T3=T1.add(T2);
        T3.display();
    }
    
}
