import java.io.*;


public class Serialization implements Serializable {

    public static void main(String[] args) {
        SavedData obj=new SavedData(50,60);
        

        try{
        FileOutputStream fos=new FileOutputStream("fileCheck.sr");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(obj);
        oos.close();
        }

        catch(Exception e){e.printStackTrace();}


        
        
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