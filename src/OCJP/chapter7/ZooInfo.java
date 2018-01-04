package OCJP.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {

    public static void main(String[] args){

        ExecutorService executorService = null;

        try{
            executorService = Executors.newSingleThreadScheduledExecutor();
            System.out.println("Begin");
            executorService.execute(() -> System.out.println("Printing zoo inventory"));
            executorService.execute(() -> {for(int i=0; i<3; i++)
                System.out.println("Printing record: "+i);});
            executorService.execute(() -> System.out.println("Printing zoo inventory"));
            System.out.println("End");
        } finally{
            if(executorService!=null){
                executorService.shutdown();
            }
        }


    }
}
