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
 class Student{
     String name;
     int age,rollno;
     void getdata()throws IOException
     {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name");
        name=s.nextLine();
        System.out.println("Enter age");
        age=s.nextInt();
        System.out.println("Enter rollno");
        rollno=s.nextInt();
     }
     
     void display()throws IOException
     {
         System.out.println("The name of the student is "+name);
         System.out.println("The age of the student is "+age);
         System.out.println("The rollno of the student is "+rollno);
     }
 }
public class MyStudent {
    public static void main(String args[])throws IOException
    {
        Scanner m=new Scanner(System.in);
       // Student d=new Student();
        int i,n;
        System.out.println("Enter the number of students: ");
        n=m.nextInt();
        Student x[]=new Student [n];
        for(i=0;i<n;i++)
        {
            x[i]=new Student();
            System.out.println("Enter the details of "+(i+1)+" student." );
            x[i].getdata();
        }
        System.out.println("The details of the "+(i)+" students are: ");
        for(i=0;i<n;i++)
        {
            System.out.println("Student "+(i+1));
            x[i].display();
        }
    }
}
