
public class Add {
  
    void add(int ... num){
        int sum = 0;
        
        for(int x:num){
            sum=sum+x;
        }
        System.out.println("Sum: "+sum);
    }
}
