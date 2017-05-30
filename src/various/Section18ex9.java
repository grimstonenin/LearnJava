package various; /**
 (Print the characters in a string reversely) Write a recursive method that displays
 a string reversely on the console using the following header:
 public static void reverseDisplay(String value)
 */
import java.util.Scanner;
public class Section18ex9 {

    public static void reverseDisplay(String value){

        if(value.length()==1){
            System.out.print(value.charAt(0));
        } else{
            System.out.print(value.charAt(value.length()-1));
            String temp = value.substring(0,value.length()-1);
            reverseDisplay(temp);
        }

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        reverseDisplay(s);

    }

}
