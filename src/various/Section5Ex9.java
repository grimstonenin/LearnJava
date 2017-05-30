package various; /**
 * (Find the two highest scores) Write a program that prompts the user to enter the
 number of students and each student’s name and score, and finally displays the
 student with the highest score and the student with the second-highest score.
 */

import java.util.Scanner;

public class Section5Ex9 {
    public static void main(String[] args){
        int max1 = 0;
        int max2 = 0;
        int tempGrade;
        int numberOfStudents;
        String nameOfNumber1="";
        String nameOfNumber2="";
        String tempStudent;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of studens: ");

        numberOfStudents = input.nextInt();
        input.nextLine();

        for(int i=1;i<=numberOfStudents;i++){
            System.out.println("Please enter the name of the student: ");
            tempStudent=input.nextLine();
            System.out.println("Please enter the grade of the student: ");
            tempGrade = input.nextInt();
            input.nextLine();

            if(tempGrade>max1){

                max2 = max1;
                nameOfNumber2 = nameOfNumber1;

                max1 = tempGrade;
                nameOfNumber1 = tempStudent;
            } else if(tempGrade>max2){
                max2 = tempGrade;
                nameOfNumber2 = tempStudent;
            }
        }

        System.out.printf("The first student is %s with a score of %d.\nThe name of the second student is %s with a score of %d.", nameOfNumber1,max1,nameOfNumber2,max2 );

    }
}
