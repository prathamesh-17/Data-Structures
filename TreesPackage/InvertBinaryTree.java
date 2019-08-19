package TreesPackage;

public class InvertBinaryTree {
	Node root;
	public void preorder(Node root)
	{
		if(root == null)return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public void swap(Node root)
	{
		if(root == null)return;
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
	public void invert(Node root)
	{
		if(root == null)return;
		swap(root);
		invert(root.left);
		invert(root.right);
	}
	public static void main(String args[])
	{
		InvertBinaryTree in = new InvertBinaryTree();
		in.root = new Node(1);
		in.root.left = new Node(2);
		in.root.right = new Node(3);
		in.root.right.left = new Node(4);
		in.root.right.right = new Node(5);
		
		in.invert(in.root);
		in.preorder(in.root);
		
	}

}
