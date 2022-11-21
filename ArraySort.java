import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
       int [] number={10,-3,4,25,14};
       int m=5;
        
        /* System.out.println("How many numbers?");
        int m=input.nextInt();
        
        System.out.println("Enter numbers:");
        for(int n=0;n<m;n++){
            number[n]=input.nextInt();
        }*/
       // System.out.println(" "+number[1]);
        Arrays.sort(number);
       // System.out.println(" "+number[1]);
        System.out.print("Ascending:");
        for(int i=0;i<m;i++){
            System.out.print(" "+number[i]);
        }
        System.out.println("\n");
        
        System.out.print("Descending:");
        for(int j=m-1;j>=0;j--){
            System.out.print(" "+number[j]);
        }
        System.out.println("\n");
    
    // String Sort
       String[] names={"Shamim","Shahin","Mehedi"};
       Arrays.sort(names);
       
       for(int i=0;i<3;i++){
           System.out.println(" "+names[i]);
       }
    
    }
}
