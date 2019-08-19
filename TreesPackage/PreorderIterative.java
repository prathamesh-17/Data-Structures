package TreesPackage;
import java.util.*;


public class PreorderIterative {
Node root;
	
	void preorder()
	{
		if(root == null)return;
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		
		while(!stack.isEmpty())
		{
			Node cur = stack.pop();
			System.out.print(cur.data+" ");
			if(cur.right != null)
			{
				stack.push(cur.right);
			}
			if(cur.left != null) {
				stack.push(cur.left);
			}
		}
	}
	public static  void main(String args[])
	{
		PreorderIterative pre = new PreorderIterative();
		pre.root = new Node(12);
		pre.root.left = new Node(10);
		pre.root.right = new Node(30);
		pre.root.left.left = new Node(25);
		pre.root.left.right = new Node(40);
		pre.preorder();
	}

}
