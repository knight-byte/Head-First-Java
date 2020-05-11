import javax.swing.*;
import java.awt.*;


public class TextField {
        public static void main(String[] args) {
            TextField gui=new TextField();
            gui.go();

        }

        public void go(){
            JFrame frame=new JFrame();
            JPanel panel=new JPanel();
            JLabel label=new JLabel("DOG'S FIRST NAME : ");
            JTextField field=new JTextField(25);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(BorderLayout.CENTER, panel);
            panel.add(label);
            panel.add(field);
            frame.setSize(500,500);
            frame.setVisible(true);


            //for getting data from TextField
          String get= field.getText();
          
          //for setting Data/text in TextField
          String set="Hello world";
          field.setText(set);
          field.setText("");  //clearing the textField

          //for Selet/highlight the text
          field.selectAll();;

          //puting the cursor to text Field
          field.requestFocus();
            
        }
}