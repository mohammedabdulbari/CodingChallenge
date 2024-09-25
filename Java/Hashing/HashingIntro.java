class HashingIntro
{
    static int mostOccurring(int nums[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
            if(nums[i]>max)max=nums[i];

        int hash[]=new int[max+1];
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]++;
        }
        max=0;
        for(int i=0;i<hash.length;i++)
            if(hash[i]>hash[max]) max=i;
        
        return max;
    }
    public static void main(String args[])
    {
        int nums[]={8,3,11,8,7,8,14,3,9,7};
        int result=mostOccurring(nums);
        System.out.println(result);
    }
}
