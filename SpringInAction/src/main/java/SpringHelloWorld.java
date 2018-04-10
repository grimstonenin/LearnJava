import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringHelloWorld {


    public static void main(String[] args){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringHelloWorld.class);
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        System.out.println(helloWorld.getMessage());
    }

}
