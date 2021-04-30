/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import java.util.List;
import riverpuzzle.ICrosser;

/**
 *
 * @author mayar abu zeid
 */
public interface ICrossingStrategy {
   public boolean isValid(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers, List<ICrosser> boatRiders);
   
    List<ICrosser> getInitialCrossers​();
   
    public​ String[] getInstructions(); 
}
