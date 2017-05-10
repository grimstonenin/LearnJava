package abstractFactoryDesign;

/**
 * Created by andrei.cristea01 on 5/10/2017.
 */
public class DisplayFriendlyRectangle implements DisplayFriendlyShape{

    private int length,height;

    public DisplayFriendlyRectangle(int length, int height){
        this.length = length;
        this.height = height;
        System.out.println("DisplayFriendlyRectangle constructor");
    }

    @Override
    public void draw(){
        System.out.println("DisplayFriendlyRectangle draw() function.");
    }
}
