class GoodDog{
    private int size;
    public int getsize(){
        return size;
    }
    public void setsize(int s){
        size=s;
    }
    void bark(){
        if (size>60) {
            System.out.println("Wooof! Wooof!");
        }
        else if(size>14){
            System.out.println("Ruff! Ruff!");
        }
        else{
            System.out.println("Yip! Yip!");
        }
    }
}
public class GoodDogTestDrive {
public static void main(String[] args) {
    GoodDog one=new GoodDog();
    one.setsize(70);
    GoodDog two=new GoodDog();
    two.setsize(8);
    System.out.println("Dog one: "+one.getsize());
    System.out.println("Dog two: "+two.getsize());
    one.bark();
    two.bark();
}
}