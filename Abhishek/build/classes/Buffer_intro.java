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
public class Buffer_intro {
    public static void main(String args[])throws IOException
    {
        FileInputStream F1=new FileInputStream("C:\\Users\\abhis\\Documents\\NetBeansProjects\\Abhishek\\src\\Area.java");
        FileInputStream F2=new FileInputStream("C:\\Users\\abhis\\Documents\\NetBeansProjects\\Abhishek\\src\\Addition.java");
        SequenceInputStream  F3=new SequenceInputStream(F1,F2);
        BufferedInputStream B1=new BufferedInputStream(F3);
        BufferedOutputStream B2=new BufferedOutputStream(System.out);
        int x;
        while((x=B1.read())!=-1)
        {
            B2.write((char)x);
        }
        B1.close();
        B2.close();
        F1.close();
        F2.close();
    }
}
