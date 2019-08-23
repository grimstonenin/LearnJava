package various;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMultiThreading {

    public static void main(String[] args){

        StringCreator stringCreator = new StringCreator("I start with this ");
        ExecutorService workers = Executors.newFixedThreadPool(20);
        for(int i =0; i < 20; i++ ){
            int finalI = i;
            workers.execute( () -> {
                System.out.println( stringCreator.updateString("and I am thread number " + finalI));
            });
        }

        workers.shutdown();
    }

}


class StringCreator {

    String input;

    public StringCreator(String input) {
        this.input = input;
    }

    public String updateString(String toAdd){
        return this.input + toAdd;
    }
}