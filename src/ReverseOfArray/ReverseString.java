package ReverseOfArray;

public class ReverseString {


    public static void reverse(char[] s, int start, int end)
    {
        char temp;
        if(start == end)
        {
            return;
        }
        else
        {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;


        }
        start++;
        reverse(s, start, end);
    }

    public static void main(String arg[]) {
        char[] s = new char[]{'h', 'e','l','l','o'};
        reverse(s, 0,s.length -1);

        for(int i = 0; i<s.length; i++)
        {
            System.out.println(s[i]);
        }
    }
}
