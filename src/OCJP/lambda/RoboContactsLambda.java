package OCJP.lambda;

import java.util.List;
import java.util.function.Predicate;

public class RoboContactsLambda {

    public void phoneContacts(List<Person> list, Predicate<Person> predicate){
        for (Person p:list){
            if(predicate.test(p)){
                roboCall(p);
            }
        }
    }

    public void emailContacts(List<Person> list, Predicate<Person> predicate){
        for(Person p: list){
            if(predicate.test(p)){
                roboEmail(p);
            }
        }
    }

    public void mailContacts(List<Person> list, Predicate<Person> predicate){
        for(Person p: list){
            if(predicate.test(p)){
                roboMail(p);
            }
        }
    }

    public void roboCall(Person p){
        System.out.println("Calling " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getPhone());
    }

    public void roboEmail(Person p){
        System.out.println("EMailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getEmail());
    }

    public void roboMail(Person p){
        System.out.println("Mailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getAddress());
    }
}
