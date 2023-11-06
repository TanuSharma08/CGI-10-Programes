// write a program to convert postfix expression to prefix expression

import java.util.*;

public class q6 
{
    public static String convertPostfixToPrefix(String postfix) 
    {
        Stack<String> stack = new Stack<>();

        for (char c : postfix.toCharArray()) 
        {
            if (Character.isLetterOrDigit(c)) 
            {
                stack.push(String.valueOf(c));
            } 
            else 
            {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String prefixExp = c + op2 + op1;
                stack.push(prefixExp);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a postfix expression: ");
        String postfixExp = scanner.nextLine();

        String prefixExp = convertPostfixToPrefix(postfixExp);
        System.out.println("Postfix Expression: " + postfixExp);
        System.out.println("Prefix Expression: " + prefixExp);
    }
}
