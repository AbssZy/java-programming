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
import java.awt.*;
public class StudentFile_Input extends Frame{
    TextField T1,T2,T3;
    Button B1,B2;
    Label L1,L2,L3;
    DataInputStream dis;
    boolean moreRecord=true;
    public StudentFile_Input()
    {
        super("Create Student File");
    }
    public void set()throws IOException
    {
        resize(400,200);
        setLayout(new GridLayout(4,2));
        T1=new TextField(25);
        L1=new Label("Roll Number");
        T2=new TextField(25);
        L2=new Label("Name");
        T3=new TextField(25);
        L3=new Label("Marks");
        B1=new Button("Next");
        B2=new Button("Exit");
        add(L1);
        add(T1);
        add(L2);
        add(T2);
        add(L3);
        add(T3);
        add(B1);
        add(B2);
        show();
        FileInputStream F1=new FileInputStream("C:\\Users\\abhis\\Desktop\\Student.txt");
        dis=new DataInputStream(F1);
    }
    public void read()throws IOException
    {
        int n;
        String s;
        float f;
        n=dis.readInt();
        s=dis.readUTF();
        f=dis.readFloat();
        T1.setText(String.valueOf(n));
        T2.setText(s);
        T3.setText(String.valueOf(f));
        moreRecord=false;
    }
    public void clean()throws IOException
    {
        dis.close();
    }
    public boolean action(Event e,Object o)
    {
        if(e.target instanceof Button)
        {
            if(e.arg.equals("Next"))
            {
                try{
                read();
                }
                catch(IOException i){}
            }
        }
        return true;
    }
    public boolean handleEvent(Event e)
    {
        if(e.target instanceof Button)
        {
            if(e.arg.equals("Exit") || moreRecord ==false)
            {
                try
                {
                    clean();
                    System.exit(0);
                    return true;
                }
                catch(IOException i){}
            }
        }
        return super.handleEvent(e);
    }
    public static void main(String args[])throws IOException
    {
        StudentFile_Input S=new StudentFile_Input();
        S.set();
    }
}
