package codewars;

import java.util.HashMap;
import java.util.Map;

public class Line {

    public static String Tickets(int[] peopleInLine) {

        Map<Integer, Integer> change = new HashMap<>();

        change.put(25, 0);
        change.put(50, 0);
        change.put(100, 0);


        for (int i : peopleInLine) {

            if (i == 25) {
                change.put(i, change.get(i) + 1);
                continue;
            }

            if (i == 50) {
                if (change.get(25) > 0) {
                    change.put(i, change.get(i) + 1);
                    change.put(25, change.get(25) - 1);
                } else {
                    return "NO";
                }
            }

            if (i == 100) {
                change.put(i, change.get(i) + 1);
                if (change.get(50) > 0 & change.get(25) > 0) {
                    change.put(50, change.get(50) - 1);
                    change.put(25, change.get(25) - 1);
                } else {
                    if (change.get(25) > 2) {
                        change.put(25, change.get(25) - 3);
                    } else {
                        return "NO";
                    }
                }
            }


        }


        return "YES";
    }

    public static void main(String args[]) {
        System.out.println(Tickets(new int[]{25, 25, 50}));
    }

}
