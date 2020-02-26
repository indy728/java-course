public class Hello {
    public static int sum(Integer[] args) {
        return 0;
    }


    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFirstNumber = (10 + 5) + 2 * 10;
        int mySecondNumber = 12;
        int myThirdNumber = 2 * myFirstNumber;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myLastOne = 1000 - myTotal;

        System.out.println(myLastOne);
    }
}
