/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Alex Nelson
 */

//Attempt to unify ComElemJLab and CompositionElement

public class GeneralTracing extends JLabel {
    //INSTEAD OF HAVING xpoints AND ypoints ARRAYS SIMPLIFY USING tabArray
   
    protected ArrayList<DragTab> tabArray;
      GeneralTracing(double[] xList, double[] yList){
          for(int i=0; i<xList.length; i++){
              
              tabArray.get(i).add(new DragTab(xList[i], yList[i]));
          
              }}
      
      
      public ArrayList<DragTab> getnumPoints(){
          return tabArray;
      }
      
   
    
    @Override
    public void paintComponent(Graphics g){
         super.paintComponent(g);//NECESSARY??
    Graphics2D g2d = (Graphics2D) g;
    g2d.draw(createPath());
    for(int i=0; i<tabArray.size(); i++){
        tabArray.get(i).repaint();
    }
        this.setOpaque(false);//IS THIS GOOD??
    }
    


// Private function to which the logic for the creation of a path
// is delegated
    private Path2D.Double createPath(){
        
        Path2D.Double path=new Path2D.Double();
        
       
    path.moveTo(tabArray.get(0).getXloc(), tabArray.get(0).getYloc());
    for(int i=1; i<=tabArray.size(); i++){
        path.lineTo(tabArray.get(i).getXloc(), tabArray.get(i).getXloc());
    }
        return path;
}
}
