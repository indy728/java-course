public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kb){
        if (kb < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int mb = kb / 1024;
        int remainderkb = kb % 1024;



        System.out.println(
                kb + " KB = " + mb + " MB and " + remainderkb + " KB"
        );
    }
}
