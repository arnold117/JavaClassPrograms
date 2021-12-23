package exp.exp3.shape2;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.calArea();
    }

    public void calArea() {
        this.area = Math.pow(this.radius, 2.0) * Math.PI;
    }

    public double getArea() {
        return area;
    }
}
