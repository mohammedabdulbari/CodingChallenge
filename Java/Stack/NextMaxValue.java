import java.util.*;

class NextMaxValue
{
    static int[] nextMaxValue(int arr[])
    {
        Stack<Integer> stk=new Stack<>();
        int nmv[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stk.isEmpty() && arr[i]>=stk.peek())
                stk.pop();
            nmv[i]=stk.isEmpty()?-1:stk.peek();
            stk.push(arr[i]);
        }
        return nmv;
    }
    public static void main(String args[])
    {
        int arr[]={2,1,3,2,6,3,5,9,1,7};
        int nmv[]=nextMaxValue(arr);
        for(int x:nmv)
            System.out.print(x+" ");
    }
}
