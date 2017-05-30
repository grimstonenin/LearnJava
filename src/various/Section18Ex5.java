package various;//(Print the digits in an integer reversely) Write a recursive method that displays
//        an int value reversely on the console using the following header:
//public static void reverseDisplay(int value)
import java.util.Scanner;
public class Section18Ex5 {

    public static void reverseDisplay(int value){
        String reverse = "";
        reverse = ""+value%10;
        System.out.print(reverse);
        if(value/10>0){
            reverseDisplay(value/10);
        }
        }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        reverseDisplay(n);

    }

}
