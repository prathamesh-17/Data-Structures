package TreesPackage;

public class SumOfLeafNodes {
	Node root;
	
	boolean isLeaf(Node node)
	{
		if(node == null)
			return false;
		if(node.left == null && node.right == null)
			return true;
		return false;
	}
	int sum(Node root)
	{
		int res=0;
		
		if(root != null)
		{
			if(isLeaf(root.left))
				res += root.left.data;
			else
				res += sum(root.left);
			
			if(isLeaf(root.right))
				res += root.right.data;
			else
				res += sum(root.right);
		}
		return res;
	}
	
	/* Sum of left leaf nodes
	 * int sum(Node root)
	{
		int res=0;
		
		if(root != null)
		{
			if(isLeaf(root.left))
				res += root.left.data;
			else
				res += sum(root.left);
			
			res += sum(root.right);
		}
		return res;
	}
	 * 
	 */
	/*Sum of right leaf nodes
	 * 
	 * int sum(Node root)
	{
		int res=0;
		
		if(root != null)
		{
			if(isLeaf(root.right))
				res += root.right.data;
			else
				res += sum(root.right);
			
			res += sum(root.left);
			
			
		}
		return res;
	}
	 */
	
	public static void main(String args[])
	{
		SumOfLeafNodes h = new SumOfLeafNodes();
		h.root = new Node(12);
		h.root.left = new Node(10);
		h.root.right = new Node(30);
		h.root.right.left = new Node(25);
		h.root.right.right = new Node(40);
		h.root.right.right.right = new Node(40);
		
		System.out.print(h.sum(h.root));
	
	}
}
