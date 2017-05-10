package abstractFactoryDesign;

/**
 * Created by andrei.cristea01 on 5/10/2017.
 */
public class TestClass {

    public static void main(String[] args){

        Canvas canvasDisplay = new Canvas();
        canvasDisplay.addNewShape("Circle","DisplayFriendly");
        canvasDisplay.addNewShape("Rectangle","DisplayFriendly");
        canvasDisplay.redraw();

        System.out.println();

        System.out.println("Now Printerfriendly");

        Canvas canvasPrinter = new Canvas();
        canvasPrinter.addNewShape("Circle","PrinterFriendly");
        canvasPrinter.addNewShape("Rectangle","PrinterFriendly");
        canvasPrinter.redraw();
    }
}
