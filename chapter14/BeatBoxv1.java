//version 2

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.sound.midi.*;
import java.util.*;



public class BeatBoxv1 {

    JFrame frame;
    ArrayList<JCheckBox> checkboxList;
    JPanel mainpanel;
    Sequencer player;
    Sequence seq;
    Track track;


    String[] instrument_name={"Bass Drum", "Closed Hi-Hat","Open Hi-Hat","Acoustic Snare", "Crash Cymbal",
                             "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga","Cowbell",
                              "Vibraslap", "Low-mid Tom", "High Agogo","Open Hi Conga"};

    int[] instruments={35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
    
    public static void main(String[] args) {

        BeatBoxv1 gui=new BeatBoxv1();
        gui.buildGui();

    }

    public void buildGui() {
        frame=new JFrame("cyber Beatbox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout=new BorderLayout();
        JPanel backGround=new JPanel(layout);
        backGround.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        checkboxList=new ArrayList<JCheckBox>();
        // Box buttonBox=new Box(BoxLayout.Y_AXIS);
        Box buttonBox=new Box(BoxLayout.Y_AXIS);

        JButton start=new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop=new JButton("Stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo=new JButton("upTempo");
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo=new JButton("downTempo");
        downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);

        JButton serializeIt=new JButton("serializeIt");
        serializeIt.addActionListener(new MySendListener());
        buttonBox.add(serializeIt);

        JButton restore=new JButton("Restore");
        restore.addActionListener(new MyReadListener());
        buttonBox.add(restore);

        Box nameBox=new Box(BoxLayout.Y_AXIS);
        for (int i=0;i<16;i++){
            nameBox.add(new Label(instrument_name[i]));

        }


        backGround.add(BorderLayout.EAST,buttonBox);
        backGround.add(BorderLayout.WEST,nameBox);

        frame.getContentPane().add(backGround);

        GridLayout grid=new GridLayout(16,16);

        grid.setVgap(1);
        grid.setHgap(2);
        mainpanel=new JPanel(grid);
        backGround.add(BorderLayout.CENTER,mainpanel);

        for(int i=0;i<256;i++){
            JCheckBox c=new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainpanel.add(c);
        }

        setUpMidi();
      //  frame.setSize(500, 800);
       frame.setBounds(300,300,300,300);
       frame.pack();
        frame.setVisible(true);

    }//close method buildGui

    public void setUpMidi() {
        try {
            player=MidiSystem.getSequencer();
            player.open();
            seq=new Sequence(Sequence.PPQ, 4);
            track=seq.createTrack();
            player.setTempoInBPM(120);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//closes method setupMidi

    public void buildTrackAndStart(){
        int[] trackList = null;
    
        seq.deleteTrack(track);
        track = seq.createTrack();
          for (int i = 0; i < 16; i++) {
            trackList = new int[16];
   
            int key = instruments[i];   
            for (int j = 0; j < 16; j++ ) {         
                
                JCheckBox jc = (JCheckBox) checkboxList.get(j + (16*i));
                if ( jc.isSelected()) {
                   trackList[j] = key;
                } else {
                   trackList[j] = 0;
                }                    
             } // close inner loop
     
        
             makeTracks(trackList);
             track.add(makeEvent(176,1,127,0,16));  
         } // close outer
         track.add(makeEvent(192,9,1,0,15));      
         try {
   
            player.setSequence(seq);
            player.setLoopCount(player.LOOP_CONTINUOUSLY);                   
            player.start();
            player.setTempoInBPM(120);
        } catch(Exception e) {e.printStackTrace();}
     } // close buildTrackAndStart method
             
            
     public class MyStartListener implements ActionListener {
         public void actionPerformed(ActionEvent a) {
             buildTrackAndStart();
         }
     } // close inner class
 
    


    public class MyStopListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            player.stop();
        }
    } // close inner class
    public class MyUpTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
     float tempoFactor = player.getTempoFactor(); 
            player.setTempoFactor((float)(tempoFactor * 1.03));
        }
     } // close inner class

     public class MyDownTempoListener implements ActionListener {
         public void actionPerformed(ActionEvent a) {
     float tempoFactor = player.getTempoFactor();
            player.setTempoFactor((float)(tempoFactor * .97));
        }
    } // close inner class

    public class MySendListener implements ActionListener{
        public void actionPerformed(ActionEvent a){
            boolean[] checkboxState=new boolean[256];
            for(int i=0;i<256;i++){
                JCheckBox check=(JCheckBox) checkboxList.get(i);
                if(check.isSelected()){
                    checkboxState[i]=true;

                }
            }
            try{
                FileOutputStream fileStream=new FileOutputStream("checkBox.ser");
                ObjectOutputStream os=new ObjectOutputStream(fileStream);
                os.writeObject(checkboxState);
            }catch(Exception e){e.printStackTrace();}
        }
    }//close inner class

    public class MyReadListener implements ActionListener{
        public void actionPerformed(ActionEvent a){
            boolean[] checkboxState=null;
            try {
                FileInputStream fileIn=new FileInputStream("checkBox.ser");
                ObjectInputStream is=new ObjectInputStream(fileIn);
                checkboxState=(boolean[]) is.readObject();
            } catch (Exception e) {
                e.printStackTrace();
                //TODO: handle exception
            }
            for(int i=0;i<256;i++){
                JCheckBox check=(JCheckBox) checkboxList.get(i);
                if(checkboxState[i]){
                    check.setSelected(true);
                }else{
                    check.setSelected(false);

                }
            }
            player.stop();
            buildTrackAndStart();
        }
    }

    public void makeTracks(int[] list) {        
       
       for (int i = 0; i < 16; i++) {
          int key = list[i];
          if (key != 0) {
             track.add(makeEvent(144,9,key, 100, i));
             track.add(makeEvent(128,9,key, 100, i+1));
          }
       }
    }
        
    public  MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch(Exception e) {e.printStackTrace(); }
        return event;
    }
} // close class



