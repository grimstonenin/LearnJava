package various; /**
 (Find future dates) Write a program that prompts the user to enter an integer for
 today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
 prompt the user to enter the number of days after today for a future day and display
 the future day of the week.
 */

import java.util.Scanner;

public class Section3Ex5 {

    
    
    public static void main(String[] args){
        
        int day;
        int elapsed;
        int newDay;
        String today = "";
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter today's date: ");
        day = input.nextInt();
        
        System.out.print("Enter the number of days elapsed since today: ");
        elapsed = input.nextInt();
        
        newDay = day + elapsed%7;
        
        switch (day){
            case 0:
                today = "Sunday";
                break;
            case 1:
                today = "Monday";
                break;
            case 2:
                today = "Tuesday";
                break;
            case 3:
                today = "Wednesday";
                break;
            case 4:
                today = "Thursday";
                break;
            case 6:
                today = "Friday";
                break;
            case 7:
                today = "Saturday";
                break;
        }
        
        switch (newDay){
            case 0:
                System.out.println("Today is " + today + " and the future day is " + "Sunday");
                break;
            case 1:
                System.out.println("Today is " + today + " and the future day is " + "Monday");
                break;
            case 2:
                System.out.println("Today is " + today + " and the future day is " + "Tuesday");
                break;
            case 3:
                System.out.println("Today is " + today + " and the future day is " + "Wednesday");
                break;
            case 4:
                System.out.println("Today is " + today + " and the future day is " + "Thursday");
                break;
            case 6:
                System.out.println("Today is " + today + " and the future day is " + "Friday");
                break;
            case 7:
                System.out.println("Today is " + today + " and the future day is " + "Saturday");
                break;
        }
        
        
    }
    
}
