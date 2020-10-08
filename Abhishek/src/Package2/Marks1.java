/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Package2;

/**
 *
 * @author abhis
 */
import java.io.IOException;
import java.util.Scanner;
import Package2.Stud;
public class Marks1 extends Stud {
     private int m1,m2,m3,m4,m5;
     public void getmarks()throws IOException
     {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the marks of subject English: ");
         m1=s.nextInt();
         System.out.println("Enter the marks of subject Maths: ");
         m2=s.nextInt();
         System.out.println("Enter the marks of subject Physics: ");
         m3=s.nextInt();
         System.out.println("Enter the marks of subject Chemistry: ");
         m4=s.nextInt();
         System.out.println("Enter the marks of subject Softskills: ");
         m5=s.nextInt();
     }
     void displaymarks()throws IOException
     {
         System.out.println("The marks in English subject are: "+m1);
         System.out.println("The marks in Maths subject are: "+m2);
         System.out.println("The marks in Physics subject are: "+m3);
         System.out.println("The marks in Chemistry subject are: "+m4);
         System.out.println("The marks in Softskills subject are: "+m5);
     }
     int getm1()throws IOException
     {
         return m1;
     }
     int getm2()throws IOException
     {
         return m2;
     }
     int getm3()throws IOException
     {
         return m3;
     }
     int getm4()throws IOException
     {
         return m4;
     }
     int getm5()throws IOException
     {
         return m5;
     }
     
     
 }

