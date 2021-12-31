package exp.exp4;

public class Lad implements Integral{
    @Override
    public double calIntegral(double limDown, double limUp, double step) {
        double x, sum = 0;

        for (x = limDown; x <= limUp; x += step) {
            sum += (Math.pow(Math.E, x) + Math.pow(Math.E, (x+step) ) ) * (step / 2);
        }

        return sum;
    }
}
