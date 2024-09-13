
class DuplicateNaturalNumber
{
    static int duplicateNumber(int nums[])
    {
        int n=nums.length;
        int sum=n*(n-1)/2;
        
        for(int i=0;i<n;i++)
        {
            sum-=nums[i];
        }
        return -sum;
    }
    public static void main(String args[])
    {
        int nums[]={8,5,7,3,6,1,9,4,7,10,2};
        System.out.print(duplicateNumber(nums));
    }
}
