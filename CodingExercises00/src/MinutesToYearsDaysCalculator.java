public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) System.out.println("Invalid Value");
        else {
            long hours = minutes / 60;
            long d = hours / 24;
            long y = d / 365;
            long m = minutes % (60 * 24);
            d = d % 365;

//            String XX = m < 10 ? "0" + m : "" + m;
//            String YY = y < 10 ? "0" + y : "" + y;
//            String ZZ = d < 10 ? "0" + d : "" + d;
            String XX = "" + minutes;
            String YY = "" + y;
            String ZZ = "" + d;

            System.out.println(XX + " min = " +
                    YY + " y and " + ZZ + " d");
        }
    }
}
