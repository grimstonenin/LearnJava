package qualifyingbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CakeWithQualifier implements DesertWithQualifiers{
    public String message() {
        return "Cake";
    }
}
