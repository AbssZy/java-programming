/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 * 
 */
 import java.io.IOException;
 import java.util.Scanner;
 class dist{
 int feet,inches;
 void getdata()throws IOException
 {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter feet: ");
     feet=s.nextInt();
     System.out.println("Enter inches");
     inches=s.nextInt();
 }
 dist add(dist d2)throws IOException
 {
     dist d4=new dist();
     d4.inches=inches+d2.inches;
     d4.feet=feet+d2.feet+d4.inches/12;
     d4.inches=d4.inches%12;
     return d4;
 }
 void display()throws IOException
 {
     System.out.println("The added values of feet and inches are "+feet+" & "+inches+" resp.");
 }
 }
public class Distance {
    public static void main(String args[])throws IOException
    {
        dist d1=new dist();
        dist d2=new dist();
        dist d3=new dist();
        d1.getdata();
        d2.getdata();
        d3=d1.add(d2);
        d3.display();
    }
    
}
