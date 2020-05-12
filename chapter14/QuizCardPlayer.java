
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


public class QuizCardPlayer {

    JFrame frame;
    JTextArea display;
    JTextArea answer;
    ArrayList<QuizCard> CardList;
    QuizCard currentCard;
    int currentCardIndex;
    JButton nextButton;
    boolean isShowAnswer;


    public static void main(String[] args) {
        QuizCardPlayer reader=new QuizCardPlayer();
        reader.go();
                
    }


    public void go() {
        
        frame=new JFrame("Quiz Card Player");
        JPanel mainPanel=new JPanel();
        Font bigFont=new Font("sanserif",Font.BOLD,24);

        display=new JTextArea(10,20);
        display.setFont(bigFont);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setEditable(false);

        JScrollPane qScroller=new JScrollPane(display);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      
        nextButton=new JButton("Next Question");
        nextButton.addActionListener(new NextCardListener());

        mainPanel.add(qScroller);
        mainPanel.add(nextButton);

        JMenuBar menuBar=new JMenuBar();
        JMenu fileMenu=new JMenu("File");
        JMenuItem loadMenuItem=new JMenuItem("Load Card Set");

        loadMenuItem.addActionListener(new OpenMenuListener());
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(640,500);
        frame.setVisible(true);



    }



    class NextCardListener implements ActionListener{
        public void actionPerformed(ActionEvent ev) {
            
            if(isShowAnswer){
                display.setText(currentCard.getAnswer());
                nextButton.setText("Next Card");
                isShowAnswer=false;

            }else { 
                if(currentCardIndex<CardList.size()){
                    showNextCard();

                }else{
            display.setText("Thats was last Card");
            nextButton.setEnabled(false);
                }
            }
            
        }
    }




    class OpenMenuListener implements ActionListener{
        public void actionPerformed(ActionEvent ev) {

            JFileChooser fileOpen=new JFileChooser();
            fileOpen.showOpenDialog(frame);
            loadFile((fileOpen.getSelectedFile()));
            
        }
    }
    

    private void loadFile(File file){

        CardList=new ArrayList<QuizCard>();

        try {
            
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String line=null;
            while ((line=reader.readLine())!=null) {
                makeCard(line);

            }
            reader.close();

        } catch (Exception e) {
            System.out.println("Couldn't read the card File");
            e.printStackTrace();
            //TODO: handle exception
        }
        showNextCard();


    }



    private void makeCard(String lineToParse){

        String[] result=lineToParse.split("/");
        QuizCard card=new QuizCard(result[0],result[1]);
        CardList.add(card);
        System.out.println("made a card");

    }


    private void showNextCard() {
        currentCard=CardList.get(currentCardIndex);
        currentCardIndex++;
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show answer");
        isShowAnswer=true;
    }
}

class QuizCard{
    String question;
    String answer;
    QuizCard(String q,String a ){
     
        question=q;
        answer=a;

    }

    public String getQuestion(){
       return question;
    }

    public String getAnswer() {
        return answer;
    }
}