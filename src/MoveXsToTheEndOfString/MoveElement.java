package MoveXsToTheEndOfString;

public class MoveElement {
    public static int count = 0;
    public static String NewStr = "";
    public void Move(String str, int idx)
    {
        if(idx == str.length()-1)
        {
            for(int i = 0; i < count; i++)
            {
                NewStr = NewStr + "x";
            }
            return;
        }

        if(str.charAt(idx) == 'x')
        {
            count++;
            idx++;
            Move(str, idx);
        }
        else
        {
            NewStr = NewStr + str.charAt(idx);
            idx++;
            Move(str, idx);
        }
    }

    public static void main(String arg[])
    {
        MoveElement m = new MoveElement();
        String str = "axbcxxdwerefdxxsfdsfdxvs";
        m.Move(str,0);
        System.out.println(NewStr);
    }
}
