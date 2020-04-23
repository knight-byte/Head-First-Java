
public class PhraseMatrix {
public static void main(String[] args) {
    String[] wordlist1={"24/7","multiTier","30,000 foot","B-to-B","win-win","front-end", "web-based","pervasive", "smart", "six", "sigma","critical-path", "dynamic"};
   String[] wordList2 = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", 
    "clustered", "branded","outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", 
    "targeted", "shared", "cooperative", "accelerated"};
       String[] wordList3 = {"process", "tipping-point", "solution", "architecture", "core competency", 
    "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
    System.out.print("\n\n");
    //System.out.print("\003[H\033[2J");
    // System.out.flush(); 
int onelength=wordlist1.length;
int twolength=wordList2.length;
int threelength=wordList3.length;
int ran1= (int) (Math.random() * onelength);
int ran2=(int) (Math.random()*twolength);
int ran3= (int) (Math.random() * threelength);
String phrase= wordlist1[ran1]+" "+wordList2[ran2]+" "+wordList3[ran3];
System.out.println("What we need is an "+phrase);
  
}
}