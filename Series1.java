import java.util.Scanner;

public class Series1 {
  public static void main(String args[]){

    Scanner input=new Scanner(System.in);
    int a,i;
    double b,j,s=1;
    
    System.out.println("Enter 1st number: ");
    b=input.nextDouble();
    j=b;
    System.out.println("How many numbers:");
    a=input.nextInt();
    
    for(i=1;i<=a;i++){
        s=s*j;
         System.out.println("j= "+j);
        j++;  
       // System.out.println("Sum: "+s);
    }
    
    System.out.println("Sum: "+s);
  }  
}
