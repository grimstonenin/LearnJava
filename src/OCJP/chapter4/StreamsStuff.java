package OCJP.chapter4;

import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamsStuff {



    public static void main(String args[]){

        Stream<Double> randoms = Stream.generate(Math::random).limit(20L);

        System.out.println(randoms);

        randoms.forEach(System.out::println);

        Stream<Double> someNumbers = Stream.generate(Math::random).limit(10L);

        System.out.println();

        System.out.println("Number of elements:  " + someNumbers.count());

        Stream<Double> someNumbers2 = Stream.generate(Math::random).limit(10L);

        System.out.println("Max: " + someNumbers2.max(Comparator.comparingInt(Double::intValue)));

        System.out.println();
        System.out.println();

        //reduce

        Stream<String> reduceMe = Stream.of("a","b","c","a","b");

        String reducedStream = reduceMe
                .peek(System.out::println)
                .filter(s -> s.equals("a")||s.equals("b"))
                .distinct()
                .peek(System.out::println)
                .map(s -> (int) s.charAt(0))
                .peek(System.out::println)
                .reduce(0,(s1,s2)->s1+s2)
                .toString();

        System.out.println(reducedStream);



    }


}
