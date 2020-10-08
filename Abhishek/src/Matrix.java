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
 
public class Matrix {
    public static void main(String args[])throws IOException
    {
        int i,n,m,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of your matrix respectively: ");
        n=s.nextInt();
        m=s.nextInt();
        int x[][]=new int[n][m];
        System.out.println("Enter the values of your ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                x[i][j]=s.nextInt();
            }
        }
        System.out.println("Your matrix is: ");
        for(i=0;i<n;i++)
        {
            System.out.println();
            for(j=0;j<n;j++)
            {
                System.out.print(x[i][j]);
            }
        }
        System.out.println();
        
    }
    
}
