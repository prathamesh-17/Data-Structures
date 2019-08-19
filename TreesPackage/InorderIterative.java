package TreesPackage;

import java.util.*;

class TreeNode1
{
	int data;
	TreeNode1 left,right;
	TreeNode1(int d)
	{
		data = d;
		left = right = null;
	}
}

public class InorderIterative {
	TreeNode1 root;
	
	void inorder()
	{
		Stack<TreeNode1> stack = new Stack<TreeNode1>();
		TreeNode1 cur = root;
		while(!stack.isEmpty() || cur != null)
		{
			if(cur != null)
			{
				stack.push(cur);
				cur = cur.left;
			}
			else {
				cur = stack.pop();
				System.out.print(cur.data+" ");
				cur = cur.right;
			
			}
				
		}
		
	}
	public static  void main(String args[])
	{
		InorderIterative in = new InorderIterative();
		in.root = new TreeNode1(12);
		in.root.left = new TreeNode1(10);
		in.root.right = new TreeNode1(30);
		in.root.left.left = new TreeNode1(25);
		in.root.left.right = new TreeNode1(40);
		in.inorder();
	}

}
