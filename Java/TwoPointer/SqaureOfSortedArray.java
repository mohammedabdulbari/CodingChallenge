public class SqaureOfSortedArray{

    public static int[] sortedSquares(int[] nums) {
        int res[]=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int index=nums.length-1;index>=0;index--)
        {
            if(Math.abs(nums[i])>Math.abs(nums[j]))
            {
                res[index]=nums[i]*nums[i];
                i++;
            }
            else
            {
                res[index]=nums[j]*nums[j];
                j--;
            }
        }
        
        return res;
    }
    public static void main(String args[])
    {
        int arr[]={-8,-6,-5,1,2,3,4};
        int res[]=sortedSquares(arr);
        for(int x:res)
            System.out.println(x);
    }
}
