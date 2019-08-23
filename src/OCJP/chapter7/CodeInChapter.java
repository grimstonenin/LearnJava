package OCJP.chapter7;

public class CodeInChapter {

     static int counter = 0;
    public static void main(String[] args) throws InterruptedException{


        Thread t = new Thread(
                () -> {
                   for(int i = 0; i<5000; i++) counter++;
                }
        );
        t.start();

        while(counter<1000){
            System.out.println("Still not there yet. " + counter);
            Thread.sleep(1000L);
        }

        System.out.println("Reached " + counter);
    }

}
