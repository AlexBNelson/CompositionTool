package Main;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Nelson
 */
//Tab which you can click and drag to resize GenralTracing components
public class DragTab extends JLabel implements MouseMotionListener{
private double xloc;
private double yloc;
    DragTab(double x, double y){
        xloc=x;
        yloc=y;
        setPreferredSize(new Dimension(20, 20));
    }
    @Override
    public final void setPreferredSize(Dimension d){
        
    }
    @Override
public void mouseMoved(MouseEvent e) {
}

@Override
public void mouseDragged(MouseEvent e) {
    
    xloc=e.getX();
    yloc=e.getY();
    repaint();//SHOULD AUTOMATICALLY REPAINT PARENT, MAYBE DO SO EXPLICITLY, PERHAPS USING A UTILITY CLASS METHOD
      //MAYBE USE parent.paintComponent(g) WITH GenralTracing parent PASSED TO THE CONSTRUCTOR
              }
      
    public void setXloc(double x){
        xloc=x;
    }
    
    public void setYloc(double y){
        yloc=y;
    }
    public double getXloc(){
        return xloc;
    }
    public double getYloc(){
        return yloc;
    }
@Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d=(Graphics2D)g;
        g2d.draw(new Rectangle2D.Double(xloc, yloc, 20, 20));
        //ENABLE ANTI ALIASING??
    }
}
