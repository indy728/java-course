public class PaintJob {
//    public static void main(String[] args) {
////        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
////        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
////        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
//
//
//    }

    public static int getBucketCount(double width, double height, double area, int extra){
        if (width <= 0 || height <= 0 || area <= 0 || extra < 0) return -1;

        return ((int)Math.ceil(width * height / area - extra));
    }

    public static int getBucketCount(double width, double height, double area){
        if (width <= 0 || height <= 0 || area <= 0) return -1;

        return ((int)Math.ceil(width * height / area));
    }

    public static int getBucketCount(double wallArea, double area){
        if (wallArea <= 0 || area <= 0) return -1;

        return ((int)Math.ceil(wallArea / area));
    }
}
