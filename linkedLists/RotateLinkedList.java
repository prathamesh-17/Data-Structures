package linkedLists;

public class RotateLinkedList {
	
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
	
	void rotate(int k)
	{
		if(k == 0)return;
		Node current = head;
		int count = 1;
		while(count < k && current != null)
		{
			current = current.next;
			count++;
		}
		
		if(current == null)return;
		
		Node kthNode = current;
		
		while(current.next != null)
		{
			current = current.next;
		}
		
		current.next = head;
		
		head = kthNode.next;
		
		kthNode.next = null;
		
	}
	void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
	public void push(int value)
	{
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	public static void main(String args[])
	{
		RotateLinkedList list = new RotateLinkedList();
		for(int i=50; i>=10; i-=10)
		{
			list.push(i);
		}
		
		list.printList(head);
		
		list.rotate(3);
		
		System.out.println();
		
		list.printList(head);
		
	}


}
