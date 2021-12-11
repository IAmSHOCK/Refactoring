package pt.up.fe.ldts.example2;

public class Shape {
    enum TYPE {RECTANGLE, CIRCLE}

    private TYPE type;
    private double x;
    private double y;

    public double getY() {
        return y;
    }
    public double getX() {
        return x;
    }
    public Shape(double x, double y) {
        this.type = TYPE.RECTANGLE;
        this.x = x;
        this.y = y;
    }

    public Shape(double x, double y, double radius) {
        this.type = TYPE.CIRCLE;
        this.x = x;
        this.y = y;
    }

}
