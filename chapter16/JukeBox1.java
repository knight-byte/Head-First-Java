import java.util.*;
import java.io.*;

public class JukeBox1 {
ArrayList<String> songList=new ArrayList<String>();

    public static void main(String[] args) {
        JukeBox1 juke=new JukeBox1();
        juke.go();
    }


    public void go(){
        getSong();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

    }

    void getSong(){
        try{
            File file=new File("SongList.txt");
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String line=null;
            while((line=reader.readLine())!=null){
                addSong(line);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    void addSong(String lineToParse){
        String[] token=lineToParse.split("/");
        songList.add(token[0]);
    }
}