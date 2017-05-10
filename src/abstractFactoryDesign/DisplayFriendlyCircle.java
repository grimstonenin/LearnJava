package abstractFactoryDesign;

/**
 * Created by andrei.cristea01 on 5/10/2017.
 */
public class DisplayFriendlyCircle implements DisplayFriendlyShape{

    private int xPos, yPos;
    private int radius;

    public DisplayFriendlyCircle(int x, int y, int r){
        xPos = x;
        yPos = y;
        radius = r;
        System.out.println("DisplayFriendlyCircle constructor");
    }

    @Override
    public void draw(){
        System.out.println("DisplayFriendlyCircle draw() function.");
    }
}
