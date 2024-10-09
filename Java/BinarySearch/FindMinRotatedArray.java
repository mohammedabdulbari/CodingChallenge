import java.util.*;

class FindMinRotatedArray
{
    public static int findMin(int[] nums) {
        int l=0,h=nums.length-1,mid;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(mid!=0 && nums[mid]<nums[mid-1]) return nums[mid];
            if(nums[h]>nums[mid])h=mid-1;
            else l=mid+1;

        }
    return nums[0];
    }
 
public static void main(String[] args)
{
    int prices[]={10,11,12,13,3,4,5,6,7};
    System.out.println(findMin(prices));
}
}
