import java.util.Scanner;

public class SquareSeries {
   public static void main(String args[]){
       Scanner input=new Scanner(System.in);
   
       int a,b,sum=0;
       System.out.println("Enter 1st number: ");
       a=input.nextInt();
       System.out.println("Enter last number: ");
       b=input.nextInt();
       
       for(int i=a;i<=b;i++){
           sum=sum+i*i;
           System.out.println(i*i);
       }
       System.out.println("Sum of the series: "+sum);
   }
    
}
