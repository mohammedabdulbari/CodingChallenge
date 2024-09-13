
class ThirdMaximum
{
    static int thirdMaximum(int nums[])
    {
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>firstMax)
            {
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=nums[i];
            }
            else if(nums[i]>secondMax)
            {
                thirdMax=secondMax;
                secondMax=nums[i];
            }
            else if(nums[i]>thirdMax)
                thirdMax=nums[i];
        }
        return thirdMax;
    }
    public static void main(String args[])
    {
        int nums[]={8,5,3,11,9,4,16,7,12,13};
        System.out.print(thirdMaximum(nums));
    }
}
