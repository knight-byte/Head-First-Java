import javax.swing.*;
import java.awt.*;
import java.util.Scanner;



public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui=new Panel1();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter fun no: ");
        int i=scan.nextInt();
        switch(i){
            case 1: gui.go1();
            break;
            case 2: gui.go2();
            break;
            case 3: gui.go3();
            break;
            case 4: gui.go4();
            break;
            case 5: gui.go5();
            break;

            default:System.out.println("enter a valid no.");
            break;
        }
        scan.close();
    }    


    //adding only JPanel to frame to east side
    public void go1(){
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();

        panel.setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    //Adding JPanel with a button on it to east side
    public void go2() {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        JButton button=new JButton("Click me!");

        panel.setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        panel.add(button);
        frame.setSize(300,300);
        frame.setVisible(true);


    }

    //Adding two buttons to JPanel to east side
    public void go3() {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        JButton button1=new JButton("Cllick me!");
        JButton button2=new JButton("Shock me!");
        
        panel.setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        panel.add(button1);
        panel.add(button2);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    //Adding Two button and arranging it in Jpanel to east side(Flow Layout)
    public void go4(){
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        JButton button1=new JButton("Click me!");
        JButton button2=new JButton("Shock Me!");

        panel.setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        panel.add(button1);
        panel.add(button2);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    //Adding Two button and arranging it in Jpanel to east side(BoxLayout)
    public void go5(){
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        JButton button1=new JButton("Click me!");
        JButton button2=new JButton("Shock Me!");

        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        panel.add(button1);
        panel.add(button2);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    
}