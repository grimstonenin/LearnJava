package OCJP.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optionals {

    public static void main(String args[]){

        List<String> list = new ArrayList<>();
        list.add(null);

        Optional<String> optional = Optional.ofNullable(list.get(0));

        optional.ifPresent(System.out::println);

        Optional<Number> optional2 = Optional.ofNullable(null);

        System.out.println(optional2.orElseGet(Math::random));

        Number n = testRandom(1);

        System.out.println(n);

        Optional<Double> avg = average();

        System.out.println(avg);

    }

    public static Number testRandom(Number n){

        Optional<Number> optional = Optional.ofNullable(n);

        return optional.orElseGet(Math::random);

       // return Optional.ofNullable(n).orElseGet(()->Math.random());
    }

    public static Optional<Double> average(int... values){

        if(values.length==0) return Optional.empty();

        int sum = 0;

        for(int i: values){
            sum += i;
        }

        return Optional.ofNullable((double)sum/values.length);
    }

}
