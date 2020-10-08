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
import java.io.IOException;
public class ReadWriterPrimitive {
    public static void main(String args[])throws IOException
    {
        File pri=new File("C:\\Users\\abhis\\Desktop\\Primitive");
        FileOutputStream fos=new FileOutputStream(pri);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(1999);
        dos.writeFloat(3.14F);
        dos.writeBoolean(false);
        dos.writeChar('A');
        dos.close();
        fos.close();
        FileInputStream fis=new FileInputStream(pri);
        DataInputStream dis=new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readFloat());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        dis.close();
        fis.close();
    }
    
}
