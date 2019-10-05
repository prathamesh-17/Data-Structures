package TreesPackage;


public class ConstructBST {

	Node root = null;
	public void addNode(int key) {

		// Create a new Node and initialize it

		Node newNode = new Node(key);

		// If there is no root this becomes root

		if (root == null) {

			root = newNode;

		} else {

			// Set root as the Node we will start
			// with as we traverse the tree

			Node focusNode = root;

			// Future parent for our new Node

			Node parent;

			while (true) {

				// root is the top parent so we start
				// there

				parent = focusNode;

				// Check if the new node should go on
				// the left side of the parent node

				if (key < focusNode.data) {

					// Switch focus to the left child

					focusNode = focusNode.left;

					// If the left child has no children

					if (focusNode == null) {

						// then place the new node on the left of it

						parent.left = newNode;
						return; // All Done

					}

				} else { // If we get here put the node on the right

					focusNode = focusNode.right;

					// If the right child has no children

					if (focusNode == null) {

						// then place the new node on the right of it

						parent.right = newNode;
						return; // All Done

					}

				}

			}
		}

	}

	
	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			// Traverse the left node

			inOrderTraverseTree(focusNode.left);

			// Visit the currently focused on node

			System.out.print(focusNode.data+" ");

			// Traverse the right node

			inOrderTraverseTree(focusNode.right);

		}

	}
    
	public static void main(String[] args) {
		ConstructBST tree = new ConstructBST(); 
        tree.addNode(10);
        tree.addNode(5);
        tree.addNode(1);
        tree.addNode(7);
        tree.addNode(40);
        tree.addNode(50);
        
        tree.inOrderTraverseTree(tree.root);
        
	}

}
