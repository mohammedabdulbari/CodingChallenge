public class LeftRotateKTime{

    public static void reverse(int nums[],int i,int j)
    {
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,nums.length-1);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        rotate(arr,5);
        for(int x:arr)
            System.out.println(x);
    }
}
