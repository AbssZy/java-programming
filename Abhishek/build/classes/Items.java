/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AbssZy
 */import java.io.IOException;
 import java.util.Scanner;
 class Item{
     private int itemcode[]=new int[10];
     private int itemprice[]=new int[10];
     private int i=0;
     int b;
     Scanner s=new Scanner(System.in);
     void getitems()throws IOException
     {
         
         System.out.println("Enter the itemcode: ");
         itemcode[i]=s.nextInt(); 
         System.out.println("Enter the itemprice: ");
         itemprice[i]=s.nextInt();
         i++;
     }
     void sumitems()throws IOException
     {
         int j,sum=0;
         for(j=0;j<i;j++)
         {
             sum=sum+itemprice[j];
         }
         System.out.println("The sum of the prices is "+sum);
     }
     void removeitems()throws IOException
     {
         int j=0,k=0;
         System.out.println("Enter the itemcode to be removed");
         b=s.nextInt();
         for(j=0;j<i;j++)
         {
             if(itemcode[j]==b)
             {
                 k++;
                 itemprice[j]=0;
                 
             }
             
         }
         if(k==0)
             {
                 System.out.println("The itemcode doesnt exist. ");
             }
     }
     void display()throws IOException
     {
         int j;
         for(j=0;j<i;j++)
         {
             System.out.println("The itemcode of item "+(j+1)+" is "+itemcode[j]);
             System.out.println("The itemprice of item "+(j+1)+" is "+itemprice[j]);
         }
     }
 }
public class Items {
    public static void main(String args[])throws IOException
    {
        Scanner d=new Scanner(System.in);
        Item I=new Item();
        int x,n;
        
        do
        {
            System.out.println("Press 1 to Accept item");
            System.out.println("Press 2 to Sum the item prices");
            System.out.println("Press 3 to Display item");
            System.out.println("Press 4 to Remove item");
            x=d.nextInt();
            switch(x)
            {
                case 1: 
                    I.getitems();
                    break;
                case 2:
                    I.sumitems();
                    break;
                case 3:
                    I.display();
                    break;
                case 4:
                    I.removeitems();
                    break;
                default:
                    System.out.println("Wrong input.");
                    
                        
            }
            System.out.println("Enter 1 to continue or 0 to exit: ");
            n=d.nextInt();
            
        }
        while(n!=0);
    }
    
}
