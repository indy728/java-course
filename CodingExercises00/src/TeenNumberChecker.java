public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c){
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int a){
        return 13 <= a && a <= 19;
    }
}
