
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ArrayList1 {
    public static void main(String args[]){
        
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(12);
        number.add(34);
        number.add(14);
        number.add(45);
        number.add(3,26);        
        number.add(3,25);
        
        /*for(int i:number){
            System.out.print(i+" ");
        }*/
        Iterator itr=number.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next()); 
        }
        System.out.println();
    }
}
