package xmlconfigurationexample.soundcheck;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CdPlayerConfig {


    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }


    public MediaPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
