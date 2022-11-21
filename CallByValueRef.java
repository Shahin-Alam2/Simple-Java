package CallByFunction;


public class CallByValueRef {
   public static void main(String args[]){
       
       //call by value
       CallByMethod ob=new CallByMethod();
       int x=10;
       System.out.println("x before call: "+x);
       ob.changeVal(x);
       System.out.println("x after call: "+x);
       
      
       //call by reference
       CallByMethod r1=new CallByMethod();
       r1.name="Shahin";
       System.out.println("before call: "+r1.name);   
       r1.changeRef(r1);
       System.out.println("after call: "+r1.name);
   } 
}
