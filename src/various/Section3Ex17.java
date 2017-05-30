package various; /**
 (Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
 game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
 wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
 scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
 2 and displays a message indicating whether the user or the computer wins, loses,
 or draws.
 */

import java.util.*;

public class Section3Ex17 {

    public static void main(String[] args){

        int choice;
        int counter = (int)(Math.random()*3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("scissor (0), rock (1), paper (2):");

        choice = scanner.nextInt();


        switch (counter){
            case 0: if(choice == counter){
                System.out.println("The computer is scissor. You are scissor. Draw!");
                System.exit(0);
            }

        }


    }
}
