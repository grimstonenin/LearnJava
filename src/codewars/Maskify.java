package codewars;

import java.util.Arrays;

public class Maskify {
    public static String maskify(String str) {

        if(str.length()>4){

            char[] chars = new char[str.length()-4];
            Arrays.fill(chars, '#');
            String text = new String(chars);
            text+=str.substring(str.length()-4);
            return text;
        } else {
            return str;
        }

    }
}
