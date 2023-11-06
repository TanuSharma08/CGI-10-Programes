// write a program to print the first non-repeated character from a string

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q4 
{
    public static char findChar(String str) 
    {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) 
        {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) 
        {
            if (charCount.get(c) == 1) 
            {
                return c;
            }
        }

        return '\0';
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        char result = findChar(str);
        if (result != '\0') 
        {
            System.out.println("The first non-repeated character is: " + result);
        } 
        else 
        {
            System.out.println("No non-repeated characters found.");
        }
    }
}
