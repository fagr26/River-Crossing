/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;

import java.awt.ComponentOrientation;
import javax.swing.JOptionPane;

/**
 *
 * @author A B C
 */
public class JFrame2 extends javax.swing.JFrame {
IRiverCrossingController c;

    public void setC(IRiverCrossingController c) {
        this.c = c;
    }
    /**
     * Creates new form JFrame2
     */
    public JFrame2() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Story 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 150, 196, 23);

        jButton2.setText("Strory 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 200, 196, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\A B C\\Desktop\\RiverPuzzle\\image1.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 640, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Strategy1 str = new Strategy1();
        c.newGame(str);
        JFrame1 o = new JFrame1();
        o.setSize(880,600);
        o.setC(c);
        o.setVisible(true);
        JOptionPane.showMessageDialog(null,c.getInstructions());
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Strategy2 str2= new Strategy2();
    c.newGame(str2);
    JFramestory2 j= new JFramestory2();
    j.setSize(880,600);
        j.setC(c);
        j.setVisible(true);
         JOptionPane.showMessageDialog(null,c.getInstructions());
        setVisible(false);
        
   
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    void printCrossers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}