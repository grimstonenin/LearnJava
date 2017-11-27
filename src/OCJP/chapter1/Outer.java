package OCJP.chapter1;

public class Outer {

    private String greeting = "hi";

    protected class Inner{

        private int count = 3;

        public void go(){
            for(int i = 0; i<count; i++){

                System.out.println(greeting);

            }
        }

    }

    public void sayGreeting(){
        Inner inner = new Inner();

        inner.go();
    }

    public static void main(String[] args){

        Outer outer = new Outer();

        outer.sayGreeting();


        Outer outer1 = new Outer();

        Inner inner = outer1.new Inner();

        inner.go();

    }
}
