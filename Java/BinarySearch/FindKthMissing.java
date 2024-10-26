
class FindKthMissing
{
     /* public int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k)
                k++;
        }
        return k;
    }*/
    static int findKthPositive(int[] arr, int k) 
    {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int totMissing = arr[mid] - (mid + 1);

            if (totMissing < k)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return k + high + 1;
    }
public static void main(String[] args)
{
    int nums[]={2,3,4,7,11};
    int res=findKthPositive(nums,1);
    System.out.println(res);
}
}
