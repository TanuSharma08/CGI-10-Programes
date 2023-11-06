// write a program to reverse an array in place, in place means you cannot create a new array and you have to update the original array

import java.util.*;

public class q2 
{
    public static void reverseArray(int[] arr) 
    {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) 
        {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println("Original array: " + Arrays.toString(arr));

        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
