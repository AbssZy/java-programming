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
public class Prime {
    public static void main(String Args[]){
    int n1, count=0,j,isprime=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    n1 = sc.nextInt();
    System.out.println("The prime numbers in between 1 and " + n1 + " are:");
    for(int i=2;i<n1;i++){
    for(j = 2;j<i;j++){
    if(i%j==0){
    isprime = 0;
    }
    }
    if(isprime == 1){
    System.out.println(i);
    count++;
    }
    isprime=1;
    }
    System.out.println("There number of prime numbers are " + count + ".");
    }
}
