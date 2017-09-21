package codewars;

import java.math.BigInteger;

public class ThreeAmigos {

    public static int[] threeAmigos(final int[] numbers) {

        long minRange = Long.MAX_VALUE;

        int[] possibleResult = new int[]{};

        for(int i = 0; i <= numbers.length-3; i++){

            boolean odd = false;

            boolean even = false;

            int[] testAmigos = new int[]{numbers[i],numbers[i+1],numbers[i+2]};

            if(numbers[i]%2==0 & numbers[i+1]%2==0 & numbers[i+2]%2==0) even = true;

            if(numbers[i]%2!=0 & numbers[i+1]%2!=0 & numbers[i+2]%2!=0) odd = true;

            long range = 0;

            if(even||odd) {
                range = (long)Math.max(Math.max(numbers[i], numbers[i + 1]), numbers[i + 2]) -
                        (long)Math.min(Math.min(numbers[i], numbers[i + 1]), numbers[i + 2]);


                if (range < minRange) {

                    minRange = range;
                    possibleResult = testAmigos;
                }

            }
        }


        return possibleResult;
    }

    public static void main(String[] args){
        int[] result = threeAmigos(new int[]{-2147483648,-2147483648,2147483647,-2147483648,0,2147483646});
        for(int a : result) System.out.println(a);

      //  System.out.println(-(long)(Integer.MIN_VALUE));
    }
}

