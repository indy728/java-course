public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(2);
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(12);
    }

    public static void printSquareStar(int n){
        if (n < 5) System.out.println("Invalid Value");
        else {
//            String s = "";

            for (int i = 0; i < n; i++) {
//                s = "";
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print('*');
                    } else if (i == j) System.out.print('*');
                    else if (j == n - (i + 1)) System.out.print('*');
                    else System.out.print(' ');
                }
                System.out.println();
            }
        }
    }
}
