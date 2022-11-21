
package Practice;

import java.util.Scanner;

public class CharacterPos {
  public static void main(String args[]){
      
      Scanner input=new Scanner(System.in);
      
      char a;
      System.out.println("Enter word:");
      a=input.next().charAt(2); //character at position 3
      System.out.println(" "+a);
  }  
}
