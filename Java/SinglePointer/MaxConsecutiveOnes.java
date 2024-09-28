class MaxConsecutiveOnes
{
  public static int maxOnes(int[] nums) {
        int maxOnes=0;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
                maxOnes=Math.max(count,maxOnes);
                count=0;
            }

        }
        return Math.max(maxOnes,count);
    }
    public static void main(String[] args) {
       int nums[]={1,0,1,1,1,0,1,1,1,1};
        System.out.println("ans"+maxOnes(nums));
        
    }
}
