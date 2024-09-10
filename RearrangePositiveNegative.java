public class RearrangePositiveNegative {

    public static void reverse(int arr[])
    {
        int i=0;
        int j =arr.length-1;
        int temp;
        while(i<=j)
            {
                while(i<=j && arr[i]<0) i++;
                while(j>=i && arr[j]>0) j--;
                if(i<j)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
    }
    // main function
    public static void main(String args[])
    {
        int arr[] = {-2,6,3,-4,1,10,-5,8,-7,-9,-12};
        int n = arr.length;
        reverse(arr);
        for(int x:arr)
            System.out.println(x);
    }
}