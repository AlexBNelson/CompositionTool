/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alex Nelson
 */
public class TestJUnit   {
    
    
    private final BufferedImage mReadImg;
    TestJUnit (File f){
   
    
    mReadImg=importImage(f);}
    
    
    private BufferedImage importImage (File f){
try {
    return ImageIO.read(f);
} catch (IOException e) {
}
    return null;}

    public BufferedImage getReadImage(){
        return mReadImg;
    }
}

    
   
    

