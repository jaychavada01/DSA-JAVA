public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][]arr = {
            {1,2,3},
            {3,2,1}
        };
        System.out.println(maximumWealth(arr));
    }

    // here person = row and account = col;
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person....now checking it with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
