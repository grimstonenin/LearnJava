package xmlconfigurationexample.soundcheck;

import org.springframework.stereotype.Component;


public class SgtPeppers implements CompactDisc {

    private final String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public String play() {
        System.out.println("Playing " + title + " by " + artist);
       return ("Playing " + title + " by " + artist);
    }

    public String playSong(int i) {
        return null;
    }
}
