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
//NEED TO START WORKING ON THE MECHANISM FOR CRAETING SIMPLE COMPOSITIONS
//CompositionElements SHOULD BE TRANSPARENT CUSTOMIZED JLabels USING label.setOpaque(false);
//AND THE IMAGE SHOULD ALSO BE A SEPARATE EXTENSION OF JLabel
//ALL PLACED ON A JPanel
//SerializableComposite IS MERELY A MEANS OF RECORDING A CompositeLabel
//RATHER THAN A DOCUMENT IN ITSELF
//MAYBE FIND WAY OF ENSURING ANY MODIFICATION OF jLayeredPane1 MODIFIES
//serComField
//FIELDS SHOULD HAVE m- PREFIX?
//MAY MAKE MORE SENSE FOR SerializableComposite TO CONTAIN ComElemJLab
//AND ImageJLab FIELDS RATHER THAN PRIMITIVES
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
