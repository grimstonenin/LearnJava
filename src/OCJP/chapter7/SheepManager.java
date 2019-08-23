package OCJP.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {

    private AtomicInteger numberOfSheep = new AtomicInteger();

    private void incrementAndReport(){
        synchronized (this) {
            System.out.print(numberOfSheep.incrementAndGet() + " ");
        }
    }

    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        SheepManager sheepManager = new SheepManager();
        sheepManager.numberOfSheep.set(0);
        for(int i = 0 ; i < 20 ; i++){
            executorService.submit(() -> sheepManager.incrementAndReport());
        }

        executorService.shutdown();


    }
}
