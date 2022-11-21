/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class InputIntger {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Enter integer numbers:");
        a=input.nextInt();
        b=input.nextInt();
        System.out.println(""+(a+b));
    }
}
