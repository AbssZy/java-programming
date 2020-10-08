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
public class LinearSearch {
    public static void main(String agrs[])throws IOException
    {
        int n,i,m,k=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of your array ");
        n=s.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the values of your array: ");
        for(i=0;i<n;i++)
        {
            x[i]=s.nextInt();
        }
        System.out.println("Enter the number to be searched: ");
        m=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]==m)
            {
                k++;
                System.out.println("The positon of the number to be searched is "+(i+1));
            }    
        }
        if(k==0)
        {
            System.out.println("The number doesnt exist.");
        }

        
        
    }
}
