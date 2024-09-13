import java.util.*;
class UsingMap
{
    static char mostOccuringLetter(String str)
    {
        str=str.toLowerCase();
        char letters[]=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int max=0;
        char maxLetter=0;
        for(int i=0;i<letters.length;i++)
        {
            int count=0;
            if(map.containsKey(letters[i]))
                count=map.get(letters[i]);
            
            map.put(letters[i],++count);
            if(count>max)
            {
                max=count;
                maxLetter=letters[i];
            }
            
        }
        
        return maxLetter;
    }
    public static void main(String args[])
    {
        String str="mkbqsqjbyq";
        char result=mostOccuringLetter(str);
        System.out.println(result);
    }
}
