import java.util.Scanner;

public class Section4ex2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double result;

        double earthRadius = 6371.01;

        System.out.println("Enter point 1 (latitude and longitude) in degrees:");

        double x1;
        double y1;

        x1 = Math.toRadians(input.nextDouble());

        y1 = Math.toRadians(input.nextDouble());

        System.out.println("Enter point 2 (latitude and longitude) in degrees:");

        double x2;

        double y2;

        x2 = Math.toRadians(input.nextDouble());

        y2 = Math.toRadians(input.nextDouble());

        result = earthRadius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between the two points is " + result);
    }
}
