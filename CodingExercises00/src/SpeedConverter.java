public class SpeedConverter {
    public static void main(String[] args){
        printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long mph = -1;

        if (kilometersPerHour >= 0) {
            mph = Math.round((kilometersPerHour / 1.609d));
        }
        return mph;
    }

    public static void printConversion(double kilometersPerHour) {

        long converted = toMilesPerHour(kilometersPerHour);

        if (converted == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(
                    kilometersPerHour + "km/h = " +
                            toMilesPerHour(kilometersPerHour)     + " mi/h"
            );
        }
    }
}