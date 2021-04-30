/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static riverpuzzle.Controller.leftSide;
import static riverpuzzle.Controller.rightSide;

/**
 *
 * @author A B C
 */
public class JFrame1 extends javax.swing.JFrame {
IRiverCrossingController c;

    public void setC(IRiverCrossingController c) {
        this.c = c;
    }
   static List<ICrosser> boatRiders= new ArrayList<ICrosser>();
   int countFarmer=1;
   int countSheep=1;
   int countPlant=1;
   int countCarnivore=1;
   int countRight=1;
   int countLeft=1;
   boolean fromLeftToRight=true;
   boolean fromRightToLeft=true;
   int x;
    /**
     * Creates new form JFrame1
     */
   
   // JPane1l panel=new JPane1l();
    
    public JFrame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPane1l1 = new riverpuzzle.JPane1l();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPane1l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPane1l1MouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        jButton1.setText("RIght!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jButton2.setText("Add Farmer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jButton3.setText("Add Carnivore");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jButton4.setText("Add Herbivore");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton5.setText("Add Plant");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        jButton6.setText("Left!");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton7.setText("Drop");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton8.setText("Drop");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton9.setText("Drop");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton10.setText("Drop");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton11.setText("Save");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton12.setText("Undo");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton13.setText("Redo");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPane1l1Layout = new javax.swing.GroupLayout(jPane1l1);
        jPane1l1.setLayout(jPane1l1Layout);
        jPane1l1Layout.setHorizontalGroup(
            jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane1l1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 424, Short.MAX_VALUE)
                .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane1l1Layout.createSequentialGroup()
                        .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPane1l1Layout.createSequentialGroup()
                                .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPane1l1Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane1l1Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(116, 116, 116))))
        );
        jPane1l1Layout.setVerticalGroup(
            jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane1l1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton8))
                .addGap(27, 27, 27)
                .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton9))
                .addGap(26, 26, 26)
                .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane1l1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPane1l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane1l1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPane1l1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPane1l1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPane1l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPane1l1MouseClicked

    }//GEN-LAST:event_jPane1l1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        boolean eshta;
        System.out.println(boatRiders.size());
        eshta=c.canMove(boatRiders,true);
        System.out.println(eshta);
        if(eshta==true){
            if(countRight==1){
                if(fromLeftToRight==true){
           jPane1l1.moveBoat();
           fromLeftToRight=false;
                }
           countRight++;
                   
            }
            else 
            {
                jPane1l1.moveRight();
                countRight--;
               c.doMove(boatRiders, true);
               fromLeftToRight=true;
            }
            
        }else{
        JOptionPane.showConfirmDialog(null,"Wrong Move, Try Again! :)");
        }
        int p=c.getNumberOfSails();
        jLabel1.setText(String.valueOf(p));
        
        System.out.println(boatRiders.size());
