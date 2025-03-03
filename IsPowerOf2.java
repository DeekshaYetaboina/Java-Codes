public class IsPowerOf2 { // 2 methods are given below
    public static void main(String[] args) {
       /* int n = 32;
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                count += 1;
            n = n >> 1;
        }

        System.out.println(isPower(count));
    }

        public static boolean isPower(int count)
        {
        if(count==1)
        {
            return true;
        }
        return false;
    }
}
*/
        System.out.println(isPower(16));
    }
    public static boolean isPower(int n)
    {

        n = n & (n - 1);
        if(n == 0) {
            return true;
        }
        return false;
    }
}
