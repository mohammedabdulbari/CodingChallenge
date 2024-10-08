import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ClosestPair
{
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        int l = 0;
        int r = arr.length - 1;
        while( r-l >= k)
        {
           if(Math.abs(arr[l] - x) > Math.abs(arr[r] - x)){
               l++;

           }
           else
           {
               r--;
           }
        }
        List<Integer> listof = new ArrayList<>();
        for(int i = l; i <= r; i++)
        {
            listof.add(arr[i]);
        }
        return listof;
        
    }
    public static void main(String[] args)
    {
        int[] arr = {1,3,5,7,9,11,13,15};
        List<Integer> al=findClosestElements(arr,3,7);
        for(int x:al)
        System.out.print(x+ " ");
    }
}
