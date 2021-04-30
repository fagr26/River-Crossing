/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Image;

/**
 *
 * @author mayar abu zeid
 */
public class RiverPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
         JPanel p = new JPanel();
       // Scene1Frame sc = Scene1Frame();
         Controller control =new Controller();
      IRiverCrossingController c=control.getInstance();

    
       Scene1Frame d = new Scene1Frame();
         d.add(p);
         d.setC(c);
        d.setSize(560,400);
        d.setVisible(true);
       /*    
       JPane1l panel= new JPane1l(new ImageIcon("farm2.jpg").getImage());
        JFrame1 frame = new JFrame1();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);*/
      /* Second s = new Second();
       JFrame j = new JFrame();
       j.add(s);
       j.setSize(600, 500);
       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       j.setVisible(true);
       */
    }
    
}
