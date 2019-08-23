package OCJP.chapter7;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class WeighAnimalAction extends RecursiveAction {

    private int start;
    private int end;
    private Double[] weights;

    public WeighAnimalAction(int start, int end, Double[] weights) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }

    @Override
    protected void compute() {
        if(end - start <= 3){
            for(int i = start; i<=end; i++){
                weights[i] = (double) new Random().nextInt(100);
                System.out.println("Animal weighs: " + i);
            }
        } else {
            int middle = start + (end - start)/2;
            System.out.println("[start] = " + start + " [middle] = " + middle + " [end] = " + end);
            invokeAll(new WeighAnimalAction(start, middle, weights), new WeighAnimalAction(middle,end, weights));
        }
    }

    public static void main(String[] args){
        Double[] weights = new Double[100];
        ForkJoinTask<?> task = new WeighAnimalAction(0, weights.length-1, weights);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);

        System.out.println("Weights: ");

        Arrays.asList(weights).stream().forEach(System.out::println);

    }
}
