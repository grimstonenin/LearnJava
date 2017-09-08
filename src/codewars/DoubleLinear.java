package codewars;

import java.util.*;

class DoubleLinear {

    public static int dblLinear (int n) {

        //My fucked up solution

//        TreeSet<Integer> interim1 = new TreeSet<>();
//        TreeSet<Integer> interim2 = new TreeSet<>();
//        TreeSet<Integer> results = new TreeSet<>();
//
//        interim1.add(1);
//        results.add(1);
//
//        while(interim1.size()<=n){
//
//            for(int i : interim1) {
//
//                interim2.add(i*2+1);
//                results.add(i*2+1);
//                interim2.add(i*3+1);
//                results.add(i*3+1);
//
//            }
//
//            interim1.clear();
//            interim1.addAll(interim2);
//            interim2.clear();
//        }
//
//        ArrayList<Integer> plm = new ArrayList<>(results);
//        System.out.println(plm.get(n));
//
//        return plm.get(n);


        // A pretty smart solution
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        for(int i = 0; i < n; i++){
            int x = numbers.first();
            numbers.add(2*x+1);
            numbers.add(3*x+1);
            numbers.remove(x);
        }
        return numbers.first();
    }

    public static void main(String[] args){
        System.out.println(dblLinear(10));
    }
}