package arrays;


public class ArrayToLL {
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
	
	public void printList()
	{
		Node tnode = head;
		while(tnode != null) {
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
		
	}

	public void push(int data) 
	{
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
		
	}
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		ArrayToLL l = new ArrayToLL();
		for(int i=a.length-1; i>=0; i--)
		{
			l.push(a[i]);
		}
		l.printList();
	}

}
