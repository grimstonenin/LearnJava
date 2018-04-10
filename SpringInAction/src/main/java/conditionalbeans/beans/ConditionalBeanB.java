package conditionalbeans.beans;

import org.springframework.stereotype.Component;

@Component
public class ConditionalBeanB {

    private final String message = "This is from bean B.";

    public String getMessage() {
        return message;
    }
}
