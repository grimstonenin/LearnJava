package OCJP.chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class JoyRide {

    public static<T> T identity(T t) { return t;
    }

    public static void main(String[] args){

        Map<String,String> rides = new HashMap<>();

        rides.put("Jenny", "Bus Tour");
        rides.put("Tom", null);

        System.out.println(rides);

        rides.putIfAbsent("Jenny", "Tram");
        rides.putIfAbsent("Sam", "Tram");
        rides.putIfAbsent("Tom", "Tram");

        System.out.println(rides);


        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1: v2;

        System.out.println();
         Map<String, String> favorites = new HashMap<>();
         favorites.put("Jenny", "Bus Tour");
         favorites.put("Tom", "Tram");

        System.out.println(favorites);

         String jenny = favorites.merge("Jenny", "Skyride", mapper);
         String tom = favorites.merge("Tom", "Skyride", mapper);

        System.out.println();
         System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
         System.out.println(jenny); // Bus Tour
         System.out.println(tom); // Skyride
    }
}
