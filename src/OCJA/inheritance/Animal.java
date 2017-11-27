package OCJA.inheritance;

public class Animal {
    private int age;
    private String name;

    public Animal(int age){
        super();
        this.age = age;

    }

    public Animal(int age, String name){
        super();
        this.age = age;
        this.name = name;
    }


    public static void main(String[] args){
        Animal gorrila = new Gorrila();

        System.out.println(gorrila.name);
    }
}
