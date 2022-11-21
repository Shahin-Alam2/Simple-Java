
public class StringBuffer1 {
    public static void main(String args[]){
        
        String s1="Shahin";
        StringBuffer sb=new StringBuffer(s1);
        //StringBuffer s1=new StringBuffer("Shahin");  //ei vabeo declare kora jay
        System.out.println(sb);
        
        sb.append(" Alam ");
        sb.append(2);
        System.out.println(sb);
        
        sb.setLength(4);
        System.out.println(sb);
        
    }
}
