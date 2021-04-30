/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import riverpuzzle.Carnivore;
import riverpuzzle.Lion;
import riverpuzzle.Wolf;

/**
 *
 * @author mayar abu zeid
 */
public class CarnivoreFactory {
      public Carnivore getCarnivore(String cname) {
        if (cname.equalsIgnoreCase("Lion")) {
            return new Lion();
        }
        else if(cname.equalsIgnoreCase("Wolf")){
            return new Wolf();
        }
        else
        return null;
    }
     
}
