package xmlconfigurationexample.soundcheck;

import java.util.List;

public class BlankDisk implements CompactDisc{

   private String title;
   private String artist;
   private List<String> tracks;


   public BlankDisk(){

   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public String play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
        return ("Playing " + title + " by " + artist);
    }

    public String playSong(int i){
       return this.tracks.get(i);
    }
}
