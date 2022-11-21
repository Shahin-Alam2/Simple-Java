import java.util.Scanner;

public class MatrixAddition {
   
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int [][] A=new int[2][3];
        int [][] B=new int[2][3];
        
        System.out.println("Matrix A:");
        
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                A[row][col]=input.nextInt();
            }
        }
      /*System.out.println("Matrix A: ");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print("  "+A[row][col]);
            }
            System.out.println("\n");
        } */
      System.out.println("Matrix B:");
      for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                B[row][col]=input.nextInt();
            }
        } 
      /*System.out.println("Matrix B: ");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print("  "+B[row][col]);
            }
            System.out.println("\n");
        } */
       //addition
       for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                A[row][col]=A[row][col]+B[row][col];
            }
        }
       System.out.println("Summation:");
       for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print("  "+A[row][col]);
            }
            System.out.println("\n");
      }
    }
}
