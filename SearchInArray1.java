
package OctoberMonth;

import java.util.Scanner;

public class SearchInArray1 {
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        int value=100,num[]={1,2,3,4,5,6,7,8,9,10};
        boolean found=false;
        
        while(value!=0){
             value=input.nextInt();
        
             for(int x:num){
              
               if(value==x){
                   found=true;
                   break;
               }
               else if(value==0){
                   System.exit(0);
               }
               }
                
               if(found){
                   System.out.println("Found");
                  // break;
               }
               else{
                   System.out.println("Not Found");
           }
        }
    }
}
