
class player{
    static int playerCount=0;
    private String name;
    public player(String n){
        name=n;
        playerCount++;
    }
}


public class playerTestDrive {
    public static void main(String[] args) {
        System.out.println(player.playerCount);
        player one=new player("Tiger Woods");
        System.out.println(player.playerCount);
    }
}