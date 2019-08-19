package stack;

import java.util.Scanner;

public class StackOperations {
	static int SIZE=3;
	static int stack[] = new int[SIZE] ;
	static int top = -1;
	static void push(int ele)
	{
		if(top == SIZE-1)
		{
			System.out.println("Stack OverFlow");
		}
		else
		{
			
			stack[++top] = ele;
			
		}
	}
	
	static void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack UnderFlow");
		}
		else
		{
			
			top--;
		}
	}
	
	static void display()
	{
		if(top == -1)
		{
			System.out.println("Stack UnderFlow");
		}
		else
		{
			for(int i=top; i>=0; i--)
			{
				System.out.println(stack[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		int ch;
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1 : System.out.print("Enter element:");
					int ele = sc.nextInt();
					push(ele);
					break;
			case 2 : pop();
					break;
			case 3 : display();
					break;
			default:
				System.exit(0);
					
			}
			System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = sc.next().charAt(0);
		}while (ch == 'Y'|| ch == 'y');
		sc.close();
	}

}
