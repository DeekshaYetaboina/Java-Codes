import java.util.Arrays;

class Duplicate {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,5};
         findDuplicate(nums);

    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        { 
            if(nums[i]!=i+1)
            {
             int correctindex=nums[i]-1;
            if(nums[correctindex]!=nums[i])
            {
               swap(nums,i,correctindex);
            }
            else return nums[i];
        }
        else
        i++;
    }
    return -1;
}
static void swap(int[] nums,int first,int second)
{
    int temp = nums[first];
    nums[first]=nums[second];
    nums[second]=temp;
}
}