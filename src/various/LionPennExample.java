package various;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPennExample {

    private void removeAnimals() { System.out.println("Removing animals"); }

    private void cleanPen() { System.out.println("Cleaning the pen"); }

    private void addAnimals() { System.out.println("Adding animals"); }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) throws BrokenBarrierException, InterruptedException {
        removeAnimals();
        c1.await();
        cleanPen();
        c2.await();
        addAnimals();
    }
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4,()-> System.out.println("****Pens are cleaned!"));
            LionPennExample manager = new LionPennExample();
            for(int i = 0; i<4; i++){
                service.submit(() -> {
                    try {
                        manager.performTask(c1, c2);
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }
                }

                finally {
            if(service != null) service.shutdown(); }
    }
}
