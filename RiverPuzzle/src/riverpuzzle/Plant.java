/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

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
public class Plant implements ICrosser{
    private int eatingRank=2;
    private double weight=0;

    public double getWeight() {
        return weight;
    }

    public int getEatingRank() {
        return eatingRank;
    }

   public ICrosser makeCopy(){
    Plant Plant=new Plant();
    return Plant;
    }
    public​ BufferedImage[] getImages(){
       
         URL url = this.getClass().getResource("plant.png");
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
