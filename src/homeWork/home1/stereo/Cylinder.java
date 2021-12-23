package homeWork.home1.stereo;

public class Cylinder {
    double radius;
    double height;
    double volume;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.calVolume();
    }

    void calVolume() {
        this.volume = this.height * this.radius * this.radius * Math.PI;
    }

    public double getVolume() {
        return volume;
    }
}
