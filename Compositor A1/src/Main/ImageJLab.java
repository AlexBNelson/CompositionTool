/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author Alex Nelson
 */
public class ImageJLab extends JLabel{ 
    private Icon mIcon;
    public ImageJLab(Icon icon){
        super(icon);
        mIcon=icon;
        
    }
    
   public ImageJLab(BufferedImage img){
       super((Icon)img);
       
       
   }
    
    public Icon getIcon(){
        return mIcon;
    }
}
