
package OctoberMonth;

public class ForEachLoop1 {
   public static void main(String[] args){ 
   
       int sum=0,num[]={1,2,3,4,5,6,7,8,9,10};
       
       for(int x: num){
           sum+=x;
       System.out.println("value:"+x);
   }
       System.out.println("Sum: "+sum);
   }
}
