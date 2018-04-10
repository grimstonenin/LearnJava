package qualifyingbeans;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


//no @primary or qualifiers - should throw error
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DesertConfiguration.class)
public class DesertsTest implements ApplicationContextAware{



    private ApplicationContext context;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Test(expected = NoUniqueBeanDefinitionException.class)
    public void testDesertWithNoQualifier(){

       Desert desert = context.getBean(Desert.class);

    }


}
