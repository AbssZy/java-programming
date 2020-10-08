/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */
import java.util.Scanner;
import java.io.IOException;
public class Arrays {
    public static void main(String agrs[])throws IOException
    {
        int n,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        n=s.nextInt();
        int x[]= new int[n];
        System.out.println("Enter the values of String: ");
        for(i=0;i<n;i++)
        {
            x[i]=s.nextInt();
        }
        System.out.println("The values is correct order are: ");
        for(i=0;i<n;i++)
        {
            System.out.println(x[i]);
        }
        System.out.println("The values in reverse order are:");
        for(i=n-1;i>=0;i--)
        {
            System.out.println(x[i]);
        }
        
        
        
    }
    
}
