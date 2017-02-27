package Main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Nelson
 */
public class LineTracing extends GeneralTracing{
    
   Line2D.Double tLine;
   private final Icon icon;
  //xp[0] is NOT NECESSARILY SMALLER THAN xp[1]  

    //equationFlag is used simply to indicate that input is an equation
    public LineTracing(double xStart, double xEnd, double m, double c, int equationFlag) {
        super();
        tabArray.clear();
        setEquation(xStart, xEnd, m, c);
        icon=new ImageIcon();
    }
    public LineTracing(Line2D.Double line){
        super();
        tabArray.clear();
        tLine=line;
        icon=new ImageIcon();
    }
    public LineTracing(int xStart, int xEnd, int yStart, int yEnd){
        super();
        tabArray.clear();
        int xWidth;
        int yWidth;
        if(xStart>xEnd){
            xWidth=xStart-xEnd;
        }
        else{
            xWidth=xEnd-xStart;
        }
        if(yStart>yEnd){
            yWidth=yStart-yEnd;
        }
        else{
            yWidth=yEnd-yStart;
        }
        BufferedImage bf1=processImage(new BufferedImage(xWidth, yWidth, BufferedImage.TYPE_INT_ARGB), xStart, xEnd, yStart, yEnd);
    icon=new ImageIcon(bf1);
    }
    //The information required to get the equation of a line finite at both ends
    public final void setEquation(double start, double end, double m, double c){
        tabArray.add(new DragTab(start, (m*start)+c));
        tabArray.add(new DragTab(end, (m*end)+c));
    }
    
    //turns line coordinates into image with line rendered on
    private BufferedImage processImage(BufferedImage old, int xStart, int xEnd, int yStart, int yEnd) {
        int w = old.getWidth();
        int h = old.getHeight();
        int xOrig;
        int yOrig;
        int xLast;
        int yLast;
        if(xEnd>xStart){
            xOrig=0;
            xLast=xEnd-xStart;
        }
        else{
            xLast=0;
            xOrig=xStart-xEnd;
        }
        if(yEnd>yStart){
            yOrig=0;
            yLast=yEnd-yStart;
        }
        else{
            yLast=0;
            yOrig=yStart-yEnd;
        }
        BufferedImage img = new BufferedImage(
                w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        g2d.drawImage(old, 0, 0, null);
        g2d.drawLine(xOrig, yOrig, xLast, yLast);
        
        
        
        g2d.dispose();
        return img;
    }
    @Override
    public void paintComponent(Graphics g){
         
         super.paintComponent(g);
         
   
        icon.paintIcon(this, g, 0, 0);
        //double xOrig;
        //double yOrig;
        //double x2;
        //double y2;
       // if(tabArray.get(0).getXloc()>tabArray.get(1).getXloc()){
         //   xOrig=tabArray.get(0).getXloc()-tabArray.get(1).getXloc();
         //   x2=0.0;
    //    }
        //else {
        //xOrig=0.0;
       // x2=tabArray.get(1).getXloc()-tabArray.get(0).getYloc();
    //}
        //if(tabArray.get(0).getYloc()>tabArray.get(1).getYloc()){
            //yOrig=tabArray.get(0).getYloc()-tabArray.get(1).getYloc();
          //  y2=0.0;
       // }
     //   else{
        //yOrig=0.0;
      //  y2=tabArray.get(1).getYloc()-tabArray.get(0).getYloc();
  //  }
//ROUNDED AND NOT IDEAL, SHOULD ULTIMATELY AIM TO HAVE IT DRAWING PATH
//Line2D line = new Line2D.Double(xOrig, yOrig, x2, y2);
//g2d.draw(tLine);
    //g2d.drawLine(Math.round((float)xOrig), Math.round((float)yOrig), Math.round((float)x2), Math.round((float)y2));
    //g2d.drawLine(0,0, 80, 80);
        
    }
    protected GeneralPath formPath(){
        
        GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD,
                2);

        
       
    path.moveTo(tabArray.get(0).getXloc(), tabArray.get(0).getYloc());
    
        path.lineTo(tabArray.get(1).getXloc(), tabArray.get(1).getXloc());
    
        return path;
}
}
