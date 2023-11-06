// write a program to reverse a stack

import java.util.*;

public class q9 
{
    public static void main(String[] args) 
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }

    public static void reverseStack(Stack<Integer> stack) 
    {
    if (!stack.isEmpty()) 
    {
        int temp = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);
    }
}

    public static void insertAtBottom(Stack<Integer> stack, int item) 
    {
        if (stack.isEmpty()) 
        {
            stack.push(item);
        } 
        else 
        {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }
}

