public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){
        if (10 > a || 10 > b || 99 < a || 99 < b){
            return false;
        }

        int x[] = new int[10];

        if (a == 0) x[0] = 1;

        while (a > 0) {
            x[a % 10] = 1;
            a /= 10;
        }

        if (b == 0 && x[0] == 1) return true;
        while (b > 0) {
            if (x[b % 10] == 1){
                return true;
            }
            b /= 10;
        }

        return false;
    }
}
