package codewars;

import java.util.Arrays;

public class SortArray {

    public static int[] sort(final int array[]) {
        Arrays.sort(array);
        return array;
    }


    public static void main(String[] args){

        int[] numbers = new int[]{4, 1, 3, 2};

        numbers = sort(numbers);

        for(int i: numbers){
            System.out.print(i);
        }

    }
}
