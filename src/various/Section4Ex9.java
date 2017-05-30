package various; /**
 * (Find the Unicode of a character) Write a program that receives a character and
 displays its Unicode.
 */
import java.util.*;
public class Section4Ex9 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        char a;

        System.out.println("Enter a character:");

        a = input.next().charAt(0);

        int result = (int) a;

        System.out.println("The Unicode for the character " + a + " is " + result);
    }
}
