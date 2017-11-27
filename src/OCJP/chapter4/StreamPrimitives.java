package OCJP.chapter4;

import java.util.OptionalDouble;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPrimitives {

    public static void main(String args[]){

        Stream<Integer> integerStream = Stream.of(1,2,3);

       // System.out.println(integerStream.reduce(0, (s, n) -> s + n));

        System.out.println(integerStream.mapToInt(x->x).sum());

        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        Stream<String> stringToInt = Stream.of("a","bb","ccc");
        IntStream intStream1 = stringToInt.mapToInt(
                String::length
        );

        intStream1.forEach(System.out::println);


    }

}
