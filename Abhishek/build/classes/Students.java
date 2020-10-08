/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AbssZy
 */
 import java.io.IOException;
 import java.util.Scanner;
 class my_student{
     private String name;
     private int rollno;
     private int marks;
     private char grade;
     void getdata()throws IOException
     {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the name: ");
         name=s.nextLine();
         System.out.println("Enter the roll no: ");
         rollno=s.nextInt();
         System.out.println("Enter the marks: ");
         marks=s.nextInt();    
                          {
                     if(marks>=60)
                     {
                         grade='A';
                     }
                     else if(marks>=50 && 60>marks)
                     {
                         grade='B';
                     }
                     else if(marks>=40 && 50>marks)
                     {
                         grade='C';
                     }
                     else
                     {
                         grade='F';
                     }
                 }
     }
     int topper()throws IOException
     {
         return marks;         
         
     }
     void display()throws IOException
     {
         System.out.println("The name of the student is "+name);
         System.out.println("The rollno of the student is "+rollno);
         System.out.println("The marks of the student is "+marks);
         System.out.println("The grade of the student is "+grade);
     }
     int search()throws IOException
     {
         return rollno;
     }
     
 }

public class Students {
    public static void main(String args[])throws IOException
    {
        Scanner s=new Scanner(System.in);
        my_student d=new my_student();
        int i,x,n,max=0,r,k=0,z=0,u;
        System.out.println("Enter the number of students: ");
        n=s.nextInt();
        my_student y[]=new my_student [n];
        for(i=0;i<n;i++)
        {
            y[i]=new my_student();
            System.out.println("Enter the details of student "+(i+1));
            y[i].getdata();
        }
        do
        {
        System.out.println("Press 1 to display topper: ");
        System.out.println("Press 2 to display Student database on Rollno: ");
        x=s.nextInt();
        
        switch(x)
        {
            case 1:
                for(i=0;i<n;i++)
                {
                    if(y[i].topper()>max)
                    {
                        max=y[i].topper();
                        z=i;
                    }
                    
                }
                y[z].display();
                break;
            case 2:
                System.out.println("Enter the rollno of the student to be searched: ");
                r=s.nextInt();
                d.search();
                for(i=0;i<n;i++)
                {
                    if(y[i].search()==r)
                    {
                        k++;
                        y[i].display();
                    }
                }
                if(k==0)
                {
                    System.out.println("The rollno doesnt exist: ");
                }
                break;
            default:
                System.out.println("Wrong input");
                break;
                
        }
        System.out.println("Enter 1 to continue or 0 to exit: ");
            u=s.nextInt();
        }
        while(u!=0);
        
        
    }
}
