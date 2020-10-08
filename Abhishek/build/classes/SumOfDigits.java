/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */import java.io.DataInputStream;
 import java.io.IOException;
public class SumOfDigits {
    public static void main(String args[])throws IOException
    {
        int a,q,r,sum;
        DataInputStream m=new DataInputStream(System.in);
        System.out.println("Enter the number: ");
        a=Integer.parseInt(m.readLine());
        sum=0;
        while(a!=0)
        {
            q=a/10;
            r=a%10;
            sum=sum+r;
            a=q;
        }
        System.out.println("The sum of digits is "+sum);
    }    
}
