class SlidingWindow
{
    static int maxSubArray(int nums[],int k)
    {
        int i=0,j=0;
        int sum=0;
        for(;j<k;j++)
            sum+=nums[j];
        j--;
        int max=sum;
        while(j<nums.length-1)
        {
            sum-=nums[i++];
            sum+=nums[++j];
            if(sum>max)
                max=sum;
        }
        
        return max;
    }
    public static void main(String args[])
    {
        int nums[]={1,2,0,4,3,6,2,1,9,-1};
        int result=maxSubArray(nums,3);
        System.out.println(result);
    }
}
