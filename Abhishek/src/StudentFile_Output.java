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
import java.awt.*;
public class StudentFile_Output extends Frame{
    TextField T1,T2,T3;
    Button B1,B2;
    Label L1,L2,L3;
    DataOutputStream dos;
    public StudentFile_Output()
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
        B1=new Button("Enter");
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
        FileOutputStream F1=new FileOutputStream("C:\\Users\\abhis\\Desktop\\Student.txt");
        dos=new DataOutputStream(F1);
    }
    public void add()throws IOException
    {
        int num;
        float f;
        num=Integer.parseInt(T1.getText());
        dos.writeInt(num);
        dos.writeUTF(T2.getText());
        f=Float.parseFloat(T3.getText());
        dos.writeFloat(f);
        T1.setText("");
        T2.setText("");
        T3.setText("");
    }
    public void clean()throws IOException
    {
        if(!T1.getText().equals(""))
        {
            add();
        }
        else
        {
            dos.flush();
            dos.close();
        }
    }
    public boolean action(Event e,Object o)
    {
        if(e.target instanceof Button)
        {
            if(e.arg.equals("Enter"))
            {
                try{
                add();
                return true;
                }
                catch(IOException i){}
            }
        }
        return super.action(e,o);
    }
    public boolean handleEvent(Event e)
    {
        if(e.target instanceof Button)
        {
            if(e.arg.equals("Exit"))
            {
                try{
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
        StudentFile_Output S=new StudentFile_Output();
        S.set();
    }
}
