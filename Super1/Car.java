
package Super1;

public class Car extends Vehicle{
    //Vehicle theke color,weight,attribute() chole asce
    int gear;
    
    Car(String c,double w,int g){
      super(c,w);
      gear=g;
    }
    
    @Override
    void attribute(){
        super.attribute();
        System.out.println("Gear: "+gear);
    }
}
