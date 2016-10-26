package Main;

import java.awt.geom.Rectangle2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Nelson
 */
//Composition element which is a rectangle
public class CompositionRect extends CompositionElement{
    private double rectWidth;//in this case position of element is top left corner of rectangle
    private double rectHeight;
    private Rectangle2D rect=new Rectangle2D.Double(xPos, yPos, rectWidth, rectHeight);
    public Rectangle2D getrect(){
        return rect;
    }
}
