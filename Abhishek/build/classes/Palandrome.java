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
public class Palandrome {
    public static void main(String args[])throws IOException
    {
        Scanner s=new Scanner(System.in);
        String A;
        System.out.println("Enter a string: ");
        A=s.nextLine();
        int j=A.length()-1;
        int i;
        for(i=0;i<A.length();i++)
        {
            if(A.charAt(i)==A.charAt(j))
            {
                j--;
            }
            else
            {
            System.out.println("Isnt a Palandrone");
            break;
            }
        }
        if(j==-1)
        {
            System.out.println("Is a Palandrone");
        }
        
        
        
    }
}
