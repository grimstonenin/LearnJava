package xmlconfigurationexample.soundcheck;

import java.util.List;

public class BlankDisk implements CompactDisc{

   private String title;
   private String artist;
   private List<String> tracks;


   public BlankDisk(String title, String artist, List<String> tracks){
       this.title = title;
       this.artist = artist;
       this.tracks = tracks;
   }


    public String play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
        return ("Playing " + title + " by " + artist);
    }
}
