
public class StringPrimitiveConvrsn {
    public static void main(String args[]){
        
        //primitive -> string
        double d=100.25;
        String s=Double.toString(d);
        System.out.println("s= "+s);
        
        //string -> primitive
        String str="32";
        int i=Integer.parseInt(str);
        System.out.println("i= "+i);
        //another way
        int j=Integer.valueOf(str);
        System.out.println("j= "+j);
    }
}
