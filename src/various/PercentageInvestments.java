package various;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PercentageInvestments {

    public static void main(String[] args){
        DecimalFormat f = new DecimalFormat("##.00");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Starting amount: ");
        double startingAmount = keyboard.nextDouble();
        System.out.println("Number of days: ");
        int days = keyboard.nextInt();
        System.out.println("Win percentage: ");
        double percentageProfit = keyboard.nextDouble();
        double sum = startingAmount;

        for(int i = 0; i< days; i++){
            sum = sum + sum*percentageProfit;
        }


        System.out.println("Starting value was: " + startingAmount);
        System.out.println("After " + days + " days, the sum will be " + f.format(sum) + ".");
        System.out.println("Total profit rate is: " + f.format((sum/startingAmount)*100) + "%");
    }
}
