package homeWork.home1.stereo;

public class Cone {
    double radius;
    double height;
    double volume;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.calVolume();
    }

    void calVolume() {
        this.volume = this.height * this.radius * this.radius * Math.PI;
        this.volume /= 3.0;
    }

    public double getVolume() {
        return volume;
    }
}
