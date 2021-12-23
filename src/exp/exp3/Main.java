package exp.exp3;

import exp.exp3.shape.Circle;
import exp.exp3.shape.Rectangle;
import exp.exp3.shape.Triangle;

public class Main {
    public static void main(String[] args) {

        double height = 1.0;
        Rectangle rectangle = new Rectangle(1, 1);
        double rectVolume = height * rectangle.getArea();
        String strOut = "The volume of the Rectangular is " + rectVolume;
        System.out.println(strOut);

        exp.exp3.shape2.Rectangle rectangle2 = new exp.exp3.shape2.Rectangle(1, 1);
        double rectVolume2 = height * rectangle.getArea();
        strOut = "The volume of the Rectangular2 is " + rectVolume2;
        System.out.println(strOut);

        Circle circle = new Circle(1);
        double cyliVolume = height* circle.getArea();
        strOut = "The volume of the Cylinder is " + cyliVolume;
        System.out.println(strOut);

        exp.exp3.shape2.Circle circle2 = new exp.exp3.shape2.Circle(1);
        double cyliVolume2 = height* circle.getArea();
        strOut = "The volume of the Cylinder2 is " + cyliVolume2;
        System.out.println(strOut);

        Triangle triangle = new Triangle(1, 1, 1);
        double triVolume = height * triangle.getArea();
        strOut = "The volume of the TriPrism is " + triVolume;
        System.out.println(strOut);

        exp.exp3.shape2.Triangle triangle2 = new exp.exp3.shape2.Triangle(1,1,1);
        double triVolume2 = height * triangle.getArea();
        strOut = "The volume of the TriPrism2 is " + triVolume2;
        System.out.println(strOut);
    }
}
