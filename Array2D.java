package secondsemexam;

import java.util.Scanner;
public class Array2D {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in); 
        int row,col;
        double sum=0;
        int[][] A=new int[2][3];
        int[][] B=new int[2][3];
        
             //input Matrix A
          System.out.println("Enter elements of Matrix A:");
        for(row=0;row<2;row++){ 
            for(col=0;col<3;col++){
                System.out.printf("A[%d][%d]= ",row,col);
              A[row][col]=input.nextInt();
            }
        }   
                //input Matrix B
          System.out.println("Enter elements of Matrix B:");
        for(row=0;row<2;row++){ 
            for(col=0;col<3;col++){
               System.out.printf("B[%d][%d]= ",row,col);
             B[row][col]=input.nextInt();
            }
        } 
           System.out.println("\n");
           //print Mat A
           System.out.println("Matrix A:");
         for(row=0;row<2;row++){ 
            for(col=0;col<3;col++){
              System.out.print(" "+A[row][col]);
            }
            System.out.println("");
        }
          System.out.println("\n\n");
               //print Mat B
           System.out.println("Matrix B:");
         for(row=0;row<2;row++){ 
            for(col=0;col<3;col++){
              System.out.print(" "+B[row][col]);
            }
            System.out.println("");
        }
         //Adding A and B
          System.out.println("\n A+B:");
          for(row=0;row<2;row++){
              for(col=0;col<3;col++){
          System.out.print(" "+(A[row][col] + B[row][col]));
    
              }System.out.println(" ");
        }
    }
    
}
