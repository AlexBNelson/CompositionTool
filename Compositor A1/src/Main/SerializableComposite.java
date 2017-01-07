/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.Icon;



/**
 *
 * @author Alex Nelson
 */

public class SerializableComposite implements java.io.Serializable{
    private Icon image;
    private List<GeneralTracing> lines;

    public SerializableComposite(Icon i){
    image=i;
    
    }
   public SerializableComposite(Icon i, List<GeneralTracing> l){
       image=i;
       lines=l;
   }
    public Icon getIcon(){
        return image;
    }
    
    public List<GeneralTracing> getLines(){
        return lines;
    }
    //should not be necessary because image is added in constructor public void addIcon(Icon icon){
      //  if(image==null){
        //    image=icon;
       // }
        //else{
       //     throw new IllegalArgumentException("there is already an icon loaded in SerializableComposite");
       // }
        
    //}
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
