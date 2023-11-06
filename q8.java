// write a program to check if all brackets are closed in a given code snippet

import java.util.*;

public class q8 
{
    public static boolean areBracketsBalanced(String code) 
    {
        Stack<Character> stack = new Stack<>();

        for (char c : code.toCharArray()) 
        {
            if (c == '(' || c == '{' || c == '[') 
            {
                stack.push(c);
            } 
            else if (c == ')' || c == '}' || c == ']') 
            {
                if (stack.isEmpty()) 
                {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) 
                {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a code snippet:");
        String code = scanner.nextLine();

        boolean result = areBracketsBalanced(code);

        if (result) 
        {
            System.out.println("Brackets are closed");
        } 
        else 
        {
            System.out.println("Brackets are open");
        }

        scanner.close();
    }
}
