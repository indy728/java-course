public class PerfectNumber {
    public static boolean isPerfectNumber(int n){
        if (n < 1) return false;
        int sumFactors = 1;

        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0) sumFactors += i;
        }
        return n == sumFactors;
    }
}
