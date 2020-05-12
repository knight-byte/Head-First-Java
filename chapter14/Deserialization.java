
import java.io.*;




public class Deserialization implements Serializable{
    public static void main(String[] args) {
    
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("fileCheck.sr"));

            SavedData restore=(SavedData) ois.readObject();

            System.out.println("Restored Area : "+restore.getArea());
            System.out.println("Restored length: "+restore.getlength());
            System.out.println("Restored breadth: "+restore.getbreath());


        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
    }
}

class SavedData implements Serializable{
    int area;
    int breadth;
    int length;
   public SavedData(int l,int b){
   length=l;
   breadth=b;
   area=length*breadth;
  }
   
  public int getbreath(){
    return breadth;
}

public int getlength(){
    return length;
}

public int getArea(){
    return area;
}


    }

