

class Animal {
    String picture;
    String food;
    String hunger;
    String boundary;
    String location;
    
    public 
    void makeNoise(){}
    void eat(){
        System.out.println("Animal Eat");
    }
    void sleep(){}
    void roam(){}
    Animal(){
        System.out.println("Animal class constructor");
    }
   
   }
   
   class Feline extends Animal{
       
       public void roam(){}
       Feline(){
           System.out.println("feline class constructor");
       }
   }
   
   class canine extends Animal {
       public void Canine(){}
       canine(){
           System.out.println("Canine class constructor");
       }
   }
   
   class Lion extends Feline{
       public
       void makeNoise(){}
       void eat(){}
       Lion(){
           System.out.println("Lion Class constructor");
       }
      
   }
   
   class hippo extends Animal{
       public 
       void makeNoise(){}
       void eat(){
           System.out.println("hippo eat");
       }
       hippo(){
           
           System.out.println("Hippo class constructor");
       }
   
   }
   
   class tiger extends Feline{
       public
       void makeNoise(){}
       void eat(){}
       tiger(){
           System.out.println("Tiger class constructor");
       }
   
   }
   
   class Dog extends canine{
       public 
       void makeNoise(){}
       void eat(){}
       Dog(){
           System.out.println("Dog class constructor");
       }
   }
   
   class Cat extends Feline{
       public 
       void makeNoise(){}
       void eat(){}
       Cat(){
           System.out.println("Cat class constructor");
       }
       
    }
    
    class wolf extends canine{
        public
        void makeNoise(){}
        void eat(){}
        wolf(){
            System.out.println("Wolf class constructor");
        }
        
    }
    
    
    
    class MyAnimalList{
        private Animal[] animals =new Animal[5];
        private int nextIndex=0;
        
        public void add(Animal a){
            if(nextIndex<animals.length){
                animals[nextIndex]=a;
                System.out.println("\nanimal addes at " +nextIndex);
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
            
            /*
            */


            /*calling all the default constructor
            If you create any subclass obj. it will also
            call the superclass/parent class constructor*/


            // Animal a=new Animal();
            //Feline f=new Feline();
            // canine c=new canine();
            // hippo h=new  hippo();
            // Lion l=new Lion();
            // tiger t=new tiger();
            //Dog d=new Dog();
            // Cat Cc=new Cat();
            // wolf w=new wolf();

            

        }
                
}
