import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CheckBox implements ItemListener {
    JCheckBox check;
    JLabel label;

    public static void main(String[] args) {
        CheckBox gui=new CheckBox();
        gui.go();

    }

    public void go() {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();  
         check=new JCheckBox("chose me!");
         label=new JLabel();
        

        //adding event to checkbox
        check.addItemListener(this);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, label);
        panel.add(check);

        frame.setSize(200,200);
        frame.setVisible(true);


        //forcing or setting the checkBox
        check.setSelected(true);
        check.setSelected(false);

    }

    public void itemStateChanged(ItemEvent event){
        String OnOrOff="Off";
        if(check.isSelected()){
            OnOrOff="on";
           }
           label.setText("CheckBox is: "+ OnOrOff);
           System.out.println("checkbox is : "+ OnOrOff);
    }

}