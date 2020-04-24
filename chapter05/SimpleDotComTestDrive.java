import java.util.Scanner;

class SimpleDotCom {
 int [] LocationCell=new int[7];
int numOfHits=0;
String checkYouself(String userguess)
{
    int num=Integer.parseInt(userguess);
    String result ="miss";
    
    for(int i:LocationCell)
    {
        if(num==i)
        {
          result="Hit";
           numOfHits++;
           break;
        }
    }
    
    if(numOfHits==LocationCell.length){
        result="kill";
        numOfHits=0;
    }
    System.out.println(result);
    return result;
}
void setLocationCel(int[] cellLocations)
{
LocationCell=cellLocations;
}

}
public class SimpleDotComTestDrive{
public static void main(String[] args) {
  int numGuessed=0;
  int numofgusses=0;
  boolean alive=true;
  SimpleDotCom obj=new SimpleDotCom();
  Scanner guess=new Scanner(System.in);
  int random=(int)(Math.random()*5);
  int[] location={random,random+1,random+2} ;
  
  while(alive==true){
   System.out.print("enter the no. : ");
   numGuessed=guess.nextInt();
   obj.setLocationCel(location);
   String userguess=Integer.toString(numGuessed);
   String Result=obj.checkYouself(userguess);
   if(Result.equals("kill")){
       alive=false;
   }
   numofgusses++;
  }
  System.out.println("you took "+numofgusses+" gusses");
  System.out.println("the random no was: "+random );
  guess.close();
}
}