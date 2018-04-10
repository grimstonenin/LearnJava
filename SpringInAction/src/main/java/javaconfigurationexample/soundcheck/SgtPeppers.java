package javaconfigurationexample.soundcheck;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private final String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public String play() {
        System.out.println("Playing " + title + " by " + artist);
       return ("Playing " + title + " by " + artist);
    }
}
