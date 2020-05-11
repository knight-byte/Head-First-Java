import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

public class List1 implements ListSelectionListener{
    
   JList lists;

    public static void main(String[] args) {
        List1 gui =new List1();
        gui.go();

    }

    public void go(){
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();

        String[] items={"alpha","beta","gamma","delta","epsilon","zeta","eta","theta"};
        lists=new JList(items);

        JScrollPane scroll=new JScrollPane(lists);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroll);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(400,400);
        frame.setVisible(true);
        lists.setVisibleRowCount(5);

        lists.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lists.addListSelectionListener(this);

        }

        // public void valuedChanged(ListSelectionEvent event) {
        //     if(!event.getValueIsAdjusting()){
        //         String Sel=(String)lists.getSelectedValue();
        //         System.out.println("Selected : "+Sel);
        //     }
        // }

        public void valueChanged(ListSelectionEvent lse) {
            if( !lse.getValueIsAdjusting()) {
                    String selection = (String) lists.getSelectedValue();
              System.out.println(selection);
            }
              }
           
}