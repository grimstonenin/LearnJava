package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Foo {
    String name;
    List<Bar> bars = new ArrayList<>();

    Foo(String name) {
        this.name = name;
    }
}

class Bar {
    String name;

    Bar(String name) {
        this.name = name;
    }
}


public class StreamTesting {

    public static void main(String[] args) {



        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12));




//        List<String> myList =
//                Arrays.asList("a1", "a2", "b1", "c2", "c1");
//
//        myList.stream()
//              .filter(s -> s.startsWith("c"))
//              .forEach(System.out::println);

//        Arrays.asList("a1","a2","a3")
//                .stream()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);


//        IntStream.range(1,4)
//                .forEach(System.out::println);
//

        //execution order
//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.startsWith("A");
//                })
//                .forEach(s -> System.out.println("forEach: " + s));

        //reusing streams
        //bad example

//       Stream testStream =  Stream.of("a","b","c")
//                .filter(s -> s.equals("a"));
//
//       testStream.forEach(System.out::println);
//       testStream.forEach(System.out::println);

        //good example with supplier

//        Supplier<Stream> streamSupplier = () -> Stream.of("a","b","c")
//                .filter(s -> s.equals("a"));
//
//        streamSupplier.get().forEach(System.out::println);
//
//        streamSupplier.get().forEach(System.out::println);


        //collectors simple example
//        Map<Integer, List<Person>> personsByAge = persons
//                .stream()
//                .collect(Collectors.groupingBy(p -> p.age));
//
//        personsByAge
//                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
//

        //flatmap example

        List<Foo> foos = new ArrayList<>();

        // create foos
        IntStream.range(1, 4)
                .forEach(i -> foos.add(new Foo("Foo" + i)));

        // create bars
        foos.forEach(f -> IntStream
                        .range(1, 4)
                        .forEach(i -> f.bars.add(new Bar("Bar" + i + " <- " + f.name))));

        foos.stream()
                .flatMap(f -> f.bars.stream())
                .forEach(b -> System.out.println(b.name));

       }

}
