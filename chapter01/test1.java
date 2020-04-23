//test problem in page 23
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        System.out.println("enter the no.: ");
        Scanner inp=new Scanner(System.in);
        int input;
        input=inp.nextInt();
        inp.close();
        System.out.println("no. is : "+ input);
        while (x<5) {
        switch(input){
        case 1: y=x-y;
        break;
        case 2: y=y+x;
        break;
        case 3:{ y=y+2;
               if(y>4){y=y-1;}}
        break;
        case 4:{ x=x+1;
                y=y+x; }
        break;
        case 5:{ if (y<5) {
            x=x+1;
            if (y<3) {
                x=x-1;
            }
        }
            y=y+2; }
        break;
        default: System.out.println("Enter a valind function no.");
           System.exit(0);
        }
    
            System.out.print(x+""+ y+" ");
            x=x+1;
        }

    }

}