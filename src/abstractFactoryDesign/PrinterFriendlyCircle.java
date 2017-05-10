package abstractFactoryDesign;

/**
 * Created by andrei.cristea01 on 5/10/2017.
 */
public class PrinterFriendlyCircle implements PrinterFriendlyShape{

    private int xPos, yPos;
    private int radius;

    public PrinterFriendlyCircle(int x, int y, int r){
        xPos = x;
        yPos = y;
        radius = r;
        System.out.println("PrinterFriendlyCircle constructor");
    }

    @Override
    public void draw(){
        System.out.println("PrinterFriendlyCircle draw() function.");
    }
}
