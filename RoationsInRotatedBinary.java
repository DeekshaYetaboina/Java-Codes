public class RoationsInRotatedBinary {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3};
        int pivot = findPivot(arr);
        int ans = pivot;
        /*if(pivot == -1) //it is not rotated
        {
            System.out.println("0");
        }
        else {*/
            System.out.println(ans + 1);
        //}

    }
    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = start + (end -start)/2;
            if(arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            if(arr[mid] < arr[mid-1])
            {

                return mid - 1;
            }
            if(arr[mid]<=start)
            {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
