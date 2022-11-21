import java.util.Scanner;

public class DecimalCnvrsnTo {
    public static void main(String args[]){
        
       Scanner input=new Scanner(System.in); 
       int deci;
       System.out.println("Enter Decimal:");
       deci=input.nextInt();
       
       //binary
       String bin=Integer.toBinaryString(deci);
       System.out.println("Binary: "+bin);
        //octal
        String oct=Integer.toOctalString(deci);
        System.out.println("Octal: "+oct);
        //hexadecimal
        String hex=Integer.toHexString(deci);
        System.out.println("Hexadecimal: "+hex);
        
        //binary -> decimal
        String binary;
        System.out.println("Enter Binary:");
        binary=input.next();
        Integer deciBin=Integer.parseInt(binary,2);
        System.out.println("Binary to Deci: "+deciBin);
        
        //octal -> decimal
        String octal;
        System.out.println("Enter Octal:");
        octal=input.next();
        Integer deciOct=Integer.parseInt(octal,8);
        System.out.println("Octal to Deci: "+deciOct);
        
        //hexadecimal -> decimal
        String hexa;
        System.out.println("Enter Hexadecimal:");
        hexa=input.next();
        Integer deciHexa=Integer.parseInt(hexa,16);
        System.out.println("Hexadecimal to Deci: "+deciHexa);
    }
}
