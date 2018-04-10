package lamda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Person {

    private enum Sex{
        MALE,FEMALE;
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailaddress;

    public int getAge(){

        ////
        return 0;
    }

    public void printPerson(){
        //
    }

    //general approach - personalized methods

    public static void printPersonsOlderThan(List<Person> roster, int age){

        for(Person p : roster){
            if (p.getAge() >= age){
                p.printPerson();
            }
        }

    }
}
