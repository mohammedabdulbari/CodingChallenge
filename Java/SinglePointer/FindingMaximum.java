import java.util.*;

class FindingMaximum
{
    static int getMax(int nums[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
                max=nums[i];
        }
        return max;
    }
    public static void main(String args[])
    {
        int nums[]={7,5,4,16,3,9,11,13,12,8};
        System.out.print(getMax(nums));
    }
}
