
class MaximumProductSubarray
{
    static long maxProduct(int[] arr) {
        int n = arr.length;
        long maxProd = Long.MIN_VALUE;
  
        // leftToRight to store product from left to Right
        long leftToRight = 1;
  
        // rightToLeft to store product from right to left
        long rightToLeft = 1;
  
        for (int i = 0; i < n; i++) {
            if (leftToRight == 0)
                leftToRight = 1;
            if (rightToLeft == 0)
                rightToLeft = 1;
      
            // calculate product from index left to right
            leftToRight *= arr[i];
      
            // calculate product from index right to left
            int j = n - i - 1;
            rightToLeft *= arr[j];
            maxProd = Math.max(leftToRight, 
                               Math.max(rightToLeft, maxProd));
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));
    }
}
