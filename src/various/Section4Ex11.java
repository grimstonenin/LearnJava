package various; /**
 * (Decimal to hex) Write a program that prompts the user to enter an integer between
 0 and 15 and displays its corresponding hex number.
 */

import java.util.*;

public class Section4Ex11 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 to 15): ");

        int x = input.nextInt();

        System.out.printf("The hex value is %X",x);
    }
}
