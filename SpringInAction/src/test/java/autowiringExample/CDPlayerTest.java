package autowiringExample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import autowiringexample.soundcheck.CdPlayerConfig;
import autowiringexample.soundcheck.CompactDisc;
import autowiringexample.soundcheck.MediaPlayer;

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

}
