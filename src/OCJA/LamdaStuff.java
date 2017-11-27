package OCJA;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class LamdaStuff {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(400);
        intList.add(600);
        intList.add(-10);
        intList.add(-40);


        Predicate<Integer> largerThanZero = (Integer i) -> i.intValue()>0;
        Predicate<Integer> smallerThanZero = (Integer i) -> i.intValue()<0;

        List<Integer> result1 = intList.stream().filter(largerThanZero).collect(Collectors.toList());

        result1.forEach(System.out::println);



    }
}


