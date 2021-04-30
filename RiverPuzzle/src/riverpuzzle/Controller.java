/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import java.io.IOException;
import static java.lang.Compiler.command;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;
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
public class Controller implements IRiverCrossingController{
      static Controller Controller=null;
  // private constructor to prevent users from instantiation 
     Controller() {}
    
    public static Controller  getInstance(){
    if(Controller==null)
        return new Controller();
    else
 return Controller;
    
}
     StacksCommand  command;
    
  private XML1 xml=new XML1();
  private XML2 xml2=new XML2();
   Stack stacksteps=new Stack(); //to know number of people on boat
   Stack side=new Stack(); //for boolean to know left/right
   public List<List> all=new ArrayList<List>(); //for save method
    private List<List> sides; //for undo
    int undo=0;//for undo 
    static List<ICrosser> boatriders=new ArrayList<ICrosser>();
   private ICrossingStrategy strategy;
    public static List<ICrosser> rightSide=new ArrayList<ICrosser>();
    public static List<ICrosser> leftSide=new ArrayList<ICrosser>();
    private int numberOfSails=0;
    private boolean fromLeftToRightBank;
   private ManagerXML manager=new ManagerXML(); //for commandpattern
   private Save save=new Save(); //for commandpattern

    
    public void newGame(ICrossingStrategy gameStrategy){
        strategy=gameStrategy;
        leftSide=strategy.getInitialCrossers();
        fromLeftToRightBank=true;
    }
    public String[] getInstructions(){
        String[] instructions;
        instructions=strategy.getInstructions();
    return instructions;
    }
    public List<ICrosser> getCrossersOnRightBank(){
    return rightSide;
    }
    public List<ICrosser> getCrossersOnLeftBank(){
    return leftSide;
    }
    public int getNumberOfSails(){
    return numberOfSails;
    }
    public void resetGame(){
    
    leftSide=strategy.getInitialCrossers();
    for(int i=0;i<rightSide.size();i++){
        rightSide.remove(i);
    }
    fromLeftToRightBank=true;
    }
    public boolean isBoatOnTheLeftBank(){
    
    
    return fromLeftToRightBank;
    }
    public boolean canMove(List<ICrosser> crossers,boolean fromLeftToRightBank){
    boolean x=strategy.isValid(rightSide,leftSide , crossers);
    
    return x;
    }
    public void  doMove(List<ICrosser> crossers,boolean fromLeftToRightBank){
        boatriders=crossers;
       int  x=boatriders.size();  //people on boat
        stacksteps.push(x); 
        if(strategy instanceof Strategy1){
    if(fromLeftToRightBank==true){
        Farmer f=new Farmer(50);
        if(crossers.size()==1){
            rightSide.add(f);
            crossers.remove(0);
        }
        if(crossers.size()==2){
           if(crossers.get(0) instanceof Farmer ||crossers.get(1) instanceof Farmer)
          rightSide.add(f);
           if(crossers.get(0) instanceof Carnivore ||crossers.get(1) instanceof Carnivore)
           rightSide.add(new Lion());
           if(crossers.get(0) instanceof Herbivore ||crossers.get(1) instanceof Herbivore)
           rightSide.add(new Sheep());
           if(crossers.get(0) instanceof Plant ||crossers.get(1) instanceof Plant)
           rightSide.add(new Plant());
        
            
        
        crossers.remove(0);
        crossers.remove(0);}
        System.out.println(crossers.size());
   // fromLeftToRightBank=false;
   numberOfSails++;
    
    }
    if(fromLeftToRightBank==false){
        if(crossers.size()==1){
            leftSide.add(new Farmer(50));
            crossers.remove(0);
        }
        if(crossers.size()==2){
         if(crossers.get(0) instanceof Farmer ||crossers.get(1) instanceof Farmer)
           leftSide.add(new Farmer(50));
           if(crossers.get(0) instanceof Carnivore ||crossers.get(1) instanceof Carnivore)
           leftSide.add(new Lion());
           if(crossers.get(0) instanceof Herbivore ||crossers.get(1) instanceof Herbivore)
           leftSide.add(new Sheep());
           if(crossers.get(0) instanceof Plant ||crossers.get(1) instanceof Plant)
           leftSide.add(new Plant());
        
            
        
        crossers.remove(0);
        crossers.remove(0);}
    //fromLeftToRightBank=true;
   numberOfSails++;
    
    }
    if(fromLeftToRightBank==true){
        this.fromLeftToRightBank=false;
        side.push("false");
    }
   else  if(fromLeftToRightBank==false){
       this.fromLeftToRightBank=true;
      side.push("true");
    }
   System.out.println("dost move:"+fromLeftToRightBank);
   for(int j=0;j<leftSide.size();j++){
   System.out.println("left:"+leftSide.get(j));
    }
    for(int j=0;j<rightSide.size();j++){
   System.out.println("right"+rightSide.get(j));
    }
    for(int j=0;j<crossers.size();j++){
   System.out.println("left:"+crossers.get(j));
    }
     }
        else if(strategy instanceof Strategy2){
        if(fromLeftToRightBank==true){
       // Farmer f=new Farmer(50);
       if(crossers.size()==1){
           if(crossers.get(0).getWeight()==40)
          rightSide.add(new Farmer(40));
           if(crossers.get(0).getWeight()==60)
           rightSide.add(new Farmer(60));
           if(crossers.get(0).getWeight()==80 )
           rightSide.add(new Farmer(80));
           if(crossers.get(0).getWeight()==90 )
           rightSide.add(new Farmer(90));
           if(crossers.get(0) instanceof Herbivore )
           leftSide.add(new Cow(20));
            crossers.remove(0);
        }
        if(crossers.size()==2){
           if(crossers.get(0).getWeight()==40 || crossers.get(1).getWeight()==40)
          rightSide.add(new Farmer(40));
           if(crossers.get(0).getWeight()==60|| crossers.get(1).getWeight()==60)
           rightSide.add(new Farmer(60));
           if(crossers.get(0).getWeight()==80 || crossers.get(1).getWeight()==80)
           rightSide.add(new Farmer(80));
           if(crossers.get(0).getWeight()==90 || crossers.get(1).getWeight()==90)
           rightSide.add(new Farmer(90));
           if(crossers.get(0) instanceof Herbivore || crossers.get(1) instanceof Herbivore)
           leftSide.add(new Cow(20));
            
        
        crossers.remove(0);
        crossers.remove(0);}
        System.out.println(crossers.size());
   // fromLeftToRightBank=false;
   numberOfSails++;
    
    }
    if(fromLeftToRightBank==false){
        if(crossers.size()==1){
            if(crossers.get(0).getWeight()==40)
          leftSide.add(new Farmer(40));
           if(crossers.get(0).getWeight()==60)
           leftSide.add(new Farmer(60));
           if(crossers.get(0).getWeight()==80 )
           leftSide.add(new Farmer(80));
           if(crossers.get(0).getWeight()==90 )
           leftSide.add(new Farmer(90));
           if(crossers.get(0) instanceof Herbivore )
           leftSide.add(new Cow(20));
            crossers.remove(0);
        }
        if(crossers.size()==2){
         if(crossers.get(0).getWeight()==40 || crossers.get(1).getWeight()==40)
          leftSide.add(new Farmer(40));
           if(crossers.get(0).getWeight()==60|| crossers.get(1).getWeight()==60)
           leftSide.add(new Farmer(60));
           if(crossers.get(0).getWeight()==80 || crossers.get(1).getWeight()==80)
           leftSide.add(new Farmer(80));
           if(crossers.get(0).getWeight()==90 || crossers.get(1).getWeight()==90)
           leftSide.add(new Farmer(90));
           if(crossers.get(0) instanceof Herbivore || crossers.get(1) instanceof Herbivore)
           leftSide.add(new Cow(20));
            
        
        crossers.remove(0);
        crossers.remove(0);}
    //fromLeftToRightBank=true;
   numberOfSails++;
    
    }
    if(fromLeftToRightBank==true){
        this.fromLeftToRightBank=false;
        side.push("false");
    }
   else  if(fromLeftToRightBank==false){
       this.fromLeftToRightBank=true;
       side.push("true");
    }
   System.out.println("dost move:"+fromLeftToRightBank);
   for(int j=0;j<leftSide.size();j++){
   System.out.println("left:"+leftSide.get(j));
    }
    for(int j=0;j<rightSide.size();j++){
   System.out.println("right"+rightSide.get(j));
    }
    for(int j=0;j<crossers.size();j++){
   System.out.println("left:"+crossers.get(j));
    }
        
        
        
        
        }
       // command= new StacksCommand(side,stacksteps,leftSide,rightSide);
    }

    @Override
    public boolean canUndo() {
       if(stacksteps.isEmpty()||side.isEmpty())
       return false;
       else 
       {undo++;
       return true;
       } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean canRedo() {
        if(undo<=0&&stacksteps.isEmpty()&&side.isEmpty())
       return false;
          else
              return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undo() {
        command= new StacksCommand(side,stacksteps,leftSide,rightSide);
        sides= command.undo();
     rightSide=sides.get(0);
     leftSide=sides.get(1);
     //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redo() {
       sides=command.redo();
     rightSide=sides.get(0);
     leftSide=sides.get(1);
      //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveGame() {
        if(strategy instanceof Strategy1 )
         manager.Command(save);
        else if(strategy instanceof Strategy2)
        { try {
              xml2.Save(leftSide,rightSide,boatriders);
          } catch (TransformerException ex) {
              Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
    }

    @Override
    public void loadGame() {
    all=xml.load();
       
        
    }
    

    @Override
    public List<List<ICrosser>> solveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
