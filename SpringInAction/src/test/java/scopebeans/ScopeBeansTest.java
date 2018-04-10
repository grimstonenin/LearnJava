package scopebeans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScopeBeansConfiguration.class)
public class ScopeBeansTest {

    @Autowired
    private BeanIsSingleton beanIsSingleton1;

    @Autowired
    private BeanIsSingleton beanIsSingleton2;

    @Autowired
    private BeanIsPrototype beanIsPrototype1;

    @Autowired
    private BeanIsPrototype beanIsPrototype2;

    @Test
    public void testSingletonBeansReturnCountOne(){
        assertEquals(1,beanIsSingleton1.getCounter());
        assertEquals(1, beanIsSingleton2.getCounter());
    }

    @Test
    public void testPrototypeBeansReturnCountTwo(){
        assertEquals(2, beanIsPrototype1.getCounter());
        assertEquals(2, beanIsPrototype2.getCounter());
    }
}
