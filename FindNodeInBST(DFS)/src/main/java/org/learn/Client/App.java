package org.learn.Client;

import org.learn.PrepareTree.Node;
import org.learn.PrepareTree.Tree;
import org.learn.Question.FindNodeInBST;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {		
		int[] data = {50, 150, 25, 80, 125,170, 10, 30, 60, 90, 110, 140};
    	Tree tree = new Tree();
    	Node root = tree.createNode(100);
    	for(int i : data ) {
    		tree.insert(root, i );
    	}    	
    	Node node = FindNodeInBST.findNodeInBST(root, 180);
    	if(null == node) {
    		System.out.println("Node not found in BST");
    	} else {
    		System.out.println("Node found in BST");
    	}
    }
}
