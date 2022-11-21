package secondsemexam;

import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int length;
        System.out.print("How many friends you have?");
        length=input.nextInt();
        String[] names=new String[length];
        
        for(int counter=0;counter<length;counter++){
            System.out.println("Write the name of friend "+(counter+1));
            names[counter]=input.next();
        }
        input.close();
    
    System.out.println("Your friends are: ");
    for(int counter=0;counter<length;counter++){
    System.out.println(names[counter]);
       }
    }
}
