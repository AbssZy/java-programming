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
public class Vowels_and_Consonents {
    public static void main(String args[])throws IOException
    {
        String A;
        int i,j=0,k=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");
        A=s.nextLine();
        for(i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='u' || A.charAt(i)=='i' || A.charAt(i)=='o')
            {
                j++;
                System.out.println(A.charAt(i)+" is a vowel");
            }
            else
            {
                k++;
                System.out.println(A.charAt(i)+" is a consonent");
            }
        }
        System.out.println("The number of vowels are: "+j);
        System.out.println("The number of consonents are: "+k);
    }
}
