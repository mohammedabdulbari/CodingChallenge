class ArrayIsSorted
{
   public static boolean isSorted(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
       int nums[]={2,3,5,5,6,7,8,9,12,15};
        System.out.println("ans"+isSorted(nums));
        
    }
}
