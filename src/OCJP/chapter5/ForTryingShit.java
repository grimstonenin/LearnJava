package OCJP.chapter5;

import java.time.*;
import java.util.Arrays;
import java.util.Locale;

public class ForTryingShit {

    public static void main(String[] args){

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime);


        System.out.println(localDate.plusYears(10L));

        System.out.println(localDate.toEpochDay());
        System.out.println(localDateTime.toEpochSecond(ZoneOffset.ofHours(0)));

        System.out.println(Locale.getDefault());

        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);
        Arrays.stream(Locale.getISOCountries()).forEach(System.out::println);



        assert (1==1);

    }
}
