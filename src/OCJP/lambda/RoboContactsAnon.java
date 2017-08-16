package OCJP.lambda;

import java.util.List;

public class RoboContactsAnon {

    public void phoneContacts(List<Person> list,MyTest<Person> aTest){
        for (Person p:list){
            if(aTest.test(p)){
                roboCall(p);
            }
        }
    }

    public void emailContacts(List<Person> list, MyTest<Person> aTest){
        for(Person p: list){
            if(aTest.test(p)){
                roboEmail(p);
            }
        }
    }

    public void mailContacts(List<Person> list, MyTest<Person> aTest){
        for(Person p: list){
            if(aTest.test(p)){
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
