package Pratices;
import java.util.*;

public class Solution {
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int result = 0;
        int count = 0;
        for(int i=1; i<=T; i++)
        {
            if(result >= T)
            {

                break;
            }
            result = result  + i;
            count++;
        }
        System.out.println(count);
    }


}
