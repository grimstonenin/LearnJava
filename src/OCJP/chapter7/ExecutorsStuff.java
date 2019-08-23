package OCJP.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsStuff {

    public static void main(String[] args){

        ExecutorService executorService = null;

        try{
            executorService = Executors.newSingleThreadExecutor();
            System.out.println("Begin");
            executorService.execute(()-> System.out.println("This is task one."));
            executorService.execute(()->{for(int i=0;i<50;i++) System.out.println("this is i: " + i);});
            executorService.execute(()-> System.out.println("This is the last task!!!"));
            System.out.println("Done");

        } finally {
            executorService.shutdown();
        }

    }
}
