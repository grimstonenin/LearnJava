package codewars;
//Clocky Mc Clock-Face
public class Dinglemouse {

    public static String whatTimeIsIt(final double angle) {

        int roundAngle = (int) angle;

        int hour = roundAngle/30;

        double minute = (angle%30)*2;

        if(hour==0||hour==12) return String.format("12:%02d",(int)minute);

        return String.format("%02d:%02d",hour,(int)minute);
    }

    public static void main(String[] args){

        System.out.println(whatTimeIsIt(114.938d));

    }

}
