
import java.io.*;


public class ReadText {

    public static void main(String[] args) {
      
        try {
            File myFile=new File("FileText.txt");
            FileReader fileReader=new FileReader(myFile);

            BufferedReader reader=new BufferedReader(fileReader);

            String line=null;
            while((line=reader.readLine())!=null){
                System.out.println(line);
                
            }
            System.out.println("Reading file completed");
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
    } 
       
}