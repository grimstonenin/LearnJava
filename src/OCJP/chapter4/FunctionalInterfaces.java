package OCJP.chapter4;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

    static String forMethodRef = "this is static from method ref";

    public static String getForMethodRef(){
        return forMethodRef;
    }

    public static void main(String[] args){


        //Supplier

        System.out.println("Supplier interface");

        System.out.println("----------------------");

        Supplier<String> s1 = new Supplier<String>(){

            @Override
            public String get() {
                return "this is an anonymous class";
            }
        };

        System.out.println(s1.get());

        Supplier<String> s2 = () -> "this is a lambda";

        System.out.println(s2.get());


        Supplier<String> s3 = FunctionalInterfaces::getForMethodRef;

        System.out.println(s3.get());

        System.out.println("----------------------");
        System.out.println();

        //Consumer

        System.out.println("Consumer interface");

        System.out.println("----------------------");

        Consumer<Integer> c1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer+1);
            }
        };

        System.out.println("consumer with anon class");
        c1.accept(1);

        Consumer<Integer> c2 = i-> System.out.println(i+1);

        System.out.println("consumer with lambda");
        c2.accept(1);

        Consumer<Integer> c3 = System.out::println;

        System.out.println("consumer with method ref");
        c3.accept(1+1);
        System.out.println("----------------------");
        System.out.println();


        Predicate<String> p1 = s -> s.contains("egg");
        Predicate<String> p2 = s -> s.contains("brown");
        Predicate<String> combined = p1.and(p2);

        System.out.println(combined.test("egg"));



    }



}
