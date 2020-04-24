import java.util.Scanner;

public class MixFor5 {
public static void main(String[] args) {
    int x=0;
    int y=30;
    Scanner fun=new Scanner(System.in);
    System.out.println("enter the function no.to run: ");
    int funno=fun.nextInt();
    for (int outer=0;outer<3;outer++){
        for(int inner=4; inner>1;inner--){
       switch(funno){
           case 1: x=x+3;
           break;
           case 2: x=x+6;
           break;
           case 3: x=x+2;
           break;
           case 4: x++;
           break;
           case 5: x--;
           break;
           case 6: x=x+0;
           break;
           default: System.out.println("Enter a vallid no.");
       }
       y=y-2;
       if(x==6){
           break;
       }
       x=x+3;
     }
    y=y-2;
    }
    System.out.println(x+" "+y);
}
}