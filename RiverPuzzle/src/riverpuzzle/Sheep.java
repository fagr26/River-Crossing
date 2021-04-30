/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import java.awt.image.BufferedImage;

/**
 *
 * @author mayar abu zeid
 */
public class Sheep extends Herbivore{
private double weight;

    public double getWeight() {
        return weight;
    }

     public ICrosser makeCopy(){
    Sheep sheep2=new Sheep();
    return sheep2;
    }
      public​ BufferedImage[] getImages(){
       
         
         
         return null;
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
