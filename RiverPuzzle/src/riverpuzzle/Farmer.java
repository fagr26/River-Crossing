/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author mayar abu zeid
 */
public class Farmer implements ICrosser{
    private int eatingRank=6;
    private double weight;
  //  private static Farmer instance =null;
    
  /* public static Farmer getInstance(){
       if(instance==null)
           return new Farmer();
       else
           return instance;
   }
   */
 public boolean Cansail (){ 
        return true ;
    }
    public double getWeight() {
        return weight;
    }

    public Farmer(double weight) {
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getEatingRank() {
        return eatingRank;
    }
     public ICrosser makeCopy(){
   Farmer farmer2=new Farmer(50);
    return farmer2;
    }
     public​ BufferedImage[] getImages(){
         
          URL url = this.getClass().getResource("farmer4.png");
       BufferedImage b[]= new BufferedImage[2];
       
        try {
            BufferedImage img= ImageIO.read(url);
             b[0]=img;
        } catch (IOException ex) {
            Logger.getLogger(Farmer.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        
         
         return b;
     }

    @Override
    public boolean canSail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLabelToBeShown(String label) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabelToBeShown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
