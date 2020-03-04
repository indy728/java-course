public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a, int b){
        if (a < 10 || b < 10) return -1;

        int common = 1;

        for(int i = 2; i <= Math.min(a, b); i++){
            if (a % i == 0 && b % i == 0) common = i;
        }
        return common;
    }
}
