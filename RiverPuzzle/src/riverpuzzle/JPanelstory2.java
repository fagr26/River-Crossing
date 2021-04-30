/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import static riverpuzzle.Controller.rightSide;
import static riverpuzzle.JFrame1.boatRiders;
import static riverpuzzle.JPane1l.list;

/**
 *
 * @author A B C
 */
public class JPanelstory2 extends JPanel implements ActionListener {

    
      private Timer animator;
    private ImageIcon imageFarmer1[];
    private ImageIcon imageFarmer2[];
       private ImageIcon imageFarmer3[];
    private ImageIcon imageFarmer4[];
    private ImageIcon imageboat[];
    private ImageIcon imageAnimal[];
    
    private int delay=50;
    private int totalFrames =4;
    private int currentFrame=0;
    int s=220; //x boat
    int x=40; // x is dim elfarmer1 40
    int y=140;// x farmer2 60
    int z=60; // x farmer3 80kg
    int l=50;//  x farmer4 90
    int a=20;// x animal
    int t=110;// y farmer1 40
    int b =300;// y farmer 2 60
    int d=270;// y farmer3 80
    int f =400;// y farmer 4 90
    int c=200;// y animal
    private static int mouseX;
    private static int mouseY;
    private Image img;

    
  
      //  setBackground(Color.BLACK);
      //  t.start();
       
    public JPanelstory2() {
        initComponents();
          imageFarmer1= new ImageIcon[totalFrames];
        for(int i=0; i<imageFarmer1.length;i++){
            imageFarmer1[i]= new ImageIcon("tom" + i+ ".png");
            
            
        }
        imageFarmer2= new ImageIcon[totalFrames];
        for(int i=0; i<imageFarmer2.length;i++){
            imageFarmer2[i]= new ImageIcon("jack" + i+ ".png");
            
            
        }
       imageFarmer3= new ImageIcon[totalFrames];
        for(int i=0; i<imageFarmer3.length;i++){
            imageFarmer3[i]= new ImageIcon("ben" + i+ ".png");
            
            
        }
         imageFarmer4= new ImageIcon[totalFrames];
        for(int i=0; i<imageFarmer4.length;i++){
            imageFarmer4[i]= new ImageIcon("sara" + i+ ".png");
            
            
        }
          
       imageboat=new ImageIcon[totalFrames];
        for(int i=0; i<imageboat.length;i++){
            imageboat[i]= new ImageIcon("boat" + i+ ".png");
            
            
        }
        imageAnimal= new ImageIcon[totalFrames];
        for(int i=0; i<imageAnimal.length;i++){
            imageAnimal[i]= new ImageIcon("goat" + i+ ".png");
        
        animator = new Timer(delay,this);
        animator.start();
    }
    }
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        ImageIcon im = new ImageIcon("farmriver30.jpg");
        
