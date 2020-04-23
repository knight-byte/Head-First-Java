//PoolPuzzelOne problem on page 24

public class PoolPuzzleOne {
public static void main(String[] args) {
    int x=0;
    while (x<3) {
        System.out.print("a");
        if (x<1) {
        System.out.print(" ");    
        }
        System.out.print("n");
        if (x<1) {
            System.out.print("oise");
            }
        if (x==1) {
            System.out.print("noys");
        }
        if(x>1){
            System.out.print(" oyster");
        }
        x=x+1;
        System.out.println("");
    }
}
}