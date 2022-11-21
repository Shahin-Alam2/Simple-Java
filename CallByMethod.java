package CallByFunction;


public class CallByMethod {
    
    //call by value
    void changeVal(int i){
        i=20;
        System.out.println("i: "+i);
    }
    
    //call by reference
    String name;
    void changeRef(CallByMethod r2){
       r2.name="Alam"; 
    }
}
