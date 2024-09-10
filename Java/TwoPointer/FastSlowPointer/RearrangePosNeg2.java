class RearrangePosNeg2
{
    static void rearrage2(int arr[])
    {
        int i=0;
        int j=0;
        int temp;
        while(i<arr.length && j<arr.length)
        {
            while(i<arr.length && arr[i]<0)i++;
            j=i+1;
            while(j<arr.length && arr[j]>0)j++;
            if(i<arr.length && j<arr.length)
            {
                System.out.println(i+" "+j);
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={-2,6,3,-4,1,10,-5,8,-7,-9};
        rearrage2(arr);
        for(int x:arr)
            System.out.print(x+" ");
    }
}