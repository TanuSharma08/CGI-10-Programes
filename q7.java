// write a program to convert prefix expression to infix expression

import java.util.*;

public class q7 
{
    public static String convertPrefixToInfix(String prefix) 
    {
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) 
        {
            char c = prefix.charAt(i);
            if (Character.isLetterOrDigit(c)) 
            {
                stack.push(String.valueOf(c));
            } 
            else 
            {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String infixExp = "(" + op1 + c + op2 + ")";
                stack.push(infixExp);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a prefix expression: ");
        String prefixExp = scanner.nextLine();
        String infixExp = convertPrefixToInfix(prefixExp);

        System.out.println("Prefix Expression: " + prefixExp);
        System.out.println("Infix Expression: " + infixExp);
    }
}
