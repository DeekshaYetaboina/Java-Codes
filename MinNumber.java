public class MinNumber {
    public static void main(String[] args) {
        int[] arr = { 90,23, 65, 45,73};
        System.out.println(min(arr));
    }
    static int min(int[] arr)
    {
        int minimum = arr[0];
        if(arr.length==0)
        {
            return -1;

        }
        for(int i = 0; i< arr.length;i++)
        {
            if(arr[i]<minimum)
            {
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
