package linkedLists;

public class ReverseInGroups {
	static class Node
	{
		int data;
		Node next;
		
	}
	static Node reverse(Node head,int k)
	{
		Node prev = null;
		Node current = head;
		Node next = null;
		int count = 0;
		while(count < k && current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		if(next != null)
		{
			head.next = reverse(next,k);
		}
		return prev;
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
	        System.out.print(node.data);  
	        node = node.next;  
	    }  
	    System.out.println();  
	}
	public static void main(String args[])
	{
		Node head = newNode(1);
		head.next = newNode(2);
		head.next.next = newNode(3);
		head.next.next.next = newNode(4);
		head.next.next.next.next = newNode(5);
		head.next.next.next.next.next = newNode(6);
		
		printList(head);
		
		reverse(head,2);
				
		printList(head);
		
	}


}
