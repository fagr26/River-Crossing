/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import java.util.ArrayList;
import java.util.List;
import riverpuzzle.Carnivore;
import riverpuzzle.Farmer;
import riverpuzzle.Herbivore;
import riverpuzzle.HerbivoreFactory;
import riverpuzzle.ICrosser;
import riverpuzzle.ICrossingStrategy;
import riverpuzzle.Plant;

/**
 *
 * @author mayar abu zeid
 */
public class Strategy1 implements ICrossingStrategy{

    
    public boolean isValid(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers, List<ICrosser> boatRiders){
        boolean flag=false;
        System.out.println(boatRiders.size());
        if(boatRiders.size()<=2){
    for(int i=0;i<boatRiders.size();i++){
        if(boatRiders.get(i) instanceof Farmer){
        flag=true;
        break;
        }
        else
            flag=false;
    }
    if(flag==true&&rightBankCrossers!=null){
     for(int j=0;j<rightBankCrossers.size();j++){
       for(int k=j+1;k<rightBankCrossers.size();k++){
                    int diff1= rightBankCrossers.get(j).getEatingRank()-rightBankCrossers.get(k).getEatingRank();
                    if(diff1==1 || diff1==-1){
                        flag=false;
                        break;
                    } 
                    else
                        flag=true;
                    }  
     }
    }
                if(flag==true) {       
                    for(int y=0;y<leftBankCrossers.size();y++){
                            for(int z=y+1;z<leftBankCrossers.size();z++){
                                int diff2= leftBankCrossers.get(y).getEatingRank()-leftBankCrossers.get(z).getEatingRank();
                                if(diff2!=1 && diff2!=-1){
                                    flag=true;
                                }
                                else {
                                    flag=false;
                                break;
                            }
                            }
                        }
                }    
        }       
    return flag;
    }
    public List<ICrosser> getInitialCrossers​(){
        
    List<ICrosser> crossers;
        crossers = new ArrayList<ICrosser>();
    Farmer f=new Farmer(50);
    crossers.add(f);
    Plant p=new Plant();
    crossers.add(p);
    CarnivoreFactory car=new CarnivoreFactory();
    Carnivore carn=car.getCarnivore("Lion");
    crossers.add(carn);
    HerbivoreFactory her=new HerbivoreFactory();
    Herbivore herb=her.getHerbivore("Sheep");
    crossers.add(herb);
    return crossers;
    }
    public​ String[] getInstructions(){
   String[] instructions=new String[3];
   instructions[0]="1)Only the farmer can sail the boat";
    instructions[1]="2)He can only take one passanger with him";
    instructions[2]="3) ​You can not leave any two crossers on the same bank if they can eat each other ";
    return instructions;
    }
} 
    

