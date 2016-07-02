package org.learn.Client;

import org.learn.Question.FindNodeInBST;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		// root level 0
		Node A = Node.createNode(50);
		// Level 1
		Node B = Node.createNode(40);
		Node C = Node.createNode(60);
		// Level 2
		Node D = Node.createNode(30);
		Node E = Node.createNode(45);
		Node F = Node.createNode(55);
		Node G = Node.createNode(70);

		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
				
		Node node = FindNodeInBST.findNodeInBST(A, 180);
		if (null == node) {
			System.out.printf("Node=%d does not exists in BST\n",180);
		} else {
			System.out.printf("Found node=%d in BST\n",180);
		}
		
		node = FindNodeInBST.findNodeInBST(A, 45);
		if (null == node) {
			System.out.printf("Node=%d does not exists in BST\n",45);
		} else {
			System.out.printf("Found node=%d in BST\n",45);
		}
	}
}
