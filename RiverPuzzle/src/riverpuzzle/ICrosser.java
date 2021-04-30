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
public interface ICrosser {
   
 

public double getWeight();
 

public int getEatingRank();
 
 
public​ BufferedImage[] getImages(); 
 

public ICrosser makeCopy();
public boolean canSail ();

public void setLabelToBeShown(String label);


public String getLabelToBeShown();
}
