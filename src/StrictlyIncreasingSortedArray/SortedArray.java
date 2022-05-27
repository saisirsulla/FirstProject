package StrictlyIncreasingSortedArray;

public class SortedArray {

    public boolean findSorting(int[] arr, int idx)
    {
        if((idx) == arr.length)
        {
            return true;
        }
        if (arr[idx] < (arr[idx + 1]))
        {
            return findSorting(arr,idx + 1);
        }
        else
        {
            return false;
        }

    }
    public static void main(String arg[])
    {
        SortedArray s = new SortedArray();
        int[] arr = new int[]{1,2,3,4,4};
        System.out.println(s.findSorting(arr,0));
    }
}
