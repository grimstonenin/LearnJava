package qualifyingbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Cake implements Desert{
    public String message() {
        return "Cake";
    }
}
