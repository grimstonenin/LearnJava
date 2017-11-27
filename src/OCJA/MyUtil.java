package OCJA;

import java.util.ArrayList;
import java.util.List;

class Food {
    public String toString(){
        return "Normal Food";
    }

    public void thisIsFood(){

    }
}

class Flesh extends Food {
    public String toString(){
        return "Flesh Food";
    }

    public void thisIsFlesh(){

    }
}

class Animal {
    public void eat(Food food){
        System.out.println("Animal eats "+ food);
    }
}

class Dog extends Animal{

    public void eat(Flesh flesh){
        System.out.println("Dog eats "+ flesh);
    }
}

public class MyUtil {

    public static void main(String[] args) {

        Animal animal = new Dog();

        Food f1 = new Flesh();

        Flesh f2 = (Flesh)f1;

        Flesh flesh = (Flesh)new Food();

        flesh.thisIsFlesh();
        flesh.thisIsFood();

        animal.eat(flesh);

        List s1 = new ArrayList();

    }
}