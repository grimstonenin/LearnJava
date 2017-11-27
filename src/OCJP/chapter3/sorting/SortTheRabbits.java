package OCJP.chapter3.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheRabbits {


    public static void main(String[] args){

        Rabbit rabbit1 = new Rabbit("Fluffy",4);
        Rabbit rabbit2 = new Rabbit("Bugs",2);
        Rabbit rabbit3 = new Rabbit("Fluffy",2);

        List<Rabbit> rabbits = new ArrayList<>();

        rabbits.add(rabbit1);
        rabbits.add(rabbit2);
        rabbits.add(rabbit3);


        //sort by id
        Collections.sort(rabbits);

        System.out.println("Sort by ID");

        for(Rabbit r : rabbits){
            System.out.println(r.getName() + " " + r.getId());
        }

        //sort by name

        Comparator<Rabbit> comparator = (o1,o2) -> o1.getName().compareTo(o2.getName());

        Collections.sort(rabbits,comparator);

        System.out.println("Sort by name");
        for(Rabbit r : rabbits){
            System.out.println(r.getName() + " " + r.getId());
        }


        //sort by multiple fields

        System.out.println("Sorting by multiple fields");

        Comparator<Rabbit> comparatorMultiple = Comparator.comparing(o1->o1.getName());

        comparatorMultiple = comparatorMultiple.thenComparing(o1->o1.getId());

        Collections.sort(rabbits,comparatorMultiple);

        for(Rabbit r : rabbits){
            System.out.println(r.getName() + " " + r.getId());
        }

    }

}
