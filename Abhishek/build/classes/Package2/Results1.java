/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abhis
 */


package Package2;
import java.io.IOException;
import Package2.Marks1;
import Package1.Sport;
public class Results1 extends Marks1 implements Sport{
     private int total;
     private float percentage;
     public void calculate()throws IOException
     {
     total=getm1()+getm2()+getm3()+getm4()+getm5()+s;
     percentage=(int)(total/5);
     }
     public int topper()throws IOException
     {
         return total;
     }
     public void display()throws IOException
     {
         displaystdata();
         displaymarks();
         System.out.println("The total marks of all subjects is: "+total);
         System.out.println("The percentage of the student is : "+percentage);
     }
     public void displaysportsmarks()
     {
         System.out.println("The sports marks added are 50.");
     }
 }
    

