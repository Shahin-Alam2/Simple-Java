
public class FactoryPtrn1 {
    public static void main(String args[]){
        
        ShapeFactory shapeFactory=new ShapeFactory();
        
        Circle shape1=shapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        Circle shape2=shapeFactory.getShape("SQUARE");
        shape2.draw();
        
        Circle shape3=shapeFactory.getShape("RECTANGLE");
        shape3.draw();
    }
}
