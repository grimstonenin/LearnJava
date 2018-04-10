package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestLamda {

    public static void main(String[] args){

        int x = 1;
        int y = 8;

        Predicate predicateA = (Object numA) -> (Integer) numA > 0;
        Predicate predicateB = (Object numA) -> (Integer) numA < 5;

        Predicate predicateC = predicateA.negate();

        Supplier<double[]> supplier = () -> {
            double[] result = new double[10];
            for (int i = 0; i<10; i++){
                result[i] = (Math.random()*10);
            }
            return result;
        };

        Operation a = (int numA, int numB) -> numA + numB;

        List doubleToFill = Arrays.asList(supplier.get());

        System.out.println(doubleToFill);

    }


}
