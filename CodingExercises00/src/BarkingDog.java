public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hour){
        return (isBarking && ((0 <= hour && hour < 8) || (22 < hour && hour <= 23)));
    }
}
