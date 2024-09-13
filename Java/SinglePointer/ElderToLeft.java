import java.util.*;

class ElderToLeft
{
    static ArrayList<Integer> leftElder(int nums[])
    {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> al=new ArrayList();        
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                al.add(nums[i]);
            }
        }
        return al;
    }
    public static void main(String args[])
    {
        int nums[]={7,5,4,11,3,8,13,2,16,9};
        ArrayList<Integer> al=leftElder(nums);
        for(int x:al)
            System.out.print(x+" ");
    }
}
