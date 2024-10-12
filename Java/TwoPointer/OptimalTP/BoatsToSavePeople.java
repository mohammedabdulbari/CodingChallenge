import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BoatsToSavePeople
{
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1,count=0;
        while(i<=j)
        {
            if(people[i]+people[j]<=limit)
            {
                count++;
                i++;
            }
            else
            {
                count++;
            }
            j--;
        }
        return count;
        
    }
       public static void main(String[] args)
    {
        int[] arr = {4,2,8,3,1,6,2,5};
        int res=numRescueBoats(arr,8);
        System.out.print(res);
    }
}
