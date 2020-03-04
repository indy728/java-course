public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if (!isValid(a) || !isValid(b) || !isValid(c)) return false;

        int armd = a % 10;
        int brmd = b % 10;
        int crmd = c % 10;
        if (armd == brmd || armd == crmd || brmd == crmd) return true;
        return false;
    }

    public static boolean isValid(int a){
        if (10 > a || a > 1000) return false;
        return true;
    }
}
