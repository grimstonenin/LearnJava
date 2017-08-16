package OCJP;

import java.time.*;


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

    }

}