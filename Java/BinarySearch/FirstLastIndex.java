class FirstLastIndex
{
    public static int[] searchRange(int[] nums, int target) {
        int l=0,h=nums.length-1,mid;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(target==nums[mid])
            {
                l=mid;while(l>0 && nums[l]==nums[l-1])l--;
                h=mid;while(h<nums.length-1 && nums[h]==nums[h+1])h++;
                return new int[]{l,h};
            
            }
            else if(target<nums[mid])
                h=mid-1;
            else
                l=mid+1;
        }
        return new int[]{-1,-1};
    }
public static void main(String[] args)
{
    int nums[]={3,3,3,4,6,6,6,6,7};
    int res[]=searchRange(nums,6);
    System.out.println(res[0]+" "+res[1]);
}
}
