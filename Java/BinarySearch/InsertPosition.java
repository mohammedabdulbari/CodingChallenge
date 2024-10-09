
class InsertPosition
{
    public static int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1,mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                h=mid-1;
            else
                l=mid+1;
        }
        return target<nums[mid]?mid:mid+1;
        
    }
public static void main(String[] args)
{
    int nums[]={3,4,6,7,10,11,13,15};
    System.out.println(searchInsert(nums,16));
}
}
