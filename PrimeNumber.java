
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int a,b,n,i;
        System.out.println("Enter 1st number:");
        a=input.nextInt();
        System.out.println("Enter last number:");
        b=input.nextInt();
        
        for(n=a;n<=b;n++){
        
            if(n!=2&&n%2!=0){
            for(i=3;i<=(b/2);i=i+2){
                if(n%i==0){
                   // System.out.println(n+" is Not a Prime");
                   // break;
                }
                else{
                    //System.out.println(n+" is a Prime");
                 //   break;
                }
            }
        }
        else{
          //  System.out.println(n+" is Prime Number");
        }
       }
    }
    
}
