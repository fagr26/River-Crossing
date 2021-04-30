/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author mayar abu zeid
 */
public class Second extends JPanel implements ActionListener{
   private Timer animator;
    private ImageIcon imageArr[];
    private int delay=50;
    private int totalFrames =4;
    private int currentFrame=0;
    
  /*  public void paint(Graphics graph){
        super.paint(graph);
        image=new ImageIcon("sponge.png");
        image.paintIcon(this, graph, 0, 0);
        
    }*/
    public Second(){
        imageArr= new ImageIcon[totalFrames];
        for(int i=0; i<imageArr.length;i++){
            imageArr[i]= new ImageIcon("frame" + i+ ".png");
            
            
        }
        animator = new Timer(delay,this);
        animator.start();
    }
    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(currentFrame>=imageArr.length){
            currentFrame=0;
            
        }
        currentFrame++;
        imageArr[currentFrame].paintIcon(this, g,0 , 0);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        repaint(); // clear imager ,graphics and call this method again every 15 ms and curr++;
    }  
}
