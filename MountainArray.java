public class MountainArray {
    public static void main(String[] args) {
        System.out.println(result());
    }
    static int result()
    {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = peakindex(arr);
       int ascending = agnostic(arr,target,0,peak);
       if(ascending!=-1)
       {
           return ascending;
       }
       else {
           return agnostic(arr,target,peak+1,arr.length-1);
       }
    }
    static int peakindex(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid-1])
            {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
    static int agnostic(int[] arr,int target,int start,int end)
    {
        boolean asc = arr[start]<arr[end];
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target == arr[mid])
            {
                return mid;
            }
            if(asc)
            {
                if(target<arr[mid])
                {
                    end =mid - 1;

                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid])
                {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
