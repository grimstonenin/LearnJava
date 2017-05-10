package abstractFactoryDesign;

import java.util.ArrayList;
import java.util.Iterator;


public class Canvas {
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();
    ShapeFactory factory;

    public void addNewShape(String shapeType, String mode){


        switch (mode){
            case "DisplayFriendly":

                 factory = new DisplayFriendlyFactory();
                 shapeList.add(factory.getShape(shapeType));
                 break;

            case "PrinterFriendly":

                 factory = new PrinterFriendlyFactory();
                 shapeList.add(factory.getShape(shapeType));


        }


    }

    public void redraw(){
        Iterator<Shape> itr = shapeList.iterator();

        while(itr.hasNext()){
            Shape shape = itr.next();
            shape.draw();
        }
    }
}
