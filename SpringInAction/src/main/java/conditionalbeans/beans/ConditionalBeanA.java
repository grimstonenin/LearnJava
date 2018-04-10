package conditionalbeans.beans;

import org.springframework.stereotype.Component;

@Component
public class ConditionalBeanA {

    private final String message = "This is from bean A.";

    public String getMessage() {
        return message;
    }
}
