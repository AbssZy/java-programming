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
public class SelectionSort {
    public static void main(String args[])throws IOException
    {
        int n,i,temp,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        n=s.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the values of your array: ");
        for(i=0;i<n;i++)
        {
            x[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(x[j]<x[i])
                {
                    temp=x[j];
                    x[j]=x[i];
                    x[i]=temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for(i=0;i<n;i++)
        {
            System.out.println(x[i]);
        }

    }
    
}
