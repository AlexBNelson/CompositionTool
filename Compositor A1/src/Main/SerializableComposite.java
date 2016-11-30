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
    private List<GeneralTracing> lines;

    public SerializableComposite(BufferedImage i, List<GeneralTracing> l){
    image=i;
    lines=l;
    }
   
    public BufferedImage getImage(){
        return image;
    }
    
    public List<GeneralTracing> getLines(){
        return lines;
    }
    
    public GeneralTracing getTopComElement(){
        return lines.get(lines.size()-1);
    }
    public void addElement(GeneralTracing ce){
        lines.add(ce);
        
    }
    
    public void clearSerCom(){
        image=null;//IS THIS OK?
        lines=null;
    }
}
