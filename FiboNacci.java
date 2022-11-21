import java.util.Scanner;

public class FiboNacci {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,n,first,second,fibo,sum=0;
        
        System.out.println("First number:");
        first=input.nextInt();
        System.out.println("Second number:");
        second=input.nextInt();
        
        System.out.println("How many numbers?");
        n=input.nextInt();
        
        System.out.print(first+" "+second);
        
        for(i=1;i<=n-2;i++){
            fibo=first+second;
            sum=sum+fibo;
            
          System.out.print(" "+fibo);
          
          first=second;
          second=fibo;
        }
        System.out.println("\nSum: "+sum);
    }
}
