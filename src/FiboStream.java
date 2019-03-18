import java.util.stream.Stream;

public class FiboStream {

    public static void main(String[] args){

        int n = 10;

        Stream.iterate(new int[]{0,1}, v->new int[]{v[1],v[0]+v[1]})
                .limit(n)
                .map(v->v[0])
                .forEach(System.out::println);
    }
}
