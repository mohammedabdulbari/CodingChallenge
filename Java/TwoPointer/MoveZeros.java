class MoveZeros
{
    static public void moveZeroes(int[] nums) {
        int i=0,j=0,n=nums.length;
        while(j<n && nums[j]!=0)j++;
        for(i=j+1;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[j++]=nums[i];
                nums[i]=0;
            }
        }
    }
    public static void main(String args[])
    {
        int nums[]={8,0,0,3,4,0,6,3,0,2};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);
    }
}
