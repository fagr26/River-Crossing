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
public class Singelton {
     private static Singelton Boat=null;
  // private constructor to prevent users from instantiation 
    private Singelton() {}
    
    public static Singelton getInstance(){
    if(Boat==null)
        return new Singelton();
    else
 return Boat;
    
}
}
