package qualifyingbeans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DesertConfiguration.class)
public class DesertsWithQualifiersAndPrimary {

    @Autowired
    private DesertWithQualifiers desert1;

    @Autowired
    @Qualifier("icecream")
    private DesertWithQualifiers desert2;

    @Autowired
    @Qualifier("cookie")
    private DesertWithQualifiers desert3;


    @Test
    public void testDeserts(){
        assertEquals(desert1.message(),"Cake");
        assertEquals(desert2.message(),"Icecream");
        assertEquals(desert3.message(), "Cookie");
    }
}
