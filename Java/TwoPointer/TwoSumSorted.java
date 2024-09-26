class TwoSumSorted
{
    public static int[] twoSum(int[] numbers, int target) {
        int result[]=new int[2];
        int i=0,j=numbers.length-1,sum;
        while(i<j)
        {
            sum=numbers[i]+numbers[j];
            if(sum==target)
            {
                result[0]=i+1;
                result[1]=j+1;
                return result;
            }
            if(sum<target)i++;
            else j--;
        }
        return result;
        
    }
    public static void main(String args[])
    {
        int nums[]={2,3,5,7,9,12,16,23,26,29};
        int res[]=twoSum(nums,30);
        System.out.println(res[0]+" "+res[1]);
    }
}
