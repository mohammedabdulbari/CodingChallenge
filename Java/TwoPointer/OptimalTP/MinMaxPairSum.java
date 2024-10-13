class MinMaxPairSum 
{
    static int minPairSum(int[] nums) {

        Arrays.sort(nums);
        int i = 0, j = nums.length - 1, max = 0;

        while (i < j) {
            if (nums[i] + nums[j] > max) {
                max = nums[i] + nums[j];
            }
            i++;
            j--;
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 7, 3, 1, 8, 6, 1, 7, 5 };
        System.out.println(minPairSum(nums));
    }
}
