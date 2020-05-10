import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini=new MiniMiniMusicApp();
        mini.play();
    }
    public void play(){
        try{
            Sequencer sequencer=MidiSystem.getSequencer();
            sequencer.open();

            Sequence seq=new Sequence(Sequence.PPQ,4);
            Track track=seq.createTrack();

            ShortMessage a=new ShortMessage();
            a.setMessage(144,1,20,100);
            MidiEvent noteon=new MidiEvent(a, 5);
            track.add(noteon);

            ShortMessage b=new ShortMessage();
            b.setMessage(128,3,44,100);
            MidiEvent noteoff=new MidiEvent(b, 3);
            track.add(noteoff);

            sequencer.setSequence(seq);
            sequencer.start();

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}