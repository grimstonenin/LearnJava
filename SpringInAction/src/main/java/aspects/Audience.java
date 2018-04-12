package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {


    @Pointcut("execution(* aspects.Performance.perform(..)))")
    public void performance(){

    }

    //with @Before and @After methods
//    @Before("performance()")
//    public void silencePhone(){
//        System.out.println("Silencing phones!");
//    }
//
//    @Before("performance()")
//    public void takeSeats(){
//        System.out.println("Taking seats!");
//    }
//
//    @AfterReturning("performance()")
//    public void applause(){
//        System.out.println("clap clap clap!");
//    }
//
//    @AfterThrowing("performance()")
//    public void demandRefund(){
//        System.out.println("We want our money back!");
//    }

    //with @Around method

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Taking seats!");
            System.out.println("Silencing phones!");
            jp.proceed();
            System.out.println("clap clap clap!");
        } catch (Throwable ex){
            System.out.println("We want our money back!");
        }
    }
}
