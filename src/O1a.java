public class Main extends EasyGraphics {
    public static void main(String[] args) {
        launch(args);
    }

    public void run() {
        final int WIDTH = 500/2;
        final int HEIGHT = 350/2;
        final int UNIT = WIDTH / 10;
        makeWindow("GrafikkDemo", WIDTH, HEIGHT);
        fillRectangle(UNIT*3, 0, UNIT, HEIGHT);
        fillRectangle(0, UNIT*3, WIDTH, UNIT);
    }
}