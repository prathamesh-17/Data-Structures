package linkedLists;


public class DeleteLinkedLists 
{
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
	void deletell()
	{
		head = null;
	}
	public static void main(String args[])
	{
		DeleteLinkedLists list = new DeleteLinkedLists();
		for(int i=60; i>=10; i-=10)
		{
			list.push(i);
		}
		
		list.printList(head);
		
		list.deletell();
		
		list.printList(head);
		
	}

}
