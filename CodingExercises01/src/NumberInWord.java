public class NumberInWord {
    public static void printNumberInWord(int a){
        String output = "OTHER";
        switch(a) {
            case 0:
                output = "ZERO";
                break;
            case 1:
                output = "ONE";
                break;
            case 2:
                output = "TWO";
                break;
            case 3:
                output = "THREE";
                break;
            case 4:
                output = "FOUR";
                break;
            case 5:
                output = "FIVE";
                break;
            case 6:
                output = "SIX";
                break;
            case 7:
                output = "SEVEN";
                break;
            case 8:
                output = "EIGHT";
                break;
            case 9:
                output = "NINE";
                break;
            default:
                break;
        }
        System.out.println(output);
    }
}
