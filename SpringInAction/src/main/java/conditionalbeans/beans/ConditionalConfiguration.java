package conditionalbeans.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfiguration {

    @Bean
    @Conditional(BeanACreationCondition.class)
    public ConditionalBeanA conditionalBeanA(){
        return new ConditionalBeanA();
    }

    @Bean
    @Conditional(BeanBCreationCondition.class)
    public ConditionalBeanB conditionalBeanB(){
        return new ConditionalBeanB();
    }
}
