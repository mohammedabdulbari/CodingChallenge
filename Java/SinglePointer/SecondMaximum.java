import java.util.*;

class SecondMaximum
{
    static int secMax(int nums[])
    {
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>firstMax)
            {
                secondMax=firstMax;
                firstMax=nums[i];
            }
            else if(nums[i]>secondMax)
            {
                secondMax=nums[i];
            }
        }
        return secondMax;
    }
    public static void main(String args[])
    {
        int nums[]={5,9,4,7,3,11,8,16,13,12};
        System.out.print(secMax(nums));
    }
}
