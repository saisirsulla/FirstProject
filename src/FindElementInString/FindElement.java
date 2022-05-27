package FindElementInString;

public class FindElement {

    public static int Find(String str, char element)
    {
        int charOccuranceCount = 0;
        int strlength = str.length();
        for(int i = 0; i < strlength; i++)        // traversing each element in String to find the Char in it
        {
            if(element == str.charAt(i))
            {
                charOccuranceCount++;
            }
        }


        return (charOccuranceCount*100)/strlength; //Calculating the percentage for the Character occured in whole String.
    }
    public static void main(String arg[])
    {
        String str = "foobar";
        System.out.println(Find(str, 'o'));
    }
}
