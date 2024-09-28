class RemoveAllDuplicates
{
    public static int removeDuplicates(int[] nums) {
        
        int k=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[k])
            {
                    nums[++k]=nums[i];
            }    
        }
        return k+1;
    }
    public static void main(String[] args) {
       int nums[]={1,1,1,2,2,3,3,4,5,5};
        System.out.println("ans"+removeDuplicates(nums));
        
    }
}
