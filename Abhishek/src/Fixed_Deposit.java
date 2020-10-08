/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AbssZy
 */
import java.io.IOException;
import java.util.Scanner;
class FixedDeposit
{
    int principal,maturity,j;
    FixedDeposit()
            {}
    FixedDeposit(int P,int Y,int R)
    {
        principal=P;
        int i;
        for(i=1;i<=Y;i++)
        {
            j=(P*R)/100;
            P=P+j;
        }
        maturity=P;
        

    }
    FixedDeposit(int P,int Y,float r)
    {
        principal=P;
        int i;
        for(i=1;i<=Y;i++)
        {
            j=(int) (P*r);
            P=P+j;
        }
        maturity=P;
        
    }
    void display()throws IOException
    {
        System.out.println("For the principal amount of "+principal+" the maturity gained is "+maturity);
    }
}
public class Fixed_Deposit {
    public static void main(String args[])throws IOException
    {
        int P,Y,R;
        float r;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Principal amount: ");
        P=s.nextInt();
        System.out.println("Enter the number of years: ");
        Y=s.nextInt();
        System.out.println("Enter the rate: ");
        R=s.nextInt();
        FixedDeposit F1=new FixedDeposit(P,Y,R);
        System.out.println("Enter the rate in float form: ");
        r=s.nextFloat();
        FixedDeposit F2=new FixedDeposit(P,Y,r);
        F1.display();
        F2.display();                
    }
    
}
