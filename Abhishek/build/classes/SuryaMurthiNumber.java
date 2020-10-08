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
import java.io.DataInputStream;
public class SuryaMurthiNumber {
    public static void main(String args[])throws IOException
    {
        int a,q,r,b,product,sum;
        DataInputStream m=new DataInputStream(System.in);
        System.out.println("Enter the number ");
        a=Integer.parseInt(m.readLine());
        b=a;
        sum=0;
        while(a!=0)
        {
            q=a/10;
            r=a%10;
            product=1;
            while(r!=0)
            {
                product=product*r;
                r--;
            }
            sum=sum+product;
            a=q;
        }
        if(sum==b)
        {
            System.out.println(b+" is a KrishnaMurthi number. ");
        }
        else
        {
            System.out.println(b+" is not a KrishnaMurthi number.");
        }
    }

}
