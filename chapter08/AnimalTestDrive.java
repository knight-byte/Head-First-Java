import java.util.Scanner;

class Animal {
    String picture;
    String food;
    String hunger;
    String boundary;
    String location;
    
    public 
    void makeNoise(){}
    void eat(){}
    void sleep(){}
    void roam(){}
   
   }
   
   class Feline extends Animal{
       public void roam(){}
   }
   
   class canine extends Animal {
       public void Canine(){}
   }
   
   class Lion extends Feline{
       public
       void makeNoise(){}
       void eat(){}
      
   }
   
   class hippo extends Animal{
       public 
       void makeNoise(){}
       void eat(){}
   
   }
   
   class tiger extends Feline{
       public
       void makeNoise(){}
       void eat(){}
   
   }
   
   class Dog extends canine{
       public 
       void makeNoise(){}
       void eat(){}
   
   }
   
   class Cat extends Feline{
       public 
       void makeNoise(){}
       void eat(){}
   
   }
   
   class wolf extends canine{
       public
       void makeNoise(){}
       void eat(){}
   
   }



class MyAnimalList{
    private Animal[] animals =new Animal[5];
    private int nextIndex=0;

    public void add(Animal a){
        if(nextIndex<animals.length){
            animals[nextIndex]=a;
            System.out.println("animal addes at " +nextIndex);
            nextIndex++;
        }
    }
}

public class AnimalTestDrive {
 public static void main(String[] args) {
     MyAnimalList list=new MyAnimalList();
     Dog a=new Dog();
     Cat c=new Cat();
     list.add(a);
     list.add(c);
     System.out.println("\noutput for equals(Object o) : ");
     if(a.equals(c)){
          System.out.println("true");
      }
    else{ System.out.println("false");}

    System.out.println("\noutput for getclass() : ");
    System.out.println(c.getClass());

    System.out.println("\noutput for Hashcode() : ");
    System.out.println(c.hashCode());

    System.out.println("\noutput for toString() : ");
    System.out.println(c.toString());


 }
}