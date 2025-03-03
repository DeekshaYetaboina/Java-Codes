public class MaxWealth {
    public static void main(String[] args) {
        int[][] wealth = {
                {1,2,3},
                {3,2,7},
                {34,6,7}
        };
        System.out.println(maxwealth(wealth));
    }
   public static int maxwealth(int[][] wealth)
    {
        int rowsum = 0;
        for(int person=0;person<wealth.length;person++)
        {
            int sum=0;
            for(int account=0;account<wealth[person].length;account++)
            {

                sum = sum+wealth[person][account];

            }
            if(sum>rowsum)
            {
                rowsum=sum;
            }

        }
        return rowsum;
    }
}
