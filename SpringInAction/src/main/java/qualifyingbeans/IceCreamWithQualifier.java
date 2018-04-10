package qualifyingbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("icecream")
public class IceCreamWithQualifier implements DesertWithQualifiers {
    public String message() {
        return "Icecream";
    }
}
