/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */
import java.util.*;

class Acc{
int acNo;
String name;
String acType;
long avaiBal;
long minBal;
public void getInput(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Account Number: ");
acNo = sc.nextInt();
System.out.println("Enter Name: ");
name = sc.nextLine();
name = sc.nextLine();
System.out.println("Enter Account Type: ");
acType = sc.nextLine();
System.out.println("Enter Available Balance: ");
avaiBal = sc.nextLong();
System.out.println("Enter Minimum Balance: ");
minBal = sc.nextInt();
}

public void getOutput(){
System.out.println("Account Number: "+acNo);
System.out.println("Name: "+name);
System.out.println("Account Type: "+acType);
System.out.println("Minimum Balance: "+minBal);
}

public void showBal(){
System.out.println("Available Balance: "+avaiBal);
}

public void deposit(){
long amt;
Scanner sc = new Scanner(System.in);
System.out.println("Enter amount to deposit: ");
amt = sc.nextInt();
avaiBal += amt;
}

public void withdraw(){
long amt;
Scanner sc = new Scanner(System.in);
System.out.println("Enter amount to withdraw: ");
amt = sc.nextInt();
avaiBal -= amt;
}

}

public class Bank {
    public static void main(String Args[]){
    Acc abc = new Acc();
    abc.getInput();
    abc.deposit();
    abc.withdraw();
    abc.showBal();
    abc.getOutput();
}
}
