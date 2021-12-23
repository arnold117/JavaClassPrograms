package homeWork.home1;

import homeWork.home1.stereo.Cone;
import homeWork.home1.stereo.Cylinder;
import homeWork.home1.stereo.Rectangular;

public class Main {
    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular(1,1,1);
        String strOut = "The volume of the Rectangular is " + rectangular.getVolume();
        System.out.println(strOut);

        Cylinder cylinder = new Cylinder(1,1);
        strOut = "The volume of the Cylinder is " + cylinder.getVolume();
        System.out.println(strOut);

        Cone cone = new Cone(1,1);
        strOut = "The volume of the Cone is " + cone.getVolume();
        System.out.println(strOut);
    }
}
