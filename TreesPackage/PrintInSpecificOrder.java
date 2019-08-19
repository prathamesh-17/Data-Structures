package TreesPackage;
import java.util.Queue;
import java.util.ArrayDeque;

public class PrintInSpecificOrder {

	Node root;
	
	void printSpecificNodes(Node root)
	{
		if(root == null)
			return;
		System.out.print(root.data+" ");
		Queue<Node> q1 = new ArrayDeque<>();
		Queue<Node> q2 = new ArrayDeque<>();
		q1.add(root.left);
		q2.add(root.right);
		while(!q1.isEmpty())
		{
			int n = q1.size();
			while(n-- > 0)
			{
				Node x = q1.poll();
				System.out.print(x.data+" ");
				if(x.left != null)
				{
					q1.add(x.left);
				}
				if(x.right != null)
				{
					q1.add(x.right);
				}
				Node y = q2.poll();
				System.out.print(y.data+" ");
				if(y.right != null)
				{
					q2.add(y.right);
				}
				if(y.left != null)
				{
					q2.add(y.left);
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		PrintInSpecificOrder print = new PrintInSpecificOrder();
		print.root = new Node(1);
		print.root.left = new Node(2);
		print.root.left.left = new Node(4);
		print.root.left.right = new Node(5);
		print.root.left.left.left = new Node(8);
		print.root.left.left.right = new Node(9);
		print.root.left.right.left = new Node(10);
		print.root.left.right.right = new Node(11);
		print.root.right = new Node(3);
		print.root.right.left = new Node(6);
		print.root.right.right = new Node(7);
		print.root.right.left.left = new Node(12);
		print.root.right.left.right = new Node(13);
		print.root.right.right.right = new Node(15);
		print.root.right.right.left = new Node(14);
		
		
		print.printSpecificNodes(print.root);

	}

}
