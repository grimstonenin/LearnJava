package OCJA.lambda;

import java.util.List;

public class RoboCallTest02 {

    public static void main(String[] args){
        List<Person> people = Person.createShortList();
        RoboContactMethods2 roboContactMethods2 = new RoboContactMethods2();

        System.out.println("\n==== Test 02 ====");
        System.out.println("\n=== Calling all Drivers ===");
        roboContactMethods2.callDrivers(people);

        System.out.println("\n=== Emailing all Draftees ===");
        roboContactMethods2.emailDraftees(people);

        System.out.println("\n=== Mail all Pilots ===");
        roboContactMethods2.mailPilots(people);

    }

}
