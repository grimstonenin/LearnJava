package OCJP.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class HappyBirthday {


    private static String decryptMessage(int... input){

        StringBuilder s = new StringBuilder();

        for(int i : input){
            s.append((char) i);
        }

        return s.toString();
    }

    private static int[] convert(String s){


       String[] split =  s.split(" ");

       int[] result = new int[split.length];

       for(int i = 0; i<split.length;i++){

           result[i] = Integer.parseInt(split[i]);

       }

        return result;
    }

    public static void main(String[] args){

        System.out.println("Please enter key to decrypt:");

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();



//        int[] input = {76, 97, 32, 109, 117, 108, 116, 105, 32, 97, 110, 105, 33, 32, 83, 97, 110, 97, 116, 97, 116, 101, 32, 109, 117, 108, 116, 97, 32, 115, 105, 32, 102, 101, 114, 105, 99, 105, 114, 101, 33 };

        System.out.println(decryptMessage(convert(input.trim())));

    }
}
