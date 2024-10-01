import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TrappingRainWater
{
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
       int leftMax = height[0], rightMax = height[height.length - 1];
       int water = 0;
       while (left < right) {
           if (leftMax < rightMax) {
               left++;
               if (height[left] > leftMax) {
                   leftMax = height[left];
               } else {
                   water += leftMax - height[left];
               }
           } else {
               right--;
               if (height[right] > rightMax) {
                   rightMax = height[right];
               } else {
                   water += rightMax - height[right];
               }
           }
       }
       return water;    
   }
       public static void main(String[] args)
    {
        int[] arr = {4,0,8,0,1,6,2,5};
        int res=trap(arr);
        System.out.print(res);
    }
}
