


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */
import static java.lang.Thread.yield;
import java.io.IOException;
class AA extends Thread
{
    public void run()
    {
        for (int i=0;i<=5000;i++)
        {
            if(i==1000) yield();
            System.out.println("\tFrom thread A: i = "+i);
        }
        System.out.println("Exit from A ");
    }
}
class BB extends Thread
{
    public void run()
    {
        for (int i=0;i<=5000;i++)
        { 
            System.out.println("\tFrom thread B: i = "+i);
            if(i==1000) stop();
        }
        System.out.println("Exit from B ");
    }
}
class CC extends Thread
{
    public void run()
    {
        for (int i=0;i<=5000;i++)
        { 
            System.out.println("\tFrom thread C: i = "+i);
            if(i==1000)
                try
                {
                    sleep(1000);
                }
            catch(Exception E)
            {}
        }
        System.out.println("Exit from C ");
    }
}
public class Mutli_Threading {
    public static void main(String args[])throws IOException
    {
        AA a=new AA();
        BB b=new BB();
        CC c=new CC();
        c.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(a.getPriority()+2);
        a.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Staring thread A: ");
        a.start();
        System.out.println("Staring thread B: ");
        b.start();
        System.out.println("Staring thread C: ");
        c.start();

    }
}
