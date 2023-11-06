// write a program to find the smallest number using a stack

import java.util.*;

public class q10 
{
    public static void main(String[] args) 
    {
        Stack<Integer> mainStack = new Stack<>();
        
        mainStack.push(2);
        mainStack.push(4);
        mainStack.push(6);
        mainStack.push(8);
        mainStack.push(10);

        System.out.println("Stack: " + mainStack);
        System.out.println("Smallest Number: " + findSmallestNo(mainStack));
    }

    public static int findSmallestNo(Stack<Integer> stack) 
    {
       
        int min = stack.peek();

        for (int element : stack) 
        {
            if (element < min) 
            {
                min = element;
            }
        }

        return min;
    }
}