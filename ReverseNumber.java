import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,temp,r,s=0;
        System.out.println("Enter a number:");
        n=input.nextInt();
        temp=n;
        
        while(temp!=0){
            r=temp%10;
            s=s*10+r;
            temp=temp/10;
        }
        System.out.println("Reverse: "+s);
        if(n==s){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
    
}
