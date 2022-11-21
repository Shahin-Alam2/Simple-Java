import java.util.ArrayList;

public class ArrayListCopy {
    public static void main(String args[]){
    ArrayList<Integer> number=new ArrayList<Integer>();   
    System.out.println("Size: "+number.size());
    
    number.add(10);
    number.add(20);
    number.add(30);
    number.add(3,40);
    number.add(50);
    System.out.println(number);
    
    number.remove(2);
    System.out.println(number);
    System.out.println("Size "+number.size());
    
    boolean check=number.isEmpty();
    System.out.println("Array is Empty: "+check);
   // number.removeAll(number);
   // boolean check1=number.isEmpty();
   // System.out.println("Array is Empty: "+check1);
    int pos=number.indexOf(40);
    System.out.println("The position of 40: "+pos);
    
    boolean contain=number.contains(30);
    System.out.println("30 is in the list "+contain);
    number.set(3,60);
    System.out.println(number);
    int i=number.get(3);
       System.out.println("Index 3: "+i);
    }
}
