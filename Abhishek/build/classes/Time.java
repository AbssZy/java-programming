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
class time1{
int hr,min;
void getdata()throws IOException
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter hour: ");
    hr=s.nextInt();
    System.out.println("Enter minutes: ");
    min=s.nextInt();
}
time1 add( time1 t2)throws IOException
{
    time1 t4=new time1();
    
    t4.min=min+t2.min;
    t4.hr=hr+t2.hr+t4.min/60;
    t4.min=t4.min%60;
    return t4;
    
}
void display()throws IOException
{
    System.out.println("Hr:Min is "+hr+":"+min);
}

}
public class Time {
    public static void main(String args[])throws IOException
    {
        time1 t1=new time1();
        time1 t2=new time1();
        time1 t3=new time1();
        t1.getdata();
        t2.getdata();
        t3=t1.add(t2);
        t3.display();
    }
}
