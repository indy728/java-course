public class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
