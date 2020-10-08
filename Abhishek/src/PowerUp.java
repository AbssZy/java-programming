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
public class PowerUp {
    public static void main(String args[])throws IOException
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the power to which 2 must be raised: ");
        a=s.nextInt();
        b=(int)Math.pow(2,a);
        System.out.println(b);
    }
}
