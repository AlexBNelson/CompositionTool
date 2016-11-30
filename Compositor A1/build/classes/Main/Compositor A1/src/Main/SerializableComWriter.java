/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alex Nelson
 */
public class SerializableComWriter {
    public SerializableComWriter (SerializableComposite s, String fileName){
        try {
         FileOutputStream fileOut =new FileOutputStream(fileName);
         
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(s);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in "+fileName);
      }catch(IOException i) {
         i.printStackTrace();
      }
    }
}
