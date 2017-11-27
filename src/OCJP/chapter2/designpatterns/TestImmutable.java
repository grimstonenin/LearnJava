package OCJP.chapter2.designpatterns;

import java.util.Arrays;

public class TestImmutable {

    public static void main(String[] args){

        Animal animal = new Animal("cat",4, Arrays.asList("fish","catfood"));

        System.out.println(animal.getFavoriteFood(1));


    }
}
