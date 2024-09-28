class SortedRotated
{
   public static boolean isSorted(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
                count++;
            if(count>1) return false;
        }
        if(count==0)return true;
        return nums[nums.length-1]<=nums[0];
    }
    public static void main(String[] args) {
       int nums[]={5,6,7,8,9,12,15,2,3,5};
        System.out.println("ans"+isSorted(nums));
        
    }
}
