package classExample.chapter4.a4_17;

public class Geometry {
    private Rectangle rect;
    private Circle circle;
    Geometry(Rectangle rect,Circle circle){
        this.rect=rect;
        this.circle=circle;
    }
    public void setCirclePosition(double x,double y){
        circle.setX(x);
        circle.setY(y);
    }
    public void setCircleRadius(double radius){
        circle.setRadius(radius);
    }
    public void setRectanglePosition(double x,double y){
        rect.setX(x);
        rect.setY(y);
    }
    public void setRectangleWidthAndHeight(double w,double h){
        rect.setWidth(w);
        rect.setHeight(h);
    }
    public void showState(){
        double circleX=circle.getX();
        double rectX=rect.getX();
        if(rectX-circleX==circle.getRadius()*2)
            System.out.println("图形中的矩形在圆的右侧");
        if(circleX-rectX==rect.getWidth())
            System.out.println("图形中的矩形在圆的左侧");
    }
}
