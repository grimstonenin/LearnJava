package xmlconfigurationexample.soundcheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;


    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }

    public String play(){
       return compactDisc.play();
    }
}
