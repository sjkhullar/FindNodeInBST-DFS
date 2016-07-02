
package org.learn.Question;

public class FindNodeInBST {
	public static Node findNodeInBST(Node node, int value) {
		if(null == node) {
			return null;
		}
		//Condition 1. we found the value
		if(node.data == value) {
			return node;
		} 
		//Condition 2. 
		//Value is less than node value. so go left sub tree
		else if(value < node.data)
			return findNodeInBST(node.left,value);
		//Condition 3. 
		//Value is greater than node value. so go right sub tree
		else 
			return findNodeInBST(node.right,value);
	}
}
