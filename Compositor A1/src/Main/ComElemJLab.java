/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.Array;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author Alex Nelson
 */
//Stands for Composition Element JLabel
//IMPLEMENT DRAWPOLYLINE METHOD AND MODIFY COMPOSITIONELEMENT ACCORDINGLY
public class ComElemJLab extends JLabel{
    private CompositionElement elem; //Final or not??
    ComElemJLab(CompositionElement line){
        super();
        
        elem=line;
    }
    @Override
    public void paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D) g;
    g2d.draw(createPath(elem));
        this.setOpaque(false);//IS THIS GOOD??
    }
    


// Private function to which the logic for the creation of a path
// is delegated
    private Path2D.Double createPath(CompositionElement elem){
        
        Path2D.Double path=new Path2D.Double();
        
       
    path.moveTo(elem.getxPoints()[0], elem.getyPoints()[0]);
    for(int i=1; i<=elem.getnumPoints(); i++){
        path.lineTo(elem.getxPoints()[i], elem.getyPoints()[i]);
    }
        return path;
}
    
    
}
