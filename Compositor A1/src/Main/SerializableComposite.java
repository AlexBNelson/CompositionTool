/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.List;



/**
 *
 * @author Alex Nelson
 */

public class SerializableComposite implements java.io.Serializable{
    private BufferedImage image;
    private List<CompositionElement> lines;

    public SerializableComposite(BufferedImage i, List<CompositionElement> l){
    image=i;
    lines=l;
    }
   
    public BufferedImage getImage(){
        return image;
    }
    
    public List<CompositionElement> getLines(){
        return lines;
    }
    
    public void addElement(CompositionElement ce){
        lines.add(ce);
        
    }
    
    public void clearSerCom(){
        image=null;
        lines=null;
    }
}
