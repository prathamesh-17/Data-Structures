package TreesPackage;

public class Height {
	Node root;
	int checkHeight(Node root)
	{
		if(root == null)
			return 0;
		
		return 1 + Math.max(checkHeight(root.left), checkHeight(root.right));
	}
	
	public static void main(String args[])
	{
		Height h = new Height();
		h.root = new Node(12);
		h.root.left = new Node(10);
		h.root.right = new Node(30);
		h.root.right.left = new Node(25);
		h.root.right.right = new Node(40);
		h.root.right.right.right = new Node(40);
		
		System.out.print(h.checkHeight(h.root));
	
	}
}
