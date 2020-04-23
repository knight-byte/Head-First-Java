//Random number guessing game  page 40
//modified game

import java.util.Scanner;

class GuessGame {
 String p1;                               //player 1
 String p2;                               //player 2
 String p3;                               //player 3
 int guess1=0,guess2=0,guess3=0,num,turns;                //player guesses
 public void details(){
      Scanner name = new Scanner(System.in);
     System.out.print("enter player one name: ");
     String name1=name.nextLine();
     p1=name1;
     System.out.print("enter player two name: ");
     name1=name.nextLine();
     p2=name1;
     System.out.print("enter player Three name: ");
     name1=name.nextLine();
     p3=name1;
     name.close();
     
 }
 void Game(){
     int s1=0,s2=0,s3=0;
     Scanner t=new Scanner(System.in);
     System.out.println(p1+"'s one no.: ");
     guess1=t.nextInt();
     System.out.println(p2+"'s no.: ");
     guess2=t.nextInt();
     System.out.println(p3+"'s no.: ");
     guess3=t.nextInt();
     System.out.println("enter no. of rounds to play");
     turns=t.nextInt();
     t.close(); 
     for(int i=0; i<turns;i++)
     {
        num= (int) (Math.random() * 10);
        if(guess1==num) {
            s1=s1+1;
        }
        if (guess2==num) {
            s2=s2+1;
        }
        if (guess3==num) {
            s3=s3+1;
        }
        System.out.println("After round "+(i+1)+" scores are : \n"+p1+" : "+s1+"\n"+p2+" : "+s2+"\n"+p3+" : "+s3+"\n\n");
        System.out.println("the original no. was "+num);
    }
    System.out.println("\nAfter Final round scores are : \n"+p1+" : "+s1+"\n"+p2+" : "+s2+"\n"+p3+" : "+s3+"\n\n");
}

}
class Results{
    public static void main(String[] args) {
        GuessGame obj=new GuessGame();
       obj.details();
       obj.Game();
    }
}