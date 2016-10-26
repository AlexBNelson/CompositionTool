/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Alex Nelson
 */
//ADD METHODS, ABSTRACT OR OTHERWISE, AS DICTATED BY REQUIREMENT
public abstract class CompositionElement { //ABSTRACT CLASS UNDERLYING ALL LINES AND SHAPES DELINING COMPOSITION
     
     protected double xPos;
     protected double yPos;
     
      
      public double getElementxPos(){
          return xPos;
      }
    
      public double getElementyPos(){
          return yPos;
      }
}
