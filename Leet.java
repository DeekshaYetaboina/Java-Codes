class Leet {
    public int missingNumber(int[] arr) {
        int i=0;
         
        while(i<arr.length)
        {
           int correct=arr[i];
           
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            //arr[i]<arr.length refers to skip out of bound number
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(i!=arr[i])
            {
                return i;
            }
            
        }
        return arr.length;
        }
          static void swap(int[] arr,int first,int second)
          {
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
          }
}