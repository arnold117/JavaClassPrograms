package classExample.chapter4.a4_17;

public class Main {
    public static void main(String args[]){
        Rectangle rect1=new Rectangle(),
                rect2=new Rectangle();
        Circle circle1=new Circle(),
                circle2=new Circle();
        Geometry geometryOne,geometryTwo;
        geometryOne=new Geometry(rect1,circle1);
        geometryOne.setRectanglePosition(30,40);
        geometryOne.setRectangleWidthAndHeight(120,80);
        geometryOne.setCirclePosition(150,30);
        geometryOne.setCircleRadius(60);

        geometryTwo=new Geometry(rect2,circle2);
        geometryTwo.setRectanglePosition(160,160);
        geometryTwo.setRectangleWidthAndHeight(120,80);
        geometryTwo.setCirclePosition(40,30);
        geometryTwo.setCircleRadius(60);

        geometryOne.showState();
        geometryTwo.showState();
    }
}
