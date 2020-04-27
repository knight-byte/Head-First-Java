//modified Simple Dot com game

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;




class DotCom {
 ArrayList<String> LocationCell;
//int numOfHits=0;
String name;


void setName(String n){
    name=n;
}
String checkYouself(String userguess)
{
    String result = "miss";
    int index = LocationCell.indexOf(userguess);      
  
    if (index >= 0) {                              
        LocationCell.remove(index);
       
       if (LocationCell.isEmpty()) {
           result = "kill";
           System.out.println(" Ouch! You sunk " + name + "  : (  ");
       } else {
           result = "hit";
       }                  
    } 
     return result;

}

void setLocationCel(ArrayList<String> cellLocations)
{
LocationCell=cellLocations;
}
}
class GameHelper{
    static final String alphabet="abcdefg";
    int gridlenght=7;
    int gridsize=49;
    int [] grid=new int[gridsize];
    int comCount=0;

            public String getUserInput(String Prompt){
            String inputLine=null;
            System.out.print(Prompt+" ");
            try {
                BufferedReader is=new BufferedReader(
                    new InputStreamReader(System.in));
                    inputLine=is.readLine();
                    if(inputLine.length()==0) return null;
            } catch (IOException e) {
               
                System.out.println("IOException: "+ e);
            }
            return inputLine.toLowerCase();
        }
        public ArrayList<String> placeDotCom(int comSize) {
            ArrayList<String> alphacells=new ArrayList<String>();
           // String[] alphacoords=new String[comSize];
            String temp=null;
             int[] coords=new int[comSize];
             int attemps=0;
             boolean success=false;
             int location=0;
             comCount++;
             int incr=1;
             if((comCount%2)==1){
                 incr=gridlenght;
             }
              while (!success& attemps++ <200) {
                  location=(int)(Math.random()*gridsize);
               
                  
                  int x=0;
                  success=true;
                  while (success&& x<comSize) {
                      if (grid[location]==0) {
                          coords[x++]=location;
                          location +=incr;
                          if(location>=gridsize){
                              success=false;
                            }
                            if (x>0 && (location% gridlenght==0)) {
                                success=false;
                          }
                      }
                      
                      else {
                          System.out.println("used : " + location);
                          success=false;
                        }
                    }
                    System.out.println("try : " + location);
              }
              int x=0;
              int row=0;
              int column=0;
              while (x<comSize) {
                  grid[coords[x]]=1;
                  row=(int ) (coords[x]/gridlenght);
                  column=coords[x]%gridlenght;
                  temp=String.valueOf(alphabet.charAt(column));
                  alphacells.add(temp.concat(Integer.toString(row)));
                  x++;
                //   System.out.println("column : " + column);
                //   System.out.println("row : " + row);
                //   System.out.println("aplha : " + alphacells);
              }
          return alphacells;
        }
    }


class DotComBust{
   GameHelper Helper=new GameHelper();
   ArrayList<DotCom> dotComslist=new ArrayList<DotCom>();
   int numOfGuesses=0;
   
   void setUpgame(){
        DotCom d1=new DotCom();
        d1.setName("pets.com");
        DotCom d2=new DotCom();
        d2.setName("eToys.com");
        DotCom d3=new DotCom();
        d3.setName("Go2.com");
        dotComslist.add(d1);
        dotComslist.add(d2);
        dotComslist.add(d3);
        for(DotCom dotComToSet: dotComslist){
           ArrayList<String> newlocation= Helper.placeDotCom(3);
           dotComToSet.setLocationCel(newlocation);

        }
    }
    void startPlaying(){
        while (!dotComslist.isEmpty()) {
            String userguess=Helper.getUserInput("Enter a guess");
            checkUserGuess(userguess);
        }
        finishGame();
    }
    void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result="miss";
        for(DotCom Dotobj : dotComslist ){
        result=Dotobj.checkYouself(userGuess);
        if(result.equals("hit")){
           break;
        }
        if(result.equals("kill")){
            dotComslist.remove(Dotobj);
            break;
        }
        }
       System.out.println(result);
    }
    void finishGame(){
        System.out.println("GAME OVER!");
        }
}
public class DotComTestDrive{
public static void main(String[] args) {
 /* int numGuessed=0;
  int numofgusses=0;
  boolean alive=true;
  DotCom obj=new DotCom();
  Scanner guess=new Scanner(System.in);
  int random=(int)(Math.random()*5);
  ArrayList<String> location={random,random+1,random+2} ;
  
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
  */
  DotComBust game=new DotComBust();
  game.setUpgame();
  game.startPlaying();
}
}