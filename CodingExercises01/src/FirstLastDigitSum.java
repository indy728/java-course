public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int num){
        if (num < 0) return -1;
        int first = num % 10;
        int last = 0;

        while (num > 0){
            last = num % 10;
            num /= 10;
        }
        return first + last;
    }
}
