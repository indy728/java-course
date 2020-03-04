public class NumberToWords {
    public static void numberToWords(int num){
        if (num < 0) System.out.println("Invalid Value");
        int mun = reverse(num);
        int numD = getDigitCount(num);
        int munD = getDigitCount(mun);

        do {
            switch(mun % 10){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            mun /= 10;
        } while (mun > 0);

        while (munD++ < numD) System.out.println("Zero");

    }

    public static int reverse(int num){
        int reverse = 0;
        int sign = num < 0 ? -1 : 1;
        int abs = Math.abs(num);

        while (abs > 0) {
            reverse *= 10;
            reverse += abs % 10;
            abs /= 10;
        }
        return sign * reverse;
    }

    public static int getDigitCount(int num){
        if (num < 0) return -1;

        int digits = 0;
        do {
            digits += 1;
            num /= 10;
        } while (num > 0);
        return digits;
    }
}
