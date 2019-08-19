package TreesPackage;

public class PostOrder {
	Node root;

	static void post(Node root)
	{
		if(root == null)
			return;
		
		post(root.left);
		post(root.right);
		System.out.print(root.data);
	}
	
	public static void main(String[] args) {
		PostOrder p = new PostOrder();
		p.root = new Node(12);
		p.root.left = new Node(10);
		p.root.right = new Node(30);
		p.root.left.left = new Node(25);
		p.root.left.right = new Node(40);
		post(p.root);
	}

}
