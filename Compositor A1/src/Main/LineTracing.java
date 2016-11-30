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
//Extension of GeneralTracing used for drawing lines
public class LineTracing extends GeneralTracing {
    LineTracing(double x1, double y1, double x2, double y2){
        xPoints[0]=x1;
        xPoints[1]=x2;
        yPoints[0]=y1;
        yPoints[1]=y2;
        
    }
    
}
