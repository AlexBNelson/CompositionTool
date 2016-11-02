/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Shape;
import javafx.scene.shape.Polyline;

/**
 *
 * @author Alex Nelson
 */
//FIELDS AND METHODS MAY BE UNECESSARY
public abstract class CompositionElement  extends Polyline{//ABSTRACT CLASS UNDERLYING ALL LINES AND SHAPES DELINING COMPOSITION
     
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
}
