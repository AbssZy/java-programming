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
public class Comparion {
    public static void main(String args[])throws IOException
    {
        int a,b,c,temp;
        DataInputStream m=new DataInputStream(System.in);
        System.out.println("Enter the values: ");
        a=Integer.parseInt(m.readLine());
        b=Integer.parseInt(m.readLine());
        c=Integer.parseInt(m.readLine());
        if(a>b && a>c)
        {
            temp=a;
        }
        else if(b>a && b>c)
        {
            temp=b;
        }
        else
                {
                    temp=c;
                }
        System.out.println("The greatest number of "+a+" "+b+" "+c+" is "+temp);
    }
}
