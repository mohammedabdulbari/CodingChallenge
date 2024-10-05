import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ValidPalindrome
{
    public static boolean isAlphaNumeric(char x)
    {
        if(x>='a' && x<='z')return true;
        if(x>='0' && x<='9')return true;
        return false;
    }
  
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char str[]=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<r && !isAlphaNumeric(str[l]))l++;
        while(l<r && !isAlphaNumeric(str[r]))r--;
        while(l<r)
        {
            System.out.println(str[l]+" "+str[r]);
            if(str[l]!=str[r])
                return false;
            do{l++;}while(l<r && !isAlphaNumeric(str[l]));
            do{r--;}while(l<r && !isAlphaNumeric(str[r]));
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(isPalindrome("No, it is open on one position"));
    }
}
