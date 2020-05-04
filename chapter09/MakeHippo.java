
class Animal{
    private String name;
    public String getName(){
        System.out.println("name : "+name);           //check*
        System.out.println("getname done\n");
        return name;
    }
    public Animal(String thename){
        name=thename;
        System.out.println("name : "+name);             //check*
        System.out.println("Animal string done\n");
    }
}

class Hippo extends Animal{
    public Hippo(String name){
        super(name);
        System.out.println("name : "+name);       //check*
        System.out.println("hippo done\n");
    }
}

public class MakeHippo {
    public static void main(String[] args) {
        Hippo h=new Hippo("Buffy");                  
        System.out.println(h.getName());
    }
}



//Check*- To check arguments running status step wise