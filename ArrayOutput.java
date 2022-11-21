import java.util.Scanner;
public class ArrayOutput {
   public static void main(String args[]){
       Scanner input=new Scanner(System.in);
       int [][] output=new int[4][];
       output[0]=new int[1];
       output[1]=new int[2];
       output[2]=new int[3];
       output[3]=new int[4];
       
       for(int row=0;row<4;row++){
           for(int col=0;col<row+1;col++){
               output[row][col]=input.nextInt();
           }
       }
       for(int row=0;row<4;row++){
           for(int col=0;col<row+1;col++){
               System.out.print(" "+output[row][col]);
       }
           System.out.println("\n");
    }
   }       
}
