package OCJP.chapter7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager {

    public static void main(String[] args) {

        ExecutorService executorService = null;

        try {
            executorService = Executors.newFixedThreadPool(4);
            LionPenManager lionPenManager = new LionPenManager();
            for(int i = 0; i<4; i++){
                CyclicBarrier c1 = new CyclicBarrier(3);
                CyclicBarrier c2 = new CyclicBarrier(3, () -> System.out.println("***PEN CLEANED***"));
                executorService.submit(() -> lionPenManager.performTask(c1, c2));
            }
        } finally {
            if(executorService != null ) executorService.shutdown();
        }


    }

    private void removeAnimals(){
        System.out.println("Removing animals!");
    }

    private void cleaningPen(){
        System.out.println("Cleaning pen!");
    }

    private void addAnimals(){
        System.out.println("Adding animals!");
    }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2){
        try {
            removeAnimals();
            c1.await();
            cleaningPen();
            c2.await();
            addAnimals();
        } catch (InterruptedException| BrokenBarrierException e){
            e.printStackTrace();
        }
    }

}
