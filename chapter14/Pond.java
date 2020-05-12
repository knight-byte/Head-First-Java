
import java.io.*;
import java.net.*;


public class Pond implements Serializable {

   transient private Duck duck = new Duck();   //Duck class object 

    //if we comment this out then it will be fine and will compile without any error
    //or use TRANSIENT keyword to skip that line during serialization



    public static void main (String[] args) {
       Pond myPond = new Pond();      
       try {
         FileOutputStream fs = new FileOutputStream("Pond.sr");  
         ObjectOutputStream os = new ObjectOutputStream(fs);
         
         os.writeObject(myPond);
         os.close();
      } catch(Exception ex) {
          ex.printStackTrace();
      }
   }
}



class Duck {   //or if we make this serializable then it will be compiled without any error
   // duck code here
}

//it wont compile as Duck is not serializable and Duck class obj is present in the pond class 
//and condition for serialization is that it serialize entirely or nothing and thrown an error