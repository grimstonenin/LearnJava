package codewars;

//Create a function isAlt() that accepts a string as an argument and validates whether the vowels (a, e, i, o, u) and consonants are in alternate order.
//
//        isAlt("amazon")
//// true
//        isAlt("apple")
//// false
//        isAlt("banana")
//// true

import java.util.ArrayList;
import java.util.List;

public class AltClass {
    public static boolean isAlt(String word) {


        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        char[] letters = word.toCharArray();

        int i = 0;
        while(i<letters.length-1){
            if(vowels.contains(letters[i])){
                if(!vowels.contains(letters[i+1])){
                    i++;
                } else{
                    return false;
                }
            } else {
                if(vowels.contains(letters[i+1])){
                    i++;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isAlt("amazon"));
        System.out.println(isAlt("apple"));
        System.out.println(isAlt("banana"));
    }
}
