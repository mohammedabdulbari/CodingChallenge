
class FindPeakElement
{
   static public int findPeakElement(int[] nums) {
        int l = 0;
   int r = nums.length - 1;
   while (l < r) {
    System.out.println(l+" "+r);
       int m = l + (r - l) / 2;
       if (nums[m] < nums[m + 1]) {
           l = m + 1;
       } else {
           r = m;
       }
   }
   return r;
   }
public static void main(String[] args)
{
    int nums[]={2,3,4,7,9,10,11,12,5,4,3,1};
    int res=findPeakElement(nums);
    System.out.println(res);
}
}
