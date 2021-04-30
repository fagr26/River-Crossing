/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import java.util.List;
import riverpuzzle.ICrosser;
import riverpuzzle.ICrosser;
import riverpuzzle.ICrosser;
import riverpuzzle.ICrossingStrategy;
import riverpuzzle.ICrossingStrategy;
import riverpuzzle.ICrossingStrategy;

/**
 *
 * @author mayar abu zeid
 */
public interface IRiverCrossingController {
    
  
    public void newGame(ICrossingStrategy gameStrategy);
    
 

    public void resetGame();
 

public String[] getInstructions(); 
 

public List<ICrosser> getCrossersOnRightBank();
 

public List<ICrosser> getCrossersOnLeftBank();

public boolean isBoatOnTheLeftBank();
 
public int getNumberOfSails();

 

public boolean canMove(List<ICrosser> crossers,boolean fromLeftToRightBank);

public void  doMove(List<ICrosser> crossers,boolean fromLeftToRightBank);
 


 

public boolean canUndo();
 
 public boolean canRedo();

 

public void undo();
 
public void redo();
 
 

public void saveGame();
 

public void loadGame(); 
      
public List<List<ICrosser>> solveGame(); 
}
