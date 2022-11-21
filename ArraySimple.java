package secondsemexam;

import java.util.Scanner;

class ArraySimple 
{
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
      double[] number=new double[5];
      double sum=0,max=0,average;
    System.out.print("Enter 5 numbers: ");
    
    for(int i=0;i<number.length;i++){
    number[i]=input.nextDouble();
    
    if(number[i]>max){
        max=number[i];
    }
    else
        max=max;
    }
      input.close();
    for(int i=0;i<number.length;i++){
        sum=sum+number[i];
     }
    
    System.out.println("Maximum number: "+max);
    System.out.println("Sum = "+sum);
    average=sum/5;
    System.out.println("Average = "+average);

     }
}
