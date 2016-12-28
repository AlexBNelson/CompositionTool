/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.awt.event.MouseAdapter;
import java.io.*;
/**
 *
 * @author Alex Nelson
 */
public class SerializableComReader extends MouseAdapter {
    private SerializableComposite serCom;
public SerializableComReader(File f){
 try {
         FileInputStream fileIn = new FileInputStream(f);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         serCom = (SerializableComposite) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i) {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      
}
public SerializableComposite getSerCom(){
    return serCom;
}
}
    
