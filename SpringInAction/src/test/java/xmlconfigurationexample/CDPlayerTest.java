package xmlconfigurationexample;

import xmlconfigurationexample.soundcheck.CompactDisc;
import xmlconfigurationexample.soundcheck.MediaPlayer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xmlconfigurationexample.soundcheck.BlankDisk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/soundcheck.xml")
public class CDPlayerTest {

    private CompactDisc compactDisc;


    private MediaPlayer player;

    @Before
    public void init(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/soundcheck.xml");
        compactDisc = (BlankDisk) context.getBean("compactDisc");
        player = (MediaPlayer) context.getBean("player");
    }

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
        ApplicationContext context = new AnnotationConfigApplicationContext();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String s : beanDefinitionNames){
            System.out.println(s);
        }
    }

}
