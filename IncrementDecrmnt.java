import java.util.Scanner;

public class IncrementDecrmnt {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Enter number:");
        a=input.nextInt();
        b=a++;
        System.out.println("Postfix I "+b);
        b=a;
        System.out.println("now "+b);
        b=a--;
        System.out.println("Postfix D "+b);
        b=a;
        System.out.println("now "+b);
        b=--a;
        System.out.println("Prefix D "+b);
        b=a;
        System.out.println("now "+b);
        b=++a;
        System.out.println("Prefix I "+b);
        b=a;
        System.out.println("now "+b);
    }
}
