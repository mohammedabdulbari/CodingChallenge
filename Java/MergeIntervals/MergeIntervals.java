import java.util.Arrays;

class MergeIntervals
{
    public static int mergeOverlap(int[][] nums) {
       
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        int prevIdx = 0; 

        for (int i = 1; i < nums.length; i++) {
          
            if (nums[prevIdx][1] >= nums[i][0]) {
                nums[prevIdx][1] = Math.max(nums[prevIdx][1], nums[i][1]);
            } else {
                prevIdx++;
                nums[prevIdx] = nums[i];
            }
        }
        return prevIdx + 1;
    }

    public static void main(String[] args) {
        int[][] nums = { { 6, 8 }, { 1, 9 }, { 2, 4 }, { 4, 7 } };

        int newSize = mergeOverlap(nums);

        System.out.print("The Merged Intervals are: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print("[" + nums[i][0] + ", " + nums[i][1] + "] ");
        }
        System.out.println();
    }
}
