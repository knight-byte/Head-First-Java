
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;




public class QuizCardBuilder {

    JFrame frame;
    JTextArea question;
    JTextArea answer;
   ArrayList<QuizCard> cardList;



    public static void main(String[] args) {
        QuizCardBuilder builder=new QuizCardBuilder();
        builder.go();
        
    }

    public void go(){
        frame=new JFrame("Quiz Card Builder");
        JPanel mainPanel=new JPanel();
        Font bigFont=new Font("sanserif",Font.BOLD,24);
        question=new JTextArea(6,20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(bigFont);

        JScrollPane qScroller=new JScrollPane(question);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        answer=new JTextArea(6,20);
        answer.setLineWrap(true);;
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);

        JScrollPane aScroller=new JScrollPane(answer);
        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton nexButton=new JButton("Next Card");
       cardList =new ArrayList<QuizCard>();

        JLabel qLabel=new JLabel("Questions: ");
        JLabel aLabel=new JLabel("Answer: ");

        mainPanel.add(qLabel);
        mainPanel.add(qScroller);
        mainPanel.add(aLabel);
        mainPanel.add(aScroller);
        mainPanel.add(nexButton);

        nexButton.addActionListener(new NextCardListener());
        JMenuBar menubar=new JMenuBar();
        JMenu fileMenu=new JMenu("file");
        JMenuItem newMenuItem=new JMenuItem("New");
        JMenuItem saveMenuItem=new JMenuItem("Save");

        newMenuItem.addActionListener(new NewMenuListener());
        saveMenuItem.addActionListener(new SaveMenuListener());

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menubar.add(fileMenu);

        frame.setJMenuBar(menubar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,600);
        frame.setVisible(true);
        
    }



    class NextCardListener implements ActionListener{
        public void actionPerformed(ActionEvent ev) {

            QuizCard card=new QuizCard(question.getText(),answer.getText());
            cardList.add(card);
            clearCard();
            
        }
    }



    class SaveMenuListener implements ActionListener{
        public void actionPerformed(ActionEvent ev) {

            QuizCard card=new QuizCard(question.getText(),answer.getText());
            cardList.add(card);

            JFileChooser fileSave=new JFileChooser();
            fileSave.showSaveDialog(frame);
            Savefile(fileSave.getSelectedFile());
            
        }
    }

    class NewMenuListener implements ActionListener{
        public void actionPerformed(ActionEvent ev) {

            cardList.clear();
            clearCard();

            
        }
    }



    public void clearCard(){

        question.setText("");
        answer.setText("");
        question.requestFocus();
    }



    private void Savefile(File file){

        try {
            
            BufferedWriter writer=new BufferedWriter(new FileWriter(file));
            for(QuizCard card:cardList){
                writer.write(card.getQuestion()+"/");
                writer.write(card.getAnswer()+"\n");}
                writer.close();
            
        } catch (Exception e) {

            System.out.println("Coundn't Write to the Cardlist out");
            e.printStackTrace();
        
        }
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