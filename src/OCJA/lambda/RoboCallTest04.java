package OCJA.lambda;

import java.util.List;
import java.util.function.Predicate;

public class RoboCallTest04 {

    public static void main(String[] args) {

        List<Person> pl = Person.createShortList();
        RoboContactsLambda robo = new RoboContactsLambda();

        Predicate<Person> allDrivers = (Person p) -> p.getAge() >= 16;
        Predicate<Person> allDraftees = (Person p) -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
        Predicate<Person> allPilots = (Person p) -> p.getAge() >=23 && p.getAge() <=65;

        System.out.println("\n==== Test 04 ====");
        System.out.println("\n=== Calling all Drivers ===");
        robo.phoneContacts(pl,allDrivers);

        System.out.println("\n=== Emailing all Draftees ===");
        robo.emailContacts(pl,allDraftees);

        System.out.println("\n=== Mail all Pilots ===");
        robo.mailContacts(pl,allPilots);

    }

}
