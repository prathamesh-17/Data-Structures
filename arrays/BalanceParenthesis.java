package arrays;

import java.util.*;

public class BalanceParenthesis {

    static boolean balanceParanthesis(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(char c:str.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
                continue;
            }
            if(c==')' && !stack.isEmpty() && stack.peek()=='(')
            {
                stack.pop();
                continue;
            }
            if(c=='}' && !stack.isEmpty() && stack.peek()=='{')
            {
                stack.pop();
                continue;
            }
            if(c==']' && !stack.isEmpty() && stack.peek()=='[')
            {
                stack.pop();
                continue;
            }
            if(c==')' || c=='}' || c==']')
            {
                stack.push(c);
                continue;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parant = sc.next();
        boolean result = balanceParanthesis(parant);
        if(result == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        sc.close();
    }
}