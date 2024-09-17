public class RotateLeft{
    static void rotateLeft(int nums[])
    {
        int temp=nums[0];
        
        for(int i=0;i<nums.length-1;i++)
        {
          nums[i]=nums[i+1];
        }

        temp[nums.length-1]=temp;
        
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10}; 
        rotateLeft(arr);   
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}
