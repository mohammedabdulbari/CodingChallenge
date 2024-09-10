class DutchNationalFlag
{
    static void arrangeColors(int nums[])
    {
        int low=0,mid=0,high=nums.length-1;
        int temp=0;
        while(mid<=high)
        {
            if(nums[mid]<2)
            {
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;mid++;
            }
            else if(nums[mid]>2)
            {
                temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;   
            }
            else
                mid++;
        }

    }
    public static void main(String args[])
    {
        int nums[]={2,1,3,2,1,3,3,1,2,1};
        arrangeColors(nums);
        for(int x:nums)
        {
            System.out.println(x);
        }
    }
}