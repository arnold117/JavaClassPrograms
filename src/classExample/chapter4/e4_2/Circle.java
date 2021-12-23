package classExample.chapter4.e4_2;

public class Circle {
    double radius;
    double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        this.area = Math.PI * radius * radius;
        return area;
    }
}
