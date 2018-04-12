package xmlconfigurationexample.soundcheck;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter {

    private Map<Integer,Integer> trackCounts = new HashMap<Integer, Integer>();

    @Pointcut("execution(* BlankDisk.playSong(int)) " + "&& args(trackNumber)")
    private void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int i){
        return trackCounts.containsKey(i) ? trackCounts.get(i) : 0;
    }

}
