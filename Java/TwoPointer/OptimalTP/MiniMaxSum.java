import java.util.*;

class MiniMaxSum
{
    public static int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int i=0,j=nums.length-1,max=0;

        while(i<j)
        {
            if(nums[i]+nums[j]>max)
            {
                max = nums[i] + nums[j];
            }
            i++;
            j--;
        }
        return max;
    }
public static void main(String[] args)
{
    int nums[]={2,6,3,4,7,11,5,8};
    int res=minPairSum(nums);
    System.out.println(res);
}
}
