package OCJP;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TestDateTime {
    int x;

    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Now is: " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;

        System.out.println("Formatted date and time: " + now.format(formatter));

        System.out.println("Over a week: " + now.plusWeeks(1));

        LocalDateTime somedate = LocalDateTime.of(2021,4,18,14,15);

        System.out.println("New date in the future will be: " + somedate.getYear() + " " + somedate.getMonth()+ " " + somedate.getDayOfWeek());

        String test = "";

        test += 2;
        test+='c';
        test+=false;

        if(test.equals("2cfalse")) System.out.println("equals");

    }
}
