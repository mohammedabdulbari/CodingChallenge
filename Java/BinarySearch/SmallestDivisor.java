class SmallestDivisor
{
    static int smallestDivisor(int[] nums, int threshold) 
  {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
            if(nums[i]>max)max=nums[i];

        int l=1,h=max,m;
        while(l<h)
        {
            m=l+(h-l)/2;
            int sum=0;
            for(int data:nums)
            {
                sum+=(data+m-1)/m;
            }
            if(sum<=threshold)
                h=m;
            else
                l=m+1;
        }
        return l;
       
    }
  
    public static void main(String args[])
    {
        int nums[]={1,3,6,11};
        int index=smallestDivisor(nums,7);
        System.out.println(index);
    }
}
