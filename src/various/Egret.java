package various;

public class Egret {
    private String color;
    public Egret(){
        this("white");
    }

    public Egret(String color){
        color = color;
    }

    public static void main(String[] args){
        Egret egret = new Egret();
        System.out.println("Color:"+egret.color);

        int x = 0;

        int y = ++x *2;

        int z = x++ *2;

        System.out.println("Y: " + y);


        System.out.println("Z: " + z);

    }


}
