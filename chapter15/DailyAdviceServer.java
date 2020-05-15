import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
 public static void main(String[] args) {
     DailyAdviceServer server=new DailyAdviceServer();
     server.go();
 }   

 String[] AdviceList={"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat.", "One word: inappropriate",
  "Just for today, be honest. Tell your  boss what you *really* think", "You might want to rethink that haircut."};

  public void go(){
      try{
          ServerSocket serverSocket=new ServerSocket(4242);
          while(true){
              Socket sock=serverSocket.accept();
              PrintWriter writer=new PrintWriter(sock.getOutputStream());
              String advice=getAdvice();
              writer.println(advice);
              writer.close();
              System.out.println(advice);
          }
      }
      catch(IOException ex){
          ex.printStackTrace();
      }
  }

  private String getAdvice() {
      int rand=(int)(Math.random()*AdviceList.length);
      return AdviceList[rand];
  }


    
}