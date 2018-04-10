package javaconfigurationexample;

import javaconfigurationexample.soundcheck.CdPlayerConfig;
import javaconfigurationexample.soundcheck.CompactDisc;
import javaconfigurationexample.soundcheck.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer player;

    @Test
    public void testIsNotNull(){
        assertNotNull(compactDisc);
    }

    @Test
    public void play(){
        assertEquals(player.play(),"Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles");
    }

    @Test
    public void returnAllManagedBeans(){
        ApplicationContext context = new AnnotationConfigApplicationContext(CdPlayerConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String s : beanDefinitionNames){
            System.out.println(s);
        }
    }

}
