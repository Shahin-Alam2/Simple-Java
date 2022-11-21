package Practice;

import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      
      int a,b,d=0,i,temp,r;
      double s=0;
     
      //to calculate from a to z numbers
      
      System.out.print("Enter First number:");
      a=input.nextInt();
      System.out.print("Last number:");
      b=input.nextInt();
      
     for(i=a;i<=b;i++){
      temp=i;
      while(temp!=0){
          d++;
          temp=temp/10;
      }
     
      temp=i;
      while(temp!=0){
         r=temp%10;
         s=s+Math.pow(r, d);
         temp=temp/10;
      }
      
      //System.out.println("Number: "+temp);
      //System.out.println("Digit: "+d);
      
      if(s==i){
          System.out.println(i+" "+"Armstrong");
      }
      else{
          //System.out.println(i+" "+"Not");
      }
          d=0;
          s=0;
     }
  }    
}
