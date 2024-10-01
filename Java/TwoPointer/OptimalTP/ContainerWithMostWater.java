class ContainerWithMostWater
{
    public static int maxArea(int[] height) {
        int ans = 0;
        int l = 0;
        int r = height.length - 1;
    
        while (l < r) 
        {
            int minHeight = Math.min(height[l], height[r]);
            ans = Math.max(ans, minHeight * (r - l));
            if (height[l] < height[r])
                ++l;
            else
                --r;
        }
    
        return ans;
      }
    public static void main(String[] args)
    {
        int[] arr = {1,4,10,5,2,6,7,3};
        int res=maxArea(arr);
        System.out.print(res);
    }
}
