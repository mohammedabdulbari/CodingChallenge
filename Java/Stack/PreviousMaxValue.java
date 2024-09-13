import java.util.*;

class PreviousMaxValue
{
    static int[] previousMaxValue(int arr[])
    {
        Stack<Integer> stk=new Stack<>();
        int pmv[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!stk.isEmpty() && arr[i]>=stk.peek())
                stk.pop();
            pmv[i]=stk.isEmpty()?-1:stk.peek();
            stk.push(arr[i]);
        }
        return pmv;
    }
    public static void main(String args[])
    {
        int arr[]={7,1,3,2,9,5,6,3,1,2};
        int pmv[]=previousMaxValue(arr);
        for(int x:pmv)
            System.out.print(x+" ");
    }
}
