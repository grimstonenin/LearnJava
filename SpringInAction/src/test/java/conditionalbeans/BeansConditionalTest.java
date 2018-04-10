package conditionalbeans;

import conditionalbeans.beans.ConditionalBeanA;
import conditionalbeans.beans.ConditionalBeanB;
import conditionalbeans.beans.ConditionalConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConditionalConfiguration.class)
public class BeansConditionalTest {

    @Autowired
    private ConditionalBeanA conditionalBeanA;

    @Autowired
    private ConditionalBeanB conditionalBeanB;



    @Test
    public void testBothBeansAreNull(){
        assertNull(conditionalBeanA);
        assertNull(conditionalBeanB);
    }

}
