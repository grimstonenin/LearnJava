package OCJA;

public enum Season {

    WINTER("Take out the sled"),SPRING("Take pictures of flowers"),SUMMER("Drink some cold juice"),AUTUMN("Watch the leaves go brown");

    private String action;

     Season(String action){
        this.action = action;
    }

    public  String action(){
        return this.action;
    }

}


class TestEnums{
    public static void main(String[] args){
        System.out.println(Season.AUTUMN.name());
        System.out.println(Season.AUTUMN.action());
    }
}