         g.drawImage(im.getImage(), 0, 0, this);
        if(currentFrame>=imageFarmer1.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
       imageFarmer1 [currentFrame].paintIcon(this,g,x,t);// farmer40
        
       if(currentFrame>=imageFarmer2.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
        imageFarmer2[currentFrame].paintIcon(this,g,y,b);//farmer60
        
        if(currentFrame>=imageFarmer3.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
        imageFarmer3[currentFrame].paintIcon(this,g,z,d);// farmer80
        
     if(currentFrame>=imageFarmer4.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
        imageFarmer4[currentFrame].paintIcon(this,g,l,f);// farmer90
        //   g.drawImage(im.getImage(), 4, 20, this);
        if(currentFrame>=imageboat.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
        imageboat[currentFrame].paintIcon(this,g,s,270);//boat
         if(currentFrame>=imageAnimal.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
        imageAnimal[currentFrame].paintIcon(this,g,a,c);//animal
        
        
    }
     public void moveFarmer40(){
      x+=180;
      repaint();
 }
      public void moveRight(){
          if(boatRiders.size()==1){
           if(boatRiders.get(0).getWeight()==40){
           x+=280;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
           }
          
           if(boatRiders.get(0).getWeight()==60){
           y+=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }
           
           if(boatRiders.get(0).getWeight()==80 ){
           
           z+=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }
           
           if(boatRiders.get(0).getWeight()==90 ){
           l+=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }  
        }
      else if(boatRiders.size()==2){
   if(boatRiders.get(0).getWeight()==40|| boatRiders.get(1).getWeight()==40){
        x+=280;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==80|| boatRiders.get(1).getWeight()==80){
       z+=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==90|| boatRiders.get(1).getWeight()==90){
        l+=280;
       repaint();
      
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==60|| boatRiders.get(1).getWeight()==60){
       y+=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       
   if(boatRiders.get(0).getWeight()==20|| boatRiders.get(1).getWeight()==20){
       s+=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
   }
   }
         public void moveSheep(){
 s+=160;
 repaint();
 }
         public void moveSheepBack(){
 s-=160;
 repaint();
 }
       public void moveLeft(){
           if(boatRiders.size()==1){
           if(boatRiders.get(0).getWeight()==40){
           x-=280;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
           }
          
           if(boatRiders.get(0).getWeight()==60){
           y-=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }
           
           if(boatRiders.get(0).getWeight()==80 ){
           
           z-=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }
           
           if(boatRiders.get(0).getWeight()==90 ){
           l-=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }  
        }
      else if(boatRiders.size()==2){
   if(boatRiders.get(0).getWeight()==40|| boatRiders.get(1).getWeight()==40){
        x-=280;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==80|| boatRiders.get(1).getWeight()==80){
       z-=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==90|| boatRiders.get(1).getWeight()==90){
        l-=280;
       repaint();
      
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==60|| boatRiders.get(1).getWeight()==60){
       y-=280;
       repaint();}
       if(boatRiders.get(0).getWeight()==20|| boatRiders.get(1).getWeight()==20){
       s-=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       }
       }
     public void moveBoat(){
         s=220;
         if(s<800)
        s+=310;
        if(boatRiders.size()==1){
           if(boatRiders.get(0).getWeight()==40){
           x+=280;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
           }
          
           if(boatRiders.get(0).getWeight()==60){
           y+=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }
           
           if(boatRiders.get(0).getWeight()==80 ){
           
           z+=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }
           
           if(boatRiders.get(0).getWeight()==90 ){
           l+=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }  
        }else if(boatRiders.size()==2){
       if(boatRiders.get(0).getWeight()==40|| boatRiders.get(1).getWeight()==40){
        x+=160;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==80|| boatRiders.get(1).getWeight()==80){
       z+=160;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==90|| boatRiders.get(1).getWeight()==90){
        l+=160;
       repaint();
      
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==60|| boatRiders.get(1).getWeight()==60){
       y+=160;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
        if(boatRiders.get(0).getWeight()==20|| boatRiders.get(1).getWeight()==20){
       a+=160;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
        }
   }
     public void moveBoatLeft(){
         s-=160;
         repaint();
         if(boatRiders.size()==1){
           if(boatRiders.get(0).getWeight()==40){
           x-=280;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
           }
          
           if(boatRiders.get(0).getWeight()==60){
           y-=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }
           
           if(boatRiders.get(0).getWeight()==80 ){
           
           z-=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }
           
           if(boatRiders.get(0).getWeight()==90 ){
           l-=280;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
           }  
        }else if(boatRiders.size()==2){
         if(boatRiders.get(0).getWeight()==40|| boatRiders.get(1).getWeight()==40){
        x-=160;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==80|| boatRiders.get(1).getWeight()==80){
       z-=160;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==90|| boatRiders.get(1).getWeight()==90){
        l-=160;
       repaint();
      
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0).getWeight()==60|| boatRiders.get(1).getWeight()==60){
       y-=160;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
        if(boatRiders.get(0).getWeight()==20|| boatRiders.get(1).getWeight()==20){
       s-=160;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
        }
     }
 public void moveFarmerBack40(){
 x-=180;
 repaint();
 }
  public void moveFarmer60(){
      y+=180;
      repaint();
 }
 public void moveFarmerBack60(){
 y-=180;
 repaint();
 }
  public void moveFarmer80(){
      z+=180;
      repaint();
 }
 public void moveFarmerBack80(){
 z-=180;
 repaint();
 }
 public void moveFarmer90(){
      l+=180;
      repaint();
 }
 public void moveFarmerBack90(){
 l-=180;
 repaint();
 }
  public void printCrossers(){
     System.out.println("crossersss");
   for(int j=0;j<rightSide.size();j++){
   System.out.println("right"+rightSide.get(j));
    }
 for(int i=0;i<rightSide.size();i++){
 if(rightSide.get(i).getWeight()==40){
 x=500;
 System.out.println("hiii");
 repaint();
 }
 if(rightSide.get(i).getWeight()==60){
 y=500;
 System.out.println("hiii");
 repaint();
 }
 if(rightSide.get(i) instanceof Carnivore){
 z=500;
 System.out.println("hiii");
 repaint();
 }
 if(rightSide.get(i) instanceof Plant){
 a=500;
 System.out.println("hiii");
 repaint();
 }}
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}