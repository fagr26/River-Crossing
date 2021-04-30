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
import java.util.Random;
import javax.sound.midi.SysexMessage;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import static riverpuzzle.Controller.leftSide;
import static riverpuzzle.Controller.rightSide;
import static riverpuzzle.JFrame1.boatRiders;

/**
 *
 * @author A B C
 */


    /**
     * Creates new form JPane1l
     * 
     */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A B C
 */

    
   
    public class  JPane1l  extends JPanel implements ActionListener{
        IRiverCrossingController c;
        
    public void setC(IRiverCrossingController c) {
        this.c = c;
    }
      static List<ICrosser> list= new ArrayList<ICrosser>();
    private Timer animator;
    private ImageIcon imageArr[];// farmer
    private ImageIcon imageArr1[];// boat
    private ImageIcon imageArr2[];// lion
    private ImageIcon imageArr3[];// sheep
    private ImageIcon imageArr4[];// wolf 
    private ImageIcon imageArr5[];// plant
    private ImageIcon imageArr6[]; // cow
    private int delay=50;
    private int totalFrames =4;
    private int currentFrame=0;
    int x=20; // x is dim elfarmer
    int y=200;//x boat
    int z=140; // x LION
    int l=40;// x cow // sheep
    int a=60; //x plant
    int t=110; //y farmer
    int b = 300;//y sheep
    int d =200;//y lion 
    int f =400;// y plant
    private static int mouseX;
    private static int mouseY;
    Random R = new Random();
    int p= (byte)R.nextInt();
    Random R1 = new Random();
    int q= (byte)R1.nextInt();

    public List<ICrosser> getList() {
        return list;
    }
   public JPane1l() {
         initComponents();
      //  setBackground(Color.BLACK);
      //  t.start();
         imageArr= new ImageIcon[totalFrames];
        for(int i=0; i<imageArr.length;i++){
            imageArr[i]= new ImageIcon("tom" + i+ ".png");
            
            
        }
        imageArr1= new ImageIcon[totalFrames];
        for(int i=0; i<imageArr1.length;i++){
            imageArr1[i]= new ImageIcon("boat" + i+ ".png");
            
            
        }
        System.out.println(p);
        if(p<=0){
       imageArr2= new ImageIcon[totalFrames];
        for(int i=0; i<imageArr2.length;i++){
            imageArr2[i]= new ImageIcon("lion" + i+ ".png");
           // p++;
        }  
        }else{
        
        imageArr4= new ImageIcon[totalFrames];
        for(int i=0; i<imageArr4.length;i++){
            imageArr4[i]= new ImageIcon("wolf" + i+ ".png");
           // p--;
            
        }   System.out.println(p);
        
        
        }
        if(q<=0){
         imageArr3= new ImageIcon[totalFrames];
        for(int i=0; i<imageArr3.length;i++){
            imageArr3[i]= new ImageIcon("goat" + i+ ".png");
               
        }}
         else {
        
        imageArr6= new ImageIcon[totalFrames];
        for(int i=0; i<imageArr6.length;i++){
            imageArr6[i]= new ImageIcon("cow" + i+ ".png");
               
        }
        
        
                 }
        imageArr5= new ImageIcon[totalFrames];
        for(int i=0; i<imageArr5.length;i++){
            imageArr5[i]= new ImageIcon("tree" + i+ ".png");
    
        animator = new Timer(delay,this);
        animator.start();
    }
                 }
 public void moveFarmer(){
      x=20;
     if(x<250)
     {
      x+=250;
     }
      t+=200;
      repaint();
 }
 public void moveSheep(){
  //l=40;
  //if(l<310){
      l+=160;
 // }
  b+=70;
   repaint();
 }
 public void moveLion(){
      z+=190;
      d+=160;
      repaint();
 }
  public void movePlant(){
      a+=400;
      f-=20;
      
      repaint();
 }
 public void moveFarmerBack(){
 x-=180;
 t-=199;
 repaint();
 }
 public void moveAddFarmerRight(){
     x-=90;
     t+=150;
     repaint();
 }
  public void moveLionBack(){
 z-=120;
 d-=80;
 
 repaint();
 }
   public void moveAddLionRight(){
     z-=160;
     d+=160;
     
     repaint();
 }
   public void moveSheepBack(){
 l-=205;
 b-=70;
 repaint();
 }
    public void moveAddSheepRight(){
         l-=100;
         b+=180;
     
     repaint();
 }
   public void movePlantBack(){
 a-=250;
 f+=20;
 repaint();
 }
   public void moveAddPlantRight(){
      a-=105;
  f+=30;
     repaint();
 }
   public void dropFarmerRight(){
   
 x=600;
        t-=160;
 repaint();
   
   
   }
    public void dropLionRight(){
     z+=280;
       d=70;
     repaint();
 }
     public void dropSheepRight(){
          l+=110;
        b=160;
    
     repaint();
 } public void dropPlantRight(){
      a+=290;
       f=100;
   

 repaint();
 }
     
   public void moveBoat(){
       System.out.println(y);
       y=200;
       if(y<800){
       y=y+310;}
       
       System.out.println(y);
        repaint();
        if(boatRiders.size()==2){
       if(boatRiders.get(0) instanceof Farmer ||boatRiders.get(1) instanceof Farmer){
        x+=310;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Carnivore || boatRiders.get(1) instanceof Carnivore){
       z+=310;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Herbivore ||boatRiders.get(1) instanceof Herbivore){
        l+=310;
       repaint();
      
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Plant || boatRiders.get(1) instanceof Plant){
       a+=310;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
        }else
        { x+=310;
        repaint();
        }
       
   }
   public void moveBoatLeft(){
    System.out.println(y);
       y-=160;
       System.out.println(y);
        repaint();
        
        if(boatRiders.size()==2){
       if(boatRiders.get(0) instanceof Farmer ||boatRiders.get(1) instanceof Farmer){
        x-=160;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Carnivore || boatRiders.get(1) instanceof Carnivore){
       z-=160;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Herbivore ||boatRiders.get(1) instanceof Herbivore){
        l-=160;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Plant || boatRiders.get(1) instanceof Plant){
       a-=160;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       
   }
        else
        { x-=160;
        repaint();
        }
   }
   public void moveRight(){
       if(boatRiders.size()==2){
   if(boatRiders.get(0) instanceof Farmer ||boatRiders.get(1) instanceof Farmer){
        x=600;
        t-=160;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Carnivore || boatRiders.get(1) instanceof Carnivore){
       z=700;
       d=300;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Herbivore ||boatRiders.get(1) instanceof Herbivore){
        l=700;
        b=160;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Plant || boatRiders.get(1) instanceof Plant){
       a=700;
       f=400;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
   
   }else
       { x=600;
       t-=160;
        repaint();
       }  
   }
   public void moveLeft(){
       if(boatRiders.size()==2){
   if(boatRiders.get(0) instanceof Farmer ||boatRiders.get(1) instanceof Farmer){
       x=20;
       t=110;
       // x-=80;
        //t+=160;
        repaint();
        animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Carnivore || boatRiders.get(1) instanceof Carnivore){
       z=140;
       d=200;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Herbivore ||boatRiders.get(1) instanceof Herbivore){
        l=40;
        //f=100;
        b=300;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       if(boatRiders.get(0) instanceof Plant || boatRiders.get(1) instanceof Plant){
       a=60;
       f=400;
       repaint();
       animator = new Timer(delay,this);
        animator.start();
       }
       }
       else
           x=20;
       t=110;
        repaint();
   }
   
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        ImageIcon im = new ImageIcon("farmriver30.jpg");
        
         g.drawImage(im.getImage(), 0, 0, this);
        if(currentFrame>=imageArr.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
        imageArr[currentFrame].paintIcon(this,g,x,t);// farmer
       if(currentFrame>=imageArr1.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
        imageArr1[currentFrame].paintIcon(this,g,y,300);//boat
        //System.out.println("Painting Boat x = "+ y);
        if(p<=0){
            if(currentFrame>=imageArr2.length-1){//lion
            currentFrame=0;
                     
        }
        currentFrame++;
        imageArr2[currentFrame].paintIcon(this,g,z,d);
       
        }else {
            
        if(currentFrame>=imageArr4.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
        imageArr4[currentFrame].paintIcon(this,g,z,d);
//wolf
        
    }
        if(q<=0){
     if(currentFrame>=imageArr3.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
        imageArr3[currentFrame].paintIcon(this,g,l,b);// Sheep
        
        }else{
        if(currentFrame>=imageArr6.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
        imageArr6[currentFrame].paintIcon(this,g,l,b);// cow
        
        
        }
         if(currentFrame>=imageArr5.length-1){
            currentFrame=0;
            
        }
        currentFrame++;
        imageArr5[currentFrame].paintIcon(this,g,a,f);
    }

    public void printCrossers(){
     System.out.println("crossersss");
   for(int j=0;j<rightSide.size();j++){
   System.out.println("right"+rightSide.get(j));
    }
 for(int i=0;i<rightSide.size();i++){
 if(rightSide.get(i) instanceof Farmer){
 x=500;
 System.out.println("hiii");
 repaint();
 }
 if(rightSide.get(i) instanceof Herbivore){
 l=500;
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
 }
 }
/*  if(c.isBoatOnTheLeftBank()==true)
  {y=100;
  repaint();}
  else
  {y=400;
  repaint();
  }
 */
 }
 public void printCrossersundoredo(){
     System.out.println("crossersss");
   
 for(int i=0;i<leftSide.size();i++){
 if(leftSide.get(i) instanceof Farmer){
 x=100;
 System.out.println("hiii");
 repaint();
 }
 if(leftSide.get(i) instanceof Herbivore){
 l=100;
 System.out.println("hiii");
 repaint();
 }
 if(leftSide.get(i) instanceof Carnivore){
 z=100;
 System.out.println("hiii");
 repaint();
 }
 if(leftSide.get(i) instanceof Plant){
 a=100;
 System.out.println("hiii");
 repaint();
 }
 }
 for(int j=0;j<leftSide.size();j++){
   System.out.println("left"+leftSide.get(j));
    }
  for(int i=0;i<rightSide.size();i++){
 if(rightSide.get(i) instanceof Farmer){
 x=500;
 System.out.println("hiii");
 repaint();
 }
 if(rightSide.get(i) instanceof Herbivore){
 l=500;
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
 }
 }
  
  
 }
    public void actionPerformed(ActionEvent e){
       
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
}
