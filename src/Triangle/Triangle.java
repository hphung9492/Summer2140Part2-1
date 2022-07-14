package Triangle;

public class Triangle {

    double base;
    double height;

    public Triangle()
    {
        this(1,2);
    }

    public Triangle(double b, double h)
    {
        this.base = b;
        this.height = h;
    }
    public double getBase()
    {
        return base;
    }

    public double getHeight()
    {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getArea()
    {
        return height * base * 1/2.0;
    }

    public String toString()
    {
        return "Base: " + base + ", Height: " + height;
    }
}
