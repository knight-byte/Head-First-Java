import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwoButtons  {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui=new TwoButtons();
        gui.go();

    }
     public void go(){
         frame=new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JButton button1=new JButton("change color");
         button1.addActionListener(new Changecol());

         JButton button2=new JButton("change label");
         button2.addActionListener(new LabelListener());

         label=new JLabel("L\nA\nB\nE\nL");
         MyDrawPanel drawPanel=new MyDrawPanel();

         frame.getContentPane().add(BorderLayout.SOUTH,button1);
         frame.getContentPane().add(BorderLayout.EAST,button2);
         frame.getContentPane().add(BorderLayout.WEST,label);
         frame.getContentPane().add(BorderLayout.CENTER,drawPanel);

         frame.setSize(300,300);
         frame.setVisible(true);

    }
 class Changecol implements ActionListener{
     public void actionPerformed(ActionEvent event){
         frame.repaint();
     }
 }
 class LabelListener implements ActionListener{
     public void actionPerformed(ActionEvent event){
         label.setText("ouch!");
     }
 }
}
class MyDrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        Graphics2D g2d=(Graphics2D) g;
        int red=(int )(Math.random()*255);
        int green=(int )(Math.random()*255);
        int blue=(int )(Math.random()*255);

        Color col=new Color(red,green,blue);
        g2d.setPaint(col);
        g2d.fillOval(100, 100, 100, 100);

}
}