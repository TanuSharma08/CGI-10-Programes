// write a program to find all pairs in an integer array whose sum is equal to a given number

import java.util.*;

public class q1 
{
    public static void findPairs(int[] arr, int equalSum) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairCount = 0;

        for (int num : arr) 
        {
            int complement = equalSum - num;
            if (map.containsKey(complement)) 
            {
                pairCount++;
                System.out.println("Pair " + pairCount + ": " + num + " + " + complement);
            }
            map.put(num, 1);
        }
        
        if (pairCount == 0) 
        {
            System.out.println("No pairs found.");
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int equalSum = scanner.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        findPairs(arr, equalSum);
    }
}