// else b3den hayetb3 label yyou can't move
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.out.println(c.isBoatOnTheLeftBank());
        Farmer farmer=new Farmer(50);
        if(c.isBoatOnTheLeftBank()==true){
            boatRiders.add(farmer);
           jPane1l1.moveFarmer();
           if(leftSide!=null){
           for(int i=0;i<leftSide.size();i++){
           if(leftSide.get(i)instanceof Farmer){
               leftSide.remove(i);
               break;
           }
           }
           }
        }
        else{
        System.out.println("da5lt b false");
         jPane1l1.moveAddFarmerRight();
         boatRiders.add(farmer);
         if(rightSide!=null){
         for(int i=0;i<rightSide.size();i++){
           if(rightSide.get(i)instanceof Farmer){
              rightSide .remove(i);
              System.out.println("removed");
               break;
           }
           }
         }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      CarnivoreFactory carn= new CarnivoreFactory();
      Carnivore carn1= carn.getCarnivore("Lion");
      
      if(leftSide!=null){
      for(int i=0;i<leftSide.size();i++){
        if(leftSide.get(i) instanceof Carnivore){
        leftSide.remove(i);
        break;
        }
      }} if(rightSide!=null){
      for(int i=0;i<rightSide.size();i++){
        if(rightSide.get(i) instanceof Carnivore){
        rightSide.remove(i);
        break;
        }}
      }
    // System.out.println(leftSide.size());
      if(countCarnivore==1){
          boatRiders.add(carn1);
        jPane1l1.moveLion();
        if(leftSide!=null){
        for(int i=0;i<leftSide.size();i++){
        if(leftSide.get(i) instanceof Carnivore){
        leftSide.remove(i);
        break;
        }
        //System.out.println(countFarmer);
        }}
        countCarnivore++;
        }else{
        jPane1l1.moveAddLionRight();
         for(int i=0;i<boatRiders.size();i++){
        if(boatRiders.get(i) instanceof Carnivore){
        boatRiders.remove(i);
        break;
        }}
        leftSide.add(carn1);
        countCarnivore--;
        }
     
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    HerbivoreFactory herb= new HerbivoreFactory();
    Herbivore herb1=herb.getHerbivore("Sheep");
        if(c.isBoatOnTheLeftBank()==true){
            boatRiders.add(herb1);
           jPane1l1.moveSheep();
           if(leftSide!=null){
           for(int i=0;i<leftSide.size();i++){
           if(leftSide.get(i)instanceof Herbivore){
               leftSide.remove(i);
               break;
           }
           }
           }
        }
        else{
        System.out.println("da5lt b false");
         jPane1l1.moveAddSheepRight();
         boatRiders.add(herb1);
         if(rightSide!=null){
         for(int i=0;i<rightSide.size();i++){
           if(rightSide.get(i)instanceof Herbivore){
              rightSide .remove(i);
              //System.out.println("removed");
               break;
           }
           }
         }
        }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       Plant plant = new Plant();
       
        if(c.isBoatOnTheLeftBank()==true){
            boatRiders.add(plant);
           jPane1l1.movePlant();
           if(leftSide!=null){
           for(int i=0;i<leftSide.size();i++){
           if(leftSide.get(i)instanceof Plant ){
               leftSide.remove(i);
               break;
           }
           }
           }
        }
        else{
        System.out.println("da5lt b false");
         jPane1l1.moveAddPlantRight();
         boatRiders.add(plant);
         if(rightSide!=null){
         for(int i=0;i<rightSide.size();i++){
           if(rightSide.get(i)instanceof Plant){
              rightSide .remove(i);
             // System.out.println("removed");
               break;
           }
           }
         }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        boolean eshta;
        eshta=c.canMove(boatRiders, false);
        System.out.println(eshta);
        System.out.println("Size of boatRiders:"+boatRiders.size());
        if(eshta==true){
           // c.doMove(boatRiders, fromLeftToRight);
            if(countLeft==1){
                if(fromRightToLeft==true){
           jPane1l1.moveBoatLeft();
                fromRightToLeft=false;
                }
           countLeft++;
                   
            }
            else 
            {
                jPane1l1.moveLeft();
                countLeft--;
               c.doMove(boatRiders, false);
               fromRightToLeft=true;
            }
        }else{
        
           JOptionPane.showConfirmDialog(null,"Wrong Move, Try Again! :)");
        }
          int p=c.getNumberOfSails();
        jLabel1.setText(String.valueOf(p));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       Farmer farmer = new Farmer(50);
       System.out.println();
        if(c.isBoatOnTheLeftBank()==true){
        jPane1l1.moveFarmerBack();
        leftSide.add(farmer);
        for(int i=0;i<boatRiders.size();i++){
        if(boatRiders.get(i) instanceof Farmer){
        boatRiders.remove(i);
        break;
        }
        }  
       }
       else{
            System.out.println("hai");
           jPane1l1.dropFarmerRight();
           rightSide.add(farmer);
            for(int i=0;i<boatRiders.size();i++){
        if(boatRiders.get(i) instanceof Farmer){
        boatRiders.remove(i);
        break;
        }
        } 
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      CarnivoreFactory carn = new CarnivoreFactory();
       Carnivore carn1= carn.getCarnivore("Lion");
       
        if(c.isBoatOnTheLeftBank()==true){
        jPane1l1.moveLionBack();
        leftSide.add(carn1);
        for(int i=0;i<boatRiders.size();i++){
        if(boatRiders.get(i) instanceof Carnivore){
        boatRiders.remove(i);
        break;
        }
        }  
       }
       else{
           jPane1l1.dropLionRight();
           rightSide.add(carn1);
            for(int i=0;i<boatRiders.size();i++){
        if(boatRiders.get(i) instanceof Carnivore){
        boatRiders.remove(i);
        break;
        }
        } 
       }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         
       HerbivoreFactory carn = new HerbivoreFactory();
   Herbivore herb1= carn.getHerbivore("Sheep");
        if(c.isBoatOnTheLeftBank()==true){
        jPane1l1.moveSheepBack();
        leftSide.add(herb1);
        for(int i=0;i<boatRiders.size();i++){
        if(boatRiders.get(i) instanceof Herbivore){
        boatRiders.remove(i);
        break;
        }
        }  
       }
       else{
           jPane1l1.dropSheepRight();
           rightSide.add(herb1);
            for(int i=0;i<boatRiders.size();i++){
        if(boatRiders.get(i) instanceof Herbivore){
        boatRiders.remove(i);
        break;
        }
        } 
       }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
     Plant plant= new Plant();
       
        if(c.isBoatOnTheLeftBank()==true){
        jPane1l1.movePlantBack();
        leftSide.add(plant);
        for(int i=0;i<boatRiders.size();i++){
        if(boatRiders.get(i) instanceof Plant){
        boatRiders.remove(i);
        break;
        }
        }  
       }
       else{
           jPane1l1.dropPlantRight();
           rightSide.add(plant);
            for(int i=0;i<boatRiders.size();i++){
        if(boatRiders.get(i) instanceof Plant){
        boatRiders.remove(i);
        break;
        }
        } 
       }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        c.saveGame();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
 boolean x=c.canUndo();
        if(x==true)
        { c.undo();
       jPane1l1.printCrossersundoredo();}
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       boolean x=c.canRedo();
        if(x==true)
        { c.redo();
       jPane1l1.printCrossersundoredo();}
    }//GEN-LAST:event_jButton13ActionPerformed
public void printCrossers(){
jPane1l1.printCrossers();
}
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private riverpuzzle.JPane1l jPane1l1;
    // End of variables declaration//GEN-END:variables
}