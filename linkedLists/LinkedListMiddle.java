package linkedLists;

public class LinkedListMiddle {
		
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
		Node head;
		void printMiddle()
		{
			Node p1=head;
			Node p2=head;
			while(p2!=null && p2.next!=null)
			{
				p1=p1.next;
				p2=p2.next.next;
			}
			System.out.println("Middle Element: "+p1.data);
		}
		public void push(int value)
		{
			Node n = new Node(value);
			n.next = head;
			head = n;
			
		}
		public void printList()
		{
			Node tnode = head;
			while(tnode != null) {
				System.out.println(tnode.data+"->");
				tnode = tnode.next;
			}
			System.out.println("NULL");
		}
		public static void main(String args[])
		{
			LinkedListMiddle list = new LinkedListMiddle();
			for(int i=5; i>0; i--)
			{
				list.push(i);
				list.printList();
				list.printMiddle();
			}
		}
}
