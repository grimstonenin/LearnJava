package scopebeans;

import org.springframework.stereotype.Component;

@Component
public class BeanIsSingleton {

    private static int count = 0;

    public BeanIsSingleton(){
        count++;
    }

    public static int getCounter() {
        return count;
    }
}
