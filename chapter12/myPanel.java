import java.awt.*;
import javax.swing.*;


class MyDrawpanel extends JPanel{
   public void paintcomponent(Graphics g){
       Graphics2D g2d =(Graphics2D) g;

       //coloring the background
       g2d.setColor(Color.orange);
       g2d.fillRect(20,50,100,100);

       //setting the image
       Image image=new ImageIcon("e:/pic/wall.png").getImage();
       g2d.drawImage(image,3, 4, this);

       //random color circle on black backgroung
       g2d.fillRect(0, 0, this.getWidth(),this.getHeight());
       //setting RGB color Random
       int red=(int ) (Math.random()*255);     
       int green=(int )(Math.random()*255);
       int blue=(int ) (Math.random()*255);
       Color RandCol=new Color(red,green,blue);
       g2d.setColor(RandCol);
       g2d.fillOval(70,70,100,100);

       //gradient
       GradientPaint gradient=new GradientPaint(70,70,Color.blue,150,150,Color.orange);
       g2d.setPaint(gradient);
       g2d.fillOval(70, 70, 100, 100);

       //random color gradient

       int redstart=(int)(Math.random()*255);
       int greenstart=(int)(Math.random()*255);
       int bluestart=(int )(Math.random()*255);
       Color Startcolor=new Color(redstart,greenstart,bluestart);

       int redend=(int )(Math.random()*255);
       int greenend=(int )(Math.random()*255);
       int blueend=(int )(Math.random()*255);
       Color EndColor=new Color(redend,greenend,blueend);

       GradientPaint randGrad =new GradientPaint(70,70,Startcolor,150,150,EndColor);
       g2d.setPaint(randGrad);
       g2d.fillOval(70, 70, 100, 100);

       
   }
}

public class myPanel {
 public static void main(String[] args) {
     MyDrawpanel pan=new MyDrawpanel();

     
     
 }   
}