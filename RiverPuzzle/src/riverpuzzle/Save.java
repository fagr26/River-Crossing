/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import java.util.List;
import riverpuzzle.XML1;
import static riverpuzzle.Controller.boatriders;
import static riverpuzzle.Controller.leftSide;
import static riverpuzzle.Controller.rightSide;

/**
 *
 * @author A B C
 */
public class Save implements Command{
 
   
private XML1 Save= new XML1();
    @Override
    public void Excute() {
        Save.save(leftSide, rightSide,boatriders);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
