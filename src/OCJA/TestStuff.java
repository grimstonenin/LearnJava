package OCJA;

import java.time.*;
import java.time.format.*;


public class TestStuff {


    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);


        Period anually = Period.ofYears(1);

        Period monthly = Period.ofMonths(1);

        System.out.println(localDate.plus(anually).plus(monthly));

        System.out.println("-------------------");
        System.out.println();

        DateTimeFormatter shortDateTime = DateTimeFormatter.BASIC_ISO_DATE;

        System.out.println(shortDateTime.format(localDateTime));

        System.out.println(localDateTime.format(shortDateTime));

    }

}