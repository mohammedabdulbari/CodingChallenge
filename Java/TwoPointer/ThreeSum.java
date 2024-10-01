import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum
{
    static boolean find3Numbers(int[] arr, int sum)
    {
        int n = arr.length;

        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1; 
            int r = n - 1; 
            while (l < r) {
                int curr_sum = arr[i] + arr[l] + arr[r];
                if (curr_sum == sum) {
                    return true;
                }
                else if (curr_sum < sum) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        System.out.println(find3Numbers(arr, sum));
    }
}
