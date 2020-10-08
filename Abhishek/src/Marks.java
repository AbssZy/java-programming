/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */
import java.util.Scanner;
public class Marks {
   public static void main(String args[]){
int n,j,m,i;
int ja[][]= new int[10][];
float average;
boolean pass;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of students : ");
n = sc.nextInt();
for(i =0;i<n;i++){
System.out.println("Enter number of subjects for student "+ (i+1) +" : ");
m = sc.nextInt();
ja[i]=new int[m];
for(j=0;j<ja[i].length;j++){

System.out.println("Enter subject " + (j+1));
ja[i][j]= sc.nextInt();
}
}
for(i=0;i<n;i++){
System.out.print("Student-"+(i+1)+" ");
average = 0;
pass = true;
for(j=0;j<ja[i].length;j++){
System.out.print(ja[i][j]+" ");
average = average + ja[i][j];
if(ja[i][j]<50){
pass = false;
}
}
average = average / ja[i].length;
System.out.print("Average-"+average);
if(pass){
System.out.println(" Result-Pass");
}else{
System.out.println(" Result-Fail");
}
}
} 
}
