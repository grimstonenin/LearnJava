package OCJP.chapter7;

import java.util.Arrays;

public class ParallelStreams {

    public static void main(String[] args){

       Integer i =  Arrays.asList(1,2,3,4,5,6,7,8,9).parallelStream().limit(5).skip(2).findFirst().get();
       Integer j = Arrays.asList(1,2,3,4,5,6,7,8,9).stream().limit(5).skip(2).findFirst().get();

        System.out.println(i);
        System.out.println(j);
    }


}
