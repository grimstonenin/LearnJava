package OCJP.chapter3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BoundedWildcards {

    public static void main(String[] args){

        //Lower bound - can make list of object higher than or equal to IOException
        List<? super IOException> list = new ArrayList<Exception>();
        list.add(new IOException("IOEX"));
        list.add(new FileNotFoundException("FNEX"));

        for(Object ex : list) {
            System.out.println(ex);
        }

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        List<Exception> exceptions = new ArrayList<>();
        exceptions.add(new IOException("test1"));
        exceptions.add(new FileNotFoundException("test2"));
        List<? extends Exception> list2 = exceptions;
        printList(list2);
    }

    public static void printList(List<? extends Exception> list) {
        for(Exception e : list){
            System.out.println(e.getMessage());
        }
    }
}
