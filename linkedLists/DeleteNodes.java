package linkedLists;



public class DeleteNodes {
	static Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public void push(int value)
	{
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
	void deleteNode(int m,int n)
	{
		Node cur = head;
		Node ptr = null;
		while(cur != null)
		{
			for(int count=1; count< m && cur != null;count++)
			{
				cur = cur.next;
			}
			if(cur == null)
				return;
			ptr = cur.next;
			for(int count=1; count< n && ptr != null; count++)
			{
				ptr = ptr.next;
			}
			if(ptr == null)
				return;
			cur.next = ptr.next;
			cur = ptr.next;
		}
		
	}
	
	public static void main(String args[])
	{
		DeleteNodes list = new DeleteNodes();
		for(int i=10; i>0; i--)
		{
			list.push(i);
		}
		list.printList(head);
		System.out.println();
		list.deleteNode(2,2);
		list.printList(head);
	}

}
