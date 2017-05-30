package various; /**
 * (Count positive and negative numbers and compute the average of numbers) Write
 a program that reads an unspecified number of integers, determines how many
 positive and negative values have been read, and computes the total and average of
 the input values (not counting zeros). Your program ends with the input 0. Display
 the average as a floating-point number.
 */
import java.util.Scanner;
public class Section5Ex1 {
    public static void main(String[] args){
        double avg;
        int positive = 0;
        int negative = 0;
        double total = 0;
        int count = 0;
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");

        while((number = input.nextInt())!=0){

            count++;
            if(number>0){
                positive++;
            }
            else{
                negative++;
            }

            total = total + number;
        }
        avg = total/count;

        System.out.println("Total number of positives is " + positive);
        System.out.println("Total number of negatives is " + negative);
        System.out.println("Total is: " + total);
        System.out.println("Average is: " + avg);

    }
}
