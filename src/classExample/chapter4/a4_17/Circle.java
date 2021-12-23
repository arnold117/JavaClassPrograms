package classExample.chapter4.a4_17;

public class Circle {
    private double x,y,radius;

    public void setX(double x){
        this.x=x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getY(){
        return y;
    }

    public void setRadius(double radius){
        if(radius<0)
            this.radius=0;
        else
            this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }
}
