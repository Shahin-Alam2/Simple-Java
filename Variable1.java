
public class Variable1 {
   public static void main(String args[]){
       int x;
       x=10;
       
       if(x==10){
           int y=20;
           System.out.println("x and y: "+x +" n "+y);
           x=y*2;
       }
       System.out.println("x is "+x);//x is known but y is known here
       
       //String to Integer Conversion
       int num;
       String s="shahinalam";
       String s1=s.substring(4,6);
       num=Integer.parseInt("123213");
       System.out.println("Num: "+s1);
     }
   } 