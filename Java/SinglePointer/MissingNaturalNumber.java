import java.util.*;

class MissingNaturalNumber
{
    static int missingNumber(int nums[])
    {
        int n=nums.length;
        int sum=(n+1)*(n+2)/2;
        
        for(int i=0;i<n;i++)
        {
            sum-=nums[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        int nums[]={8,5,3,1,9,4,7,10,2};
        System.out.print(missingNumber(nums));
    }
}
