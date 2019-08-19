package TreesPackage;

public class SumTree {

	Node root;
	
	int sum(Node node)
	{
		if(node == null)
			return 0;
		return sum(node.left)+node.data+sum(node.right);
	}
	
	int isSumTree(Node root)
	{
		if((root == null) || (root.left == null && root.right == null))
				return 1;
		int ls,rs;
		ls = sum(root.left);
		rs = sum(root.right);
		if((root.data == ls+rs) && (isSumTree(root.left) != 0) && (isSumTree(root.right) != 0))
			return 1;
		return 0;
	}
	public static void main(String[] args) {
		SumTree sum = new SumTree();
		sum.root = new Node(26);
		sum.root.left = new Node(3);
		sum.root.left.right = new Node(3);
		sum.root.right = new Node(10);
		sum.root.right.left = new Node(4);
		sum.root.right.right = new Node(6);
		
		if(sum.isSumTree(sum.root) == 1)
			System.out.print("Is a sum tree.");
		else
			System.out.print("Not a sum tree.");
	}

}
