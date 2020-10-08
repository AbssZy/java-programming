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
public class ReadBytes {
    public static void main(String args[])throws IOException
    {
        byte cities[]={'D','E','L','H','I','\n','C','H','E','N','N','A','I','\n','L','O','N','D','O','N'};
        FileOutputStream out=new FileOutputStream("C:\\Users\\abhis\\Desktop\\City.txt");
        out.write(cities);
        out.close();
        for(int i=0;i<20;i++)
        {
            System.out.print((char)cities[i]);
        }
    }
}