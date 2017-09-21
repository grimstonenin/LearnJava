package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSumDig {

    public static long powerSumDigTerm(int n) {

    List<Long> a = new ArrayList<>();

            for (int b = 2; b < 400; b++) {
        long value = b;
        for (int e = 2; e < 50; e++) {
            value *= b;

            if (DigitSum(value) == b) {
                a.add(value);
            }
            if (a.size() > 50) break;
        }
        if (a.size() > 50) break;
    }

        Collections.sort(a);
        return a.get(n-1);

}

    private static int DigitSum(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n%10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args){

        System.out.println(powerSumDigTerm(1));
    }

}
