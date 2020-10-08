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
import java.io.*;
public class FileMathRandom {
    public static void main(String args[])throws IOException
    {
        File intfile=new File("C:\\Users\\abhis\\Desktop\\Random");
        FileOutputStream fos=new FileOutputStream(intfile);
        DataOutputStream dos=new DataOutputStream(fos); 
        for(int i=0;i<20;i++)
        {
            dos.writeInt((int)(Math.random()*100));
        }
        dos.close();
        fos.close();
        FileInputStream fis=new FileInputStream(intfile);
        DataInputStream dis=new DataInputStream(fis);
        for(int i=0;i<20;i++)
        {
            int n=dis.readInt();
            System.out.print(n+" ");
        }
        dis.close();
        fis.close();
    }    
}
