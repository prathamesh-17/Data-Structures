package TreesPackage;

public class ValidateBST {
	Node root;
	
	public boolean checkBST(Node root,Node l,Node r)
	{
		if(root == null)
			return true;
		if(l != null && root.data < l.data)
			return false;
		
		if(r != null && root.data > r.data)
			return false;
		
		return checkBST(root.left,l,root) && checkBST(root.right,root,r);
	}
	
	public static void main(String args[])
	{
		ValidateBST val = new ValidateBST();
		val.root = new Node(5);
		val.root.left = new Node(2);
		val.root.right = new Node(8);
		val.root.left.left = new Node(1);
		val.root.left.right = new Node(3);
		val.root.right.left = new Node(6);
		val.root.right.right = new Node(10);
		
		if (val.checkBST(val.root,null,null))  
	        System.out.print("Is BST");  
	    else
	        System.out.print("Not a BST"); 
	}

}
