package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaesarTwo {


    public static List<String> encodeStr(String s, int shift) {

        List<String> resultList = new ArrayList<>();

        StringBuilder encodedMessage = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            if((s.charAt(i)<=90 & s.charAt(i)>=65)||(s.charAt(i)<=122 & s.charAt(i)>=97)){
                encodedMessage.append(buildPrefix(s.charAt(i),shift));
                break;
            }
        }

        for(int i = 0; i<s.length(); i++){

           encodedMessage.append(encodeLetter(s.charAt(i),shift));

       }

        int length = encodedMessage.length();
        int perPart = (int)Math.ceil(length/5.0);
         for (int i = 0; i < length; i += perPart) {
                resultList.add(encodedMessage.substring(i, Math.min(length, i + perPart)));
            }




        return resultList;
    }

    public static String decode(List<String> s) {

        String encodedMessage = "";

        for(String a : s){
            encodedMessage += a;
        }

        String prefix = encodedMessage.substring(0,2);

        int shift = decodePrefix(prefix);

        System.out.println(shift);

        encodedMessage = encodedMessage.substring(2);

        StringBuilder decodedMessage = new StringBuilder();

        for(char c: encodedMessage.toCharArray()){
            decodedMessage.append(decodeLetter(c,shift));
        }

        return decodedMessage.toString();
    }

    private static char encodeLetter(char c, int shift){

        if(c<=90&c>=65){
            return (char)((c+shift%26>90) ? 64+(c+shift%26)-90 : c+shift%26);
        }

        if(c<=122&c>=97){
            return (char)((c+shift%26>122) ? 96+(c+shift%26)-122 : c+shift%26);
        }

        return c;
    }

    private static char decodeLetter(Character c, int shift){

        if(c<=90&c>=65){
            return (char)((c-shift%26>=65) ? c-shift%26 : 90-Math.abs(65-c+shift%26)+1);
        }

        if(c<=122&c>=97){
            return (char)((c-shift%26>=97) ? c-shift%26 : 122-Math.abs(97-c+shift%26)+1);
        }

        return c;


    }

    private static String buildPrefix(char firstChar,int shift){

        String prefix = "";

        if(firstChar<=90&firstChar>=65){
            firstChar = (char)(firstChar+32);
            prefix+=firstChar;
        } else {
            prefix += (char)firstChar;
        }

        prefix += (char)((firstChar+shift%26>122) ? 96+(firstChar+shift%26)-122 : firstChar+shift%26);

        return prefix;
    }

    private static int decodePrefix(String prefix){

        if(prefix.charAt(1)-prefix.charAt(0)>=0) return prefix.charAt(1)-prefix.charAt(0);

        else return 122-96-Math.abs(prefix.charAt(1)-prefix.charAt(0));

    }

    public static void main(String[] args){


      //  System.out.println("Encoding tests:");

      //  List<String> v = Arrays.asList("ijJ tipvme ibw", "f lopxo uibu z", "pv xpvme ibwf ", "b qfsgfdu botx", "fs gps nf!!!");

      //  System.out.println("Result: "+encodeStr("I should have known that you would have a perfect answer for me!!!",27));

      //   System.out.println("Expected: "+v);
        // System.out.println("Result: "+encodeStr("I have spread my dreams under your feet; Tread softly because you tread on my dreams. William B Yeats (1865-1939)",27));

        //List<String> v = Arrays.asList(I h[ave spread my dreams under your feet; Tread softly because you tread on my dreams. William B Yea]ts (1865-1939));

      //  System.out.println("Expected: "+v);

        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Decoding tests:");

        List<String> x = encodeStr("I have spread my dreams under your feet; Tread softly because you tread on my dreams. William B Yeats (1865-1939)",25);

        System.out.println("Result: "+decode(x));


        //System.out.println("Expected: "+"I should have known that you would have a perfect answer for me!!!");

    }
}
