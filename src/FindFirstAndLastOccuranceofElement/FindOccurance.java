package FindFirstAndLastOccuranceofElement;

public class FindOccurance {
    public static int first = -1;
    public static int last = -1;

    public void find(String str, int idx, char element)
    {
        if(idx == str.length())
        {
            System.out.println("First occurance "+ first);
            System.out.println("last occurance "+ last);
            return;
        }

        if(element == str.charAt(idx))
        {
            if(first == -1)
            {
                first = idx;
            }
            else
            {
                last = idx;
            }
        }
        idx++;
        find(str, idx, element);
    }
    public static void main(String arg[])
    {
        FindOccurance f = new FindOccurance();
        String str = "abaacdaefaahxzcvmn,xcvma";

        f.find(str, 0, 'a');
    }
}
