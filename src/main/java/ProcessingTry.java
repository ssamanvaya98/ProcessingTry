import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 840;
    public static final int HEIGHT = 680;
    public static final int Diameter = 10;

    int height1 = (HEIGHT * 1 / 5);
    int height2 = (HEIGHT * 2 / 5);
    int height3 = (HEIGHT * 3 / 5);
    int height4 = (HEIGHT * 4 / 5);

    int speed1 = 0;
    int speed2 = 0;
    int speed3 = 0;
    int speed4 = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle(speed1, height1);
        drawCircle(speed2, height2);
        drawCircle(speed3, height3);
        drawCircle(speed4, height4);

        speed1 += 1;
        speed2 += 2;
        speed3 += 3;
        speed4 += 4;
    }

    private void drawCircle(int speed, int height) {
        ellipse(speed, height, Diameter, Diameter);
    }
}