
package Practice;

import java.util.*;

public class ReverseString {
  public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      
      String original,reverse="";
      
      System.out.println("Enter String:");
      original=input.nextLine();
      
      int length=original.length();
      for(int i=length-1;i>=0;i--){
          reverse=reverse+original.charAt(i);
      }
      System.out.println("Reverse: "+reverse);
  }    
}
