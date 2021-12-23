package classExample.chapter4.a4_17;

public class Rectangle {
    private double x,y,width,height;

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

    public void setWidth(double width){
        if(width<=0)
            this.width=0;
        else
            this.width=width;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        if(height<=0)
            height=0;
        else
            this.height=height;
    }

    public double getHeight(){
        return height;
    }
}
