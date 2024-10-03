class LinearSearch
{
    static int search(int nums[],int key)
    {      
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int nums[]={8,3,10,5,7,1,9,6,4,2};
        int index=search(nums,9);
        System.out.print(index);
    }
}
