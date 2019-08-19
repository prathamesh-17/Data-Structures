package linkedLists;

public class AddOne {
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
		
	}
	static Node reverse(Node head)
	{
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	static Node newNode(int data)
	{
		Node new_node = new Node(data);
		new_node.next = null;
		return new_node;
	}
	
	static Node addOneUntil(Node head)
	{
		Node res = head;
		Node temp = null;
		int carry = 1, sum;
		while(head != null)
		{
			sum = carry + head.data;
			carry = (sum >= 10)?1:0;
			sum = sum % 10;
			head.data = sum;
			temp = head;
			head = head.next;
		}
		if(carry>0)
		{
			 temp.next = newNode(carry);
		}
		return res;
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
	static Node addOne(Node head)
	{
		head = reverse(head);
		head = addOneUntil(head);
		return reverse(head);
	}
	public static void main(String args[])
	{
		Node head = newNode(1);
		head.next = newNode(9);
		head.next.next = newNode(9);
		head.next.next.next = newNode(9);
		
		printList(head);
		
		head = addOne(head);
		
		printList(head);
		
	}

}
