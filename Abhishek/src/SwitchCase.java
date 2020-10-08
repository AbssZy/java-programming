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
public class SwitchCase {
    public static void main(String args[])throws IOException
    {
        int a,b,sum,diff,mul,c;
        float div;
        DataInputStream m=new DataInputStream(System.in);
        System.out.println("Enter the two numbers");
        a=Integer.parseInt(m.readLine());
        b=Integer.parseInt(m.readLine());
        System.out.println("Press 1 for addition; Press 2 for subtraction; Press 3 for Multiplication; Press 4 for Divide");
        System.out.println("Make a choice ");
        c=Integer.parseInt(m.readLine());
        switch(c)
        {
            case 1:
                sum=a+b;                        
                System.out.println("The sum is "+sum);
                break;
            case 2:
                diff=a-b;
                System.out.println("The difference is "+diff);
                break;
            case 3:
                mul=a*b;
                System.out.println("The product is "+mul);
                break;
            case 4:
                div=(float)a/(float)b;
                System.out.println("The division is "+div);
                break;
            default:
                System.out.println("Option not included ");
        }           
            
    }
    
}
