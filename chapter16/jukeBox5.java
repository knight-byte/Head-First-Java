
import java.util.*;
import java.io.*;

public class jukeBox5 {
    ArrayList<Song> songList = new ArrayList<Song>(); 
    public static void main(String[] args) {
        jukeBox5 juke=new jukeBox5();
        juke.go();
    }

class ArtistCompare implements Comparator<Song>{
    public int comapare(Song one,Song two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}

    public void go() {  
        getSongs(); 
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);  

        ArtistCompare artistCompare=new ArtistCompare();
        Collections.sort(songList,artistCompare);
        System.out.println(songList);
       } 
       void getSongs() {
        try {
         File file = new File("SongListMore.txt");
         BufferedReader reader = new BufferedReader(new FileReader(file));
         String line =  null;
         while ((line= reader.readLine()) != null) {
          addSong(line);
         }
        } catch(Exception ex) {
         ex.printStackTrace();
        }
       }
       void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);   
       }  
          
      }


class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm; 
    
    Song(String t, String a, String r, String b) {
     title = t;
     artist = a;
     rating = r;
     bpm = b;
    }

    public int compareTo(Song s){
      return title.compareTo(s.getTitle());
    }
    
    public String getTitle() {
     return title;
    }
    
    public String getArtist() { 
     return artist;
    }
    
    public String getRating() {
     return rating;
    }
    
    public String getBpm() {
     return bpm;
    }
     
    public String toString() {
     return title; 
    }  
   }