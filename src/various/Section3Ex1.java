package various; /**
 (Algebra: solve quadratic equations) The two roots of a quadratic equation
 ax2 + bx + c = 0 can be obtained using the following formula:
 r1 =
 -b + 2b2 - 4ac
 2a
 and r2 =
 -b - 2b2 - 4ac
 2a
 b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 equation has two real roots. If it is zero, the equation has one root. If it is negative,
 the equation has no real roots.
 Write a program that prompts the user to enter values for a, b, and c and displays
 the result based on the discriminant. If the discriminant is positive, display two
 roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 has no real roots”.
 */

import java.util.*;

public class Section3Ex1 {

    private static int a;
    private static int b;
    private static int c;



    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter input parameters:");

        System.out.println("Enter parameter a: ");

        a = scanner.nextInt();

        System.out.println("Enter parameter b: ");

        b = scanner.nextInt();

        System.out.println("Enter parameter c: ");

        c = scanner.nextInt();

        int qResult = (b*b - 4*a*c);

        if(qResult<0){
            System.out.println("The equation has no real roots.");
        } else if (qResult == 0){
            System.out.println("The equation has one root: "+(float)(-b/(2*a)));
        } else {
            System.out.println("The equation has two roots: " + (float)(((-b) - Math.pow(qResult,0.5))/2*a) + " and " + (float)(((-b) + Math.pow(qResult,0.5))/2*a));
        }

    }
}
