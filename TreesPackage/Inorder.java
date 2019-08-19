package TreesPackage;

class TreeNode
{
	int data;
	TreeNode left,right;
	TreeNode(int d)
	{
		data = d;
		left = right = null;
	}
}

public class Inorder {
	TreeNode root;
	
	public void inorder(TreeNode root)
	{
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
		
	void inord()
	{
		inorder(root);
	}
	
	public static  void main(String args[])
	{
		Inorder in = new Inorder();
		in.root = new TreeNode(12);
		in.root.left = new TreeNode(10);
		in.root.right = new TreeNode(30);
		in.root.left.left = new TreeNode(25);
		in.root.left.right = new TreeNode(40);
		in.inord();
	}

}
