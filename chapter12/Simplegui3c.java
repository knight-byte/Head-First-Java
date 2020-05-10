import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Simplegui3c implements ActionListener {
    JFrame frame;
    public static void main(String[] args) {
        Simplegui3c gui=new Simplegui3c();
        gui.go();
    }

    public void go(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button=new JButton("click ME!");
        button.addActionListener(this);
        MyDrawPanel drawPanel=new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.setSize(500,500);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent event){
        frame.repaint();
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
         g2d.fillOval(150,150,150,150);
    }
}