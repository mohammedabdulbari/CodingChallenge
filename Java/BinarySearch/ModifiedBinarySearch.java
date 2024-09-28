class ModifiedBinarySearch
{
    static int modBinarySearch(int nums[],int key)
    {
        int l=0;
        int h=nums.length-1,mid;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(key==nums[mid])
                return mid;
            else if(nums[l]<=nums[mid])
            {
                if(key>=nums[l] && key<nums[mid])
                    h=mid-1;
                else
                    l=mid+1;
            }
            else 
            {
                if(key>nums[mid] && key<=nums[h])
                    l=mid+1;
                else
                    h=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int nums[]={6,7,8,9,11,13,14,2,3,5};
        int index=modBinarySearch(nums,3);
        System.out.println(index);
    }
}
