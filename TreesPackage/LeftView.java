package TreesPackage;

class Node
{
	int data;
	Node left,right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}
public class LeftView {
	Node root;
	int max_level = 0;
	void leftView(Node node,int level)
	{
		if(node == null)
			return;
		if(max_level < level)
		{
			System.out.println(node.data+"");
			max_level = level;
		}
		leftView(node.left,level+1);
		leftView(node.right,level+1);
		
	}
	void left()
	{
		leftView(root,1);
	}
	public static  void main(String args[])
	{
		LeftView lv = new LeftView();
		lv.root = new Node(12);
		lv.root.left = new Node(10);
		lv.root.right = new Node(30);
		lv.root.left.left = new Node(25);
		lv.root.left.right = new Node(40);
		lv.left();
	}

}
