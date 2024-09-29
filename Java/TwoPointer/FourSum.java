import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FourSum
{
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        int l,h;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<nums.length-2;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                l=j+1;h=nums.length-1;
                while(l<h)
                {
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[l];
                    sum+=nums[h];
                    if(sum==target)
                    {
                        res.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[l],nums[h])));
                        l++;h--;
                        while(l<h && nums[l]==nums[l-1])l++;
                        while(l<h && nums[h]==nums[h+1])h--;
                    }
                    else if(sum<target)
                        l++;
                    else
                        h--;
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
    int[] arr = {0, 1, 0, 2, 1, 2, 2};
        int target = 3;
        List<List<Integer>> ans = fourSum(arr, target);
        for (List<Integer> v : ans) {
            for (int x : v) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
