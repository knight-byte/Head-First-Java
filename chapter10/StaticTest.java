class SuperStatic{
    static{
        System.out.println("super Static block");
    }

    SuperStatic(){
        System.out.println("super staic constructor");
    }
}
 

public class StaticTest extends SuperStatic {

    static int rand;

    static{
        rand=(int) (Math.random()*6);
        System.out.println("Static block "+rand);
    }
    StaticTest(){
        System.out.println("static block  constructor");
    }
    public static void main(String[] args) {
        System.out.println("in home");
        StaticTest st=new StaticTest();
        
    }
}