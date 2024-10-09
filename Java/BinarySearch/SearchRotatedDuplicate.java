
class SearchRotatedDuplicate
{
    public static boolean search(int[] nums, int target) {
        int low=0,high=nums.length-1;
         while(low<=high){
             int mid=low+(high-low)/2;
             if(nums[mid]==target){
                 return true;
             }
             if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                 low++;
                 high--;
                 continue;
             }
             if(nums[low]<=nums[mid]){
                 if(nums[low]<=target && nums[mid]>target){
                     high=mid-1;
                 }
                 else{
                     low=mid+1;
                 }
             }
             else{
                 if(nums[mid]<target && nums[high]>=target){
                     low=mid+1;
                 }
                 else{
                     high=mid-1;
                 }
             }
         }
         return false; 
     }
public static void main(String[] args)
{
    int nums[]={6,6,6,6,7,3,3,3,4,4,5,5,6,6,6};
    boolean res=search(nums,6);
    System.out.println(res);
}
}
