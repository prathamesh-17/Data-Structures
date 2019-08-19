package linkedLists;


public class LinkedListDeleteMiddle {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
			
		}
	}
	Node deleteMiddle()
	{
		Node p1 = head;
		Node p2 = head;
		Node prev = null;
		while(p2 != null && p2.next != null)
		{
			prev = p1;
			p1 = p1.next;
			p2 = p2.next.next;
		}
		prev.next = p1.next;
		return head;
	}
	public void push(int value)
	{
		Node new_node = new Node(value);
		new_node.next = head;
		head = new_node;
		
	}
	public void printList()
	{
		Node tnode = head;
		while(tnode != null) {
			System.out.println(tnode.data+"");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}
	public static void main(String args[])
	{
		LinkedListDeleteMiddle list = new LinkedListDeleteMiddle();
		for(int i=7; i>0; i--)
		{
			list.push(i);
		}
		list.deleteMiddle();
		list.printList();
		
	}

}
