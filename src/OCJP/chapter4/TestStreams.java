package OCJP.chapter4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args){

        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,5,6);
        List<Integer> l3 = Arrays.asList(7,8,9);

        Stream.of(l1,l2,l3).flatMap(Collection::stream).map(x -> x+1).forEach(System.out::println);


        Stream<Integer> s1 = Stream.of(1);
        IntStream i1 = s1.mapToInt(x->x);
        DoubleStream ds1 = s1.mapToDouble(x->x);

    }

}
