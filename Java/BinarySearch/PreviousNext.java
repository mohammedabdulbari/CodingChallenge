class PreviousNext
{
    public static int[] prevNext(int[] nums, int target) {
        int l=0,h=nums.length-1,mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
           
            if(nums[mid]>target)
                h=mid-1;
            else
                l=mid+1;
        }
        if(mid==0)return new int[]{-1,nums[0]};
        if(mid==nums.length-1)return new int[]{nums[mid],-1};
        return new int[]{nums[mid-1],nums[mid]};
        
    }
public static void main(String[] args)
{
    int nums[]={3,4,6,7,10,11,13,15};
    int res[]=prevNext(nums,20);
    System.out.println(res[0]+" "+res[1]);
}
}
