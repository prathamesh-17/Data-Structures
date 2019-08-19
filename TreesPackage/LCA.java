package TreesPackage;

public class LCA {
	Node root;
	
	//This algorithm works only if it is a Binary Search Tree
	
	public Node lca(Node root,int n1,int n2)
	{
		while(root != null)
		{
			if(root.data > n1 && root.data > n2)
			{
				root = root.left;
			}
			else if(root.data < n1 && root.data < n2)
			{
				root = root.right;
			}
			else
				break;
		}
		return root;
	}
	public static void main(String args[])
	{
		LCA val = new LCA();
		val.root = new Node(1);
		val.root.left = new Node(2);
		val.root.right = new Node(3);
		val.root.left.right = new Node(4);
		val.root.right.left = new Node(5);
		val.root.right.right = new Node(6);
		val.root.right.left.left = new Node(7);
		val.root.right.left.right = new Node(8);
		
		Node lca = val.lca(val.root, 6, 7);
	
		System.out.println(lca.data);
		
	}


}
