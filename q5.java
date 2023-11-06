// write a program to implement the tower of hanoi algorithm

public class q5 
{
    public static void towerOfHanoi(int n, char source, char auxiliary, char target) 
    {
        if (n == 1) 
        {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }
        
        towerOfHanoi(n - 1, source, target, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        towerOfHanoi(n - 1, auxiliary, source, target);
    }

    public static void main(String[] args) 
    {
        int n = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
