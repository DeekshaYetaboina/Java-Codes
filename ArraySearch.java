import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int m = in.nextInt();
        int[] arr = new int[10];
        System.out.println("enter the elements into the array");
        for(int i = 0 ; i<m;i++)
        {
           arr[i] = in.nextInt();
        }
        System.out.println("enter the element you want to search");
 int target = in.nextInt();
 int ans = linearSearch(arr, target);
        System.out.println("The element you want to search is found at index:");
        System.out.println(ans);
    }
    static int linearSearch(int[] arr , int target)
    {
         if(arr.length==0)
         {
             return-1;
         }
         for(int index = 0; index<arr.length; index++)
         {
             int element = arr[index];
             if(element == target)
             {
                 return index;
             }

         }
         return -1;
    }
}
