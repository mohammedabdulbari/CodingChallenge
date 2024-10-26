class SingleInDuplicates
{
   public static int singleInDuplicate(int[] nums) {
        int l=0,h=nums.length-1;
        int mid=0;
        while(l<h)
        {
            mid=(l+h)/2;
            if(mid%2==1)
                mid--;
            if(nums[mid]!=nums[mid+1])
                h=mid;
            else
                l=mid+2;
        }
        return nums[h];
    }
public static void main(String[] args)
{
    int nums[]={2,2,3,3,4,4,5,6,6,7,7};
    int res=findKthPositive(nums,1);
    System.out.println(res);
}
}
