/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */
import java.io.DataInputStream;
import java.io.IOException;
public class FibonacciSeries {
    public static void main(String args[])throws IOException
    {
        int a,b,sum,i;
        DataInputStream m=new DataInputStream(System.in);
        System.out.println("Enter the two numbers: ");
        a=Integer.parseInt(m.readLine());
        b=Integer.parseInt(m.readLine());
        sum=0;
        
        for(i=0;i<10;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(+a+" "+b);
        }
        System.out.println("is the Fibonacci's Series");
        System.out.println("The sum of Fibonacci's series is "+sum);
    }
}
