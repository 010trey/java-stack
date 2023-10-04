import java.util.HashMap;
import java.util.Map;

public class SongListDemo {

    public static void main(String[] args) {
        // Create a HashMap for the trackList
        Map<String, String> trackList = new HashMap<>();

        // Add songs to the trackList (song title as key and lyrics as value)
        trackList.put("Song 1", "Lyrics for Song 1");
        trackList.put("Song 2", "Lyrics for Song 2");
        trackList.put("Song 3", "Lyrics for Song 3");
        trackList.put("Song 4", "Lyrics for Song 4");

        // Retrieve and print lyrics for a specific song by title
        String songTitle = "Song 2";
        String lyrics = trackList.get(songTitle);
        if (lyrics != null) {
            System.out.println("Lyrics for " + songTitle + ": " + lyrics);
        } else {
            System.out.println("Song not found: " + songTitle);
        }

        // Print all track names and lyrics
        System.out.println("\nTrack List:");
        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            String trackTitle = entry.getKey();
            String trackLyrics = entry.getValue();
            System.out.println("Track: " + trackTitle);
            System.out.println("Lyrics: " + trackLyrics + "\n");
        }
    }
}
