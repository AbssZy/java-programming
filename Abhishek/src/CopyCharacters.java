/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */
import java.io.*;
public class CopyCharacters {
    public static void main(String args[])throws IOException
    {
        File inFile=new File("C:\\Users\\abhis\\Desktop\\Input.txt");
        File outFile=new File("C:\\Users\\abhis\\Desktop\\Output.txt");
        FileReader in=new FileReader(inFile);
        FileWriter out=new FileWriter(outFile);
        int ch;
        while((ch=in.read())!=-1)
        {
            out.write(ch);
        }   
        in.close();
        out.close();
       // System.exit(-1);
    }
}
