/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package riverpuzzle;
import java.util.*;
import riverpuzzle.ICrosser;
import riverpuzzle.ICrosser;

public class StacksCommand {
   private Stack stack1=new Stack();
   private Stack stack2=new Stack();
  private  Stack side;
  private  Stack stacksteps;
  private List<ICrosser> left;
  private List<ICrosser> right;
  private List<List>  sides=new ArrayList<List>();
  ICrosser t;
  int countleft=0;
  int countright=0;
  List<ICrosser> gui;
    public StacksCommand(Stack s, Stack m,List<ICrosser> l,List<ICrosser> r){
     side=s; //side
     stacksteps=m; //stacksteps
     left=l; //leftside
     right=r; //rightside
    }

   /* StacksCommand(Stacks side, Stacks stacksteps, List<ICrosser> rightSide, List<ICrosser> leftSide) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    public List<List> undo(){   
          String x= (String) side.pop(); //false if right and true if left
            int y= (int) stacksteps.pop();  
            int z=right.size();
            int f=left.size(); 
    
    if(x.equals("true")){ 
        if(y==2){
    right.add(left.get(left.size()-1));
    left.remove(left.size()-1);
   right.add(left.get(left.size()-1));
      left.remove(left.size()-1);
        }
      else if(y==1)
              {  right.add(left.get(left.size()-1));
    left.remove(left.size()-1);
              }
        }
      else
      {  if(y==2){
   left.add(right.get(right.size()-1));
    right.remove(right.size()-1);
   left.add(right.get(right.size()-1));
      right.remove(right.size()-1);
        }
      else if(y==1)
              {  left.add(right.get(right.size()-1));
                 right.remove(right.size()-1);
              }
    
      }

          stack1.push(x);
          stack2.push(y);
                 sides.add(right);
                 sides.add(left);
        
        return sides;
    }
    
    public List<List> redo(){     
    String m= (String) stack1.pop(); //true/false
    int n=(int) stack2.pop();
    if(m.equals("true")){
      { 
          if(n==2){
   left.add(right.get(right.size()-1));
    right.remove(right.size()-1);
   left.add(right.get(right.size()-1));
      right.remove(right.size()-1);
        }
      else if(n==1)
              {  left.add(right.get(right.size()-1));
    right.remove(right.size()-1);
              }
      }
      }
     else
    {  if(n==2){
    right.add(left.get(left.size()-1));
    left.remove(left.size()-1);
   right.add(left.get(left.size()-1));
      left.remove(left.size()-1);
        }
      else if(n==1)
              {  right.add(left.get(left.size()-1));
    left.remove(left.size()-1);
              }
        }
    sides.add(right);
    sides.add(left);
    return sides;
    }
}
    


