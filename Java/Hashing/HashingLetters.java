class HashingLetters
{
    static char mostOccurringLetter(String str)
    {
        str=str.toLowerCase();
        char letters[]=str.toCharArray();

        int hash[]=new int[26];
        for(int i=0;i<letters.length;i++)
        {
            hash[letters[i]-97]++;
        }
        int max=0;
        for(int i=0;i<hash.length;i++)
            if(hash[i]>hash[max]) max=i;
        
        return (char)(max+97);
    }
    public static void main(String args[])
    {
        String str="mkbqsqjbyq";
        char result=mostOccurringLetter(str);
        System.out.println(result);
    }
}
