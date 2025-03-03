import java.util.Arrays;

public class StringSearchRange {
    public static void main(String[] args) {
 int[] arr={1,2,3,4,5,6,7,8,9};
 int target = 7;
 int ans = search(arr,2,8,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int start,int end,int target)
    {
        if(arr.length==0)
            return -1;
         for(int i = start;i<=end;i++)
         {
             if(arr[i] == target)
             {
                 return i;
             }
         }
        return -1;
    }

}
