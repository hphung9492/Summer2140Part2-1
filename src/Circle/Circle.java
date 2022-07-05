package Circle;

public class Circle {
    private double radius;

    public Circle(double newRadius){
        this.radius = newRadius;
    }

    public Circle(){
        this(1.0);
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double nR)
    {
        this.radius = nR;
    }


     public String toString(){
        return "Radius: " + radius;
    }

    public double computeArea(){
        return radius * radius * Math.PI;
    }

    public double computePerimeter()
    {
        return 2 * radius * Math.PI;
    }
}
