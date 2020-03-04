public class EvenDigitSum {
    public static int getEvenDigitSum(int num){
        if (num < 0) return -1;
        int sum = 0;

        while (num > 0){
            if (num % 10 % 2 == 0){
                sum += num % 10;
            }
            num /= 10;
        }
        return sum;
    }
}
