public class AreaCalculator {
    public static double area(double x){
        return x < 0 ? -1 : Math.PI * x * x;
    }

    public static double area(double x, double y){
        return x < 0 || y < 0 ? -1 : x * y;
    }
}
