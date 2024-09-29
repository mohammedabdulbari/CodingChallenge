import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum
{
    static boolean find3Numbers(int[] arr, int sum)
    {
        int n = arr.length;

        // Sort the elements
        Arrays.sort(arr);

        // Fix the first element one by one
        // and find the other two elements
        for (int i = 0; i < n - 2; i++) {

            // To find the other two elements, start two
            // index variables from two corners of the array
            // and move them toward each other
            int l = i + 1; // index of the first element
            int r = n - 1; // index of the last element

            while (l < r) {
                int curr_sum = arr[i] + arr[l] + arr[r];
                if (curr_sum == sum) {
                    System.out.println(
                        "Triplet is " + arr[i] + ", "
                        + arr[l] + ", " + arr[r]);
                    return true;
                }
                else if (curr_sum < sum) {
                    l++;
                }
                else { // curr_sum > sum
                    r--;
                }
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;

        find3Numbers(arr, sum);
    }
}
