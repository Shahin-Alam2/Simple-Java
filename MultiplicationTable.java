/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);
     int n,i;
     System.out.println("Which number?");
     n=input.nextInt();
     
     for(i=1;i<=10;i++){
         System.out.println(n+" X "+i+" = "+n*i);
     }
    }
    
}
