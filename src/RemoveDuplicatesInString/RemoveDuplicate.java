package RemoveDuplicatesInString;

public class RemoveDuplicate {
    public static boolean[] map = new boolean[26];

    public void removeD(String str, int idx, String newString)
    {
        char currentChar = str.charAt(idx);

        if(idx == str.length()-1)
        {
            System.out.println(newString);
            return;
        }

        if(map[currentChar - 'a'] == true)
        {
            removeD(str,++idx,newString);
        }
        else
        {
            map[currentChar - 'a'] = true;
            newString += currentChar;
            removeD(str,++idx,newString);
        }
    }
    public static void main(String arg[])
    {
        RemoveDuplicate r = new RemoveDuplicate();
        String str = "aabbbccccdddddd";
        r.removeD(str, 0, "");
    }
}
