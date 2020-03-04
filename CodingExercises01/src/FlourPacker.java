public class FlourPacker {
    public static boolean canPack(int big, int small, int goal){
        if (big < 0 || small < 0 || goal < 0) return false;

        if (big * 5 + small >= goal && goal % 5 <= small) return true;
        return false;
    }
}
