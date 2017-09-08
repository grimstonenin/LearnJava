package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consecutives {

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> results = new ArrayList<Integer>();

        int ref = s.get(0);
        int count = 0;

        for(int i = 0; i<s.size(); i++){
          if(ref == s.get(i)) {
              count++;
          }
          else {
              results.add(ref*count);
              ref = s.get(i);
              count = 1;
          }
        }

        results.add(ref*count);

        return results;
    }

    public static void main(String[] args){
        List<Integer> i = Arrays.asList(1,4,4,4,0,4,3,3,1);

        System.out.println(Consecutives.sumConsecutives(i));
    }

}