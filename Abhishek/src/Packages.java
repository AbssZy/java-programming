/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */import java.io.IOException;
import Mypack.FirstClass;
 import Mypack.SecondClass;
public class Packages {
    public static void main(String args[])throws IOException
    {
        FirstClass Fc=new FirstClass();
        SecondClass Sc=new SecondClass();
        Fc.display();
        Sc.display();
        
    }
    
}
