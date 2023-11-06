// write a program to check if two strings are a rotation of each other

public class q3 
{
    public static boolean areRotations(String str1, String str2) 
    {
        if (str1.length() != str2.length()) 
        {
            return false;
        }

        String concatenatedStr = str1 + str1;
        return concatenatedStr.contains(str2);
    }

    public static void main(String[] args) 
    {
        String str1 = "hello world";
        String str2 = "ldhello wor";

        if (areRotations(str1, str2)) 
        {
            System.out.println("Strings are rotations of each other.");
        } 
        else 
        {
            System.out.println("Strings are not rotations of each other.");
        }
    }
}

