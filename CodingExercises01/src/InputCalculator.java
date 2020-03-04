import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 0;

        while (scanner.hasNextInt()) {
            ++count;
            sum += scanner.nextInt();
            avg = Math.round((double)(sum) / (double)count);
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
