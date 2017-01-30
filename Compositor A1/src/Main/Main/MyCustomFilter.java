/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.File;

/**
 *
 * @author Alex Nelson
 */

//File Filter for fileChooser that allows only .ser files
public class MyCustomFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only files with ".ser" extension
            return file.getAbsolutePath().endsWith(".ser");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Serializable files (*.ser)";
        }
    } 
