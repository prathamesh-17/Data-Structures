package TreesPackage;
import java.util.*;


public class PostorderIterative {
Node root;
	
	void postorder()
	{
		if(root == null)return;
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		Stack<Node> out = new Stack<Node>();
		while(!stack.isEmpty())
		{
			Node cur = stack.pop();
			out.push(cur);
			if(cur.left != null)
			{
				stack.push(cur.left);
			}
			if(cur.right != null) {
				stack.push(cur.right);
			}
		}
		while(!out.isEmpty())
		{
			Node temp = out.pop(); 
			System.out.print(temp.data+" ");
		}
	}
	public static  void main(String args[])
	{
		PostorderIterative post = new PostorderIterative();
		post.root = new Node(12);
		post.root.left = new Node(10);
		post.root.right = new Node(30);
		post.root.left.left = new Node(25);
		post.root.left.right = new Node(40);
		post.postorder();
	}

}
