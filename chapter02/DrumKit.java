//drumkit problem in page 43

public class DrumKit {
boolean topHat=true;
boolean snare =true;
void playsnare(){
    System.out.println("bang bang ba-band");
}
void playTopHat(){
    System.out.println("ding ding da-ding");
}
}
class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d=new DrumKit();
        d.playsnare();
        d.snare=false;
        if (d.snare==true)
        {
            d.playsnare();
        }
        else{
            d.playTopHat();
        }

    }
}