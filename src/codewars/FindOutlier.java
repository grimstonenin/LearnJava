package codewars;

import java.util.ArrayList;
import java.util.List;

public class FindOutlier {

    static int find(int[] integers){

        List<Integer> odds = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int i: integers){
            if(Math.floorMod(i,2)==0){
                even.add(i);
            } else {
                odds.add(i);
            }
        }

        if(odds.size()>even.size()){ return even.get(0);}
        else {
            return odds.get(0);
        }
    }

    public static void main(String[] args){

//        int[] exampleTest1 = {2,6,8,-10,3};
//        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
//        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
//
//        System.out.println(FindOutlier.find(exampleTest1));
//        System.out.println(FindOutlier.find(exampleTest2));
//        System.out.println(FindOutlier.find(exampleTest3));


        System.out.println(-11%2);
        System.out.println(-11%-2);

        System.out.println(Math.floorMod(-11,2));
        System.out.println(Math.floorMod(-11,-2));
    }
}
