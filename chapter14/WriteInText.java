
import java.io.*;


public class WriteInText {
    public static void main(String[] args) {
        try {
            
            FileWriter writer=new FileWriter("fileText.txt");
            writer.write("PEACE OUT");
            writer.close();

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
