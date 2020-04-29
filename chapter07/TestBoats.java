
class RowBoat extends Boat{
    public void rowTheBoat(){
    System.out.print(" stroke natasha");
    }
}

class Boat{
    public int length;
    public void setLength(int len){
        length=len;
    }
     public int getlength(){
      return length;
     }
     public void move(){
         System.out.print("drift ");
     }
}

public class TestBoats {
 public static void main(String[] args) {
     Boat b1=new Boat();
     SailBoats b2=new SailBoats();
     RowBoat b3=new RowBoat();
     b2.setLength(32);
     b1.move();
     b3.move();
     b2.move();
 }
}

class SailBoats extends Boat{
    public void move(){
        System.out.print("hoist sail ");
    }
}