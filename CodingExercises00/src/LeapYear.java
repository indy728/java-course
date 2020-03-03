public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year > 0 && year < 9999 && year % 4 == 0){
            if (year % 100 == 0) {
                if (year % 400 != 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
