package codewars;

import java.util.Arrays;
//Statistics for an Athletic Association

public class Stat {

    public static String stat(String strg) {

        if(strg.equals("")) return "";

        String[] individual = strg.split(", ");

        int[] timeInSeconds = new int[individual.length];

        for(int i = 0; i<individual.length;i++){

            String[] s = individual[i].split("\\|");

            timeInSeconds[i] = Integer.parseInt(s[0])*3600 +
                               Integer.parseInt(s[1])*60 +
                                Integer.parseInt(s[2]);
        }

        int rangeInSeconds = range(timeInSeconds);
        int averageInSeconds = average(timeInSeconds);
        int medianInSeconds = median(timeInSeconds);


        return "Range: " + formatSecondsAsString(rangeInSeconds) + " " +
               "Average: " + formatSecondsAsString(averageInSeconds) + " " +
               "Median: " + formatSecondsAsString(medianInSeconds);
    }

    private static int range(int[] a){

        Arrays.sort(a);

        return a[a.length-1] - a[0];

    }

    private static int average(int[] a){

        int sum = 0;

        for(int x : a){
            sum+=x;
        }

        return sum/a.length;
    }

    private static int median(int[] a){

        Arrays.sort(a);
        int median;
        if (a.length % 2 == 0)
            median = (a[a.length/2] + a[a.length/2 - 1])/2;
        else
            median =  a[a.length/2];

        return median;
    }

    private static String formatSecondsAsString(int a){

int hours = 0;
int minutes = 0;
int seconds = 0;

hours = a/3600;
minutes = (a-(hours*3600))/60;
seconds = a%60;


        return String.format("%02d|%02d|%02d", hours,minutes,seconds);
    }

    public static void main(String[] args){

        System.out.println(stat("02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41"));

    }

}
