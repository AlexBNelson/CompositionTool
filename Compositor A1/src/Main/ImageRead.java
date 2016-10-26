/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;//TODO change package
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;

/**
 *
 * @author Alex Nelson
 */

//SUCCESFULLY TESTED
public class ImageRead{ //TAKES AN IMAGE FILE AND CONVERTS IT INTO A BUFFEREDIMAGE
    private BufferedImage mReadImg;
    ImageRead(File f){
    BufferedImage img = null;
    
    mReadImg=importImage(f, img);}
    
    public BufferedImage getReadImage(){
        return mReadImg;
    }
    
    private BufferedImage importImage (File f, BufferedImage img){
try {
    img = ImageIO.read(f);
} catch (IOException e) {
}
    return img;}}


