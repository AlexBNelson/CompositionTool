/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Alex Nelson
 */
public class CircleTracing extends GeneralTracing{
    private double radius;
    
    CircleTracing(double centreX, double centreY, double radius){
        super();
        tabArray.clear();
        setEquation( centreX,  centreY,  radius);
    }
    public void setEquation(double centreX, double centreY, double radius){
        tabArray.add(new DragTab(centreX, centreY));
    }
    
    @Override
    public void paintComponent(Graphics g){
        Ellipse2D.Double shape = new Ellipse2D.Double(((int)tabArray.get(0).getX()), ((int)tabArray.get(0).getX()), radius, radius);
        Graphics2D g2d= (Graphics2D)g;
        g2d.draw(shape);
        shape=null;
    }
}
