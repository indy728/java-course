public class NumberPalindrome {
    public static boolean isPalindrome(int num){
        int dup = Math.abs(num);
        int res = 0;

        while (dup > 0){
            res *= 10;
            res += dup % 10;
            dup /= 10;
        }
        return res == Math.abs((num));
    }
}
