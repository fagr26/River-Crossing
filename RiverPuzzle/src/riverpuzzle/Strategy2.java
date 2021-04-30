/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import java.util.ArrayList;
import java.util.List;
import riverpuzzle.Carnivore;
import riverpuzzle.CarnivoreFactory;
import riverpuzzle.Farmer;
import riverpuzzle.ICrosser;
import riverpuzzle.ICrossingStrategy;

/**
 *
 * @author mayar abu zeid
 */
public class Strategy2 implements ICrossingStrategy{
   
    public boolean isValid(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers, List<ICrosser> boatRiders){
        
        int sum=0;
        boolean flag=false;
        if(boatRiders.size()<=2){
           for(int i=0;i<boatRiders.size();i++){
               if(boatRiders.get(i) instanceof Farmer ){
                   
                  flag=true;
                  break;
               }
               else 
                   flag=false;
           }
            
        }
    if(flag==true){
       for(int j=0;j<boatRiders.size();j++){
           sum +=boatRiders.get(j).getWeight();
       }
        if(sum<=100){
            
            flag=true;
        }else {
            flag=false;
           
        }
    }
    return flag;
    

}
    public List<ICrosser> getInitialCrossers(){
        
    List<ICrosser> crossers1= new ArrayList<ICrosser>();
    Farmer f1=new Farmer(40);
    crossers1.add(f1);
     Farmer f2=new Farmer(60);
    crossers1.add(f2);
     Farmer f3=new Farmer(80);
    crossers1.add(f3);
     Farmer f4=new Farmer(90);
    crossers1.add(f4);
    HerbivoreFactory car=new HerbivoreFactory();
    Herbivore carn1=car.getHerbivore("Cow");
    crossers1.add(carn1);
        return crossers1;
    }
    public​ String[] getInstructions(){
        String[] instructions=new String[3];
        instructions[0]="1)The boat cannot bear a load more than 100 kg";
    instructions[1]="2)The animal cannot cross alone";
    instructions[2]="3) How you can make them cross the other bank? ";
    return instructions;
}
}