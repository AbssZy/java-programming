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
public class Stud {
     private String name;
     private int rollno;
     public void getstdata()throws IOException
     {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter name: ");
         name=s.nextLine();
         System.out.println("Enter rollno: ");
         rollno=s.nextInt();
     }
     public void displaystdata()throws IOException
     {
         System.out.println("The name of the student is: "+name);
         System.out.println("The rollno of the student is: "+rollno);
     }
     public int getrollno()throws IOException
     {
         return rollno;
     }
     public String getname()throws IOException
     {
         return name;
     }
 
    
}
