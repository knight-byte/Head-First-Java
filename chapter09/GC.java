import java.util.Scanner;

public class GC {
    public static GC dostuff(){
        GC newGC=new GC();
        dostuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2=new GC();
        GC gc3=new GC();
        GC gc4=gc3;
        gc1=dostuff();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the func no. : ");
        int i=scan.nextInt();
        switch(i){
            // case 1: copyGC=null;                             copyGC not valid beoz out of scope
            // break;
            case 2: gc2=null;
            break;
            // case 3: newGC=gc3;                               newGc not valid becoz out of scope
            // break;
            case 4: gc1=null;
            break;
            // case 5: newGC=null;                              newGc not valid becoz out of scope
            // break;    
            case 6: gc4=null;
            break;
            case 7: gc3=gc2;
            break;
            case 8: gc1=gc4;
            break;
            case 9: gc3=null;
            break;
            default:System.out.println("Enter a valid func no.");
            break;
        }
        scan.close();
    }

    public static void dostuff2(GC copyGC){
       GC localGC;
    }
}