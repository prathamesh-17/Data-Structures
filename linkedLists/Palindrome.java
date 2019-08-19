package linkedLists;

import java.util.*;

public class Palindrome 
{
	Node head;
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
	boolean isPalindrome()
	{
		
		Node slow = head;
		Node fast = head;
		Stack<Integer> s = new Stack<Integer>();
		while(fast != null && fast.next != null)
		{
			s.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null)
		{
			slow = slow.next;
		}
		while(slow != null)
		{
			int top = s.pop().intValue();
			if(top != slow.data)
			{
				return false;
			}
			slow = slow.next;
		}
		return true;
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
		
	}
	public static void main(String args[])
	{
		Palindrome p = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			int a = sc.nextInt();
			p.push(a);
		}
		
		
		System.out.println(p.isPalindrome());
		
		sc.close();
		
	}


}
