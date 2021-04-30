/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import riverpuzzle.Cow;
import riverpuzzle.Herbivore;
import riverpuzzle.Sheep;

/**
 *
 * @author mayar abu zeid
 */
public class HerbivoreFactory {
     public Herbivore getHerbivore(String cname) {
        if (cname.equalsIgnoreCase("Sheep")) {
            return new Sheep();
        }
        else if(cname.equalsIgnoreCase("Cow")){
            return new Cow(20);
        }
        else
        return null;
    }
     
     
  
    }



