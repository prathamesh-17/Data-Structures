package linkedLists;

import java.util.Scanner;

public class InsertInSortedLL {
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
	public void push(int value)
	{
		Node new_node = new Node(value);
		new_node.next = head;
		head = new_node;
		
	}
	public void insert(int data)
	{
		Node n = new Node(data);
		Node cur = head;
		if(head == null || head.data >= n.data)
		{
			n.next = head;
			head = n;
		}
		else
		{
			while(cur.next != null && cur.next.data < n.data)
			{
				cur = cur.next;
			}
			n.next = cur.next;
			cur.next = n;
		}
		
	}
	public void printList()
	{
		Node tnode = head;
		while(tnode != null) {
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		InsertInSortedLL list = new InsertInSortedLL();
	
		list.push(10);
		list.push(9);
		list.push(7);
		list.push(5);
		list.push(3);
		list.printList();
		System.out.println("Enter the number to insert:");
		int a = sc.nextInt();
		list.insert(a);
		list.printList();
		sc.close();
	}
	

}
