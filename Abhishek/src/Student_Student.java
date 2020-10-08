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
 import Package2.*;
public class Student_Student {
    public static void main(String args[])throws IOException
    {                
        Scanner s=new Scanner(System.in);
        int i,u,a,k=0,y,c,max=0,z=0,n;
        String b;
        System.out.println("Enter the number of Students: ");
        n=s.nextInt();
        Results1 A[]=new Results1[n];
        
        do{
            System.out.println("Press 1 to enter the details of all students: ");
            System.out.println("Press 2 to search the details of any student based on rollno: ");
            System.out.println("Press 3 to search the details of any student based on name: ");
            System.out.println("Press 4 to search the topper: ");
            c=s.nextInt();
            switch(c)
            {
            case 1:
            for(i=0;i<n;i++)
        {
        System.out.println("Enter the details of Student number "+(i+1));
        Results1 R=new Results1();
        
        R.getstdata();
        R.getmarks();
        R.calculate();
        A[i]=R;
        }
        break;
            case 2:
        System.out.println("Enter the rollno to be searched: ");
        a=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(A[i].getrollno()==a)
            {
                k++;
                A[i].display();
                A[i].displaysportsmarks();
            }
        }
        if(k==0)
        {
            System.out.println("The number doesnt exist.");
        }
        break;
            case 3:
        System.out.println("Enter the name to be searched: ");
        b=s.next();
        for(i=0;i<n;i++)
        {
            if(b.equals(A[i].getname()))
            {
                k++;
                A[i].display();
                A[i].displaysportsmarks();
            }
        }
        if(k==0)
        {
            System.out.println("The name doesnt exist.");
        }
        break;
            case 4:
                for(i=0;i<n;i++)
                {
                    if(A[i].topper()>max)
                    {
                        max=A[i].topper();
                        z=i;
                    }
                    
                }
                A[z].display();
                A[z].displaysportsmarks();
                System.out.println("Is the topper");
                
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
        System.out.println("Press 1 to Continue or 0 to exit");
        u=s.nextInt();
        }
        while(u!=0);
                
        
    }
}