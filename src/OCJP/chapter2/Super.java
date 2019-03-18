package OCJP.chapter2;

//Method inheritance and hiding

public class Super {
     static String greeting(){
        return "Greetings";
    }
    String name() { return "Richard"; }
}

class Sub extends Super{
    static String greeting(){
        return "Hello";
    }
    String name() { return "John"; }

    public static void main(String[] args){
        Super s = new Sub();
        System.out.println(s.greeting() + " " + s.name());
    }
}
