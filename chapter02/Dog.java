//first class func example in page 36
class Dog {
 int size;
 String breed;
 String name;
 void bark(){
     System.out.println("Rufff! Ruff!");
 }
}
/**
 * InnerDog
 */
class InnerDog {
public static void main(String[] args) {
    Dog d=new Dog();     //creating object
    d.bark();
    d.size=40;
    System.out.println(d.size);
}
    
}