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
public class String_Magic {
    public static void main(String args[])throws IOException
    {
        String A;//=new String();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name to be reversed: ");
        A=s.nextLine();
        int l=A.length()-1;
        for(int i=l;i>=0;i--)
        {
            System.out.print(A.charAt(i));
        }
    }
}
