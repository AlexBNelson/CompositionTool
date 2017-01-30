/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Alex Nelson
 */

//Attempt to unify ComElemJLab and CompositionElement

public class GeneralTracing extends JLabel {
    //INSTEAD OF HAVING xpoints AND ypoints ARRAYS SIMPLIFY USING tabArray
   
    protected ArrayList<DragTab> tabArray;
    protected ImageIcon tracing; 
    
    
   
    
    
      GeneralTracing(int[] xList, int[] yList){
          super();
          tracing=new ImageIcon(new BufferedImage(xList[xList.length-1]-xList[0], yList[yList.length-1]-yList[0],BufferedImage.TYPE_INT_ARGB));
          tabArray=new ArrayList<>();
          for(int i=0; i<xList.length; i++){
              tabArray=new ArrayList<>();
              tabArray.add(new DragTab(xList[i], yList[i]));
          
              }
          //Dimension preferredSize=new Dimension((int)(Math.ceil(xList[1]-xList[0])), (int)(Math.ceil(yList[1]-yList[0])));
      //this.setPreferredSize(preferredSize);
      }
      
      GeneralTracing(){
      super();
      tracing=new ImageIcon();
      tabArray=new ArrayList<>();
      };
      
        

      public ArrayList<DragTab> getTabs(){
          return tabArray;
      }
     
      
   public void parseEquation(String equation){
       for(int i=0; i<equation.length(); i++){
           
       }
   }
    
    @Override
    public void paintComponent(Graphics g){
         Graphics2D g2d = (Graphics2D) g;
         super.paintComponent(g2d);
    
    //g2d.draw(createPath());
    
        
    }
    


// Private function to which the logic for the creation of a path
// is delegated-used in the draw method
    protected Path2D.Double createPath(){
        
        Path2D.Double path=new Path2D.Double();
        
       
    path.moveTo(tabArray.get(0).getXloc(), tabArray.get(0).getYloc());
    for(int i=1; i<tabArray.size(); i++){
        path.lineTo(tabArray.get(i).getXloc(), tabArray.get(i).getXloc());
    }
        return path;
}
}
