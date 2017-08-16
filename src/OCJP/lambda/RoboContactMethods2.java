package OCJP.lambda;

import java.util.List;

public class RoboContactMethods2 {

    public void callDrivers(List<Person> people){
        for(Person p:people){
            if(isDriver(p)){
                roboCall(p);
            }
        }
    }

    public void emailDraftees(List<Person> people) {
        for (Person p: people){
            if(isDraftee(p)){
                roboEmail(p);
            }
        }
    }

    public void mailPilots(List<Person> people) {
        for(Person p: people){
            if(isPilot(p)){
                roboMail(p);
            }
        }
    }

    private boolean isDriver(Person p){
        return p.getAge()>=16;
    }

    private boolean isDraftee(Person p){
        return p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
    }

    private boolean isPilot(Person p){
        return p.getAge() >= 23 && p.getAge() <= 65;
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
