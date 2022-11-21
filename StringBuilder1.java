
public class StringBuilder1 {
   public static void main(String args[]){
       
       StringBuilder str=new StringBuilder("Shahin");
       
       str.append(" Alam ");
       str.append(2);
       
      // str.reverse();
       System.out.println(str) ;
       str.delete(2,5);
       System.out.println(str);
       
       //primitive -> object
       int x=30;
       Integer y=Integer.valueOf(x);
       System.out.println("y= "+y);
       //auto-boxing
       Integer z=x;
       System.out.println("z= "+z);
       
       //object -> primitive
      Double d=new Double(10.25);
      System.out.println("d= "+d);
      //unboxing
      double e=d; //d.doubleValue();
      System.out.println("e= "+e);
   } 
}
