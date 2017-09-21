package codewars;

import java.util.*;

public class PrimeDecomp {

    public static String factors(int n) {


        Map<Integer,Integer> factorsMap = new TreeMap<>();

        for(int i = 2; i <= n; i++){

            if(n%i == 0){
                if(factorsMap.containsKey(i)){
                    int getPower = factorsMap.get(i)+1;
                    factorsMap.put(i,getPower);
                }
                else {
                    factorsMap.put(i,1);
                }
                n /=i;
                i--;

            }
        }

        String result = "";


        for(int i : factorsMap.keySet()){

            if(factorsMap.get(i)==1) result+="("+i+")";
            else result+="("+i+"**"+factorsMap.get(i)+")";
        }
        return result;
    }




    public static void main(String[] args){
        System.out.println(factors(86240));
    }

}
