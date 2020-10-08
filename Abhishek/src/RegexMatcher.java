/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */

import java.util.regex.*;
import java.util.Scanner;
public class RegexMatcher {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Regestration Number: ");
        String a=sc.nextLine();
        String b="[0-9]{2}[A-Z]{3}[0-9]{4}";
        Pattern p = Pattern.compile(b);
        if(Pattern.matches(b,a))
        {
            System.out.println(a+ " is a Valid Regestration Number.");
        }
        else
        {   
            System.out.println(a+" is Invalid Regestration Number.");
        }
    }
}
