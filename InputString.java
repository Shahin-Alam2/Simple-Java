
import java.util.Scanner;

public class InputString {

  public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      String name;
      System.out.println("Enter String:");
      name=input.nextLine();
      System.out.println("Welcome "+name);
  }    
}
