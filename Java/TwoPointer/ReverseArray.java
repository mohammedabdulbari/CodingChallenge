public class ReverseArray{
    static void reverse(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        int temp=0;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10}; 
        reverse(arr);   
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}
