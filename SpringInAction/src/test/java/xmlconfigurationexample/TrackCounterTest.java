package xmlconfigurationexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import xmlconfigurationexample.soundcheck.CompactDisc;
import xmlconfigurationexample.soundcheck.TrackCounter;
import xmlconfigurationexample.soundcheck.TrackCounterConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TrackCounterConfiguration.class)
public class TrackCounterTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter() {
        cd.playSong(1);
        cd.playSong(2);
        cd.playSong(3);
        cd.playSong(3);
        cd.playSong(3);
        cd.playSong(3);

        assertEquals(1,  counter.getPlayCount(1));
        assertEquals(1,  counter.getPlayCount(2));
        assertEquals(4,  counter.getPlayCount(3));
        assertEquals(0,  counter.getPlayCount(4));
        assertEquals(0,  counter.getPlayCount(5));
        assertEquals(0,  counter.getPlayCount(6));
    }
}
