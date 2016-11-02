package Main;

import java.awt.geom.Rectangle2D;
import java.lang.reflect.Array;

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
    CompositionRect(int[] xp, int[] yp){
        super();
        if(Array.getLength(xp)>2 || Array.getLength(yp)>2){
            //USE AN IllegalArgumentException
        }
        xPoints[0]=xp[0];
        xPoints[1]=xp[1];
        xPoints[3]=xp[0];
        xPoints[4]=xp[1];
        yPoints[0]=yp[0];
        yPoints[1]=yp[1];
        yPoints[3]=yp[0];
        yPoints[4]=yp[1];
        numPoints=4;
        
    }
}
