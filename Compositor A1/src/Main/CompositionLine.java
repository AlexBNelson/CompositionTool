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
//Composition element which is a line
public class CompositionLine extends CompositionElement {
    private double xPos2; //Every composition element has a position defined by a single coordinate
    private double yPos2; //xPos2 and yPos2 are the second set of coordinates of the line
    public double getxPos2(){return xPos2;}
    public double getyPos2(){return yPos2;}
}
