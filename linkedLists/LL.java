package linkedLists;

import linkedLists.DeleteLinkedLists.Node;

public class LL {
	
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

	
	public static void main(String[] args) {
		LL a  = new LL();
		a.push(10);
		

	}

}
