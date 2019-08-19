package linkedLists;

public class ReverseAlternate {
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
	
	Node reverseAlternative(Node node,int k)
	{
		Node current = node; 
        Node next = null, prev = null; 
        int count = 0; 
  
        /*1) reverse first k nodes of the linked list */
        while (current != null && count < k) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
            count++; 
        } 
  
        /* 2) Now head points to the kth node.  So change next  
         of head to (k+1)th node*/
        if (node != null) { 
            node.next = current; 
        } 
  
        /* 3) We do not want to reverse next k nodes. So move the current  
         pointer to skip next k nodes */
        count = 1; 
        while (count < k  && current != null) { 
            current = current.next; 
            count++; 
        } 
  
        /* 4) Recursively call for the list starting from current->next. 
         And make rest of the list as next of first node */
        if (current != null) { 
            current.next = reverseAlternative(current.next, k); 
        } 
  
        /* 5) prev is new head of the input list */
        return prev; 
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
		ReverseAlternate list = new ReverseAlternate();
		for(int i=20; i>=1; i--)
		{
			list.push(i);
		}
		
		list.printList(head);
		
		head = list.reverseAlternative(head,4);
		
		System.out.println();
		
		list.printList(head);
		
	}
}
