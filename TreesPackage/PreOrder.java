package TreesPackage;

public class PreOrder {
	Node root;
	
	void preorder(Node root)
	{
		if(root == null)return;
		
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static  void main(String args[])
	{
		PreOrder pre = new PreOrder();
		pre.root = new Node(12);
		pre.root.left = new Node(10);
		pre.root.right = new Node(30);
		pre.root.right.left = new Node(25);
		pre.root.right.right = new Node(40);
		pre.preorder(pre.root);
	}

}
