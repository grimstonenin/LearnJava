package qualifyingbeans;

import org.springframework.stereotype.Component;

@Component
public class Cookie implements Desert{
    public String message() {
        return "Cookie";
    }
}
