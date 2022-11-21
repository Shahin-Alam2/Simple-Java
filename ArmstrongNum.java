package secondsemexam;

import java.util.Scanner;
public class ArmstrongNum {
 public static void main(String [] args){
     Scanner input=new Scanner(System.in);
     int sum=0,n,r,temp;
     System.out.println("Enter any number: ");
     n=input.nextInt();
     
     temp=n;
     while(temp!=0){
         r=temp%10;
         sum=sum+r*r*r;
         temp=temp/10;
     }
     if(n==sum){
     System.out.println(n+" is an Armstrong number.");
      }
     else{
         System.out.println(n+" is not an Armstrong number.");
     }
 }
    
}
