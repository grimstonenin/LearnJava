package various;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            ransom[ransom_i] = in.next();
        }

        Map<String, Integer> magazineMap = new HashMap<>();

        for (String s1 : magazine) {
            Integer countWord = magazineMap.get(s1);
            if(countWord==null){
                countWord = 1;
            }else{
                countWord++;
            }
            magazineMap.put(s1, countWord);
        }

        for (String r : ransom) {

            Integer count = magazineMap.get(r);
            if (count!=null) {
                if(count==1) {
                    magazineMap.remove(r);
                } else {
                    magazineMap.put(r, count - 1);
                }
            }else{
                System.out.println("No");
                ;
            }
        }

        System.out.println("Yes");

    }
}





