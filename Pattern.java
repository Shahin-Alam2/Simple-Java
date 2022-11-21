package secondsemexam;

import java.util.Scanner;
public class Pattern {
    public static void main(String [] args){
     int n,row,col;
     Scanner input=new Scanner(System.in);
     System.out.println("Enter the number of rows: ");
     n=input.nextInt();
     
     for(row=n;row>0;row--){
         for(col=1;col<=row;col++){
             System.out.print(" "+col);
         }
         System.out.println(" ");
     }
    }
}
