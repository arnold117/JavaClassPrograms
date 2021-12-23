package exp.exp3.shape;

public class Rectangle {
    private double length;
    private double width;
    private double area;

    public void calArea() {
        this.area = this.length * this.width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.calArea();
    }

    public double getArea() {
        return area;
    }
}
