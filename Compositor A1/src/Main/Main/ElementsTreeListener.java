/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Alex Nelson
 */
//LOOK INTO
//Listener that allows you to change the name of nodes in side menu etc
public class ElementsTreeListener implements TreeModelListener  {
    @Override
    public void treeNodesChanged(TreeModelEvent e) {
        DefaultMutableTreeNode node;
        node = (DefaultMutableTreeNode)
                 (e.getTreePath().getLastPathComponent());

        /*
         * If the event lists children, then the changed
         * node is the child of the node we have already
         * gotten.  Otherwise, the changed node and the
         * specified node are the same.
         */
        try {
            int index = e.getChildIndices()[0];
            node = (DefaultMutableTreeNode)
                   (node.getChildAt(index));
        } catch (NullPointerException exc) {}

        
    }
    @Override
    public void treeNodesInserted(TreeModelEvent e) {
    }
    @Override
    public void treeNodesRemoved(TreeModelEvent e) {
    }
    @Override
    public void treeStructureChanged(TreeModelEvent e) {
    }
}
