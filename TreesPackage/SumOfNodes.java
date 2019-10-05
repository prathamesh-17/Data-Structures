package TreesPackage;

public class SumOfNodes {
	Node root;
	int sum(Node root)
	{
		if(root == null)
			return 0;
		
		return root.data + sum(root.left) + sum(root.right);
	}
	
	public static void main(String args[])
	{
		SumOfNodes h = new SumOfNodes();
		h.root = new Node(12);
		h.root.left = new Node(10);
		h.root.right = new Node(30);
		h.root.right.left = new Node(25);
		h.root.right.right = new Node(40);
		h.root.right.right.right = new Node(40);
		
		System.out.print(h.sum(h.root));
	
	}
}
