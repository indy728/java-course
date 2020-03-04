public class LargestPrime {
    public static int getLargestPrime(int n){
        if (n < 2) return -1;
        int prime = -1;

        for (int i = 2; i <= n; i++){
            if (n % i == 0){
                for (int j = 2; j <= i; j++){
                    if (j == i) prime = j;
                    if (i % j == 0) break;
                }
            }
        }
        return prime;
    }
}
