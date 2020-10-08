/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 *
 */
import java.io.IOException;
class AAA implements Runnable
 {
     public void run()
     {
         for(int i=0;i<=5000;i++)
         {
             System.out.println("X of i = "+i);
         }
         System.out.println("End of Thread. ");
     }
 }
public class Threading_Threading {
    public static void main(String args[])throws IOException
    {
        AAA a=new AAA();
        Thread T=new Thread(a); 
        T.start();
        System.out.println("End of program.");
    }
}
