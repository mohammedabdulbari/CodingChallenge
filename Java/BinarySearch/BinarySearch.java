class BinarySearch
{
    static int binarySearch(int nums[],int key)
    {
        int l=0,h=nums.length-1,mid;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(key==nums[mid])
                return mid;
            else if(key<nums[mid])
                h=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int nums[]={2,3,5,6,7,8,9,11,13,14};
        int index=binarySearch(nums,10);
        System.out.println(index);
    }
}
