//DogTestDrive program on page 73

class Dog {
int size;
String name;

void bark(){
    if (size>60) {
        System.out.println("Wooof! Wooof!");
    } else if(size>14) {
        System.out.println("Ruff! Ruff!");
    }
    else{
        System.out.println("Yip! Yip!");
    }
}
}
class DogTestDrive{
    public static void main(final String[] args) {
        final Dog one = new Dog();
        one.size = 70;
        final Dog two = new Dog();
        two.size = 8;
        final Dog three = new Dog();
        three.size=35;

        one.bark();
        two.bark();
        three.bark();
    }
}