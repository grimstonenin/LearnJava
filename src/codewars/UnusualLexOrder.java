package codewars;

import java.util.Arrays;
import java.util.Collections;

public class UnusualLexOrder {

    static String[] unusualLexOrder(String[] words) {

        String[] results = new String[words.length];

        String[] reversed = new String[words.length];

        for(int i=0; i<words.length;i++){
            reversed[i] = reverse(words[i]);
        }

        Collections.sort(Arrays.asList(reversed),(s1,s2)->{return s1.compareTo(s2);});

        for(int i=0; i<words.length;i++){
            results[i] = reverse(reversed[i]);
        }

        return results;
    }

    static String reverse(String word){
        StringBuilder reverseWord = new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            reverseWord.append(word.charAt(i));
        }
        return reverseWord.toString();
    }

    public static void main(String[] args){

        String[] toSort = {"nigeb", "ta", "eht", "gninnigeb"};

       for(String s:unusualLexOrder(toSort)){
           System.out.println(s);
       }


    }
}
