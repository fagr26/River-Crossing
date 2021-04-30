/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

/**
 *
 * @author mayar abu zeid
 */
public abstract class Carnivore implements ICrosser{
    private int eatingRank=4;
    
    public int getEatingRank() {
        return eatingRank;
    }

    @Override
    public abstract double getWeight() ;
     public boolean canSail (){ 
        return false ;
     }
}
