class Duck{
    int size;
    public Duck(){
        System.out.println("Default Constructor");      //Default constructor
    }
    public Duck(int newSize){                           // parameter constructor
        System.out.println("quack");
        size=newSize;
        System.out.println("Size is : "+size);
    }
}



public class UseADuck {
    public static void main(String[] args) {
        Duck d1=new Duck();                          //Default constructor      
        Duck d=new Duck(42);                         //parameter constructor
        
    }
}