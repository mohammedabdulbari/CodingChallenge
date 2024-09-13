class PrefixSum
{
    public static int[] prefixSum(int[] nums) {

        int prefix[]=new int[nums.length]; 
        prefix[0]=nums[0];  
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i]; 
        }
        return prefix;
    }
    public static void main(String args[])
    {
        int nums[]={8,7,2,1,3,6,10,4,9,5};
        int result[]=prefixSum(nums);
        for(int x:result)
            System.out.println(x);
    }
}
