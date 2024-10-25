class PivotInteger
{
   /* public static int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 8) {
            return 6;
        } else if (n == 49) {
            return 35;
        } else if (n == 288) {
            return 204;
        }

        return -1;
    }*/

    int pivotInteger(int n) {
        int total=n*(n+1)/2;
        int l=1,h=n;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(m*m == total)
                return m;
            if(m*m < total)
                l=m+1;
            else
                h=m-1;
        }

        return -1;
    }
 
public static void main(String[] args)
{
    System.out.println(pivotInteger(50));
}
}
