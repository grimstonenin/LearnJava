/**
  (Occurrences of a specified character in a string) Write a recursive method that
 finds the number of occurrences of a specified letter in a string using the following
 method header:
 public static int count(String str, char a)
 For example, count("Welcome", 'e') returns 2. Write a test program that
 prompts the user to enter a string and a character, and displays the number of
 occurrences for the character in the string.
 */
import java.util.Scanner;

public class Section18Ex10 {

    public static int count(String str, char a){
       if(str.length()==1){
           if(str.charAt(0)==1){
               return 1;
           } else {
               return 0;
           }
       } else{
           if(str.charAt(str.length()-1)==a){
               return 1 + count(str.substring(0,str.length()-1),a);
           }
           else{
               return count(str.substring(0,str.length()-1),a);
           }
       }
    }

    public static void main(String[] args){
        String string = "";
        char a;

        Scanner input = new Scanner(System.in);

        string = input.nextLine();
        a = input.nextLine().charAt(0);

        System.out.println("Character " + a + " appears " + count(string,a) + " times.");
    }
}
