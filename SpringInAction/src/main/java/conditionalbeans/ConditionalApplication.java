package conditionalbeans;

import conditionalbeans.beans.ConditionalBeanA;
import conditionalbeans.beans.ConditionalBeanB;
import conditionalbeans.beans.ConditionalConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionalApplication {

    static {
        System.setProperty("createBeanA","true");
        System.setProperty("createBeanB","true");
    }

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfiguration.class);



        ConditionalBeanA conditionalBeanA = (ConditionalBeanA) context.getBean("conditionalBeanA");
        ConditionalBeanB conditionalBeanB = (ConditionalBeanB) context.getBean("conditionalBeanB");

        System.out.println(conditionalBeanA.getMessage());
        System.out.println(conditionalBeanB.getMessage());

    }

}
