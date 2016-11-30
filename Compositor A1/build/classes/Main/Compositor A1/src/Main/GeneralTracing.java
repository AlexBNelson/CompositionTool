/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import javax.swing.JLabel;

/**
 *
 * @author Alex Nelson
 */

//Attempt to unify ComElemJLab and CompositionElement

public class GeneralTracing extends JLabel {
    protected double[] xPoints;
    protected double[] yPoints;
    protected int numPoints;
     
      
      public double[] getxPoints(){
          return xPoints;
      }
    
      public double[] getyPoints(){
          return yPoints;
      }
      
      public int getnumPoints(){
          return numPoints;
      }
      
   
    
    @Override
    public void paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D) g;
    g2d.draw(createPath());
        this.setOpaque(false);//IS THIS GOOD??
    }
    


// Private function to which the logic for the creation of a path
// is delegated
    private Path2D.Double createPath(){
        
        Path2D.Double path=new Path2D.Double();
        
       
    path.moveTo(xPoints[0], yPoints[0]);
    for(int i=1; i<=numPoints; i++){
        path.lineTo(xPoints[i], yPoints[i]);
    }
        return path;
}
}
