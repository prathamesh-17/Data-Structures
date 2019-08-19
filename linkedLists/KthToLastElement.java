package linkedLists;



public class KthToLastElement 
{
	static class Node
	{
		int data;
		Node next;
		
	}
	static Node kthToLast(Node head,int k)
	{
		Node p1 = head;
		Node p2 = head;
		for(int i=0; i<k; i++)
		{
			if(p1 == null) return null;
			p1 = p1.next;
		}
		while(p1 != null)
		{
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
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
		
		
		
		Node val = kthToLast(head,4);
		
	System.out.println(val.data);
		
	}

}
