public class PlayingCat {
    public static boolean isCatPlaying(boolean a, int temp){
        int lim = a ? 45 : 35;

        return 25 <= temp && temp <= lim;
    }

}
