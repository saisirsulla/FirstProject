package TowerOfHanoi;

public class Hanoi {

    public static void tower(int n, char src, char hel, char des)
    {
        if(n == 1)
        {
            System.out.println("Transfer from disk "+ src + " to "+ des);
            return;
        }

        tower(n-1, src, des, hel);
        System.out.println("Transfer from disk "+ src + " to "+ des);

        tower(n-1, hel, src, des);
    }
    public static void main(String arg[])
    {
        int n = 3;
        tower(n,'S','H','D');
    }
}
