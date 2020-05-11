import javax.swing.*;
import java.awt.*;


public class TextArea {
    public static void main(String[] args) {
        TextArea gui=new TextArea();
        gui.go();

    }

    public void go() {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        JTextArea area=new JTextArea(10,25);
        
        JScrollPane scrollPane=new JScrollPane(area);
        area.setLineWrap(true);

        //Setting the Scroll fun. in TextArea
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //Adding TextArea to panel
        panel.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(500,500);
        frame.setVisible(true);
        
        //getting text from TextArea
        String get=area.getText();

        //Setting text in textArea
        area.setText("Whats up guy ? how you doing ? ");
        area.setText("");// for clearing up 

        //to select or HIghtlight the Text in the textarea
        area.selectAll();

        //put curson on textarea
        area.requestFocus();



    }
}