import java.util.*;

class ElderToRight
{
    static ArrayList<Integer> rightElder(int nums[])
    {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> al=new ArrayList();        
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                al.add(0,nums[i]);
            }
        }
        return al;
    }
    public static void main(String args[])
    {
        int nums[]={7,5,4,17,3,8,13,2,6,9};
        ArrayList<Integer> al=rightElder(nums);
        for(int x:al)
            System.out.print(x+" ");
    }
}
