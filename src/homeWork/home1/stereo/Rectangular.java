package homeWork.home1.stereo;

public class Rectangular {
    double length;
    double width;
    double height;
    double volume;

    public Rectangular(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        calVolume();
    }

    void calVolume() {
        this.volume = this.length * this.width * this.height;
    }

    public double getVolume() {
        return volume;
    }
}
