package TreesPackage;

import java.util.Queue;
import java.util.ArrayDeque;

public class LevelOrderTraversal {
	Node root;
	void levelOrderTraversal(Node root)
	{
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(root); 	
		 Node cur;
		 while(!queue.isEmpty())
		 {
			 cur = queue.poll();
			 System.out.print(cur.data+" ");
			 if(cur.left != null)
			 {
				 queue.add(cur.left);
			 }
			 if(cur.right != null)
			 {
				 queue.add(cur.right);
			 }
		 }
		
	}
	public static void  main(String args[])
	{
		LevelOrderTraversal level = new LevelOrderTraversal();
		level.root = new Node(12);
		level.root.left = new Node(10);
		level.root.left.right = new Node(5);
		level.root.right = new Node(30);
		level.root.right.left = new Node(25);
		level.root.right.right = new Node(40);
		level.root.right.right.right = new Node(40);
		
		level.levelOrderTraversal(level.root);
		
	}

}


