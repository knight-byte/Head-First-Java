import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class Button1 {
    public static void main(String[] args) {
        Button1 gui=new Button1();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the funno. :  ");
        int i=scan.nextInt();
        switch(i){
            case 1: gui.go1();
            break;
            case 2:gui.go2();
            break;
            case 3: gui.go3();
            break;
            case 4: gui.go4();
            break;
            case 5:gui.go5();
            break;
            default:System.out.println("enter a valid no. ");
            break;
        }
        scan.close();


      

    }


    //setting buuton with small text to east side

    public void go1() {
        JFrame frame=new JFrame();
        JButton button=new JButton("click me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST,button);
        frame.setSize(500,300);
        frame.setVisible(true);


    }


    //setting button with long text to east side
    public void go2(){
        JFrame frame=new JFrame();
        JButton button=new JButton("click me plzzzz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST,button);
        frame.setSize(500,300);
        frame.setVisible(true);


    }


    //setting button with default/ small height text to north side
    public void go3() {
        JFrame frame=new JFrame();
        JButton button=new JButton(" there is a spoon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.NORTH,button);
        frame.setSize(500,300);
        frame.setVisible(true);
    }


    //setting button with custom height of the text to north side
    public void go4(){
        JFrame frame=new JFrame();
        JButton button=new JButton("click this!");
        Font bigFont=new Font("serif",Font.BOLD,30);
        button.setFont(bigFont);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.NORTH,button);
        frame.setSize(500,300);
        frame.setVisible(true);
    }

    //setting for center location
    public void go5(){
        JFrame frame=new JFrame();

        //buttons
        JButton east=new JButton("EAST");
        JButton west=new JButton("WEST");
        JButton center=new JButton("CENTER");
        JButton north=new JButton("NORTH");
        JButton south=new JButton("SOUTH");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST,east);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.CENTER, center);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.WEST, west);

        frame.setSize(500,500);
        frame.setVisible(true);
    }
}