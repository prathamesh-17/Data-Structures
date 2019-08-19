package linkedLists;

import java.util.Scanner;



public class LinkedListsRemoveDups {
	Node head;
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
	void removeDups()
	{
		Node current = head;
		while(current != null)
		{
			Node runner = current;
			while(runner.next != null)
			{
				if(runner.next.data == current.data)
				{
					runner.next = runner.next.next;
				}
				else
				{
					runner = runner.next;
				}
			}
			current = current.next;
		}
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
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LinkedListsRemoveDups list = new LinkedListsRemoveDups();
		
			int n = sc.nextInt();
			for(int j=0; j<n; j++)
			{
				int val = sc.nextInt();
				list.push(val);
			}
			
		
		list.removeDups();
		list.printList();
		sc.close();
	}

}
