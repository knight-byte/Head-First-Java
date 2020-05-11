import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextArea1 implements ActionListener {

    JTextArea text;

    public static void main(String[] args) {
        TextArea1 gui=new TextArea1();
        gui.go();

    }


    public void go(){
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        text=new JTextArea(20,30);
        JButton button=new JButton("Just Click Me!");
        text.setLineWrap(true);

       JScrollPane scroll=new JScrollPane(text);
       scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroll);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(500,500);
        frame.setVisible(true);

        button.addActionListener(this);

        

    }
    public void actionPerformed(ActionEvent event){
        text.append("button clicked \n");
    }
}