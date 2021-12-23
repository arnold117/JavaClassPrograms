package exp.exp3.shape2;

public class Triangle {
    private double a;
    private double b;
    private double c;
    private double area;

    public void calArea() {
        double p = (this.a + this.b + this.c) / 2.0;
        this.area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.calArea();
    }

    public double getArea() {
        return area;
    }
}
