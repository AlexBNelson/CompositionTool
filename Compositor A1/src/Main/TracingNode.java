package Main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Nelson
 */
public class TracingNode extends DefaultMutableTreeNode implements MouseListener{
  private int objectIndex;//for reference to a particular GeneralTracing object
  private JLabel GT;
  private JPopupMenu jp;
  private JTree JT;
  TracingNode(String string, JLabel gt, JPopupMenu jp1, JTree jt)
  {
      super(string);
      GT=gt;
      JT=jt;
  }
  
    @Override
    public void mouseClicked(MouseEvent e) {
        if(SwingUtilities.isRightMouseButton(e)){
            jp.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void valueChanged(){
         DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                           JT.getLastSelectedPathComponent();

    /* if nothing is selected */ 
        if (node == null) return;

    /* retrieve the node that was selected */ 
        Object nodeInfo = node.getUserObject();
        ...
    /* React to the node selection. */
        ...
    }
}
