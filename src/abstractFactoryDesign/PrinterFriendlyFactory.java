package abstractFactoryDesign;

/**
 * Created by andrei.cristea01 on 5/10/2017.
 */
public class PrinterFriendlyFactory implements ShapeFactory{

    @Override
    public Shape getShape(String shape){
        switch(shape){
            case("Circle"): return new PrinterFriendlyCircle(10,10,20);
            case("Rectangle"): return new PrinterFriendlyRectangle(10,20);
        }
        return null;
    }
}
