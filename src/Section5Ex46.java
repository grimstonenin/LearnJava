/**
 * (Reverse a string) Write a program that prompts the user to enter a string and
 displays the string in reverse order.
 */
import java.util.*;
public class Section5Ex46 {
    public static void main(String[] args){
        String input;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a string: ");

        input = myScanner.nextLine();
        System.out.print("The reverse is: ");
        for(int i = input.length()-1; i>=0; i--){
            System.out.print(input.charAt(i));
        }
    }
}
