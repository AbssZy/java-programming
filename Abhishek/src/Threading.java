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
class A extends Thread
{
    public void run()
    {
        for(int i=0;i<=33000;i++)
        {
            System.out.println("From thread A: i="+i);
        }
        System.out.println("Exit from A. ");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<=33000;i++)
        {
            System.out.println("From thread B: i="+i);
        }
        System.out.println("Exit from B. ");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int i=0;i<=33000;i++)
        {
            System.out.println("From thread C: i="+i);
        }
        System.out.println("Exit from C. ");
    }
}

public class Threading {
    public static void main(String args[])throws IOException
    {
        new A().start();
        new B().start();
        new C().start();
    }
    
}
