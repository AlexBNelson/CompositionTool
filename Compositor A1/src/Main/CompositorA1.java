/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


/**
 *
 * @author Alex Nelson
 */
//FEATURES-
//SHOULD ALLOW USER TO CREATE THEIR OWN COMPOSITIONAL ELEMENTS
//INTEGRATE WITH MATHS AND OTHER MEANS OF DESCRIPTION
//USE JAVA OBJECT SERIALIZATION TO SERIALIZE A FILE CONTAINING BUFFEREDIMAGE AND 
//GEOMETRIC PRIMITIVES AND THEN SAVE THE FILE
//MAIN CLASS (AS OPPOSED TO METHOD) MAY NOT BE NECESSARY FOR THE FORMAT BECAUSE IT PRECLUDES THE 
//CREATION OF RESOURCES FILE
// IMPLEMENT CUSTOM FILEFILTER CLASS MyCustomFilter USING addChoosableFileFilter
// METHOD


public class CompositorA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelA1().setVisible(true);
            }
        });
    }
    
}
