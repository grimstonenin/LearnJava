package OCJA.lambda;

import java.util.List;

public class RoboCallTest03 {

    public static void main(String[] args){
        List<Person> people = Person.createShortList();
        RoboContactsAnon roboContactsAnon = new RoboContactsAnon();

        System.out.println("\n==== Test 03 ====");
        System.out.println("\n=== Calling all Drivers ===");

        roboContactsAnon.phoneContacts(people, new MyTest<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge()>=16;
            }
        });

        System.out.println("\n=== Emailing all Draftees ===");

        roboContactsAnon.emailContacts(people, new MyTest<Person>() {
            @Override
            public boolean test(Person person) {
               return person.getAge() >= 18 && person.getAge() <= 25 && person.getGender() == Gender.MALE;
            }
        });

        System.out.println("\n=== Mail all Pilots ===");

        roboContactsAnon.mailContacts(people, new MyTest<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 23 && person.getAge() <= 65;
            }
        });

    }
}
