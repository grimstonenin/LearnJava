package abstractFactoryDesign;

/**
 * Created by andrei.cristea01 on 5/10/2017.
 */
public class PrinterFriendlyRectangle implements PrinterFriendlyShape{

    private int length,height;

    public PrinterFriendlyRectangle(int length, int height){
        this.length = length;
        this.height = height;
        System.out.println("PrinterFriendlyRectangle constructor");
    }

    @Override
    public void draw(){
        System.out.println("PrinterFriendlyRectangle draw() function.");
    }
}
