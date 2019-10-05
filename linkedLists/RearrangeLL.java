package linkedLists;


public class RearrangeLL {

	static class Node
	{
		int data;
		Node next;
		
	}
	static Node reverse(Node node)
	{
		Node cur = node;
		Node prev = null;
		Node next = null;
		while(cur != null)
		{
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		node = prev;
		return node;
	}
	static Node rearrange(Node node)
	{
		Node slow = node;
		Node fast = slow.next;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		Node node1 = node;
		Node node2 = slow.next;
		slow.next = null;
		
		node2 = reverse(node2);
		
		node = newNode(0);
		
		Node cur = node;
		while(node1 != null || node2 != null)
		{
			if(node1 != null)
			{
				cur.next = node1;
				cur = cur.next;
				node1 = node1.next;
			}
			if(node2 != null)
			{
				cur.next = node2;
				cur = cur.next;
				node2 = node2.next;
			}
		}
		node = node.next;
		return node;
	}
	static Node newNode(int data)
	{
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = null;
		return new_node;
	}
	static void printList(Node node)  
	{  
	    while (node != null)  
	    {  
	        System.out.print(node.data+"->");  
	        node = node.next;  
	    }  
	    System.out.println();  
	}
	public static void main(String[] args) {
		Node head = newNode(1);
		head.next = newNode(2);
		head.next.next = newNode(3);
		head.next.next.next = newNode(4);
		head.next.next.next.next = newNode(5);
		head.next.next.next.next.next = newNode(6);
		
		printList(head);
		Node temp = rearrange(head);
		System.out.print("\n");
		printList(temp);

	}

}
