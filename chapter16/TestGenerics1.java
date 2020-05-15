public class TestGenerics1 {
    public static void main(String[] args) {
        TestGenerics1 obj=new TestGenerics1();
        obj.go();
    }

    public void go() {
        Animal[] animals={new Dog(),new Cat(),new Dog()};
        Dog[] dogs={new Dog(),new Dog(),new Dog()};
        takeAnimal(animals);
        takeAnimal(dogs);

    }

    public void takeAnimal(Animal[] animals) {
        for(Animal a: animals){
            a.eat();
        }
    }
}

abstract class Animal{
    void eat(){
        System.out.println("Animal eating");
    }
}
class Dog extends Animal{
    void barks(){}

}

class Cat extends Animal{
    void meow(){}
}