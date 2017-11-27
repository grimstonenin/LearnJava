package OCJA;

interface Executable{
    int execute(int a);
}

class Runner{

    public void run(Executable e){
        System.out.println("Executing code block");
        int value = e.execute(8);
        System.out.println("Return value is: " + value);
    }
}

public class App {

    public static void main(String[] args){

        Runner runner = new Runner();
//
//        runner.run(new Executable() {
//            @Override
//            public int execute(int a) {
//                System.out.println("Hello There");
//                return 7 + a;
//            }
//        });

        System.out.println("=========================");

        runner.run((int a) -> {
            System.out.println("In lambda:");
            return 10+a;
        });
        


    }
}
