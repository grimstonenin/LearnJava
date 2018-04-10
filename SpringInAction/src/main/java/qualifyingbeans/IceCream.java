package qualifyingbeans;

import org.springframework.stereotype.Component;

@Component

public class IceCream implements Desert {
    public String message() {
        return "Icecream";
    }
}
