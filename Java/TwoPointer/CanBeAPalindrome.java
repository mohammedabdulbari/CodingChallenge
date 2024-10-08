
class CanBeAPalindrome {
    public static boolean isPalindrome(byte str[], int i, int j) {
        while (i < j) {
            if (str[i] != str[j])
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        byte str[] = s.getBytes();
        while (i < j) {
            if (str[i] != str[j]) {
                return isPalindrome(str, i + 1, j) || isPalindrome(str, i, j - 1);
            }
            i++;
            j--;

        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(validPalindrome("aebbeba"));
    }
}
