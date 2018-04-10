package scopebeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanIsPrototype {

    private static int count = 0;

    public BeanIsPrototype() {
        count++;
    }

    public static int getCounter() {
        return count;
    }
}
