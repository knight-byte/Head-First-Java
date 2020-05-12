import java.io.*;

public class DungeonTest {
    public static void main(String[] args) {
        DungeonGame d=new DungeonGame();
        
        
        System.out.println(d.getX()+d.getY()+d.getZ());
        try {
           
            FileOutputStream fos=new FileOutputStream("gd.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            
            oos.writeObject(d);
            oos.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        try {
            FileInputStream fis=new FileInputStream("gd.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);

            d=(DungeonGame) ois.readObject();
            
            ois.close();
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        System.out.println(d.getX()+d.getY()+d.getZ());
        
    }
}

class DungeonGame implements Serializable{
    public int x=3;
    transient long y=4;
    private short z=5;

    DungeonGame(){

    }
    public int getX(){
        return x;

    }

    public long getY(){
        return y;
    }

    public short getZ(){
        return z;
    }


}