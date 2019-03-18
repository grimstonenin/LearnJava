package OCJP.chapter3;

import java.util.*;

public class CollectionsTest {

    public static void main(String[] args){

        List<String> list1;
        Set<String> set1;
        Queue<String> queue1;

        list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        System.out.println(list1);

        Queue<String> linkedList = (Queue<String>) list1;
        linkedList.add("C");
        linkedList.offer("D");
        System.out.println(linkedList);

        System.out.println(linkedList.element());
        System.out.println(linkedList);

        System.out.println(linkedList.peek()+ " : " + linkedList);
        System.out.println(linkedList.poll() + " : " + linkedList);


        System.out.println();
        System.out.println("---------------");
        System.out.println();

        queue1 = new ArrayDeque<>();
        queue1.add("A");
        queue1.add("B");



    }

}
