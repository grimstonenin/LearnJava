package qualifyingbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cookie")
public class CookieWithQualifier implements DesertWithQualifiers{
    public String message() {
        return "Cookie";
    }
}
