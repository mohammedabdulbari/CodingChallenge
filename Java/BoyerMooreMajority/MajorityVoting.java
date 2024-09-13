class MajorityVoting
{
    public static int majority(int[] nums) 
    {
        int count=1;
        int lastElement=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==lastElement)
                count++;
            else
            {
                if(count>1) count--;
                else lastElement=nums[i];
            }
        }  
        return lastElement;
          
    }
    public static void main(String args[])
    {
        int nums[]={9,13,9,16,9,11,9,20,9,9};
        int result=majority(nums);
        System.out.println(result);
    }
}
